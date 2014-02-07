package me.mrCookieSlime.Slimefun.Listeners.Armor;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class UberArmorListener implements Listener{
	
	private startup plugin;
	boolean doNotDamageThePlayerOnEnderPearlUse = false;
	
	  public UberArmorListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	
	@SuppressWarnings("deprecation")
	@EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent e){
		if (e.getEntity().getShooter() instanceof Player) {
			Player p = (Player) e.getEntity().getShooter();
			
			if (p.getInventory().getChestplate() != null) {
				if (p.getInventory().getChestplate().hasItemMeta()) {
					if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
						if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
							if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Ender Fake")) {
								doNotDamageThePlayerOnEnderPearlUse = true;
							}
						}
					}
				}
			}
		}
    }
	
	@SuppressWarnings("deprecation")
	@EventHandler
    public void onProjectileHitEvent (ProjectileHitEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player)) {
        	  return; 
        	}
        
        if (e.getEntity().toString().contentEquals("CraftEnderPearl")){
            doNotDamageThePlayerOnEnderPearlUse = true;
            Player p = (Player) e.getEntity().getShooter();
            if (p.getInventory().getChestplate() != null) {
				if (p.getInventory().getChestplate().hasItemMeta()) {
					if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
						if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
							if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Ender Fake")) {
									Location hitlocation = e.getEntity().getLocation();
	    						  Location teleport = new Location(p.getWorld(), hitlocation.getX(), hitlocation.getY(), hitlocation.getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
	    						  p.teleport(teleport);
							}
						}
					}
				}
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
        	if (p.getInventory().getChestplate() != null) {
				if (p.getInventory().getChestplate().hasItemMeta()) {
					if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
						if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
							if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Ender Fake")) {
								 	e.setCancelled(true);
	    				            doNotDamageThePlayerOnEnderPearlUse = false;
							}
						}
					}
				}
			}
        }
    }
	
	@EventHandler
	  public void onEntityDamaged(EntityDamageEvent e){
		if (e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
			if (e.getCause() == DamageCause.FALL) {
				if (p.getInventory().getBoots() != null) {
					if (p.getInventory().getBoots().hasItemMeta()) {
						if (p.getInventory().getBoots().getItemMeta().hasDisplayName()) {
							if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Boots")) {
								if (p.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor.GRAY + "Long Fall Boots")) {
									e.setCancelled(true);
								}
							}
						}
					}
				}
			}
		}
	  }
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onShoot(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Arrow) {
			if (e.getEntity() instanceof Player) {
				Player p = (Player) e.getEntity();
				if (p.getInventory().getChestplate() != null) {
					if (p.getInventory().getChestplate().hasItemMeta()) {
						if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
							if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
								if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Arrow Reflector")) {
									e.getDamager().remove();
									
									Vector direction = p.getEyeLocation().getDirection().multiply(1);
							    	  Projectile projectile = (Projectile)p.getWorld().spawn(p.getEyeLocation().add(direction.getX(), direction.getY(), direction.getZ()), Arrow.class);
							    	  projectile.setShooter(p);
							    	  projectile.setVelocity(direction);
							    	  
									e.setCancelled(true);
								}
							}
						}
					}
				}
			}
		}
	}
	
	@EventHandler
    public void setFlyOnJump(PlayerToggleFlightEvent e) {
        Player p = e.getPlayer();
        
        if(e.isFlying() && e.getPlayer().getGameMode() != GameMode.CREATIVE) {
        	if (p.getInventory().getBoots() != null) {
    			if (p.getInventory().getBoots().hasItemMeta()) {
    				if (p.getInventory().getBoots().getItemMeta().hasDisplayName()) {
    					if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Boots")) {
    						if (p.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor.GRAY + "Double Jump")) {
    							
    						           
    					            p.setFlying(false);
    					            p.getWorld().playSound(p.getLocation(), Sound.EXPLODE, (float) 0.25, 1);
    								p.getWorld().playEffect(p.getLocation(), Effect.SMOKE, 1, 1);
    					            Vector jump = p.getLocation().getDirection().multiply(0.6).setY(2);
    					            p.setVelocity(p.getVelocity().add(jump));
    					           p.setAllowFlight(false);
    					            e.setCancelled(true);
    					        }
    						else {
    			        		p.setAllowFlight(false);
    			        	}
    					}
    					else {
    		        		p.setAllowFlight(false);
    		        	}
    				}
    				else {
    	        		p.setAllowFlight(false);
    	        	}
    			}
    			else {
            		p.setAllowFlight(false);
            	}
    		}
        	else {
        		p.setAllowFlight(false);
        	}
        }
    }
	
}
