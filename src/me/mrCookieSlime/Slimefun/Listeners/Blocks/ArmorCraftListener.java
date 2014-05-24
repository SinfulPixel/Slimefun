package me.mrCookieSlime.Slimefun.Listeners.Blocks;

import me.mrCookieSlime.CSCoreLib.general.Player.PlayerInventory;
import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ArmorCraftListener implements Listener {
	
	private startup plugin;
	
	public ArmorCraftListener(startup instance) {
		plugin = instance;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	  public void onClick(InventoryClickEvent e) {
    try {
			  Player p = (Player) e.getWhoClicked();
				 if (ToolBenchListener.tb.get(p.getName()).equals("armor")) {
					  e.setCancelled(true);
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Ender boots")) {
						  if (p.getInventory().contains(Material.ENDER_PEARL, 6) && p.getInventory().contains(Material.EYE_OF_ENDER, 3) && p.getInventory().contains(Material.OBSIDIAN, 1) ) {
							  
							  PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PEARL, 6);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.EYE_OF_ENDER, 3);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 1);
							  
							  p.getInventory().addItem(SlimefunItem.ENDER_BOOTS);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
						  
					  	}
					 
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Ender leggings")) {
						  if (p.getInventory().contains(Material.ENDER_PEARL, 10) && p.getInventory().contains(Material.EYE_OF_ENDER, 6) && p.getInventory().contains(Material.OBSIDIAN, 1) ) {
							  
							  PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PEARL, 10);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.EYE_OF_ENDER, 6);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 1);
							  
							  p.getInventory().addItem(SlimefunItem.ENDER_LEGGINGS);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					  
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Ender chestplate")) {
						  if (p.getInventory().contains(Material.ENDER_PEARL, 12) && p.getInventory().contains(Material.EYE_OF_ENDER, 7) && p.getInventory().contains(Material.OBSIDIAN, 2) ) {
							  
							  PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PEARL, 12);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.EYE_OF_ENDER, 7);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 2);
						      
							  p.getInventory().addItem(SlimefunItem.ENDER_CHESTPLATE);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					 
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_PURPLE + "Ender helmet")) {
						  if (p.getInventory().contains(Material.ENDER_PEARL, 8) && p.getInventory().contains(Material.EYE_OF_ENDER, 4) && p.getInventory().contains(Material.OBSIDIAN, 1) ) {
							  
							  PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PEARL, 8);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.EYE_OF_ENDER, 4);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 1);
							  
							  p.getInventory().addItem(SlimefunItem.ENDER_HELMET);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Glowstone boots")) {
						  if (p.getInventory().contains(Material.GLOWSTONE, 4) && p.getInventory().contains(Material.GOLD_INGOT,2)) {

							  PlayerInventory.removeItemIgnoringMeta(p, Material.GLOWSTONE, 4);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.GOLD_INGOT, 2);
							  
							  p.getInventory().addItem(SlimefunItem.GLOWSTONE_BOOTS);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Glowstone leggings")) {
						  if (p.getInventory().contains(Material.GLOWSTONE, 7) && p.getInventory().contains(Material.GOLD_INGOT,3)) {
							  
							  PlayerInventory.removeItemIgnoringMeta(p, Material.GLOWSTONE, 7);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.GOLD_INGOT, 3);
							  
							  p.getInventory().addItem(SlimefunItem.GLOWSTONE_LEGGINGS);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Glowstone chestplate")) {
						  if (p.getInventory().contains(Material.GLOWSTONE, 8) && p.getInventory().contains(Material.GOLD_INGOT,4)) {
							  
							  PlayerInventory.removeItemIgnoringMeta(p, Material.GLOWSTONE, 8);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.GOLD_INGOT, 4);
							  
							  p.getInventory().addItem(SlimefunItem.GLOWSTONE_CHESTPLATE);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "Glowstone helmet")) {
						  if (p.getInventory().contains(Material.GLOWSTONE, 5) && p.getInventory().contains(Material.GOLD_INGOT,2)) {
							  
							  PlayerInventory.removeItemIgnoringMeta(p, Material.GLOWSTONE, 5);
							  PlayerInventory.removeItemIgnoringMeta(p, Material.GOLD_INGOT, 2);
							  
							  p.getInventory().addItem(SlimefunItem.GLOWSTONE_HELMET);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							  messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					  if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Slime helmet")) {
						  if (p.getInventory().contains(Material.SLIME_BALL, 4) && p.getInventory().contains(Material.IRON_INGOT,1)) {
							  
							 PlayerInventory.removeItemIgnoringMeta(p, Material.SLIME_BALL, 4);
							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_INGOT, 1);
							  
							 p.getInventory().addItem(SlimefunItem.SLIME_HELMET);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						  }
						  else {
							 messages.NotEnoughMaterials(p);
							  e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						  }
					  	}
					  if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Slime chestplate")) {
						 if (p.getInventory().contains(Material.SLIME_BALL, 7) && p.getInventory().contains(Material.IRON_INGOT,1)) {

							PlayerInventory.removeItemIgnoringMeta(p, Material.SLIME_BALL, 7);
							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_INGOT, 1);
							  
							  p.getInventory().addItem(SlimefunItem.SLIME_CHESTPLATE);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					  if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Slime leggings")) {
						 if (p.getInventory().contains(Material.SLIME_BALL, 6) && p.getInventory().contains(Material.IRON_INGOT,1)) {

							PlayerInventory.removeItemIgnoringMeta(p, Material.SLIME_BALL, 6);
							PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_INGOT, 1);
							  
							  p.getInventory().addItem(SlimefunItem.SLIME_LEGGINGS);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					  if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Slime boots")) {
						 if (p.getInventory().contains(Material.SLIME_BALL, 4) && p.getInventory().contains(Material.IRON_INGOT,1)) {

							PlayerInventory.removeItemIgnoringMeta(p, Material.SLIME_BALL, 4);
							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_INGOT, 1);
							  
							  p.getInventory().addItem(SlimefunItem.SLIME_BOOTS);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					  if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Nanosuit helmet")) {
						 if (p.getInventory().contains(Material.OBSIDIAN, 4) && p.getInventory().containsAtLeast(SlimefunItem.NANO_FOCUS, 1)) {
							 
							PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 4);
							PlayerInventory.removeItem(p, SlimefunItem.NANO_FOCUS, 1);
							 
							p.getInventory().addItem(SlimefunItem.NANO_HELMET);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Nanosuit chestplate")) {
						 if (p.getInventory().contains(Material.OBSIDIAN, 7) && p.getInventory().containsAtLeast(SlimefunItem.NANO_FOCUS, 1)) {
							 
							PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 7);
							PlayerInventory.removeItem(p, SlimefunItem.NANO_FOCUS, 1);
							 
							 p.getInventory().addItem(SlimefunItem.NANO_CHESTPLATE);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Nanosuit leggings")) {
						 if (p.getInventory().contains(Material.OBSIDIAN, 6) && p.getInventory().containsAtLeast(SlimefunItem.NANO_FOCUS, 1)) {
							 
							PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 6);
							PlayerInventory.removeItem(p, SlimefunItem.NANO_FOCUS, 1);
							 
							p.getInventory().addItem(SlimefunItem.NANO_LEGGINGS);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GRAY + "Nanosuit boots")) {
						 if (p.getInventory().contains(Material.OBSIDIAN, 4) && p.getInventory().containsAtLeast(SlimefunItem.NANO_FOCUS, 1)) {
							 
							PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 4);
							PlayerInventory.removeItem(p, SlimefunItem.NANO_FOCUS, 1);
							
							p.getInventory().addItem(SlimefunItem.NANO_BOOTS);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Quatumarmor helmet")) {
						 if (p.getInventory().contains(Material.IRON_BLOCK, 2) && p.getInventory().containsAtLeast(SlimefunItem.QUANTUM_FOCUS, 2) && p.getInventory().containsAtLeast(SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1)) {
							 
							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.QUANTUM_FOCUS, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1);
							 
							 p.getInventory().addItem(SlimefunItem.QUANTUM_HELMET);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Quatumarmor chestplate")) {
						 if (p.getInventory().contains(Material.IRON_BLOCK, 5) && p.getInventory().containsAtLeast(SlimefunItem.QUANTUM_FOCUS, 2) && p.getInventory().containsAtLeast(SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1)) {
							 
							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 5);
							 PlayerInventory.removeItem(p, SlimefunItem.QUANTUM_FOCUS, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1);
							 
							 p.getInventory().addItem(SlimefunItem.QUANTUM_CHESTPLATE);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Quatumarmor leggings")) {
						 if (p.getInventory().contains(Material.IRON_BLOCK, 4) && p.getInventory().containsAtLeast(SlimefunItem.QUANTUM_FOCUS, 2) && p.getInventory().containsAtLeast(SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1)) {

							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 4);
							 PlayerInventory.removeItem(p, SlimefunItem.QUANTUM_FOCUS, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1);
							 
							 p.getInventory().addItem(SlimefunItem.QUANTUM_LEGGINGS);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.WHITE + "Quatumarmor boots")) {
						 if (p.getInventory().contains(Material.IRON_BLOCK, 2) && p.getInventory().containsAtLeast(SlimefunItem.QUANTUM_FOCUS, 2) && p.getInventory().containsAtLeast(SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1)) {

							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.QUANTUM_FOCUS, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.SIMPLE_CIRCUIT_BOARD, 1);
							 
							 p.getInventory().addItem(SlimefunItem.QUANTUM_BOOTS);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							e.setCancelled(true);
							p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Helmet")) {
						if (p.getInventory().contains(Material.IRON_BLOCK, 5) && p.getInventory().containsAtLeast(SlimefunItem.UBER_FOCUS, 4) && p.getInventory().contains(Material.GHAST_TEAR, 8) && p.getInventory().containsAtLeast(SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4) && p.getInventory().containsAtLeast(SlimefunItem.STEEL_PLATE, 1) ) {

							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 5);
							 PlayerInventory.removeItemIgnoringMeta(p, Material.GHAST_TEAR, 8);
							 PlayerInventory.removeItem(p, SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4);
							 PlayerInventory.removeItem(p, SlimefunItem.STEEL_PLATE, 1);
							 PlayerInventory.removeItem(p, SlimefunItem.UBER_FOCUS, 4);
							 
							 	p.getInventory().addItem(SlimefunItem.UBER_HELMET);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							 e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
						 if (p.getInventory().contains(Material.IRON_BLOCK, 8) && p.getInventory().containsAtLeast(SlimefunItem.UBER_FOCUS, 4) && p.getInventory().contains(Material.GHAST_TEAR, 10) && p.getInventory().containsAtLeast(SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4) && p.getInventory().containsAtLeast(SlimefunItem.STEEL_PLATE, 2)) {

							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 8);
							 PlayerInventory.removeItemIgnoringMeta(p, Material.GHAST_TEAR, 10);
							 PlayerInventory.removeItem(p, SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4);
							 PlayerInventory.removeItem(p, SlimefunItem.STEEL_PLATE, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.UBER_FOCUS, 4);
							 
							 p.getInventory().addItem(SlimefunItem.UBER_CHESTPLATE);
							 e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							 e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Leggings")) {
						 if (p.getInventory().contains(Material.IRON_BLOCK, 7) && p.getInventory().containsAtLeast(SlimefunItem.UBER_FOCUS, 4) && p.getInventory().contains(Material.GHAST_TEAR, 9) && p.getInventory().containsAtLeast(SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4) && p.getInventory().containsAtLeast(SlimefunItem.STEEL_PLATE, 2)) {

							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 7);
							 PlayerInventory.removeItemIgnoringMeta(p, Material.GHAST_TEAR, 9);
							 PlayerInventory.removeItem(p, SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4);
							 PlayerInventory.removeItem(p, SlimefunItem.STEEL_PLATE, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.UBER_FOCUS, 4);
							 
							 p.getInventory().addItem(SlimefunItem.UBER_LEGGINGS);
							 e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							 e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
					  }
					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Boots")) {
						 if (p.getInventory().contains(Material.IRON_BLOCK, 4) && p.getInventory().containsAtLeast(SlimefunItem.UBER_FOCUS, 4) && p.getInventory().contains(Material.GHAST_TEAR, 6) && p.getInventory().containsAtLeast(SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4) && p.getInventory().containsAtLeast(SlimefunItem.STEEL_PLATE, 2)) {

							 PlayerInventory.removeItemIgnoringMeta(p, Material.IRON_BLOCK, 4);
							 PlayerInventory.removeItemIgnoringMeta(p, Material.GHAST_TEAR, 6);
							 PlayerInventory.removeItem(p, SlimefunItem.ADVANCED_CIRCUIT_BOARD, 4);
							 PlayerInventory.removeItem(p, SlimefunItem.STEEL_PLATE, 2);
							 PlayerInventory.removeItem(p, SlimefunItem.UBER_FOCUS, 4);
							 
							 p.getInventory().addItem(SlimefunItem.UBER_BOOTS);
							 e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
						 }
						 else {
							 messages.NotEnoughMaterials(p);
							 e.setCancelled(true);
							 p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 1, 1);
						 }
						}
				 	}
    			}
    			catch(Exception x) {
    	
    		}
     }

}
