package me.mrCookieSlime.Slimefun.Items;

import java.util.HashMap;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Inventories.SlimefunInventory;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class SlimefunGuide implements Listener {
	
	public static HashMap<String, String> inv = new HashMap<String, String>();
	public static startup plugin;

	  public SlimefunGuide(startup instance)
	  {
	    plugin = instance;
	    plugin.getServer().getPluginManager().registerEvents(this, plugin);
	  }
	  
	  @EventHandler
	  public void onGuide(PlayerInteractEvent e) {
		  Player p = e.getPlayer();
		  if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			  if (p.getItemInHand().getType() == Material.ENCHANTED_BOOK && p.getItemInHand().getDurability() == 1) {
				  p.openInventory(SlimefunInventory.craftGuide(p));
				  inv.put(p.getName(), "recipe");
				  p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
			  } 
		  }
	  }
	  
	  
	  
	  @EventHandler
      public void in(InventoryCloseEvent e) {
   	   try {
   	   Player p = (Player) e.getPlayer();
   	   if (inv.get(p.getName()).equals("noob")) {
   		inv.remove(p.getName());
   		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
   	   	   }
   	if (inv.get(p.getName()).equals("donators")) {
   		inv.remove(p.getName());
   		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
   	   	   }
   	if (inv.get(p.getName()).equals("recipe")) {
   		inv.remove(p.getName());
   		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
   	   	   }
   	if (inv.get(p.getName()).equals("team")) {
   		inv.remove(p.getName());
   		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
   	   	   }
   	if (inv.get(p.getName()).equals("success")) {
   		inv.remove(p.getName());
   		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
   	   	   }
   	if (inv.get(p.getName()).equals("cheat")) {
   		inv.remove(p.getName());
   		p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
   	   	   }
   	   }
   	   catch (Exception x) {
   	   }
      }
	  
	  @EventHandler
 	  public void onClick(InventoryClickEvent e) {
      try {
 			  Player p = (Player) e.getWhoClicked();
 			  
 			 if (inv.get(p.getName()).equals("recipe")) {
 				 
 				 e.setCancelled(true);
 				 
 				if (e.getSlot() == e.getRawSlot()) {
 					if (Slimefun.getCategories().contains(e.getCurrentItem())) {
 	 	 				 for (int i = 0; i < Slimefun.getCategories().size(); i++) {
 	 						  if (e.getCurrentItem().isSimilar(Slimefun.getCategories().get(i))) {
 	 							  
 	 							  p.closeInventory();
 	 							  p.openInventory(SlimefunInventory.craftSubMenu(p, Slimefun.getCategories().get(i)));
 	 							  inv.put(p.getName(), "recipe");
 	 							  
 	 							  SlimefunInventory.lastInv.put(p, SlimefunInventory.craftSubMenu(p, Slimefun.getCategories().get(i)));
 	 							  
 	 							  break;
 	 						  }
 	 					  }
 	 	 			  }
 	 	 			  else if (Slimefun.getItems().contains(e.getCurrentItem())) {
 	 	 				 for (int i = 0; i < Slimefun.getItems().size(); i++) {
 							  if (e.getCurrentItem().isSimilar(Slimefun.getItems().get(i))) {
 								  
 								  p.closeInventory();
 								  p.openInventory(SlimefunInventory.craftRecipe(p, Slimefun.getItems().get(i)));
 								  inv.put(p.getName(), "recipe");
 								  
 								  break;
 							  }
 						  }
 	 	 			  }
 	 	 			  else if (e.getCurrentItem().isSimilar(SlimefunInventory.exit())) {
 	 	 				  p.closeInventory();
 	 	 				  
 	 	 				  p.openInventory(SlimefunInventory.lastInv.get(p));
 	 	 				  
 	 	 				  inv.put(p.getName(), "recipe");
 	 	 			  }
 				  }
 				}
 			 else if (inv.get(p.getName()).equals("cheat")) {
	 				 
	 				 e.setCancelled(true);
	 				 
	 				if (Slimefun.getCategories().contains(e.getCurrentItem())) {
	 	 				 for (int i = 0; i < Slimefun.getCategories().size(); i++) {
	 						  if (e.getCurrentItem().isSimilar(Slimefun.getCategories().get(i))) {
	 							  
	 							  p.closeInventory();
	 							  p.openInventory(SlimefunInventory.craftSubCheat(p, Slimefun.getCategories().get(i)));
	 							  
	 							  break;
	 						  }
	 					  }
	 	 			  }
				  }
 			if (inv.get(p.getName()).equals("noob")) {
				  messages.nocheating(p);
				  e.setCancelled(true);
		   }
		  if (inv.get(p.getName()).equals("donators")) {
			 if (e.getCurrentItem().getType() == Material.DIAMOND) {
				 e.setCancelled(true);
				p.sendMessage(messages.prefix + ChatColor.BLUE + "" + ChatColor.BOLD + "http://dev.bukkit.org/server-mods/slimefun");
			 }
			 else {
				 if (!p.hasPermission("slimefun.items")) {
 					messages.nocheating(p);
 					 e.setCancelled(true);
 				 }
			 }
		}
         }
         catch (Exception x) {
         }
 	 }

}
