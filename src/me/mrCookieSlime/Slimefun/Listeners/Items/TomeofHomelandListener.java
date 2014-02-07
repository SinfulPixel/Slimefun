package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class TomeofHomelandListener implements Listener {
	
private startup plugin;
	
	public TomeofHomelandListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 8) {
	      Action a = e.getAction();
	      if (p.hasPermission("slimefun.tomeofhomeland")) {
	    	  if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    		  try {
	    			  Location bed = p.getBedSpawnLocation();
	    			  p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 1);
	    	          p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
	    	          p.teleport(bed);
	    	          messages.BedTeleport(p);
	    		  }
	    		  catch(Exception x) {
	    			  messages.NoBed(p);
	    			  }
	    		  }
	      }
	    	  
	   }
	}

}
