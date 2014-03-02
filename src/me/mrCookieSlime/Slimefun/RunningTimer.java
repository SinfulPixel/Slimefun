package me.mrCookieSlime.Slimefun;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class RunningTimer {
	
	public static void runRunnable(final startup plugin) {
		
		plugin.getServer().getScheduler().runTaskTimer(plugin, new BukkitRunnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				for (Player p: Bukkit.getOnlinePlayers()) {
					if (p.getInventory().getHelmet() != null) {
						// Glowstone Helmet
						if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.DURABILITY) == 8) {
				    		p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999, 2));
						}
						// Nano Helmet
						if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 10) {
					        p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 999, 10));
					        if (plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
					        	p.getInventory().getHelmet().setDurability((short) 0); 
					    	}
					    }
						// Quantum Helmet
						if (p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET && p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 100) {
					           p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 9990, 4));
					           if (plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
					    			 p.getInventory().getHelmet().setDurability((short) 0); 
					    		 }
					    	 }
					}
					if (p.getInventory().getChestplate() != null) {
						// Nano Chestplate
						if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.THORNS) == 10) {
				    	    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999, 1));
				    		if (plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
				    		   p.getInventory().getChestplate().setDurability((short) 0); 
				    		}
				    	}
						// Quantum Chestplate
						if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.DURABILITY) == 100) {
				    		 p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 9990, 10));
				    		 if (plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
				    			 p.getInventory().getChestplate().setDurability((short) 0); 
				    		 }
				    	   }
					}
					if (p.getInventory().getLeggings() != null) {
						// Nano Leggings
						if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 10) {
					    	 p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 999, 10));
					    	 if (plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
					    		p.getInventory().getLeggings().setDurability((short) 0); 
					    	 }
					     }
						// Quantum Leggings
						if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 100) {
				    		 p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 9990, 0));
				    		 p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9990, plugin.getConfig().getInt("armor.quantum.speed")));
				    		 if (plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
				    			 p.getInventory().getLeggings().setDurability((short) 0); 
				    		 }
				        }
						// Slime Leggings
						if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.DURABILITY) == 2) {
				        	 p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
				         }
					}
					if (p.getInventory().getBoots() != null) {
						// Nano Boots
						if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 10) {
				        	 p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999, plugin.getConfig().getInt("armor.nano.speed")));
				        	 if (plugin.getConfig().getBoolean("durability.infinite-nanosuit-durability") == true) {
				    			 p.getInventory().getBoots().setDurability((short) 0); 
				    		 }
						}
						// Quantum Boots
						if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 100) {
				        	 p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 9990, plugin.getConfig().getInt("armor.quantum.jump")));
				        	 if (plugin.getConfig().getBoolean("durability.infinite-quantumarmor-durability") == true) {
				    			 p.getInventory().getBoots().setDurability((short) 0); 
				    		 }
						}
						// Slime Boots
						if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 3 && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.DURABILITY) == 2) {
				        	 p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 600, 7));
				    	 }
					}
					if (p.getInventory().getHelmet() != null && p.getInventory().getChestplate() != null && p.getInventory().getLeggings() != null && p.getInventory().getBoots() != null) {
						// Nano Armor
						if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 10 && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 10 && p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 10 && p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.THORNS) == 10) {
					    	p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 999, plugin.getConfig().getInt("armor.nano.regeneration")));
						    p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999, plugin.getConfig().getInt("armor.nano.jump")));
						    if (plugin.getConfig().getBoolean("armor.nano.can-fly") == true) {
						    	if (p.isSneaking()) {
						    		Location l = p.getLocation();
						    		Vector d = l.getDirection();
						 			int speed = plugin.getConfig().getInt("armor.nano.fly-speed");
						 			d.multiply(speed);
						 			p.setVelocity(d);
						        }
						    }
						}
						// Quantum Armor
						if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 100 && p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 100 && p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.OXYGEN) == 100 && p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.DURABILITY) == 100) {
				            p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 9990, plugin.getConfig().getInt("armor.quantum.regeneration")));
				            p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9990, plugin.getConfig().getInt("armor.quantum.strength")));
				            p.setFoodLevel(30);
				            if (plugin.getConfig().getBoolean("armor.quantum.can-fly")) {
				            	if (p.isSneaking()) {
								       Location l = p.getLocation();
								       Vector d = l.getDirection();
								       int flyspeed = plugin.getConfig().getInt("armor.quantum.fly-speed");
								       d.multiply(flyspeed);
								       p.setVelocity(d);
							        }
				            }
				       }
					}
					// Uber Armor
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
									
									if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Resistance")) {
										p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1200, 5));
									}
									if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Strength")) {
										p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1200, 2));
									}
									if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Fast Digging")) {
										p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1200, 3));
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
				
			}
		}, 0L, plugin.getConfig().getInt("armor.update-second-delay") * 20L);
	}

}
