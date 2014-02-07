package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.EnderChestPlusSupporter;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import com.RingOfStorms.util.ecp.chestUtil;

public class CrystalOfRepairingListener implements Listener {
	
	private startup plugin;
	private int delayNORMAL = 4;
	private int delayENDER = 10;
	
	public CrystalOfRepairingListener(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}


    
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		List<Material> materials = new ArrayList<Material>();
		
		materials.add(Material.LEATHER_BOOTS);
		materials.add(Material.LEATHER_CHESTPLATE);
		materials.add(Material.LEATHER_HELMET);
		materials.add(Material.LEATHER_LEGGINGS);
		
		materials.add(Material.IRON_BOOTS);
		materials.add(Material.IRON_CHESTPLATE);
		materials.add(Material.IRON_LEGGINGS);
		materials.add(Material.IRON_HELMET);
		
		materials.add(Material.GOLD_BOOTS);
		materials.add(Material.GOLD_CHESTPLATE);
		materials.add(Material.GOLD_LEGGINGS);
		materials.add(Material.GOLD_HELMET);
		
		materials.add(Material.DIAMOND_BOOTS);
		materials.add(Material.DIAMOND_CHESTPLATE);
		materials.add(Material.DIAMOND_LEGGINGS);
		materials.add(Material.DIAMOND_HELMET);
		
		materials.add(Material.WOOD_SWORD);
		materials.add(Material.STONE_SWORD);
		materials.add(Material.IRON_SWORD);
		materials.add(Material.GOLD_SWORD);
		materials.add(Material.DIAMOND_SWORD);
		
		materials.add(Material.WOOD_SPADE);
		materials.add(Material.STONE_SPADE);
		materials.add(Material.IRON_SPADE);
		materials.add(Material.GOLD_SPADE);
		materials.add(Material.DIAMOND_SPADE);
		
		materials.add(Material.WOOD_PICKAXE);
		materials.add(Material.STONE_PICKAXE);
		materials.add(Material.IRON_PICKAXE);
		materials.add(Material.GOLD_PICKAXE);
		materials.add(Material.DIAMOND_PICKAXE);
		
		materials.add(Material.WOOD_AXE);
		materials.add(Material.STONE_AXE);
		materials.add(Material.IRON_AXE);
		materials.add(Material.GOLD_AXE);
		materials.add(Material.DIAMOND_AXE);
		
		materials.add(Material.WOOD_HOE);
		materials.add(Material.STONE_HOE);
		materials.add(Material.IRON_HOE);
		materials.add(Material.GOLD_HOE);
		materials.add(Material.DIAMOND_HOE);
		
		materials.add(Material.BOW);
		materials.add(Material.FLINT_AND_STEEL);
		materials.add(Material.SHEARS);
		materials.add(Material.FISHING_ROD);
		materials.add(Material.CARROT_STICK);
		
