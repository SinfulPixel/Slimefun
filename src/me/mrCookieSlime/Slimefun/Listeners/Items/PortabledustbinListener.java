package me.mrCookieSlime.Slimefun.Listeners.Items;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class PortabledustbinListener implements Listener {
	
	private startup plugin;

	  public PortabledustbinListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.BUCKET && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 5 || p.getItemInHand().getType() == Material.BUCKET && p.getItemInHand().getDurability() == 1) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	        Inventory trash = Bukkit.createInventory(p.getPlayer(), 54, ChatColor.BOLD + "Portable dustbin");
	        p.getPlayer().openInventory(trash);
	        p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
	      }
	    }
	  }

}
