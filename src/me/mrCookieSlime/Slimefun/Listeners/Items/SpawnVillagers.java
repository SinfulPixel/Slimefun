package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.entities.SlimefunVillager;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SpawnVillagers implements Listener {
	
	private startup plugin;
	
	public SpawnVillagers(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    try {
	    	if (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RESET + "Spawn \"" + ChatColor.GRAY + "Lost " + ChatColor.BLUE + "Merchant" + ChatColor.RESET + "\"")) {
	  	      Action a = e.getAction();
	  	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
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
	  	    	  SlimefunVillager.spawnMerchant(e.getClickedBlock().getRelative(e.getBlockFace()).getLocation());
	  	      }
	  	      e.setCancelled(true);
	  	    }
	  	    else if (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RESET + "Spawn \"" + ChatColor.GREEN + "Quest " + ChatColor.BLUE + "Villager" + ChatColor.RESET + "\"")) {
	  		      Action a = e.getAction();
	  		      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
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
	  		    	  SlimefunVillager.spawnQuester(e.getClickedBlock().getRelative(e.getBlockFace()).getLocation());
	  		      }
	  		      e.setCancelled(true);
	  		    }
	  	    else if (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RESET + "Spawn \"" + ChatColor.GRAY + "Lost " + ChatColor.DARK_GRAY + "Blacksmith" + ChatColor.RESET + "\"")) {
		  	      Action a = e.getAction();
		  	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
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
		  	    	  SlimefunVillager.spawnBlacksmith(e.getClickedBlock().getRelative(e.getBlockFace()).getLocation());
		  	      }
		  	      e.setCancelled(true);
		  	    }
	    }
	    catch(Exception x) {
	    	
	    }
	  }

}