		if (p.getInventory().contains(SlimefunItem.CRYSTAL_OF_REPAIRING)) {
			
				for(int i = 0; i < 46; i++) {
					try {
						if (p.getItemInHand().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayNORMAL) {
								short j = p.getItemInHand().getDurability();
								if (j != 0) {
									j--;
									p.getItemInHand().setDurability(j);
								}
							}
						}
						if (p.getInventory().getHelmet().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayNORMAL) {
								short j = p.getInventory().getHelmet().getDurability();
								if ( j != 0) {
									j--;
									p.getInventory().getHelmet().setDurability(j);
								}
							}
						}
						if (p.getInventory().getChestplate().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayNORMAL) {
								short j = p.getInventory().getChestplate().getDurability();
								if (j != 0) {
									j--;
									p.getInventory().getChestplate().setDurability(j);
								}
							}
						}
						if (p.getInventory().getLeggings().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayNORMAL) {
								short j = p.getInventory().getLeggings().getDurability();
								if (j != 0) {
									j--;
									p.getInventory().getLeggings().setDurability(j);
								}
							}
						}
						if (p.getInventory().getBoots().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayNORMAL) {
								short j = p.getInventory().getBoots().getDurability();
								if (j != 0) {
									j--;
									p.getInventory().getBoots().setDurability(j);
								}
							}
						}
					}
					catch(Exception x) {
						
					}
				}
		}
	}
	
	@EventHandler
	public void onMove2(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		List<Material> materials = new ArrayList<Material>();
		
		materials.add(Material.LEATHER_BOOTS);
		materials.add(Material.LEATHER_CHESTPLATE);
		materials.add(Material.LEATHER_HELMET);
		materials.add(Material.LEATHER_LEGGINGS);
		
		materials.add(Material.IRON_BOOTS);
		materials.add(Material.IRON_CHESTPLATE);
		materials.add(Material.IRON_LEGGINGS);
		materials.add(Material.IRON_HELMET);
		
		materials.add(Material.GOLD_BOOTS);
		materials.add(Material.GOLD_CHESTPLATE);
		materials.add(Material.GOLD_LEGGINGS);
		materials.add(Material.GOLD_HELMET);
		
		materials.add(Material.DIAMOND_BOOTS);
		materials.add(Material.DIAMOND_CHESTPLATE);
		materials.add(Material.DIAMOND_LEGGINGS);
		materials.add(Material.DIAMOND_HELMET);
		
		materials.add(Material.WOOD_SWORD);
		materials.add(Material.STONE_SWORD);
		materials.add(Material.IRON_SWORD);
		materials.add(Material.GOLD_SWORD);
		materials.add(Material.DIAMOND_SWORD);
		
		materials.add(Material.WOOD_SPADE);
		materials.add(Material.STONE_SPADE);
		materials.add(Material.IRON_SPADE);
		materials.add(Material.GOLD_SPADE);
		materials.add(Material.DIAMOND_SPADE);
		
		materials.add(Material.WOOD_PICKAXE);
		materials.add(Material.STONE_PICKAXE);
		materials.add(Material.IRON_PICKAXE);
		materials.add(Material.GOLD_PICKAXE);
		materials.add(Material.DIAMOND_PICKAXE);
		
		materials.add(Material.WOOD_AXE);
		materials.add(Material.STONE_AXE);
		materials.add(Material.IRON_AXE);
		materials.add(Material.GOLD_AXE);
		materials.add(Material.DIAMOND_AXE);
		
		materials.add(Material.WOOD_HOE);
		materials.add(Material.STONE_HOE);
		materials.add(Material.IRON_HOE);
		materials.add(Material.GOLD_HOE);
		materials.add(Material.DIAMOND_HOE);
		
		materials.add(Material.BOW);
		materials.add(Material.FLINT_AND_STEEL);
		materials.add(Material.SHEARS);
		materials.add(Material.FISHING_ROD);
		materials.add(Material.CARROT_STICK);
		
		if (Bukkit.getPluginManager().isPluginEnabled("EnderChestPlus")) {
			if (this.plugin.ECPcfg.getBoolean("use") == true) {
				if (chestUtil.playerHasFileConfig(p.getName())) {
					chestUtil.loadToMemory(p.getName());
					Inventory ECP = EnderChestPlusSupporter.getInventoryObject(p.getName());

						if (p.getInventory().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING) || p.getEnderChest().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING) || ECP.contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING)) {
							
							for(int i = 0; i < 46; i++) {
								try {
									if (p.getItemInHand().getType() == materials.get(i)) {
										if (new Random().nextInt(1000) < delayENDER) {
											short j = p.getItemInHand().getDurability();
											if (j != 0) {
												j--;
												p.getItemInHand().setDurability(j);
											}
										}
									}
									if (p.getInventory().getHelmet().getType() == materials.get(i)) {
										if (new Random().nextInt(1000) < delayENDER) {
											short j = p.getInventory().getHelmet().getDurability();
											if ( j != 0) {
												j--;
												p.getInventory().getHelmet().setDurability(j);
											}
										}
									}
									if (p.getInventory().getChestplate().getType() == materials.get(i)) {
										if (new Random().nextInt(1000) < delayENDER) {
											short j = p.getInventory().getChestplate().getDurability();
											if (j != 0) {
												j--;
												p.getInventory().getChestplate().setDurability(j);
											}
										}
									}
									if (p.getInventory().getLeggings().getType() == materials.get(i)) {
										if (new Random().nextInt(1000) < delayENDER) {
											short j = p.getInventory().getLeggings().getDurability();
											if (j != 0) {
												j--;
												p.getInventory().getLeggings().setDurability(j);
											}
										}
									}
									if (p.getInventory().getBoots().getType() == materials.get(i)) {
										if (new Random().nextInt(1000) < delayENDER) {
											short j = p.getInventory().getBoots().getDurability();
											if (j != 0) {
												j--;
												p.getInventory().getBoots().setDurability(j);
											}
										}
									}
								}
								catch(Exception x) {
									
								}
							}
					}
					
				}
				else {
					if (p.getInventory().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING) || p.getEnderChest().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING)) {
						
						
						for(int i = 0; i < 46; i++) {
							try {
								if (p.getItemInHand().getType() == materials.get(i)) {
									if (new Random().nextInt(1000) < delayENDER) {
										short j = p.getItemInHand().getDurability();
										if (j != 0) {
											j--;
											p.getItemInHand().setDurability(j);
										}
									}
								}
								if (p.getInventory().getHelmet().getType() == materials.get(i)) {
									if (new Random().nextInt(1000) < delayENDER) {
										short j = p.getInventory().getHelmet().getDurability();
										if ( j != 0) {
											j--;
											p.getInventory().getHelmet().setDurability(j);
										}
									}
								}
								if (p.getInventory().getChestplate().getType() == materials.get(i)) {
									if (new Random().nextInt(1000) < delayENDER) {
										short j = p.getInventory().getChestplate().getDurability();
										if (j != 0) {
											j--;
											p.getInventory().getChestplate().setDurability(j);
										}
									}
								}
								if (p.getInventory().getLeggings().getType() == materials.get(i)) {
									if (new Random().nextInt(1000) < delayENDER) {
										short j = p.getInventory().getLeggings().getDurability();
										if (j != 0) {
											j--;
											p.getInventory().getLeggings().setDurability(j);
										}
									}
								}
								if (p.getInventory().getBoots().getType() == materials.get(i)) {
									if (new Random().nextInt(1000) < delayENDER) {
										short j = p.getInventory().getBoots().getDurability();
										if (j != 0) {
											j--;
											p.getInventory().getBoots().setDurability(j);
										}
									}
								}
							}
							catch(Exception x) {
								
							}
						}
				}
				}
			}
			else {
				if (p.getInventory().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING) || p.getEnderChest().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING)) {
					
					
					for(int i = 0; i < 46; i++) {
						try {
							if (p.getItemInHand().getType() == materials.get(i)) {
								if (new Random().nextInt(1000) < delayENDER) {
									short j = p.getItemInHand().getDurability();
									if (j != 0) {
										j--;
										p.getItemInHand().setDurability(j);
									}
								}
							}
							if (p.getInventory().getHelmet().getType() == materials.get(i)) {
								if (new Random().nextInt(1000) < delayENDER) {
									short j = p.getInventory().getHelmet().getDurability();
									if ( j != 0) {
										j--;
										p.getInventory().getHelmet().setDurability(j);
									}
								}
							}
							if (p.getInventory().getChestplate().getType() == materials.get(i)) {
								if (new Random().nextInt(1000) < delayENDER) {
									short j = p.getInventory().getChestplate().getDurability();
									if (j != 0) {
										j--;
										p.getInventory().getChestplate().setDurability(j);
									}
								}
							}
							if (p.getInventory().getLeggings().getType() == materials.get(i)) {
								if (new Random().nextInt(1000) < delayENDER) {
									short j = p.getInventory().getLeggings().getDurability();
									if (j != 0) {
										j--;
										p.getInventory().getLeggings().setDurability(j);
									}
								}
							}
							if (p.getInventory().getBoots().getType() == materials.get(i)) {
								if (new Random().nextInt(1000) < delayENDER) {
									short j = p.getInventory().getBoots().getDurability();
									if (j != 0) {
										j--;
										p.getInventory().getBoots().setDurability(j);
									}
								}
							}
						}
						catch(Exception x) {
							
						}
					}
			}
			}
		}
		else {
			if (p.getInventory().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING) || p.getEnderChest().contains(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING)) {
				
				
				for(int i = 0; i < 46; i++) {
					try {
						if (p.getItemInHand().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayENDER) {
								short j = p.getItemInHand().getDurability();
								if (j != 0) {
									j--;
									p.getItemInHand().setDurability(j);
								}
							}
						}
						if (p.getInventory().getHelmet().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayENDER) {
								short j = p.getInventory().getHelmet().getDurability();
								if ( j != 0) {
									j--;
									p.getInventory().getHelmet().setDurability(j);
								}
							}
						}
						if (p.getInventory().getChestplate().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayENDER) {
								short j = p.getInventory().getChestplate().getDurability();
								if (j != 0) {
									j--;
									p.getInventory().getChestplate().setDurability(j);
								}
							}
						}
						if (p.getInventory().getLeggings().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayENDER) {
								short j = p.getInventory().getLeggings().getDurability();
								if (j != 0) {
									j--;
									p.getInventory().getLeggings().setDurability(j);
								}
							}
						}
						if (p.getInventory().getBoots().getType() == materials.get(i)) {
							if (new Random().nextInt(1000) < delayENDER) {
								short j = p.getInventory().getBoots().getDurability();
								if (j != 0) {
									j--;
									p.getInventory().getBoots().setDurability(j);
								}
							}
						}
					}
					catch(Exception x) {
						
					}
				}
		}
		}
	}
	
	public ItemStack Setname(ItemStack iss, String Name, String Description) {
   	    ItemStack tree = iss;
   	    ItemMeta orange = tree.getItemMeta();
   	    orange.setDisplayName(Name);
   	    tree.setItemMeta(orange);
   	    return tree;
   	  }
		public ItemStack setLore(ItemStack item, String lore){
         ItemMeta im = item.getItemMeta();
         List<String> ll = new ArrayList<String>();
         ll.add(lore);
         im.setLore(ll);
         item.setItemMeta(im);
         return item;
       }
		public ItemStack setDurability(ItemStack item, int i) {
			item.setDurability((short) i);
			return item;
		}

}
