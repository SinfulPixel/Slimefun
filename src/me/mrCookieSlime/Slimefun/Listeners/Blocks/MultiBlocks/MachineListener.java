package me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks;

import java.util.List;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Utilities.BlockAdjacents;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
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
														
														messages.ChargeAdd(p, String.valueOf(bonus) + " KJ");
														
														ItemStack item = p.getItemInHand().clone();
														
														ItemMeta im = item.getItemMeta();
														List<String> lore = item.getItemMeta().getLore();
														lore.set(2, ChatColor.GRAY + String.valueOf(charge) + " / " + ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1]);
														im.setLore(lore);
														
														item.setItemMeta(im);
														
														p.setItemInHand(item);
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
														
														messages.ChargeAdd(p, String.valueOf(bonus) + " KJ");
														
														ItemStack item = p.getItemInHand().clone();
														
														ItemMeta im = item.getItemMeta();
														List<String> lore = item.getItemMeta().getLore();
														lore.set(2, ChatColor.GRAY + String.valueOf(charge) + " / " + ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1]);
														im.setLore(lore);
														
														item.setItemMeta(im);
														
														p.setItemInHand(item);
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
														
														messages.ChargeAdd(p, String.valueOf(bonus) + " KJ");
														
														ItemStack item = p.getItemInHand().clone();
														
														ItemMeta im = item.getItemMeta();
														List<String> lore = item.getItemMeta().getLore();
														lore.set(2, ChatColor.GRAY + String.valueOf(charge) + " / " + ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(2)).split(" / ")[1]);
														im.setLore(lore);
														
														item.setItemMeta(im);
														
														p.setItemInHand(item);
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
		}
	}

}
