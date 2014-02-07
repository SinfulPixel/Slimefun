package me.mrCookieSlime.Slimefun.Listeners.Armor;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SlimeSuitListener implements Listener {
	private startup plugin;

	  public SlimeSuitListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler(priority = EventPriority.LOWEST)
    public void onPlayermove(PlayerMoveEvent e) {
	     Player p = e.getPlayer();
	     try {
	         if (p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 3 && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.DURABILITY) == 2) {
	        	 p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 7));
	    	   }
	         if (p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.DURABILITY) == 2) {
	        	 p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
	         }
	     }
	     catch (NullPointerException n) {
	     }
	}
	@EventHandler
	  public void onEntityDamaged(EntityDamageEvent e){
	      if (((e.getEntity() instanceof Player)) && (e.getCause().equals(EntityDamageEvent.DamageCause.FALL))) {
	        Player p = (Player)e.getEntity();
	    	  try {if (p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 3 && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.DURABILITY) == 2) {
	            e.setCancelled(true);
	               }
	    	  }
	    	  catch (NullPointerException n) {
	    	  }
	        }
	  }

}