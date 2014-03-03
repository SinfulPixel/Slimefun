package me.mrCookieSlime.Slimefun.Listeners.Blocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;


public class ToolBenchListener implements Listener {
	
	public static HashMap<String, String> tb = new HashMap<String, String>();
	private startup plugin;

	  public ToolBenchListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Action a = e.getAction();
		if ((a == Action.RIGHT_CLICK_BLOCK)) {
			Block b = e.getClickedBlock();
			if (p.getItemInHand().getType() != Material.EYE_OF_ENDER && p.getItemInHand().getType() != Material.SHEARS) {
				if (!e.isCancelled()) {
					if (b.getType() == Material.ENDER_PORTAL_FRAME) {
						if (!p.isSneaking()) {
							if (PlayerResearch.hasResearched(p, "Armor Crafting")) {
								this.openInv(p);
							}
							else {
								messages.NotResearched(p);
							}
				    	 e.setCancelled(true);
						}
				  }
				}
			}
		}
	}
	
	
	public void openInv(Player p) {
		int lines = 4;
		  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.BOLD + "Tool bench");
		  int slot = 0;
		  
			if (PlayerResearch.hasResearched(p, "Slime armor")) {
				if (this.plugin.getConfig().getBoolean("items.SlimeHelmet") == true) {
				    ItemStack SlimeHelmet = new ItemStack(Material.LEATHER_HELMET, 1);
				    ItemMeta im = SlimeHelmet.getItemMeta();
			         List<String> ll = new ArrayList<String>();
			         String l1 = ChatColor.YELLOW + "[Click to craft]";
			         String l0 = "";
			         String l2 = ChatColor.BLUE + "Materials needed:";
			         String l3 = ChatColor.BLUE + "4 slime balls";
			         String l4 = ChatColor.BLUE + "1 iron ingot";
			         ll.add(l1);
			         ll.add(l0);
			         ll.add(l2);
			         ll.add(l3);
			         ll.add(l4);
			         im.setLore(ll);
			         ((LeatherArmorMeta) im).setColor(Color.LIME);
			         SlimeHelmet.setItemMeta(im);
					SlimeHelmet = Setname(SlimeHelmet, ChatColor.GREEN + "Slime helmet", " ");
					inv.setItem(slot, SlimeHelmet);
				  }
					
					slot = 9;
					
					if (this.plugin.getConfig().getBoolean("items.SlimeChestplate") == true) {
					ItemStack SlimeChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
					ItemMeta im2 = SlimeChest.getItemMeta();
			         List<String> ll2 = new ArrayList<String>();
			         String l12 = ChatColor.YELLOW + "[Click to craft]";
			         String l02 = "";
			         String l22 = ChatColor.BLUE + "Materials needed:";
			         String l32 = ChatColor.BLUE + "7 slime balls";
			         String l42 = ChatColor.BLUE + "1 iron ingot";
			         ll2.add(l12);
			         ll2.add(l02);
			         ll2.add(l22);
			         ll2.add(l32);
			         ll2.add(l42);
			         im2.setLore(ll2);
			         ((LeatherArmorMeta) im2).setColor(Color.LIME);
			         SlimeChest.setItemMeta(im2);
			         SlimeChest = Setname(SlimeChest, ChatColor.GREEN + "Slime chestplate", " ");
					inv.setItem(slot, SlimeChest);
					}
					
					slot = 18;
					
					if (this.plugin.getConfig().getBoolean("items.SlimeLeggings") == true) {
					ItemStack SlimeLeggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
					ItemMeta im3 = SlimeLeggings.getItemMeta();
			         List<String> ll3 = new ArrayList<String>();
			         String l13 = ChatColor.YELLOW + "[Click to craft]";
			         String l03 = "";
			         String l23 = ChatColor.BLUE + "Materials needed:";
			         String l33 = ChatColor.BLUE + "6 slime balls";
			         String l43 = ChatColor.BLUE + "1 iron ingot";
			         ll3.add(l13);
			         ll3.add(l03);
			         ll3.add(l23);
			         ll3.add(l33);
			         ll3.add(l43);
			         im3.setLore(ll3);
			         ((LeatherArmorMeta) im3).setColor(Color.LIME);
			         SlimeLeggings.setItemMeta(im3);
					SlimeLeggings = Setname(SlimeLeggings, ChatColor.GREEN + "Slime leggings", " ");
					inv.setItem(slot, SlimeLeggings);
					}
					
					slot = 27;
					
					if (this.plugin.getConfig().getBoolean("items.SlimeBoots") == true) {
					ItemStack SlimeBoots = new ItemStack(Material.LEATHER_BOOTS, 1);
					ItemMeta im4 = SlimeBoots.getItemMeta();
			         List<String> ll4 = new ArrayList<String>();
			         String l14 = ChatColor.YELLOW + "[Click to craft]";
			         String l04 = "";
			         String l24 = ChatColor.BLUE + "Materials needed:";
			         String l34 = ChatColor.BLUE + "4 slime balls";
			         String l44 = ChatColor.BLUE + "1 iron ingot";
			         ll4.add(l14);
			         ll4.add(l04);
			         ll4.add(l24);
			         ll4.add(l34);
			         ll4.add(l44);
			         im4.setLore(ll4);
			         ((LeatherArmorMeta) im4).setColor(Color.LIME);
			         SlimeBoots.setItemMeta(im4);
					SlimeBoots = Setname(SlimeBoots, ChatColor.GREEN + "Slime boots", " ");
					inv.setItem(slot, SlimeBoots);
					}
			}
			if (PlayerResearch.hasResearched(p, "Ender armor")) {
				slot = 4;
				
				if (this.plugin.getConfig().getBoolean("items.EnderHelmet") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_HELMET, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "8 Enderpearls";
			         String l45 = ChatColor.BLUE + "1 Obsidian";
			         String l55 = ChatColor.BLUE + "4 Eyes of Ender";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         ll5.add(l55);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.DARK_PURPLE + "Ender helmet", " ");
					inv.setItem(slot, NanoHelmet);
				}
				
				slot = 13;
				
				if (this.plugin.getConfig().getBoolean("items.EnderChestplate") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "12 Enderpearls";
			         String l45 = ChatColor.BLUE + "2 Obsidian";
			         String l55 = ChatColor.BLUE + "7 Eyes of Ender";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         ll5.add(l55);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.DARK_PURPLE + "Ender chestplate", " ");
					inv.setItem(slot, NanoHelmet);
				}
				
				slot = 22;
				
				if (this.plugin.getConfig().getBoolean("items.EnderLeggings") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "10 Enderpearls";
			         String l45 = ChatColor.BLUE + "1 Obsidian";
			         String l55 = ChatColor.BLUE + "6 Eyes of Ender";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         ll5.add(l55);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.DARK_PURPLE + "Ender leggings", " ");
					inv.setItem(slot, NanoHelmet);
				}
				
				slot = 31;
				
				if (this.plugin.getConfig().getBoolean("items.EnderBoots") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_BOOTS, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "6 Enderpearls";
			         String l45 = ChatColor.BLUE + "1 Obsidian";
			         String l55 = ChatColor.BLUE + "3 Eyes of Ender";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         ll5.add(l55);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.DARK_PURPLE + "Ender boots", " ");
					inv.setItem(slot, NanoHelmet);
				}
			}
		
			if (PlayerResearch.hasResearched(p, "Glowstone armor")) {
				slot = 3;
				
				if (this.plugin.getConfig().getBoolean("items.glowstonehelmet") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_HELMET, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "2 gold ingots";
			         String l45 = ChatColor.BLUE + "5 Glowstones";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(255, 228, 175));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.YELLOW + "Glowstone helmet", " ");
					inv.setItem(slot, NanoHelmet);
				}
				
				slot = 12;
				
				if (this.plugin.getConfig().getBoolean("items.glowstonechestplate") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "4 gold ingots";
			         String l45 = ChatColor.BLUE + "8 Glowstones";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(255, 228, 175));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.YELLOW + "Glowstone chestplate", " ");
					inv.setItem(slot, NanoHelmet);
				}
				
				slot = 21;
				
				if (this.plugin.getConfig().getBoolean("items.glowstoneleggings") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_LEGGINGS, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "2 gold ingots";
			         String l45 = ChatColor.BLUE + "7 Glowstones";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(255, 228, 175));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.YELLOW + "Glowstone leggings", " ");
					inv.setItem(slot, NanoHelmet);
				}
				
				slot = 30;
				
				if (this.plugin.getConfig().getBoolean("items.glowstoneboots") == true) {
					ItemStack NanoHelmet = new ItemStack(Material.LEATHER_BOOTS, 1);
				    ItemMeta im5 = NanoHelmet.getItemMeta();
			         List<String> ll5 = new ArrayList<String>();
			         String l15 = ChatColor.YELLOW + "[Click to craft]";
			         String l05 = "";
			         String l25 = ChatColor.BLUE + "Materials needed:";
			         String l35 = ChatColor.BLUE + "2 gold ingots";
			         String l45 = ChatColor.BLUE + "4 Glowstones";
			         ll5.add(l15);
			         ll5.add(l05);
			         ll5.add(l25);
			         ll5.add(l35);
			         ll5.add(l45);
			         im5.setLore(ll5);
			         ((LeatherArmorMeta) im5).setColor(Color.fromRGB(255, 228, 175));
			         NanoHelmet.setItemMeta(im5);
					NanoHelmet = Setname(NanoHelmet, ChatColor.YELLOW + "Glowstone boots", " ");
					inv.setItem(slot, NanoHelmet);
				}
			}
			
			if (PlayerResearch.hasResearched(p, "Nano armor")) {
				slot = 1;
				if (this.plugin.getConfig().getBoolean("craftable-items.nanosuit-is-craftable") == true) {
					if (this.plugin.getConfig().getBoolean("items.NanoHelmet") == true) {
						ItemStack NanoHelmet = new ItemStack(Material.LEATHER_HELMET, 1);
					    ItemMeta im5 = NanoHelmet.getItemMeta();
				         List<String> ll5 = new ArrayList<String>();
				         String l15 = ChatColor.YELLOW + "[Click to craft]";
				         String l05 = "";
				         String l25 = ChatColor.BLUE + "Materials needed:";
				         String l35 = ChatColor.BLUE + "4 obsidian";
				         String l45 = ChatColor.BLUE + "1 Nano Focus";
				         ll5.add(l15);
				         ll5.add(l05);
				         ll5.add(l25);
				         ll5.add(l35);
				         ll5.add(l45);
				         im5.setLore(ll5);
				         ((LeatherArmorMeta) im5).setColor(Color.BLACK);
				         NanoHelmet.setItemMeta(im5);
						NanoHelmet = Setname(NanoHelmet, ChatColor.DARK_GRAY + "Nanosuit helmet", " ");
						inv.setItem(slot, NanoHelmet);
						}
						
						slot = 10;
						
						if (this.plugin.getConfig().getBoolean("items.NanoChestplate") == true) {
						ItemStack NanoChest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
						ItemMeta im6 = NanoChest.getItemMeta();
				         List<String> ll6 = new ArrayList<String>();
				         String l16 = ChatColor.YELLOW + "[Click to craft]";
				         String l06 = "";
				         String l26 = ChatColor.BLUE + "Materials needed:";
				         String l36 = ChatColor.BLUE + "7 obsidian";
				         String l46 = ChatColor.BLUE + "1 Nano Focus";
				         ll6.add(l16);
				         ll6.add(l06);
				         ll6.add(l26);
				         ll6.add(l36);
				         ll6.add(l46);
				         im6.setLore(ll6);
				         ((LeatherArmorMeta) im6).setColor(Color.BLACK);
				         NanoChest.setItemMeta(im6);
				         NanoChest = Setname(NanoChest, ChatColor.DARK_GRAY + "Nanosuit chestplate", " ");
						inv.setItem(slot, NanoChest);
						}
						
						slot = 19;
						
						if (this.plugin.getConfig().getBoolean("items.NanoLeggings") == true) {
						ItemStack NanoLeggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
						ItemMeta im7 = NanoLeggings.getItemMeta();
						List<String> ll7 = new ArrayList<String>();
						String l17 = ChatColor.YELLOW + "[Click to craft]";
						String l07 = "";
						String l27 = ChatColor.BLUE + "Materials needed:";
						String l37 = ChatColor.BLUE + "6 obsidian";
						String l47 = ChatColor.BLUE + "1 Nano Focus";
						ll7.add(l17);
						ll7.add(l07);
						ll7.add(l27);
						ll7.add(l37);
						ll7.add(l47);
						im7.setLore(ll7);
						((LeatherArmorMeta) im7).setColor(Color.BLACK);
						NanoLeggings.setItemMeta(im7);
						NanoLeggings = Setname(NanoLeggings, ChatColor.DARK_GRAY + "Nanosuit leggings", " ");
						inv.setItem(slot, NanoLeggings);
						}
						
						slot = 28;
						
						if (this.plugin.getConfig().getBoolean("items.NanoBoots") == true) {
						ItemStack NanoBoots = new ItemStack(Material.LEATHER_BOOTS, 1);
						ItemMeta im8 = NanoBoots.getItemMeta();
						List<String> ll8 = new ArrayList<String>();
				        String l18 = ChatColor.YELLOW + "[Click to craft]";
						String l08 = "";
						String l28 = ChatColor.BLUE + "Materials needed:";
						String l38 = ChatColor.BLUE + "4 obsidian";
						String l48 = ChatColor.BLUE + "1 Nano Focus";
						ll8.add(l18);
						ll8.add(l08);
						ll8.add(l28);
						ll8.add(l38);
						ll8.add(l48);
				        im8.setLore(ll8);
				        ((LeatherArmorMeta) im8).setColor(Color.BLACK);
						NanoBoots.setItemMeta(im8);
						NanoBoots = Setname(NanoBoots, ChatColor.DARK_GRAY + "Nanosuit boots", " ");
						inv.setItem(slot, NanoBoots);
						}
				}
			}
			if (PlayerResearch.hasResearched(p, "Quantum armor")) {
				slot = 2;
				
				if (this.plugin.getConfig().getBoolean("craftable-items.quantumarmor-is-craftable") == true) {
					if (this.plugin.getConfig().getBoolean("items.QuantumHelmet") == true) {
						ItemStack NanoHelmet = new ItemStack(Material.LEATHER_HELMET, 1);
					    ItemMeta im5 = NanoHelmet.getItemMeta();
				         List<String> ll5 = new ArrayList<String>();
				         String l15 = ChatColor.YELLOW + "[Click to craft]";
				         String l05 = "";
				         String l25 = ChatColor.BLUE + "Materials needed:";
				         String l35 = ChatColor.BLUE + "1 simple circuitboard";
				         String l45 = ChatColor.BLUE + "2 Quantum Foci";
				         String l55 = ChatColor.BLUE + "2 iron blocks";
				         ll5.add(l15);
				         ll5.add(l05);
				         ll5.add(l25);
				         ll5.add(l35);
				         ll5.add(l45);
				         ll5.add(l55);
				         im5.setLore(ll5);
				         ((LeatherArmorMeta) im5).setColor(Color.WHITE);
				         NanoHelmet.setItemMeta(im5);
						NanoHelmet = Setname(NanoHelmet, ChatColor.WHITE + "Quatumarmor helmet", " ");
						inv.setItem(slot, NanoHelmet);
					}
					
					slot = 11;
					
					if (this.plugin.getConfig().getBoolean("items.QuantumChestplate") == true) {
						ItemStack NanoHelmet = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
					    ItemMeta im5 = NanoHelmet.getItemMeta();
				         List<String> ll5 = new ArrayList<String>();
				         String l15 = ChatColor.YELLOW + "[Click to craft]";
				         String l05 = "";
				         String l25 = ChatColor.BLUE + "Materials needed:";
				         String l35 = ChatColor.BLUE + "1 simple circuitboard";
				         String l45 = ChatColor.BLUE + "2 Quantum Foci";
				         String l55 = ChatColor.BLUE + "5 iron blocks";
				         ll5.add(l15);
				         ll5.add(l05);
				         ll5.add(l25);
				         ll5.add(l35);
				         ll5.add(l45);
				         ll5.add(l55);
				         im5.setLore(ll5);
				         ((LeatherArmorMeta) im5).setColor(Color.WHITE);
				         NanoHelmet.setItemMeta(im5);
						NanoHelmet = Setname(NanoHelmet, ChatColor.WHITE + "Quatumarmor chestplate", " ");
						inv.setItem(slot, NanoHelmet);
					}
					
					slot = 20;
					
					if (this.plugin.getConfig().getBoolean("items.QuantumLeggings") == true) {
						ItemStack NanoHelmet = new ItemStack(Material.LEATHER_LEGGINGS, 1);
					    ItemMeta im5 = NanoHelmet.getItemMeta();
				         List<String> ll5 = new ArrayList<String>();
				         String l15 = ChatColor.YELLOW + "[Click to craft]";
				         String l05 = "";
				         String l25 = ChatColor.BLUE + "Materials needed:";
				         String l35 = ChatColor.BLUE + "1 simple circuitboard";
				         String l45 = ChatColor.BLUE + "2 Quantum Foci";
				         String l55 = ChatColor.BLUE + "4 iron blocks";
				         ll5.add(l15);
				         ll5.add(l05);
				         ll5.add(l25);
				         ll5.add(l35);
				         ll5.add(l45);
				         ll5.add(l55);
				         im5.setLore(ll5);
				         ((LeatherArmorMeta) im5).setColor(Color.WHITE);
				         NanoHelmet.setItemMeta(im5);
						NanoHelmet = Setname(NanoHelmet, ChatColor.WHITE + "Quatumarmor leggings", " ");
						inv.setItem(slot, NanoHelmet);
					}
					
					slot = 29;
					
					if (this.plugin.getConfig().getBoolean("items.QuantumBoots") == true) {
						ItemStack NanoHelmet = new ItemStack(Material.LEATHER_BOOTS, 1);
					    ItemMeta im5 = NanoHelmet.getItemMeta();
				         List<String> ll5 = new ArrayList<String>();
				         String l15 = ChatColor.YELLOW + "[Click to craft]";
				         String l05 = "";
				         String l25 = ChatColor.BLUE + "Materials needed:";
				         String l35 = ChatColor.BLUE + "1 simple circuitboard";
				         String l45 = ChatColor.BLUE + "2 Quantum Foci";
				         String l55 = ChatColor.BLUE + "2 iron blocks";
				         ll5.add(l15);
				         ll5.add(l05);
				         ll5.add(l25);
				         ll5.add(l35);
				         ll5.add(l45);
				         ll5.add(l55);
				         im5.setLore(ll5);
				         ((LeatherArmorMeta) im5).setColor(Color.WHITE);
				         NanoHelmet.setItemMeta(im5);
						NanoHelmet = Setname(NanoHelmet, ChatColor.WHITE + "Quatumarmor boots", " ");
						inv.setItem(slot, NanoHelmet);
					}
				}
			}

			if (PlayerResearch.hasResearched(p, "Uber armor")) {
				if (this.plugin.getConfig().getBoolean("craftable-items.uberarmor-is-craftable")) {
			    	slot = 5;
					if (this.plugin.getConfig().getBoolean("items.UberHelmet") == true) {
						ItemStack uber = new ItemStack(Material.LEATHER_HELMET);
						ItemMeta im = uber.getItemMeta();
						List<String> ll = new ArrayList<String>();
						ll.add(ChatColor.YELLOW + "[Click to craft]");
						ll.add("");
						ll.add(ChatColor.BLUE + "Materials needed:");
						ll.add(ChatColor.BLUE + "5 Iron Blocks");
						ll.add(ChatColor.BLUE + "4 Uber Foci");
						ll.add(ChatColor.BLUE + "8 Ghast Tears");
						ll.add(ChatColor.BLUE + "4 Advanced Circuit Boards");
						ll.add(ChatColor.BLUE + "1 Steel Plate");
						im.setLore(ll);
						((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
						uber.setItemMeta(im);
						uber = Setname(uber, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Helmet", "");
						inv.setItem(slot, uber);
					}
					slot = 14;
					if (this.plugin.getConfig().getBoolean("items.UberChestplate") == true) {
							ItemStack uber = new ItemStack(Material.LEATHER_CHESTPLATE);
							ItemMeta im = uber.getItemMeta();
							List<String> ll = new ArrayList<String>();
							ll.add(ChatColor.YELLOW + "[Click to craft]");
							ll.add("");
							ll.add(ChatColor.BLUE + "Materials needed:");
							ll.add(ChatColor.BLUE + "8 Iron Blocks");
							ll.add(ChatColor.BLUE + "4 Uber Foci");
							ll.add(ChatColor.BLUE + "10 Ghast Tears");
							ll.add(ChatColor.BLUE + "4 Advanced Circuit Boards");
							ll.add(ChatColor.BLUE + "2 Steel Plates");
							im.setLore(ll);
							((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
							uber.setItemMeta(im);
							uber = Setname(uber, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate", "");
							inv.setItem(slot, uber);
					}
					slot = 23;
					if (this.plugin.getConfig().getBoolean("items.UberLeggings") == true) {
						ItemStack uber = new ItemStack(Material.LEATHER_LEGGINGS);
						ItemMeta im = uber.getItemMeta();
						List<String> ll = new ArrayList<String>();
						ll.add(ChatColor.YELLOW + "[Click to craft]");
						ll.add("");
						ll.add(ChatColor.BLUE + "Materials needed:");
						ll.add(ChatColor.BLUE + "7 Iron Blocks");
						ll.add(ChatColor.BLUE + "4 Uber Foci");
						ll.add(ChatColor.BLUE + "9 Ghast Tears");
						ll.add(ChatColor.BLUE + "4 Advanced Circuit Boards");
						ll.add(ChatColor.BLUE + "2 Steel Plates");
						im.setLore(ll);
						((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
						uber.setItemMeta(im);
						uber = Setname(uber, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Leggings", "");
						inv.setItem(slot, uber);
					}
					slot = 32;
					if (this.plugin.getConfig().getBoolean("items.UberBoots") == true) {
						ItemStack uber = new ItemStack(Material.LEATHER_BOOTS);
						ItemMeta im = uber.getItemMeta();
						List<String> ll = new ArrayList<String>();
						ll.add(ChatColor.YELLOW + "[Click to craft]");
						ll.add("");
						ll.add(ChatColor.BLUE + "Materials needed:");
						ll.add(ChatColor.BLUE + "4 Iron Blocks");
						ll.add(ChatColor.BLUE + "4 Uber Foci");
						ll.add(ChatColor.BLUE + "6 Ghast Tears");
						ll.add(ChatColor.BLUE + "4 Advanced Circuit Boards");
						ll.add(ChatColor.BLUE + "1 Steel Plates");
						im.setLore(ll);
						((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
						uber.setItemMeta(im);
						uber = Setname(uber, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Boots", "");
						inv.setItem(slot, uber);
					}
				}
			}
		  p.openInventory(inv);
		  p.playSound(p.getLocation(), Sound.ANVIL_LAND, 1, 1);
		  tb.put(p.getName(), "armor");
       }
    	  
       @EventHandler
       public void in(InventoryCloseEvent e) {
    	   try {
    	   Player p = (Player) e.getPlayer();
    	   if (tb.containsKey(p.getName())) {
    		   tb.remove(p.getName());
    	   	   }
    	   }
    	   catch (Exception x) {
    	   }
       }
       
       @EventHandler
 	  public void onPlayerInteract1(PlayerInteractEvent e) {
 	    Player p = e.getPlayer();
 	    if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 6) {
 	      Action a = e.getAction();
 	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
 	    	  this.openInv(p);
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
