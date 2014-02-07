package me.mrCookieSlime.Slimefun.Listeners.Armor;

import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.ChatColor;
import org.bukkit.Color;
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
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
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
  public void onPlayermove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		if (p.getInventory().getHelmet() != null) {
			if (p.getInventory().getHelmet().hasItemMeta()) {
				if (p.getInventory().getHelmet().getItemMeta().hasDisplayName()) {
					if (p.getInventory().getHelmet().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Helmet")) {
						if (p.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor.GRAY + "Scuba Helmet")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 5));
						}
						if (p.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor.GRAY + "Night Vision Goggles")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1200, 5));
						}
						if (p.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor.GRAY + "Absorption")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200, 4));
						}
						if (p.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor.GRAY + "Regeneration")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200, 5));
						}
						if (p.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor.GRAY + "Feeder")) {
							p.setFoodLevel(20);
						}
						if (p.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor.GRAY + "Milk Module")) {
							if (p.hasPotionEffect(PotionEffectType.BLINDNESS)) {
								p.removePotionEffect(PotionEffectType.BLINDNESS);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
							if (p.hasPotionEffect(PotionEffectType.CONFUSION)) {
								p.removePotionEffect(PotionEffectType.CONFUSION);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
							if (p.hasPotionEffect(PotionEffectType.HUNGER)) {
								p.removePotionEffect(PotionEffectType.HUNGER);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
							if (p.hasPotionEffect(PotionEffectType.POISON)) {
								p.removePotionEffect(PotionEffectType.POISON);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
							if (p.hasPotionEffect(PotionEffectType.SLOW)) {
								p.removePotionEffect(PotionEffectType.SLOW);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
							if (p.hasPotionEffect(PotionEffectType.SLOW_DIGGING)) {
								p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
							if (p.hasPotionEffect(PotionEffectType.WEAKNESS)) {
								p.removePotionEffect(PotionEffectType.WEAKNESS);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
							if (p.hasPotionEffect(PotionEffectType.WITHER)) {
								p.removePotionEffect(PotionEffectType.WITHER);
								p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
							}
						}
						if (p.getInventory().getHelmet().getItemMeta().getLore().contains(ChatColor.GRAY + "Disco")) {
							
							Color uber = Color.fromRGB(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255));
							
							ItemMeta him = p.getInventory().getHelmet().getItemMeta();
							((LeatherArmorMeta) him).setColor(uber);
							p.getInventory().getHelmet().setItemMeta(him);
							
							if (p.getInventory().getChestplate() != null) {
								if (p.getInventory().getChestplate().hasItemMeta()) {
									if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
										if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
											ItemMeta im = p.getInventory().getChestplate().getItemMeta();
											((LeatherArmorMeta) im).setColor(uber);
											p.getInventory().getChestplate().setItemMeta(im);
										}
									}
								}
							}
							
							if (p.getInventory().getLeggings() != null) {
								if (p.getInventory().getLeggings().hasItemMeta()) {
									if (p.getInventory().getLeggings().getItemMeta().hasDisplayName()) {
										if (p.getInventory().getLeggings().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Leggings")) {
											ItemMeta im = p.getInventory().getLeggings().getItemMeta();
											((LeatherArmorMeta) im).setColor(uber);
											p.getInventory().getLeggings().setItemMeta(im);
										}
									}
								}
							}
							
							if (p.getInventory().getBoots() != null) {
								if (p.getInventory().getBoots().hasItemMeta()) {
									if (p.getInventory().getBoots().getItemMeta().hasDisplayName()) {
										if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Boots")) {
											ItemMeta im = p.getInventory().getBoots().getItemMeta();
											((LeatherArmorMeta) im).setColor(uber);
											p.getInventory().getBoots().setItemMeta(im);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		if (p.getInventory().getChestplate() != null) {
			if (p.getInventory().getChestplate().hasItemMeta()) {
				if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
					if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
						
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
						
						if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Resistance")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 5));
						}
						if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Strength")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1200, 2));
						}
						if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Fast Digging")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 3));
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
					}
				}
			}
		}
		
		if (p.getInventory().getLeggings() != null) {
			if (p.getInventory().getLeggings().hasItemMeta()) {
				if (p.getInventory().getLeggings().getItemMeta().hasDisplayName()) {
					if (p.getInventory().getLeggings().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Leggings")) {
						if (p.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor.GRAY + "Kinetic Legs")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1200, 5));
						}
						if (p.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor.GRAY + "Fire Resistance")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1200, 5));
						}
						if (p.getInventory().getLeggings().getItemMeta().getLore().contains(ChatColor.GRAY + "Armor-Repair")) {
							try {
								if (p.getInventory().getHelmet().getType() != Material.AIR) {
									if (new Random().nextInt(1000) < 10) {
										short j = p.getInventory().getHelmet().getDurability();
										if ( j != 0) {
											j--;
											p.getInventory().getHelmet().setDurability(j);
										}
									}
								}
							}
							catch(NullPointerException x) {
							}
							try {
								if (p.getInventory().getChestplate().getType() != Material.AIR) {
									if (new Random().nextInt(1000) < 10) {
										short j = p.getInventory().getChestplate().getDurability();
										if (j != 0) {
											j--;
											p.getInventory().getChestplate().setDurability(j);
										}
									}
								}
							}
							catch(NullPointerException x) {
							}
							try {
								if (p.getInventory().getLeggings().getType() != Material.AIR) {
									if (new Random().nextInt(1000) < 10) {
										short j = p.getInventory().getLeggings().getDurability();
										if (j != 0) {
											j--;
											p.getInventory().getLeggings().setDurability(j);
										}
									}
								}
							}
							catch(NullPointerException x) {
							}
							try {
								if (p.getInventory().getBoots().getType() != Material.AIR) {
									if (new Random().nextInt(1000) < 10) {
										short j = p.getInventory().getBoots().getDurability();
										if (j != 0) {
											j--;
											p.getInventory().getBoots().setDurability(j);
										}
									}
								}
							}
							catch(NullPointerException x) {
							}
						}
					}
				}
			}
		}
		
		if (p.getInventory().getBoots() != null) {
			if (p.getInventory().getBoots().hasItemMeta()) {
				if (p.getInventory().getBoots().getItemMeta().hasDisplayName()) {
					if (p.getInventory().getBoots().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Boots")) {
						if (p.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor.GRAY + "Jump Assist")) {
							p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1200, 8));
						}
						if (p.getInventory().getBoots().getItemMeta().getLore().contains(ChatColor.GRAY + "Double Jump")) {
							if (p.isOnGround() && p.getGameMode() != GameMode.CREATIVE) {
								p.setAllowFlight(true);
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
