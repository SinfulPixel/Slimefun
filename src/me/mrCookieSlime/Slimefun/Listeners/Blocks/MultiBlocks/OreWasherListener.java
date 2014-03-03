package me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.ItemModifier;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.api.BlockAdjacents;
import me.mrCookieSlime.Slimefun.api.PlayerInventory;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.BlockFace;
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

public class OreWasherListener implements Listener {
	
	private HashMap<String, String> inv = new HashMap<String, String>();
	private HashMap<String, Location> washer = new HashMap<String, Location>();
	
	private startup plugin;

	  public OreWasherListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler
      public void in(InventoryCloseEvent e) {
   	   try {
   	   Player p = (Player) e.getPlayer();
   	   if (this.inv.get(p.getName()).equals("wash")) {
   		this.inv.remove(p.getName());
   		this.washer.remove(p.getName());
   	   	   }
   	   }
   	   catch (Exception x) {
   	   }
      }
	  
	  @EventHandler
		public void onPlayerInteract(PlayerInteractEvent e) {
			Player p = e.getPlayer();
			Action a = e.getAction();
			if ((a == Action.RIGHT_CLICK_BLOCK)) {
				if (e.getClickedBlock().getType() == Material.FURNACE) {
					if (BlockAdjacents.hasMaterialOnBothSides(e.getClickedBlock(), Material.IRON_BLOCK)) {
						if (e.getClickedBlock().getRelative(BlockFace.DOWN).getType() == Material.STATIONARY_WATER) {
							if (!p.isSneaking()) {
								if (PlayerResearch.hasResearched(p, "Ore Washing")) {
									e.setCancelled(true);
									openInv(p, e.getClickedBlock().getLocation());
								}
								else {
									messages.NotResearched(p);
									e.setCancelled(true);
								}
							}
						}
					}
				}
			}
		}
		
		public void openInv(Player p, Location l) {
			int lines = 4;
			  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.BOLD + "Ore Washer");
			  int slot = 0;
			  
					ItemStack charcoal = new ItemStack(Material.WATER);
			        charcoal = ItemModifier.Setname(charcoal, ChatColor.AQUA + "Water");
			        inv.setItem(8, charcoal);
			        inv.setItem(17, charcoal);
			        inv.setItem(26, charcoal);
			        inv.setItem(35, charcoal);
			        
			        ItemStack pane = new ItemStack(Material.THIN_GLASS);
			        pane = ItemModifier.Setname(pane, " ");
			        inv.setItem(7, pane);
			        inv.setItem(16, pane);
			        inv.setItem(25, pane);
			        inv.setItem(34, pane);
			        
		        if (plugin.getConfig().getBoolean("items.IronChunk")) {
		        	ItemStack Iron = new ItemStack(Material.IRON_ORE);
		    		ItemMeta IronIM = Iron.getItemMeta();
		            List<String> Ironll = new ArrayList<String>();
		            Ironll.add(ChatColor.YELLOW + "[Click to wash]");
		            Ironll.add("");
		            Ironll.add(ChatColor.BLUE + "Materials needed:");
		            Ironll.add(ChatColor.BLUE + "1 Iron ore");
		            IronIM.setLore(Ironll);
		            Iron.setItemMeta(IronIM);
		            Iron = ItemModifier.Setname(Iron, ChatColor.GREEN + "Wash 2-3 Iron Chunks");
		            inv.setItem(slot, Iron);
		            slot++;
		        }
		        if (plugin.getConfig().getBoolean("items.GoldChunk")) {
		        	ItemStack Iron = new ItemStack(Material.GOLD_ORE);
		    		ItemMeta IronIM = Iron.getItemMeta();
		            List<String> Ironll = new ArrayList<String>();
		            Ironll.add(ChatColor.YELLOW + "[Click to wash]");
		            Ironll.add("");
		            Ironll.add(ChatColor.BLUE + "Materials needed:");
		            Ironll.add(ChatColor.BLUE + "1 Gold ore");
		            IronIM.setLore(Ironll);
		            Iron.setItemMeta(IronIM);
		            Iron = ItemModifier.Setname(Iron, ChatColor.GREEN + "Wash 2-3 Gold Chunks");
		            inv.setItem(slot, Iron);
		            slot++;
		        }
		        if (plugin.getConfig().getBoolean("recipes.allow-washing-diamond-ores")) {
		        	ItemStack Iron = new ItemStack(Material.DIAMOND);
		    		ItemMeta IronIM = Iron.getItemMeta();
		            List<String> Ironll = new ArrayList<String>();
		            Ironll.add(ChatColor.YELLOW + "[Click to wash]");
		            Ironll.add("");
		            Ironll.add(ChatColor.BLUE + "Materials needed:");
		            Ironll.add(ChatColor.BLUE + "1 Diamond Ore");
		            IronIM.setLore(Ironll);
		            Iron.setItemMeta(IronIM);
		            Iron = ItemModifier.Setname(Iron, ChatColor.GREEN + "Wash 2-3 Diamonds");
		            inv.setItem(slot, Iron);
		            slot++;
		        }
		        
