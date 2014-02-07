package me.mrCookieSlime.Slimefun.Listeners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Dictionary.ItemDictionary;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Utilities.Calculator;
import me.mrCookieSlime.Slimefun.api.PlayerInventory;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VillagerListener implements Listener {
	
	private startup plugin;
	
	private HashMap<String, String> inv = new HashMap<String, String>();
	
	private HashMap<String, String> quest = new HashMap<String, String>();
	
	private HashMap<String, String> kill = new HashMap<String, String>();
	
	public VillagerListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onHit(EntityDamageEvent e) {
		if (e.getEntity() instanceof Villager) {
			Villager v = (Villager) e.getEntity();
			try {
				if (v.getCustomName().equalsIgnoreCase(ChatColor.GRAY + "Lost " + ChatColor.BLUE + " Merchant")) {
					e.setCancelled(true);
				}
				if (v.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "Quest " + ChatColor.BLUE + " Villager")) {
					e.setCancelled(true);
				}
				if (v.getCustomName().equalsIgnoreCase(ChatColor.GRAY + "Lost " + ChatColor.DARK_GRAY + " Blacksmith")) {
					e.setCancelled(true);
				}
			}
			catch(Exception x) {
			}
		}
	}
	
	@EventHandler
	public void onOpen(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Villager) {
			Villager v = (Villager) e.getRightClicked();
			if (v.getCustomName() != null) {
				if (v.getCustomName().equalsIgnoreCase(ChatColor.GRAY + "Lost " + ChatColor.BLUE + " Merchant")) {
					if (kill.containsKey(e.getPlayer().getName())) {
						e.setCancelled(true);
						kill.remove(e.getPlayer().getName());
						messages.NPCremoved(e.getPlayer());
						v.remove();
					}
					else {
						e.setCancelled(true);
						
						openMerchantShop(e.getPlayer());
					}
				}
				if (v.getCustomName().equalsIgnoreCase(ChatColor.GRAY + "Lost " + ChatColor.DARK_GRAY + " Blacksmith")) {
					if (kill.containsKey(e.getPlayer().getName())) {
						e.setCancelled(true);
						kill.remove(e.getPlayer().getName());
						messages.NPCremoved(e.getPlayer());
						v.remove();
					}
					else {
						if (PlayerResearch.hasResearched(e.getPlayer(), "Uber Upgrade Cores")) {
							e.setCancelled(true);
							
							openBlacksmithshop(e.getPlayer());
						}
						else {
							e.setCancelled(true);
							
							messages.NotResearched(e.getPlayer());
						}
					}
				}
				if (v.getCustomName().equalsIgnoreCase(ChatColor.GREEN + "Quest " + ChatColor.BLUE + " Villager")) {
					if (kill.containsKey(e.getPlayer().getName())) {
						e.setCancelled(true);
						kill.remove(e.getPlayer().getName());
						messages.NPCremoved(e.getPlayer());
						v.remove();
					}
					else {
						e.setCancelled(true);
						
						giveQuest(e.getPlayer());
					}
				}
			}
		}
	}
	
	public List<String> getCosts() {
		List<String> items = new ArrayList<String>();
		for (int i = 0; i < Slimefun.getUberUpgrades().size(); i++) {
			items.add(Slimefun.getUpgradePrice(Slimefun.getUberUpgrades().get(i).clone()));
		}
		
		return items;
	}
	
	public void openBlacksmithshop(Player p) {
		List<ItemStack> offers = new ArrayList<ItemStack>();
		
		for (int i = 0; i < Slimefun.getUberUpgrades().size(); i++) {
			offers.add(Slimefun.getUberUpgrades().get(i).clone());
		}
		
		List<String> cost = getCosts();
		
		int lines = Calculator.formToLine(offers.size());
			  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GRAY + "Lost " + ChatColor.DARK_GRAY + "Blacksmith");
			  int slot = 0;
			  
			  for (int i = 0; i < offers.size(); i++) {
				  try {
					  
					  ItemStack offer = offers.get(i);
					  ItemMeta im = offer.getItemMeta();
					  List<String> ll = im.getLore();
					  ll.add(ChatColor.YELLOW + "[Click to buy]");
					  ll.add("");
					  ll.add(ChatColor.GREEN + "Price: " + cost.get(i));
					  im.setLore(ll);
					  offer.setItemMeta(im);
					  offer = Setname(offer, offers.get(i).getItemMeta().getDisplayName());
					  inv.setItem(slot, offer);
					  slot++;
				  }
				  catch(Exception x) {
					  System.out.println("Fatal Error: Unknown Item: " + offers.get(i));
				  }
			  }
			  p.openInventory(inv);
			  this.inv.put(p.getName(), "blacksmith");
			  p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 1);
	}

	@SuppressWarnings("deprecation")
	public void giveQuest(Player p) {
		
		if (quest.containsKey(p.getName())) {
			
			int q = Integer.parseInt(this.quest.get(p.getName()));
		
			List<String> quests = this.plugin.getConfig().getStringList("quests.message");
	
			List<String> amount = this.plugin.getConfig().getStringList("quests.needed-amount");
			
			List<String> id = this.plugin.getConfig().getStringList("quests.needed-item");
	
			List<String> rewards = this.plugin.getConfig().getStringList("quests.amount-of-slime-gems-rewarded");
			
			if (p.getInventory().contains(Material.getMaterial(Integer.parseInt(id.get(q))), Integer.parseInt(amount.get(q)))) {
				
				PlayerInventory.removeItemIgnoringMetaAndDamage(p, Material.getMaterial(Integer.parseInt(id.get(q))), Integer.parseInt(amount.get(q)));
				
				ItemStack reward = SlimefunItem.SLIME_GEM.clone();
				reward.setAmount(Integer.parseInt(rewards.get(q)));
				
				p.getInventory().addItem(reward);
				
				messages.QuestCompleted(p);
				
				this.quest.remove(p.getName());
			}
			else {
				p.sendMessage(ChatColor.GREEN + "Quest " + ChatColor.BLUE + " Villager" + ChatColor.GRAY + ": " + ChatColor.GOLD + quests.get(q));
				messages.QuestCancel(p);
			}
		}
		else {
			List<String> quests = this.plugin.getConfig().getStringList("quests.message");
			
			int q = new Random().nextInt(quests.size());
			
			p.sendMessage(ChatColor.GREEN + "Quest " + ChatColor.BLUE + " Villager" + ChatColor.GRAY + ": " + ChatColor.GOLD + quests.get(q));
			messages.QuestCancel(p);
			
			this.quest.put(p.getName(), String.valueOf(q));
		}
	}
	
	@SuppressWarnings("deprecation")
	public void openMerchantShop(Player p) {
		
		List<String> offers = this.plugin.getConfig().getStringList("merchant.offers");
		
		int lines = Calculator.formToLine(offers.size());
			  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GRAY + "Lost " + ChatColor.BLUE + "Merchant");
			  int slot = 0;
			  
			  for (int i = 0; i < offers.size(); i++) {
				  try {
					  
					  ItemStack SFitem;
					  try {
							int id = Integer.parseInt(offers.get(i));
							 SFitem = new ItemStack(id);
						}
						catch(Exception x) {
							SFitem = ItemDictionary.getItem(offers.get(i));
						}
					  
					  ItemStack offer = new ItemStack(SFitem.getType());
					  ItemMeta im = offer.getItemMeta();
					  List<String> ll = new ArrayList<String>();
					  ll.add(ChatColor.YELLOW + "[Click to buy]");
					  ll.add("");
					  ll.add(ChatColor.GREEN + "Price: " + ChatColor.GOLD + this.plugin.getConfig().getInt("merchant.prices." + offers.get(i)) + " Slime Gems");
					  im.setLore(ll);
					  offer.setItemMeta(im);
					  offer = Setname(offer, SFitem.getItemMeta().getDisplayName());
					  inv.setItem(slot, offer);
					  slot++;
				  }
				  catch(Exception x) {
					  System.out.println("Fatal Error: Unknown Item: " + offers.get(i));
				  }
			  }
			  p.openInventory(inv);
			  this.inv.put(p.getName(), "trade");
			  p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 1);
	}
		public ItemStack Setname(ItemStack iss, String Name) {
	   	    ItemStack tree = iss;
	   	    ItemMeta orange = tree.getItemMeta();
	   	    orange.setDisplayName(Name);
	   	    tree.setItemMeta(orange);
	   	    return tree;
	   	  }
			public ItemStack setLore(ItemStack item, String lore){
	         ItemMeta im = item.getItemMeta();
	         List<String> ll = new ArrayList<String>();
	         ll.add(lore);
	         im.setLore(ll);
	         item.setItemMeta(im);
	         return item;
	       }
			public ItemStack setDurability(ItemStack item, int i) {
				item.setDurability((short) i);
				return item;
			}
			
			@EventHandler
		      public void in(InventoryCloseEvent e) {
		   	   try {
		   	   Player p = (Player) e.getPlayer();
		   	   if (this.inv.get(p.getName()).equals("trade")) {
		   		this.inv.remove(p.getName());
		   		p.playSound(p.getLocation(), Sound.NOTE_PIANO, 1, 2);
		   	   	   }
		   	 if (this.inv.get(p.getName()).equals("blacksmith")) {
			   		this.inv.remove(p.getName());
			   		p.playSound(p.getLocation(), Sound.NOTE_PIANO, 1, 2);
			   	   	   }
		   	   }
		   	   catch (Exception x) {
		   	   }
		      }
			
			@SuppressWarnings("deprecation")
			@EventHandler
			public void onBuy(InventoryClickEvent e) {
					Player p = (Player) e.getWhoClicked();
					if (e.getCurrentItem() != null) {
						if (inv.containsKey(p.getName())) {
							if (inv.get(p.getName()).equalsIgnoreCase("trade")) {
								e.setCancelled(true);
								if (e.getSlot() == e.getRawSlot()) {
									int slot = e.getSlot();
									List<String> offers = this.plugin.getConfig().getStringList("merchant.offers");
									String offer = offers.get(slot);
									int cost = this.plugin.getConfig().getInt("merchant.prices." + offer);
									if (p.getInventory().containsAtLeast(SlimefunItem.SLIME_GEM, cost)) {
										PlayerInventory.removeItem(p, SlimefunItem.SLIME_GEM, cost);
										
										ItemStack item;
										
										try {
											int id = Integer.parseInt(offer);
											item = new ItemStack(id);
										}
										catch(Exception x) {
											item = ItemDictionary.getItem(offer);
										}
										
										p.getInventory().addItem(item);
										p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 1);
									}
									else {
										messages.NotEnoughMaterials(p);
										p.playSound(p.getLocation(), Sound.NOTE_PIANO, 1, 2);
									}
								}
							}
							else if (inv.get(p.getName()).equalsIgnoreCase("blacksmith")) {
								e.setCancelled(true);
								if (e.getSlot() == e.getRawSlot()) {
									int slot = e.getSlot();
									List<ItemStack> offers = new ArrayList<ItemStack>();
									
									for (int i = 0; i < Slimefun.getUberUpgrades().size(); i++) {
										offers.add(Slimefun.getUberUpgrades().get(i));
									}
									
									ItemStack offer = offers.get(slot);
									int cost = Integer.parseInt(getCosts().get(slot));
									if (p.getInventory().containsAtLeast(SlimefunItem.SLIME_GEM, cost)) {
										PlayerInventory.removeItem(p, SlimefunItem.SLIME_GEM, cost);
										
										p.getInventory().addItem(offer);
										p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 1);
									}
									else {
										messages.NotEnoughMaterials(p);
										p.playSound(p.getLocation(), Sound.NOTE_PIANO, 1, 2);
									}
								}
							}
						}
					}
			}
			@EventHandler
			public void Cancel(PlayerCommandPreprocessEvent e) {
				Player p = e.getPlayer();
				if (e.getMessage().equalsIgnoreCase("/quest cancel")) {
					if (quest.containsKey(p.getName())) {
						this.quest.remove(p.getName());
						messages.QuestCancelled(p);
						e.setCancelled(true);
					}
				}
			}
			
			@EventHandler
			public void onRemove(PlayerCommandPreprocessEvent e) {
				Player p = e.getPlayer();
				if (e.getMessage().toLowerCase().startsWith("/sf killnpc") || e.getMessage().toLowerCase().startsWith("/slimefun killnpc")) {
					kill.put(p.getName(), "kill");
				}
			}
}
