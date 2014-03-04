package me.mrCookieSlime.Slimefun.Listeners.Armor;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
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
import org.bukkit.event.player.PlayerMoveEvent;
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
	  public void onClimb(PlayerMoveEvent e) {
		  Player p = e.getPlayer();
		  if (p.getInventory().getChestplate() != null) {
				if (p.getInventory().getChestplate().hasItemMeta()) {
					if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
						if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
							 if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Spider Climb")) {
							        Block b = p.getLocation().getBlock();
							        if (b.getType() == Material.AIR && (!(b.getRelative(BlockFace.NORTH).getType() == Material.AIR) || !(b.getRelative(BlockFace.EAST).getType() == Material.AIR) || !(b.getRelative(BlockFace.SOUTH).getType() == Material.AIR) || !(b.getRelative(BlockFace.WEST).getType() == Material.AIR))) {
							            p.sendBlockChange(b.getLocation(), Material.VINE, (byte) 0);
							            Block b2 = b.getRelative(BlockFace.UP);
							            if (b2.getType() == Material.AIR && (!(b2.getRelative(BlockFace.NORTH).getType() == Material.AIR) || !(b2.getRelative(BlockFace.EAST).getType() == Material.AIR) || !(b2.getRelative(BlockFace.SOUTH).getType() == Material.AIR) || !(b2.getRelative(BlockFace.WEST).getType() == Material.AIR))) {
							                if (p.getEyeLocation().getBlock().getRelative(BlockFace.UP).getType() == Material.AIR) {
							                	p.sendBlockChange(b2.getLocation(), Material.VINE, (byte) 0);
							                }
							            }
							        }
								}
							 if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Glider")) {
									if(p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.AIR) && p.getLocation().getBlock().getRelative(0, -2, 0).getType().equals(Material.AIR)){
										if(p.getLocation().getPitch() > -5){
											if(p.getLocation().getPitch() < 5){
												p.setVelocity(p.getLocation().getDirection().multiply(0.2));
											}else{
												p.setVelocity(p.getLocation().getDirection().multiply(0.2));
											}
											p.setFallDistance(0F);
										}
								}
							}
							 if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Jetpack")) {
									if (p.isSneaking()) {
										p.getWorld().playSound(p.getLocation(), Sound.EXPLODE, (float) 0.25, 1);
										p.getWorld().playEffect(p.getLocation(), Effect.SMOKE, 1, 1);
										Location l = p.getLocation();
										l.setPitch(1000);
									       Vector d = l.getDirection();
									       d.multiply(0.55);
									       p.setVelocity(d);
									       
									       p.setFallDistance(0F);
									}
								}
						}
					}
				}
		  }
	  }
	  
	
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
