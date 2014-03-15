package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.util.ArrayList;
import java.util.List;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Utilities.BlockBreaker;
import me.mrCookieSlime.Slimefun.Utilities.PlayerFace;
import me.mrCookieSlime.Slimefun.Utilities.PlayerInventory;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class UberPickaxeListener implements Listener{
	
	private startup plugin;
	
	public UberPickaxeListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	List<Location> broken = new ArrayList<Location>();
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		if (e.getAction() == Action.LEFT_CLICK_BLOCK) {
			PlayerFace.lastFace.put(e.getPlayer().getName(), e.getBlockFace().getOppositeFace());
		}
		else if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Player p = e.getPlayer();
			if (p.getItemInHand() != null) {
				if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE) {
					if (p.getItemInHand().hasItemMeta()) {
						if (p.getItemInHand().getItemMeta().hasDisplayName()) {
							if (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Pickaxe")) {
								e.setCancelled(true);
								
								boolean Pattern_1x1 = false;
								boolean Pattern_3x3 = false;
								boolean Pattern_5x5 = false;
								boolean Pattern_1x3 = false;
								
								if (p.getItemInHand().getItemMeta().hasLore()) {
									if (p.getItemInHand().getItemMeta().getLore().size() == 6) {
										String mode = ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(3)).replace("Current Mode: ", "");
										
										if (mode.equalsIgnoreCase("1x1")) {
											Pattern_1x1 = true;
										}
										else if (mode.equalsIgnoreCase("3x3")) {
											Pattern_3x3 = true;
										}
										else if (mode.equalsIgnoreCase("5x5")) {
											Pattern_5x5 = true;
										}
										else if (mode.equalsIgnoreCase("1x3")) {
											Pattern_1x3 = true;
										}
									}
								}
								
								if (Pattern_1x1) {
									ItemStack pickaxe = p.getItemInHand().clone();
									ItemMeta im = pickaxe.getItemMeta();
									im.setLore(SlimefunItem.UBER_PICKAXE_3x3.getItemMeta().getLore());
									pickaxe.setItemMeta(im);
									p.setItemInHand(pickaxe);
									
									messages.UberPickaxeModeChanged(p, "3x3");
								}
								else if (Pattern_3x3) {
									ItemStack pickaxe = p.getItemInHand().clone();
									ItemMeta im = pickaxe.getItemMeta();
									im.setLore(SlimefunItem.UBER_PICKAXE_5x5.getItemMeta().getLore());
									pickaxe.setItemMeta(im);
									p.setItemInHand(pickaxe);
									
									messages.UberPickaxeModeChanged(p, "5x5");
								}
								else if (Pattern_5x5) {
									ItemStack pickaxe = p.getItemInHand().clone();
									ItemMeta im = pickaxe.getItemMeta();
									im.setLore(SlimefunItem.UBER_PICKAXE_1x3.getItemMeta().getLore());
									pickaxe.setItemMeta(im);
									p.setItemInHand(pickaxe);
									
									messages.UberPickaxeModeChanged(p, "1x3");
								}
								else if (Pattern_1x3) {
									ItemStack pickaxe = p.getItemInHand().clone();
									ItemMeta im = pickaxe.getItemMeta();
									im.setLore(SlimefunItem.UBER_PICKAXE.getItemMeta().getLore());
									pickaxe.setItemMeta(im);
									p.setItemInHand(pickaxe);
									
									messages.UberPickaxeModeChanged(p, "1x1");
								}
							}
						}
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onChop(BlockBreakEvent e) {
		if (!broken.contains(e.getBlock().getLocation())) {
			Player p = e.getPlayer();
			if (p.getItemInHand() != null) {
				if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE) {
					if (p.getItemInHand().hasItemMeta()) {
						if (p.getItemInHand().getItemMeta().hasDisplayName()) {
							if (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Pickaxe")) {
								
								boolean Pattern_1x1 = false;
								boolean Pattern_3x3 = false;
								boolean Pattern_5x5 = false;
								boolean Pattern_1x3 = false;
								
								if (p.getItemInHand().getItemMeta().hasLore()) {
									if (p.getItemInHand().getItemMeta().getLore().size() == 6) {
										String mode = ChatColor.stripColor(p.getItemInHand().getItemMeta().getLore().get(3)).replace("Current Mode: ", "");
										
										boolean uber = true;
										
										if (mode.equalsIgnoreCase("1x1")) {
											Pattern_1x1 = true;
										}
										else if (mode.equalsIgnoreCase("3x3")) {
											Pattern_3x3 = true;
										}
										else if (mode.equalsIgnoreCase("5x5")) {
											Pattern_5x5 = true;
										}
										else if (mode.equalsIgnoreCase("1x3")) {
											Pattern_1x3 = true;
										}
										else {
											uber = false;
										}
										
										e.setCancelled(uber);
										
										if (Pattern_1x1) {
											
											Block b = e.getBlock();
											
											broken.add(b.getLocation());
											
											BlockBreaker.breakBlock(p, b);
											PlayerInventory.damage(p);
											
											broken.remove(b.getLocation());
											
										}
										else if (Pattern_3x3) {
											if (PlayerFace.lastFace.containsKey(p.getName())) {
												BlockFace face = PlayerFace.lastFace.get(p.getName());
												
												if (face == BlockFace.UP || face == BlockFace.DOWN) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH_WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH_WEST));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
												else if (face == BlockFace.NORTH || face == BlockFace.SOUTH) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
												else if (face == BlockFace.EAST || face == BlockFace.WEST) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.SOUTH));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
											}
										}
										else if (Pattern_5x5) {
											if (PlayerFace.lastFace.containsKey(p.getName())) {
												BlockFace face = PlayerFace.lastFace.get(p.getName());
												
												if (face == BlockFace.UP || face == BlockFace.DOWN) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH_WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH_WEST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH_WEST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.NORTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.SOUTH_EAST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.SOUTH_WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.SOUTH_EAST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.NORTH_WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.SOUTH_WEST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH_EAST).getRelative(BlockFace.NORTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH_EAST).getRelative(BlockFace.SOUTH_EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH_WEST).getRelative(BlockFace.NORTH_WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH_WEST).getRelative(BlockFace.SOUTH_WEST));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
												else if (face == BlockFace.NORTH || face == BlockFace.SOUTH) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.WEST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST));
													
													blocks.add(e.getBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.EAST).getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.EAST).getRelative(BlockFace.EAST).getRelative(BlockFace.DOWN));
													
													blocks.add(e.getBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.WEST).getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.WEST).getRelative(BlockFace.WEST).getRelative(BlockFace.DOWN));
													
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.EAST).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.WEST).getRelative(BlockFace.WEST));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.EAST).getRelative(BlockFace.EAST));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST).getRelative(BlockFace.WEST));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
												else if (face == BlockFace.EAST || face == BlockFace.WEST) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.SOUTH));
													
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH));
													
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.SOUTH));
													
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH).getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH).getRelative(BlockFace.DOWN));
													
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.SOUTH).getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH).getRelative(BlockFace.SOUTH).getRelative(BlockFace.DOWN));
													
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.UP).getRelative(BlockFace.UP).getRelative(BlockFace.SOUTH).getRelative(BlockFace.SOUTH));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.NORTH).getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN).getRelative(BlockFace.DOWN).getRelative(BlockFace.WEST).getRelative(BlockFace.WEST));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
											}
										}
										else if (Pattern_1x3) {
											if (PlayerFace.lastFace.containsKey(p.getName())) {
												BlockFace face = PlayerFace.lastFace.get(p.getName());
												
												if (face == BlockFace.UP || face == BlockFace.DOWN) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.NORTH));
													blocks.add(e.getBlock().getRelative(BlockFace.SOUTH));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
												else if (face == BlockFace.NORTH || face == BlockFace.SOUTH || face == BlockFace.EAST || face == BlockFace.WEST) {
													List<Block> blocks = new ArrayList<Block>();
													
													blocks.add(e.getBlock());
													blocks.add(e.getBlock().getRelative(BlockFace.UP));
													blocks.add(e.getBlock().getRelative(BlockFace.DOWN));
													
													for (Block b: blocks) {
														broken.add(b.getLocation());
														
														BlockBreaker.breakBlock(p, b);
														
														broken.remove(b.getLocation());
													}
													
													PlayerInventory.damage(p);
													
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
