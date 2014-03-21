package me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks;

import java.io.File;
import java.io.IOException;
import java.util.List;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Utilities.BlockAdjacents;
import me.mrCookieSlime.Slimefun.Utilities.PlayerInventory;
import me.mrCookieSlime.Slimefun.Utilities.RecipeCalculator;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MachineListener implements Listener {
	
	public startup plugin;
	
	public MachineListener(startup instance) {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	public File furnaces = new File("data-storage/Slimefun", "ElectricFurnaces.yml");
	public FileConfiguration Fcfg = YamlConfiguration.loadConfiguration(furnaces);
	
	public File refuelers = new File("data-storage/Slimefun", "RefuelingStations.yml");
	public FileConfiguration Rcfg = YamlConfiguration.loadConfiguration(refuelers);
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (e.getClickedBlock().getType() == Material.PISTON_BASE) {
				if (BlockAdjacents.hasMaterialOnTop(e.getClickedBlock(), Material.NETHER_FENCE)) {
					if (BlockAdjacents.hasMaterialOnTop(e.getClickedBlock().getRelative(BlockFace.UP), Material.DAYLIGHT_DETECTOR)) {
						if (BlockAdjacents.hasMaterialOnBothSides(e.getClickedBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP), Material.DAYLIGHT_DETECTOR)) {
							if (PlayerResearch.hasResearched(p, "Solar Panel")) {
								if (plugin.getConfig().getBoolean("items.SolarPanel")) {
									if (p.getItemInHand() != null) {
										if (p.getItemInHand().hasItemMeta()) {
											if (p.getItemInHand().getItemMeta().hasLore()) {
												if (p.getItemInHand().getItemMeta().getLore().size() == 3) {
													if (p.getItemInHand().getItemMeta().getLore().get(1).equalsIgnoreCase(ChatColor.GREEN + "Charge:")) {
														double charge = Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[0]);
														double added = 0.1;
														double max = Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1].replace(" KJ", ""));
														
														int y = (int) e.getClickedBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.UP).getLocation().getY();
														
														for (int i = y; i < p.getWorld().getMaxHeight(); i++) {
															Block b = p.getWorld().getBlockAt((int) e.getClickedBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.UP).getLocation().getX(), i, (int) e.getClickedBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.UP).getLocation().getZ());
															if (b.getType() != Material.AIR) {
																added = 0.0;
																break;
															}
															else if (!BlockAdjacents.hasMaterialOnBothSides(b, Material.AIR)) {
																added = 0.0;
																break;
															}
														}
														
														if (added > 0.0) {
															if (p.getWorld().getTime() < 12300 || p.getWorld().getTime() > 23850) {
															}
															else {
																added = 0.0;
															}
														}
														
														if (charge + added > max) {
															added = max - charge;
														}
														
														charge = charge + added;
														
														double bonus = charge - Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[0]);
														
														updateBattery(p, bonus, charge, true);
													}
												}
											}
										}
									}
								}
							}
							else {
								messages.NotResearched(p);
							}
						}
					}
				}
				else if (BlockAdjacents.hasMaterialOnBothSides(e.getClickedBlock(), Material.IRON_FENCE)) {
					if (e.getClickedBlock().getRelative(BlockFace.DOWN).getType() == Material.STATIONARY_WATER) {
						if (BlockAdjacents.hasMaterialOnBothSides(e.getClickedBlock().getRelative(BlockFace.DOWN), Material.STATIONARY_WATER)) {
							if (PlayerResearch.hasResearched(p, "Water Mill")) {
								if (plugin.getConfig().getBoolean("items.WaterMill")) {
									if (p.getItemInHand() != null) {
										if (p.getItemInHand().hasItemMeta()) {
											if (p.getItemInHand().getItemMeta().hasLore()) {
												if (p.getItemInHand().getItemMeta().getLore().size() == 3) {
													if (p.getItemInHand().getItemMeta().getLore().get(1).equalsIgnoreCase(ChatColor.GREEN + "Charge:")) {
														double charge = Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[0]);
														double added = 0.05;
														double max = Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1].replace(" KJ", ""));
														
														if (charge + added > max) {
															added = max - charge;
														}
														
														charge = charge + added;
														
														double bonus = charge - Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[0]);
														
														updateBattery(p, bonus, charge, true);
													}
												}
											}
										}
									}
								}
							}
							else {
								messages.NotResearched(p);
							}
						}
					}
					else if (e.getClickedBlock().getRelative(BlockFace.DOWN).getType() == Material.STATIONARY_LAVA) {
						if (BlockAdjacents.hasMaterialOnBothSides(e.getClickedBlock().getRelative(BlockFace.DOWN), Material.STATIONARY_LAVA)) {
							if (PlayerResearch.hasResearched(p, "Thermal Generator")) {
								if (plugin.getConfig().getBoolean("items.ThermalGenerator")) {
									if (p.getItemInHand() != null) {
										if (p.getItemInHand().hasItemMeta()) {
											if (p.getItemInHand().getItemMeta().hasLore()) {
												if (p.getItemInHand().getItemMeta().getLore().size() == 3) {
													if (p.getItemInHand().getItemMeta().getLore().get(1).equalsIgnoreCase(ChatColor.GREEN + "Charge:")) {
														double charge = Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[0]);
														double added = 0.2;
														double max = Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1].replace(" KJ", ""));
														
														if (charge + added > max) {
															added = max - charge;
														}
														
														charge = charge + added;
														
														double bonus = charge - Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[0]);
														
														updateBattery(p, bonus, charge, true);
													}
												}
											}
										}
									}	
								}
							}
							else {
								messages.NotResearched(p);
							}
						}
					}
				}
			}
			else if (e.getClickedBlock().getType() == Material.FURNACE) {
				if (BlockAdjacents.hasMaterialOnBothSides(e.getClickedBlock(), Material.PISTON_BASE)) {
					e.setCancelled(true);
					if (PlayerResearch.hasResearched(p, "Electric Furnace")) {
						if (p.getItemInHand() != null) {
							boolean battery = false;
							if (p.getItemInHand().hasItemMeta()) {
								if (p.getItemInHand().getItemMeta().hasLore()) {
									if (p.getItemInHand().getItemMeta().getLore().size() == 3) {
										if (p.getItemInHand().getItemMeta().getLore().get(1).equalsIgnoreCase(ChatColor.GREEN + "Charge:")) {
											
											battery = true;
											
											double Bcharge = Double.valueOf(ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[0]);
											double Fcharge = 0;
											
											if (Bcharge <= 0) {
												updateBattery(p, 0, Bcharge, false);
											}
											else {
												List<String> efX = Fcfg.getStringList("furnaces.x");
												List<String> efY = Fcfg.getStringList("furnaces.y");
												List<String> efZ = Fcfg.getStringList("furnaces.z");
												List<String> efW = Fcfg.getStringList("furnaces.world");
												List<String> efC = Fcfg.getStringList("furnaces.charge");
												
												int pos = -1;
												
												if (efX.contains(String.valueOf(e.getClickedBlock().getLocation().getX())) && efY.contains(String.valueOf(e.getClickedBlock().getLocation().getY())) && efZ.contains(String.valueOf(e.getClickedBlock().getLocation().getZ())) && efW.contains(e.getClickedBlock().getLocation().getWorld().getName())) {
													for(int i = 0; i < efX.size(); i++) {
														if (Double.parseDouble(efX.get(i)) == e.getClickedBlock().getLocation().getX()) {
															if (Double.parseDouble(efY.get(i)) == e.getClickedBlock().getLocation().getY()) {
																if (Double.parseDouble(efZ.get(i)) == e.getClickedBlock().getLocation().getZ()) {
																	if (efW.get(i).equalsIgnoreCase(e.getClickedBlock().getWorld().getName())) {
																		Fcharge = Double.parseDouble(efC.get(i));
																		pos = i;
																		break;
																	}
																}
															}
														}
													}
												}
												else {
													efX.add(String.valueOf(e.getClickedBlock().getLocation().getX()));
													efY.add(String.valueOf(e.getClickedBlock().getLocation().getY()));
													efZ.add(String.valueOf(e.getClickedBlock().getLocation().getZ()));
													efW.add(e.getClickedBlock().getLocation().getWorld().getName());
													efC.add(String.valueOf(0));
													
													Fcfg.set("furnaces.x", efX);
													Fcfg.set("furnaces.y", efY);
													Fcfg.set("furnaces.z", efZ);
													Fcfg.set("furnaces.world", efW);
													Fcfg.set("furnaces.charge", efC);
													
													try {
														Fcfg.save(furnaces);
													} catch (IOException x) {
													}
													
													for(int i = 0; i < efX.size(); i++) {
														if (Double.parseDouble(efX.get(i)) == e.getClickedBlock().getLocation().getX()) {
															if (Double.parseDouble(efY.get(i)) == e.getClickedBlock().getLocation().getY()) {
																if (Double.parseDouble(efZ.get(i)) == e.getClickedBlock().getLocation().getZ()) {
																	if (efW.get(i).equalsIgnoreCase(e.getClickedBlock().getWorld().getName())) {
																		pos = i;
																		break;
																	}
																}
															}
														}
													}
												}
												
												if (pos >= 0) {
													double left = 50.0 - Fcharge;
													
													if (left == 0) {
														updateBattery(p, 0.0, Bcharge, false);
													}
													else if (left > Bcharge) {
														Fcharge = Fcharge + Bcharge;
														
														updateBattery(p, Bcharge, 0.0, false);
													}
													else {
														Fcharge = Fcharge + left;
														
														Bcharge = Bcharge - left;
														
														updateBattery(p, left, Bcharge, false);
													}
													
													efC.set(pos, String.valueOf(Fcharge));
													
													Fcfg.set("furnaces.charge", efC);
													
													try {
														Fcfg.save(furnaces);
													} catch (IOException x) {
													}
												}
											}
										}
									}
								}
							}
							
							if (!battery) {
								
								double Fcharge = 0;
								
									List<String> efX = Fcfg.getStringList("furnaces.x");
									List<String> efY = Fcfg.getStringList("furnaces.y");
									List<String> efZ = Fcfg.getStringList("furnaces.z");
									List<String> efW = Fcfg.getStringList("furnaces.world");
									List<String> efC = Fcfg.getStringList("furnaces.charge");
									
									int pos = -1;
									
									if (efX.contains(String.valueOf(e.getClickedBlock().getLocation().getX())) && efY.contains(String.valueOf(e.getClickedBlock().getLocation().getY())) && efZ.contains(String.valueOf(e.getClickedBlock().getLocation().getZ())) && efW.contains(e.getClickedBlock().getLocation().getWorld().getName())) {
										for(int i = 0; i < efX.size(); i++) {
											if (Double.parseDouble(efX.get(i)) == e.getClickedBlock().getLocation().getX()) {
												if (Double.parseDouble(efY.get(i)) == e.getClickedBlock().getLocation().getY()) {
													if (Double.parseDouble(efZ.get(i)) == e.getClickedBlock().getLocation().getZ()) {
														if (efW.get(i).equalsIgnoreCase(e.getClickedBlock().getWorld().getName())) {
															Fcharge = Double.parseDouble(efC.get(i));
															pos = i;
															break;
														}
													}
												}
											}
										}
									}
									else {
										efX.add(String.valueOf(e.getClickedBlock().getLocation().getX()));
										efY.add(String.valueOf(e.getClickedBlock().getLocation().getY()));
										efZ.add(String.valueOf(e.getClickedBlock().getLocation().getZ()));
										efW.add(e.getClickedBlock().getLocation().getWorld().getName());
										efC.add(String.valueOf(0));
										
										Fcfg.set("furnaces.x", efX);
										Fcfg.set("furnaces.y", efY);
										Fcfg.set("furnaces.z", efZ);
										Fcfg.set("furnaces.world", efW);
										Fcfg.set("furnaces.charge", efC);
										
										try {
											Fcfg.save(furnaces);
										} catch (IOException x) {
										}
										
										for(int i = 0; i < efX.size(); i++) {
											if (Double.parseDouble(efX.get(i)) == e.getClickedBlock().getLocation().getX()) {
												if (Double.parseDouble(efY.get(i)) == e.getClickedBlock().getLocation().getY()) {
													if (Double.parseDouble(efZ.get(i)) == e.getClickedBlock().getLocation().getZ()) {
														if (efW.get(i).equalsIgnoreCase(e.getClickedBlock().getWorld().getName())) {
															pos = i;
															break;
														}
													}
												}
											}
										}
									}
									
									if (pos >= 0) {
										
										if (Fcharge >= 0.1) {
											ItemStack result = RecipeCalculator.getSmeltedOutput(p.getItemInHand().getType());
											
											if (result != null) {
												
												messages.ChargeRemove(p, "100 J " + ChatColor.DARK_GRAY + "(Electric Furnace)");
												
												Fcharge = Fcharge - 0.1;
												
												efC.set(pos, String.valueOf(Fcharge));
												
												Fcfg.set("furnaces.charge", efC);
												
												try {
													Fcfg.save(furnaces);
												} catch (IOException x) {
												}
												
												PlayerInventory.consumeItemInHand(p);
												p.getInventory().addItem(result);
												PlayerInventory.update(p);
											}
										}
										else {
											messages.ChargeRemove(p, "0 J " + ChatColor.DARK_GRAY + "(Electric Furnace)");
										}
									}
								}
						}
					}
				}
			}
		}
	}
	
	public static void updateBattery(Player p, double difference, double charge, boolean add) {
		if (add) {
			messages.ChargeAdd(p, String.valueOf(difference) + " KJ " + ChatColor.DARK_GRAY + "(Battery)");
			
			ItemStack item = p.getItemInHand().clone();
			
			ItemMeta im = item.getItemMeta();
			List<String> lore = item.getItemMeta().getLore();
			lore.set(2, ChatColor.GRAY + String.valueOf(charge) + " / " + ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1]);
			im.setLore(lore);
			
			item.setItemMeta(im);
			
			item.setAmount(1);
			
			PlayerInventory.consumeItemInHand(p);
			p.getInventory().addItem(item);
		}
		else {
			messages.ChargeRemove(p, String.valueOf(difference) + " KJ " + ChatColor.DARK_GRAY + "(Battery)");
			
			ItemStack item = p.getItemInHand().clone();
			
			ItemMeta im = item.getItemMeta();
			List<String> lore = item.getItemMeta().getLore();
			lore.set(2, ChatColor.GRAY + String.valueOf(charge) + " / " + ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1]);
			im.setLore(lore);
			
			item.setItemMeta(im);
			
			item.setAmount(1);
			
			PlayerInventory.consumeItemInHand(p);
			p.getInventory().addItem(item);
		}
		
		PlayerInventory.update(p);
		
	}

}
