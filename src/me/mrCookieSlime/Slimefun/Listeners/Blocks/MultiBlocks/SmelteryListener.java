package me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.api.PlayerInventory;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SmelteryListener implements Listener {
	
	private startup plugin;
	private HashMap<String, String> inv = new HashMap<String, String>();
	private HashMap<String, Block> sm = new HashMap<String, Block>();
	
	public File smelteries = new File("data-storage/Slimefun", "Smelteries.yml");
	public FileConfiguration scfg = YamlConfiguration.loadConfiguration(smelteries);
	
	public SmelteryListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	public void openSmeltery(Player p, Block smeltery) {
		
		
			List<String> smX = scfg.getStringList("smelteries.x");
			List<String> smY = scfg.getStringList("smelteries.y");
			List<String> smZ = scfg.getStringList("smelteries.z");
			List<String> smW = scfg.getStringList("smelteries.world");
			List<String> smL = scfg.getStringList("smelteries.lava");
			
			int lava = 0;
			
			if (smX.contains(String.valueOf(smeltery.getLocation().getX())) && smY.contains(String.valueOf(smeltery.getLocation().getY())) && smZ.contains(String.valueOf(smeltery.getLocation().getZ())) && smW.contains(smeltery.getLocation().getWorld().getName())) {
				for(int i = 0; i < smX.size(); i++) {
					if (Double.parseDouble(smX.get(i)) == smeltery.getLocation().getX()) {
						if (Double.parseDouble(smY.get(i)) == smeltery.getLocation().getY()) {
							if (Double.parseDouble(smZ.get(i)) == smeltery.getLocation().getZ()) {
								if (smW.get(i).equalsIgnoreCase(smeltery.getWorld().getName())) {
									lava = Integer.parseInt(smL.get(i));
									break;
								}
							}
						}
					}
				}
			}
			else {
				smX.add(String.valueOf(smeltery.getLocation().getX()));
				smY.add(String.valueOf(smeltery.getLocation().getY()));
				smZ.add(String.valueOf(smeltery.getLocation().getZ()));
				smW.add(smeltery.getLocation().getWorld().getName());
				smL.add(String.valueOf(0));
				
				scfg.set("smelteries.x", smX);
				scfg.set("smelteries.y", smY);
				scfg.set("smelteries.z", smZ);
				scfg.set("smelteries.world", smW);
				scfg.set("smelteries.lava", smL);
				
				try {
					scfg.save(smelteries);
				} catch (IOException e) {
				}
			}
			
			
			Inventory inv = Bukkit.createInventory(null, 36, ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Smeltery");
			int slot = 0;
			
			Boolean b = true;
			
			if (b) {
				ItemStack charcoal = new ItemStack(Material.LAVA);
				ItemMeta charcoalIM = charcoal.getItemMeta();
		        List<String> Charcoalll = new ArrayList<String>();
		        Charcoalll.add(ChatColor.YELLOW + "[Click to refill]");
		        Charcoalll.add("");
		        Charcoalll.add(ChatColor.BLUE + "Materials needed:");
		        Charcoalll.add(ChatColor.BLUE + "1 Lava bucket");
		        charcoalIM.setLore(Charcoalll);
		        charcoal.setItemMeta(charcoalIM);
		        charcoal = Setname(charcoal, ChatColor.RED + "Lava: " + lava + " / 64");
		        charcoal = setDurability(charcoal, 1);
		        inv.setItem(8, charcoal);
		        inv.setItem(17, charcoal);
		        inv.setItem(26, charcoal);
		        inv.setItem(35, charcoal);
		        
		        ItemStack pane = new ItemStack(Material.THIN_GLASS);
		        pane = Setname(pane, " ");
		        inv.setItem(7, pane);
		        inv.setItem(16, pane);
		        inv.setItem(25, pane);
		        inv.setItem(34, pane);
			}
			
			if (b) {
				ItemStack charcoal = new ItemStack(Material.COAL);
				ItemMeta charcoalIM = charcoal.getItemMeta();
		        List<String> Charcoalll = new ArrayList<String>();
		        Charcoalll.add(ChatColor.YELLOW + "[Click to smelt]");
		        Charcoalll.add("");
		        Charcoalll.add(ChatColor.BLUE + "Materials needed:");
		        Charcoalll.add(ChatColor.BLUE + "1 Log");
		        charcoalIM.setLore(Charcoalll);
		        charcoal.setItemMeta(charcoalIM);
		        charcoal = Setname(charcoal, ChatColor.GREEN + "Craft 1 Charcoal");
		        charcoal = setDurability(charcoal, 1);
		        inv.setItem(slot, charcoal);
		        slot++;
			}
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.IRON_INGOT);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Iron ore");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 2 Iron Ingots");
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.GOLD_INGOT);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Gold ore");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 2 Gold Ingots");
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.IRON_INGOT);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Iron Chunk");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Iron Ingot");
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.GOLD_INGOT);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Gold Chunk");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Gold Ingot");
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (PlayerResearch.hasResearched(p, "Steel Ingot")) {
	        	ItemStack Iron = new ItemStack(Material.IRON_INGOT);
		    	ItemMeta IronIM = Iron.getItemMeta();
		           List<String> Ironll = new ArrayList<String>();
		           Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
		           Ironll.add("");
		            Ironll.add(ChatColor.BLUE + "Materials needed:");
		            Ironll.add(ChatColor.BLUE + "4 Iron Chunks");
		            IronIM.setLore(Ironll);
		            Iron.setItemMeta(IronIM);
		            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Steel Ingot");
		            Iron = setDurability(Iron, 1);
		            inv.setItem(slot, Iron);
		            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.COOKED_BEEF);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Raw Beef");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Cooked Beef");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot = 9;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.COOKED_CHICKEN);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Raw Chicken");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Cooked Chicken");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.GRILLED_PORK);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Raw Porkchop");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Cooked Porkchop");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.COOKED_FISH);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "1 Raw Fish");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Cooked Fish");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.STONE);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "8 Cobblestone");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 8 Stone");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.GLASS);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "8 Sand");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 8 Glass");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (b) {
	        	ItemStack Iron = new ItemStack(Material.NETHER_BRICK_ITEM);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "8 Netherrack");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 8 Netherbricks");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        if (plugin.getConfig().getBoolean("recipes.allow-smelting-Rotten-flesh-to-leather-in-smeltery")) {
	        	ItemStack Iron = new ItemStack(Material.LEATHER);
	    		ItemMeta IronIM = Iron.getItemMeta();
	            List<String> Ironll = new ArrayList<String>();
	            Ironll.add(ChatColor.YELLOW + "[Click to smelt]");
	            Ironll.add("");
	            Ironll.add(ChatColor.BLUE + "Materials needed:");
	            Ironll.add(ChatColor.BLUE + "4 Rotten Flesh");
	            IronIM.setLore(Ironll);
	            Iron.setItemMeta(IronIM);
	            Iron = Setname(Iron, ChatColor.GREEN + "Craft 1 Leather");
	            Iron = setDurability(Iron, 1);
	            inv.setItem(slot, Iron);
	            slot++;
	        }
	        p.openInventory(inv);
	        this.inv.put(p.getName(), "smelt");
			this.sm.put(p.getName(), smeltery);
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
		public void onOpen(PlayerInteractEvent e) {
			Player p = e.getPlayer();
			if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
				if (e.getClickedBlock().getType() == Material.FURNACE) {
					Location fire = e.getClickedBlock().getLocation();
					fire.setY(e.getClickedBlock().getLocation().getY() - 1.0D);
					Location nether = e.getClickedBlock().getLocation();
					nether.setY(e.getClickedBlock().getLocation().getY() - 2.0D);
					if (fire.getBlock().getType() == Material.FIRE && nether.getBlock().getType() == Material.NETHERRACK) {
						if (!p.isSneaking()) {
							e.setCancelled(true);
							if (PlayerResearch.hasResearched(p, "Hot Melting")) {
								openSmeltery(p, e.getClickedBlock());
							}
							else {
								messages.NotResearched(p);
								e.setCancelled(true);
							}
							p.playSound(p.getLocation(), Sound.LAVA, (float) 0.7, 1);	
						}
					}
				}
			}
		}
		
		@EventHandler
	      public void in(InventoryCloseEvent e) {
	   	   try {
	   	   Player p = (Player) e.getPlayer();
	   	   if (this.inv.get(p.getName()).equals("smelt")) {
	   		this.inv.remove(p.getName());
	   		this.sm.remove(p.getName());
	   		p.playSound(p.getLocation(), Sound.LAVA, (float) 0.7, 1);
	   	   	   }
	   	   }
	   	   catch (Exception x) {
	   	   }
	      }
		
		@EventHandler
		public void onClick(InventoryClickEvent e) {
			Player p = (Player) e.getWhoClicked();
			try {
				if (this.inv.get(p.getName()).equalsIgnoreCase("smelt")) {
					e.setCancelled(true);
					
					Block smeltery = sm.get(p.getName());
					
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Charcoal")) {
						if (p.getInventory().contains(Material.LOG, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.LOG, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(setDurability(new ItemStack(Material.COAL), 1));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().startsWith(ChatColor.RED + "Lava: ")) {
						if (p.getInventory().contains(Material.LAVA_BUCKET, 1)) {
							
							addLava(p, smeltery);
							
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 8 Glass")) {
						if (p.getInventory().contains(Material.SAND, 8)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.SAND, 8);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.GLASS, 8));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 8 Stone")) {
						if (p.getInventory().contains(Material.COBBLESTONE, 8)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.COBBLESTONE, 8);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.STONE, 8));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 2 Iron Ingots")) {
						if (p.getInventory().contains(Material.IRON_ORE, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_ORE, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.IRON_INGOT, 2));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 2 Gold Ingots")) {
						if (p.getInventory().contains(Material.GOLD_ORE, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.GOLD_ORE, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 2));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Iron Ingot")) {
						if (p.getInventory().containsAtLeast(SlimefunItem.IRON_CHUNK, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItem(p, SlimefunItem.IRON_CHUNK, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.IRON_INGOT));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Gold Ingot")) {
						if (p.getInventory().containsAtLeast(SlimefunItem.GOLD_CHUNK, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItem(p, SlimefunItem.GOLD_CHUNK, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Steel Ingot")) {
						if (p.getInventory().containsAtLeast(SlimefunItem.IRON_CHUNK, 4)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItem(p, SlimefunItem.IRON_CHUNK, 4);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(SlimefunItem.STEEL_INGOT);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Cooked Beef")) {
						if (p.getInventory().contains(Material.RAW_BEEF, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.RAW_BEEF, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 1));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Cooked Porkchop")) {
						if (p.getInventory().contains(Material.PORK, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.PORK, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.GRILLED_PORK, 1));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Cooked Fish")) {
						if (p.getInventory().contains(Material.RAW_FISH, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.RAW_FISH, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.COOKED_FISH, 1));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Cooked Chicken")) {
						if (p.getInventory().contains(Material.RAW_CHICKEN, 1)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.RAW_CHICKEN, 1);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.COOKED_CHICKEN, 1));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 8 Netherbricks")) {
						if (p.getInventory().contains(Material.NETHERRACK, 8)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.NETHERRACK, 8);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.NETHER_BRICK_ITEM, 8));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Craft 1 Leather")) {
						if (p.getInventory().contains(Material.ROTTEN_FLESH, 4)) {
							if (getLava(sm.get(p.getName())) >= 1) {
								
								PlayerInventory.removeItemIgnoringMeta(p, Material.ROTTEN_FLESH, 4);
								
								removeLava(p, smeltery);
								
								p.getInventory().addItem(new ItemStack(Material.LEATHER, 1));
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 1, 1);
								
							}
							else {
								messages.NoMoreLava(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
							}
						}
						else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.FIZZ, 1, 1);
						}
					}
				}
			}
			catch(Exception x) {
				
			}
		}
		
		public int getLava(Block smeltery) {
			List<String> smX = scfg.getStringList("smelteries.x");
			List<String> smY = scfg.getStringList("smelteries.y");
			List<String> smZ = scfg.getStringList("smelteries.z");
			List<String> smW = scfg.getStringList("smelteries.world");
			List<String> smL = scfg.getStringList("smelteries.lava");
			
			int lava = 0;
			
			if (smX.contains(String.valueOf(smeltery.getLocation().getX())) && smY.contains(String.valueOf(smeltery.getLocation().getY())) && smZ.contains(String.valueOf(smeltery.getLocation().getZ())) && smW.contains(smeltery.getLocation().getWorld().getName())) {
				for(int i = 0; i < smX.size(); i++) {
					if (Double.parseDouble(smX.get(i)) == smeltery.getLocation().getX()) {
						if (Double.parseDouble(smY.get(i)) == smeltery.getLocation().getY()) {
							if (Double.parseDouble(smZ.get(i)) == smeltery.getLocation().getZ()) {
								if (smW.get(i).equalsIgnoreCase(smeltery.getWorld().getName())) {
									lava = Integer.parseInt(smL.get(i));
									break;
								}
							}
						}
					}
				}
			}
			return lava;
		}
		
		public void addLava(Player p, Block smeltery) {
			List<String> smX = scfg.getStringList("smelteries.x");
			List<String> smY = scfg.getStringList("smelteries.y");
			List<String> smZ = scfg.getStringList("smelteries.z");
			List<String> smW = scfg.getStringList("smelteries.world");
			List<String> smL = scfg.getStringList("smelteries.lava");
			
			if (getLava(smeltery) <= 48) {
				int lava = getLava(smeltery) + 16;
				
				PlayerInventory.removeItemIgnoringMeta(p, Material.LAVA_BUCKET, 1);
				
				p.getInventory().addItem(new ItemStack(Material.BUCKET));
				
				for(int i = 0; i < smX.size(); i++) {
					if (Double.parseDouble(smX.get(i)) == smeltery.getLocation().getX()) {
						if (Double.parseDouble(smY.get(i)) == smeltery.getLocation().getY()) {
							if (Double.parseDouble(smZ.get(i)) == smeltery.getLocation().getZ()) {
								if (smW.get(i).equalsIgnoreCase(smeltery.getWorld().getName())) {
									smL.set(i, String.valueOf(lava));
									scfg.set("smelteries.lava", smL);
									
									try {
										scfg.save(smelteries);
									} catch (IOException e) {
									}
									
									updateSmeltery(p, smeltery);
									break;
								}
						}
					}
				}
			}
			}
			else {
				messages.DecentLava(p);
			}
		}
		
		public void removeLava(Player p, Block smeltery) {
			List<String> smX = scfg.getStringList("smelteries.x");
			List<String> smY = scfg.getStringList("smelteries.y");
			List<String> smZ = scfg.getStringList("smelteries.z");
			List<String> smW = scfg.getStringList("smelteries.world");
			List<String> smL = scfg.getStringList("smelteries.lava");
			
			if (getLava(smeltery) >= 1) {
				int lava = getLava(smeltery) - 1;
				
				for(int i = 0; i < smX.size(); i++) {
					if (Double.parseDouble(smX.get(i)) == smeltery.getLocation().getX()) {
						if (Double.parseDouble(smY.get(i)) == smeltery.getLocation().getY()) {
							if (Double.parseDouble(smZ.get(i)) == smeltery.getLocation().getZ()) {
								if (smW.get(i).equalsIgnoreCase(smeltery.getWorld().getName())) {
									smL.set(i, String.valueOf(lava));
									scfg.set("smelteries.lava", smL);
									
									try {
										scfg.save(smelteries);
									} catch (IOException e) {
									}
									
									updateSmeltery(p, smeltery);
									break;
								}
						}
					}
				}
			}	
		}
	}
		
		public void updateSmeltery(Player p, Block smeltery) {
			p.closeInventory();
			this.openSmeltery(p, smeltery);
		}
}
