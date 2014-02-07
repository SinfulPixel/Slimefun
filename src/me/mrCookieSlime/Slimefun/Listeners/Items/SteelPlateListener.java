package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class SteelPlateListener implements Listener {
	
private startup plugin;
	
	 public SteelPlateListener(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	 
	 @EventHandler
		public void onPlace(PlayerInteractEvent e) {
			Player p = e.getPlayer();
			if (p.getItemInHand().getType() == Material.IRON_FENCE && p.getItemInHand().getDurability() == 1) {
				e.setCancelled(true);
			}
		}

}
