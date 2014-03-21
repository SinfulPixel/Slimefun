package me.mrCookieSlime.Slimefun.Listeners.Drops;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class SimpleCircuitBoardDropListener implements Listener {
	
	private startup plugin;

	  public SimpleCircuitBoardDropListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler
	  public void onSCBdrop(EntityDeathEvent e) {
		  if (e.getEntity() instanceof IronGolem) {
				  if (e.getEntity().getKiller() instanceof Player) {
					  if (Slimefun.isEnabled(e.getEntity().getKiller().getWorld().getName())) {
						  if (PlayerResearch.hasResearched(e.getEntity().getKiller(), "Electric Work")) {
							  e.getDrops().add(SlimefunItem.SIMPLE_CIRCUIT_BOARD);
						  }
					  }
				  }
		  }
	  }
}
