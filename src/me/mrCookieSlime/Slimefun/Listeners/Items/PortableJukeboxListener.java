package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
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

public class PortableJukeboxListener implements Listener {
	
private HashMap<String, String> inv = new HashMap<String, String>();
	
	private startup plugin;

	 public PortableJukeboxListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	 
	 @EventHandler
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 10) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  this.openInv(p);
	    	  p.playSound(p.getLocation(), Sound.CHEST_OPEN, (float) 0.7, 1);
	    	  e.setCancelled(true);
	      }
	    }
	  }
	 
	 @SuppressWarnings("deprecation")
	public void openInv(Player p) {
			int lines = 3;
			  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.BOLD + "Portable Jukebox");
			  int slot = 0;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2256)));
			  slot++;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2257)));
			  slot = 9;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2258)));
			  slot++;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2259)));
			  slot = 18;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2260)));
			  slot++;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2261)));
			  slot = 7;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2262)));
			  slot++;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2263)));
			  slot = 16;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2264)));
			  slot++;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2265)));
			  slot = 25;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2266)));
			  slot++;
			  
			  inv.setItem(slot, new ItemStack(Material.getMaterial(2267)));
			  
			  /*slot = 13;
			  ItemStack stop = new ItemStack(Material.FIREWORK_CHARGE);
			  stop = Setname(stop, ChatColor.RED + "Stop Music");
			  inv.setItem(slot, stop);*/
			  
			  p.openInventory(inv);
			  this.inv.put(p.getName(), "music");
	       }
	       @SuppressWarnings("deprecation")
		@EventHandler
	 	  public void onClick(InventoryClickEvent e) {
	      try {
	 		  if (e.getSlot() == e.getRawSlot()) {
	 			  Player p = (Player) e.getWhoClicked();
	 				  if (this.inv.get(p.getName()).equals("music")) {
	 					  e.setCancelled(true);
	 					  /*if (e.getCurrentItem().getType() == Material.FIREWORK_CHARGE) {
	 						 p.closeInventory();
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2257), -64);
	 					  }*/
	 					  if (e.getCurrentItem().getType() == Material.getMaterial(2256)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2256));
	 						  p.closeInventory();
	 					  }
	 					 if (e.getCurrentItem().getType() == Material.getMaterial(2257)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2257));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2258)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2258));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2259)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2259));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2260)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2260));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2261)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2261));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2262)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2262));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2263)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2263));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2264)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2264));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2265)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2265));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2266)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2266));
	 						 p.closeInventory();
	 					  }
	 					if (e.getCurrentItem().getType() == Material.getMaterial(2267)) {
	 						  p.getWorld().playEffect(p.getLocation(), Effect.RECORD_PLAY, Material.getMaterial(2267));
	 						 p.closeInventory();
	 					  }
	 					 
	 					  }
	 				  }
	         }
	         catch (Exception x) {
	         }
	 	 }
	       
	       @EventHandler
	       public void in(InventoryCloseEvent e) {
	    	   try {
	    	   Player p = (Player) e.getPlayer();
	    	   if (this.inv.get(p.getName()).equals("music")) {
	    		   this.inv.remove(p.getName());
	    		   p.playSound(p.getLocation(), Sound.CHEST_CLOSE, (float) 0.7, 1);
	    	   	   }
	    	   }
	    	   catch (Exception x) {
	    	   }
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
	

}
