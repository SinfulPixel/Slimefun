package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MagicEnderEyeListener implements Listener {
	
private startup plugin;
	
	public MagicEnderEyeListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.EYE_OF_ENDER && p.getItemInHand().getDurability() == 1) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  try {
	    		  if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    			  if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    				  if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    					  if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
	    			    		  p.launchProjectile(EnderPearl.class);
	    			    	  }
	    		    	  }
	    	    	  }
		    	  }
	    		  else if (p.getInventory().getChestplate() != null) {
	  				if (p.getInventory().getChestplate().hasItemMeta()) {
						if (p.getInventory().getChestplate().getItemMeta().hasDisplayName()) {
							if (p.getInventory().getChestplate().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate")) {
								if (p.getInventory().getChestplate().getItemMeta().getLore().contains(ChatColor.GRAY + "Ender Fake")) {
									 p.launchProjectile(EnderPearl.class);
								}
							}
						}
					}
				}
	    	  }
	    	  catch(Exception x) {
	    		  
	    	  }
	    	  e.setCancelled(true);
	      }
	    }
	  }

}
