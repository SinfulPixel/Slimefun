package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.util.HashMap;


import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BookoTeleportingListener implements Listener {
	
	private HashMap<String, String> inv = new HashMap<String, String>();
	
	private startup plugin;

	  public BookoTeleportingListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler
      public void in(InventoryCloseEvent e) {
   	   try {
   	   Player p = (Player) e.getPlayer();
   	   if (this.inv.get(p.getName()).equals("BookoTeleporting")) {
   		this.inv.remove(p.getName());
   	   	   }
   	   }
   	   catch (Exception x) {
   	   }
      }
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 6 || p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 3) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  if (p.hasPermission("slimefun.port")){
	    	      this.openInv(p);
	    	      p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
	    	  }
	    	  else {
	    		  messages.NoPermission(p, "slimefun.port");	
	    	  }
	      }
	    }
	  }
	  public void openInv(Player p) {
		  int lines = 0;
		  Player[] players = Bukkit.getOnlinePlayers();
		  while (lines * 9 < players.length - 1) {
			  lines++;
		  }
		  if (lines > 6) {
			  lines = 6;
		  }
		  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.BOLD + "Book o' Teleporting");
		  int slot = 0;
		  for (int i = 0; i < players.length; i++) {
			  Player pl = players[i];
			  if (pl != p) {
				  ItemStack it = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
				  ItemMeta m = it.getItemMeta();
				  m.setDisplayName(ChatColor.AQUA + pl.getName());
				  it.setItemMeta(m);
				  inv.setItem(slot, it);
				  slot++;
			  }
		  }
		  p.openInventory(inv);
		  this.inv.put(p.getName(), "BookoTeleporting");
	  }
	  public void closeInv(Player p) {
		  if (this.inv.containsKey(p.getName())) {
			  p.closeInventory();
			  this.inv.remove(p.getName());
		  }
	  }
	  
	  @SuppressWarnings("deprecation")
	@EventHandler
	  public void onClick(InventoryClickEvent e) {
		  if (e.getSlot() == e.getRawSlot()) {
			  Player p = (Player) e.getWhoClicked();
			  if (this.inv.containsKey(p.getName())) {
				  if (this.inv.get(p.getName()).equals("BookoTeleporting")) {
					  e.setCancelled(true);
					  ItemStack it = e.getCurrentItem();
					  if (it != null) {
						  String name = ChatColor.stripColor(it.getItemMeta().getDisplayName());
						  Player pl = Bukkit.getPlayerExact(name);
						  if (pl != null) {
							  p.teleport(pl);
							  messages.PlayerTeleported(p, pl.getName());
							  p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
					    	  p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
						  } else {
							  messages.PlayerIsNotOnline(p, name);
						  }
						  this.closeInv(p);
					  }
				  }
			  }
		  }
	  }
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onClose(InventoryCloseEvent e) {
		  this.inv.remove((Player)e.getPlayer());
	  }
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onKick(PlayerKickEvent e) {
		  this.inv.remove((Player)e.getPlayer());
	  }
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onQuit(PlayerQuitEvent e) {
		  this.inv.remove((Player)e.getPlayer());
	  }
}
