package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

public class DiamondOfDuplicatingListener implements Listener {
	
	private HashMap<String, String> inv = new HashMap<String, String>();
	private startup plugin;
	
	public DiamondOfDuplicatingListener(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.DIAMOND && p.getItemInHand().getDurability() == 1) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  openDuplicating(p);
	      }
	    }
	  }
	
	public void openDuplicating(Player p) {
		Inventory inv = Bukkit.createInventory(null, 0, ChatColor.BOLD + "Click on an Item to duplicate:");
		p.openInventory(inv);
		this.inv.put(p.getName(), "duplicate");
		p.playSound(p.getLocation(), Sound.ANVIL_USE, (float) 0.7, 1);
	}
	
	@EventHandler
	public void onDuplicate(InventoryClickEvent e) {
		try {

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
			
			Player p = (Player) e.getWhoClicked();
			if (this.inv.get(p.getName()).equals("duplicate")) {
				e.setCancelled(true);
				if (p.getItemInHand().getType() == Material.DIAMOND && p.getItemInHand().getDurability() == 1) {
						for(int i = 0; i < 46; i++) {
							try {
								if (e.getCurrentItem().getType() == materials.get(i)) {
									
									e.getCurrentItem().setAmount(e.getCurrentItem().getAmount() + 1);
									
									if (p.getItemInHand().getAmount() != 1) {
							    		  if (p.getGameMode() != GameMode.CREATIVE) {
							    			  p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
							    		  }
							    	  }
							    	  else {
							    		  if (p.getGameMode() != GameMode.CREATIVE) {
							    			  p.setItemInHand(null);
							    		  }
							    	  }
									
									p.closeInventory();
									this.inv.remove(p.getName());
									
								}
							}
							catch(Exception x) {
								
							}
						}
				}
				else {
					p.closeInventory();
				}
			}
		}
		catch(Exception x) {
			
		}
	}
	
	@EventHandler
  public void in(InventoryCloseEvent e) {
		Player p = (Player) e.getPlayer();
	   try {
		  if (this.inv.get(p.getName()).equals("duplicate")) {
		   		this.inv.remove(p.getName());
		   		p.playSound(p.getLocation(), Sound.ANVIL_USE, (float) 0.7, 1);
		   	   	   }
	   }
	   catch(Exception x) {
		   
	   }
	}

}
