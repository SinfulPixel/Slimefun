package me.mrCookieSlime.Slimefun.Listeners.Armor;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Location;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class EnderArmorListener implements Listener {
	
	boolean doNotDamageThePlayerOnEnderPearlUse = false;	
	private startup plugin;
	
	public EnderArmorListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent e){
		if (e.getEntity().getShooter() instanceof Player) {
			Player p = (Player) e.getEntity().getShooter();
	        try {
	    		  if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    			  if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    				  if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    					  if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    							  doNotDamageThePlayerOnEnderPearlUse = true;
	    						  
	    			    	  }
	    		    	  }
	    	    	  }
		    	  }
	    	  }
	    	  catch(Exception x) {
	    		  
	    	  }
		}
    }
 
    @EventHandler
    public void onProjectileHitEvent (ProjectileHitEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player)) {
        	  return; 
        	}
 
        if (e.getEntity().toString().contentEquals("CraftEnderPearl")){
            doNotDamageThePlayerOnEnderPearlUse = true;
            Player p = (Player) e.getEntity().getShooter();
            try {
	    		  if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    			  if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    				  if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    					  if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    							  Location hitlocation = e.getEntity().getLocation();
		    						  Location teleport = new Location(p.getWorld(), hitlocation.getX(), hitlocation.getY(), hitlocation.getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
		    						  p.teleport(teleport);
	    			    	  }
	    		    	  }
	    	    	  }
		    	  }
	    	  }
	    	  catch(Exception x) {
	    	  }
        }
    }
 
    @EventHandler
    public void onEntityDamageEvent (EntityDamageEvent e){
        if (!(e.getEntity() instanceof Player)) { 
        	  return; 
        	}
 
        if (doNotDamageThePlayerOnEnderPearlUse == true){
        	Player p = (Player) e.getEntity();
            try {
	    		  if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    			  if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    				  if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    					  if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    							  e.setCancelled(true);
		    				            doNotDamageThePlayerOnEnderPearlUse = false;
	    			    	  }
	    		    	  }
	    	    	  }
		    	  }
	    	  }
	    	  catch(Exception x) {
	    	  }
        }
    }
}
