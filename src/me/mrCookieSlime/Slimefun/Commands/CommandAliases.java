package me.mrCookieSlime.Slimefun.Commands;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandAliases implements Listener {
	
	private startup plugin;
	public CommandAliases(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler
	public void Help(PlayerCommandPreprocessEvent e) {
		Player p = e.getPlayer();
		if (e.getMessage().equalsIgnoreCase("/help slimefun")) {
			p.performCommand("sf");
			e.setCancelled(true);
		}
		else if (e.getMessage().equalsIgnoreCase("/sf help")) {
			p.performCommand("sf");
			e.setCancelled(true);
		}
		else if (e.getMessage().equalsIgnoreCase("/slimefun help")) {
			p.performCommand("sf");
			e.setCancelled(true);
		}
		else if (e.getMessage().equalsIgnoreCase("/sf ?")) {
			p.performCommand("sf");
			e.setCancelled(true);
		}
		else if (e.getMessage().equalsIgnoreCase("/slimefun ?")) {
			p.performCommand("sf");
			e.setCancelled(true);
		}
	}

}
