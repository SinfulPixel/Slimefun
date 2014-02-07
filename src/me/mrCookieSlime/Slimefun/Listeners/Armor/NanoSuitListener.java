package me.mrCookieSlime.Slimefun.Listeners.Armor;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class NanoSuitListener implements Listener {
	private startup plugin;

	  public NanoSuitListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler
	  public void onEntityDamaged(EntityDamageEvent e){
	      if (((e.getEntity() instanceof Player)) && (e.getCause().equals(EntityDamageEvent.DamageCause.FALL))) {
	        Player p = (Player)e.getEntity();
	    	  try {if (p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 10) {
	            e.setCancelled(true);
	               }
	    	  }
	    	  catch (NullPointerException n) {
	    	  }
	        }
	  }
}