		        p.openInventory(inv);
		        this.inv.put(p.getName(), "wash");
		        washer.put(p.getName(), l.getBlock().getRelative(BlockFace.DOWN).getLocation());
	       }
		
	       @EventHandler
	 	  public void onClick(InventoryClickEvent e) {
	      try {
	 			  Player p = (Player) e.getWhoClicked();
	 				  if (this.inv.get(p.getName()).equals("wash")) {
	 					  e.setCancelled(true);
	 					  
	 					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Wash 2-3 Iron Chunks")) {
	 						if (p.getInventory().contains(Material.IRON_ORE, 1)) {
 								
 								PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_ORE, 1);
 								
 								ItemStack chunk = SlimefunItem.IRON_CHUNK.clone();
 								chunk.setAmount(2);
 								if (new Random().nextInt(100) > 50) {
 									chunk.setAmount(3);
 								}
 								
 								p.getInventory().addItem(chunk);
 								e.setCancelled(true);
 								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
 								washer.get(p.getName()).getBlock().setType(Material.AIR);
 								p.closeInventory();
	 						}
	 						else {
	 							messages.NotEnoughMaterials(p);
	 							e.setCancelled(true);
	 							p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
 							}
	 					}
	 					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Wash 2-3 Gold Chunks")) {
	 						if (p.getInventory().contains(Material.GOLD_ORE, 1)) {
 								
 								PlayerInventory.removeItemIgnoringMeta(p, Material.GOLD_ORE, 1);
 								
 								ItemStack chunk = SlimefunItem.GOLD_CHUNK.clone();
 								chunk.setAmount(2);
 								if (new Random().nextInt(100) > 50) {
 									chunk.setAmount(3);
 								}
 								
 								p.getInventory().addItem(chunk);
 								e.setCancelled(true);
 								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
 								washer.get(p.getName()).getBlock().setType(Material.AIR);
 								p.closeInventory();
	 						}
	 						else {
	 							messages.NotEnoughMaterials(p);
	 							e.setCancelled(true);
	 							p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
 							}
	 					}
	 					else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Wash 2-3 Diamonds")) {
	 						if (p.getInventory().contains(Material.DIAMOND_ORE, 1)) {
 								
 								PlayerInventory.removeItemIgnoringMeta(p, Material.DIAMOND_ORE, 1);
 								
 								ItemStack chunk = new ItemStack(Material.DIAMOND, 2);
 								if (new Random().nextInt(100) > 50) {
 									chunk.setAmount(3);
 								}
 								
 								p.getInventory().addItem(chunk);
 								e.setCancelled(true);
 								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
 								washer.get(p.getName()).getBlock().setType(Material.AIR);
 								p.closeInventory();
	 						}
	 						else {
	 							messages.NotEnoughMaterials(p);
	 							e.setCancelled(true);
	 							p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
 							}
	 					}
	 				  }
	         }
	         catch (Exception x) {
	         }
	 	 }

}
