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

public class QuantumarmorListener implements Listener {
	
	private startup plugin;

	  public QuantumarmorListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	@EventHandler
    public void onPlayermove(PlayerMoveEvent e) {
	     Player p = e.getPlayer();
	     int speed = this.plugin.getConfig().getInt("armor.quantum.speed");
	     int jump = this.plugin.getConfig().getInt("armor.quantum.jump");
	     int regen = this.plugin.getConfig().getInt("armor.quantum.regeneration");
	     int strength = this.plugin.getConfig().getInt("armor.quantum.strength");
	     try { 
	    	 if (p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 100) {
	    		 p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9990, 0));
	    		 p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9990, speed--));
	    		 if (this.plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
	    			 p.getInventory().getLeggings().setDurability((short) 0); 
	    		 }
	         }
	     }
	     catch (NullPointerException n) {
	     }
	     try {
	         if (p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 100) {
	        	 p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 9990, jump--));
	        	 if (this.plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
	    			 p.getInventory().getBoots().setDurability((short) 0); 
	    		 }
	    	   }
	     }
	     catch (NullPointerException n) {
	     }
	     try {
	         if (p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET && p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 100) {
	           p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 9990, 4));
	           if (this.plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
	    			 p.getInventory().getHelmet().setDurability((short) 0); 
	    		 }
	    	   }
	     }
	     catch (NullPointerException n) {
	     }
	     try {
	    	 if (p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE && p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.DURABILITY) == 100) {
	    		 p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 9990, 10));
	    		 if (this.plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
	    			 p.getInventory().getChestplate().setDurability((short) 0); 
	    		 }
	    	   }
	     }
	     catch (NullPointerException n) {
	     }
	     try {if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 100 && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 100 && p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 100 && p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.DURABILITY) == 100) {
		            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 9990, regen--));
		            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9990, strength--));
		            p.setFoodLevel(30);
		            /*p.removePotionEffect(PotionEffectType.CONFUSION);
		            p.removePotionEffect(PotionEffectType.WITHER);
		            p.removePotionEffect(PotionEffectType.WEAKNESS);
		            p.removePotionEffect(PotionEffectType.POISON);*/
		            if (this.plugin.getConfig().getBoolean("armor.quantum.can-fly") == true) {
		            	if (p.isSneaking()) {
						       Location l = p.getLocation();
						       Vector d = l.getDirection();
						       int flyspeed = this.plugin.getConfig().getInt("armor.quantum.fly-speed");
						       d.multiply(flyspeed);
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
	    	  try {if (p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 100) {
	            e.setCancelled(true);
	               }
	    	  }
	    	  catch (NullPointerException n) {
	    	  }
	        }
	  }

}