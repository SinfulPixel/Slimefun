package me.mrCookieSlime.Slimefun.Listeners.Armor;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class NanoSuitListener implements Listener {
	private startup plugin;

	  public NanoSuitListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler
	    public void onPlayermove(PlayerMoveEvent e) {
		     Player p = e.getPlayer();
		     try {
		    	 if (p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 10) {
		    		 p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 999, 10));
		    		 if (this.plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
		    			 p.getInventory().getLeggings().setDurability((short) 0); 
		    		 }
		         }
		     }
		     catch (NullPointerException n) {
		     }
		     try {
		         if (p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 10) {
		        	 p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999, this.plugin.getConfig().getInt("armor.nano.speed")));
		        	 if (this.plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
		    			 p.getInventory().getBoots().setDurability((short) 0); 
		    		 }
		    	   }
		     }
		     catch (NullPointerException n) {
		     }
		     try {
		         if (p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET && p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 10) {
		           p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 999, 10));
		           if (this.plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
		    			 p.getInventory().getHelmet().setDurability((short) 0); 
		    		 }
		    	   }
		     }
		     catch (NullPointerException n) {
		     }
		     try {
		    	 if (p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE && p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.THORNS) == 10) {
		    		 p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999, 1));
		    		 if (this.plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
		    			 p.getInventory().getChestplate().setDurability((short) 0); 
		    		 }
		    	   }
		     }
		     catch (NullPointerException n) {
		     }
		     try {if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 10 && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 10 && p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 10 && p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.THORNS) == 10) {
			            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999, this.plugin.getConfig().getInt("armor.nano.regeneration")));
			            p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999, this.plugin.getConfig().getInt("armor.nano.jump")));
			            if (this.plugin.getConfig().getBoolean("armor.nano.can-fly") == true) {
			            	if (p.isSneaking()) {
			 				       Location l = p.getLocation();
			 				       Vector d = l.getDirection();
			 				       int speed = this.plugin.getConfig().getInt("armor.nano.fly-speed");
			 				       d.multiply(speed);
			 				       p.setVelocity(d);
			            		}
			            }
			            }
		     }
			 catch (NullPointerException n) {
		     }
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