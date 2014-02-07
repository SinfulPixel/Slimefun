package me.mrCookieSlime.Slimefun.Listeners.Items;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PortableEnchanterListener implements Listener {
	
	private startup plugin;

	  public PortableEnchanterListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	@EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract2(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 2 || p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 2) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  p.openEnchanting(null, true);
	    	  p.playSound(p.getLocation(), Sound.LEVEL_UP, 1, 1);
	      }
	    }
	  }
}
