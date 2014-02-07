package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class CircuitBoardListener implements Listener {
	
	private startup plugin;
	
	public CircuitBoardListener(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (p.getItemInHand().getType() == Material.POWERED_RAIL && p.getItemInHand().getDurability() == 1) {
				e.setCancelled(true);
			}
			if (p.getItemInHand().getType() == Material.ACTIVATOR_RAIL && p.getItemInHand().getDurability() == 1) {
				e.setCancelled(true);
			}
			if (p.getItemInHand().getType() == Material.DETECTOR_RAIL && p.getItemInHand().getDurability() == 1) {
				e.setCancelled(true);
			}
		}
	}

}
