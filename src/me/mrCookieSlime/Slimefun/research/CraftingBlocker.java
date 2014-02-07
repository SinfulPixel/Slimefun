package me.mrCookieSlime.Slimefun.research;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class CraftingBlocker implements Listener {
	
	private startup plugin;
	
	public CraftingBlocker(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onCraft(CraftItemEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (Slimefun.getResearches().containsKey(e.getCurrentItem())) {
			if (Slimefun.isEnabled(p.getWorld().getName())) {
				if (!PlayerResearch.hasResearched(p, Slimefun.getResearches().get(e.getCurrentItem()))) {
					e.setCancelled(true);
					messages.NotResearched(p);
					p.playSound(p.getLocation(), Sound.CLICK, 1, 1);
				}
			}
			else {
				e.setCancelled(true);
				messages.NotEnabled(p);
			}
		}
	}

}
