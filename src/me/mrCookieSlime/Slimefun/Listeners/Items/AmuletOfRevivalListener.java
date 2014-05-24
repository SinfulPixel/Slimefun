package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.CSCoreLib.general.Player.PlayerInventory;
import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;

public class AmuletOfRevivalListener implements Listener {
	
	private startup plugin;
	
	public AmuletOfRevivalListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler
	public void onHurt(EntityDamageEvent e) {
		if (e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
			if (p.getInventory().containsAtLeast(SlimefunItem.AMULET_OF_REVIVAL, 1)) {
				if (p.getInventory().containsAtLeast(SlimefunItem.AMULET_OF_REVIVAL, 2)) {
					e.setDamage(e.getDamage() * 20);
					messages.AmuletTricked(p);
				}
				else {
					if ((p.getHealth() - e.getDamage()) <= 0) {
						messages.AmuletSaved(p);
						PlayerInventory.removeItem(p, SlimefunItem.AMULET_OF_REVIVAL, 1);
						
						e.setCancelled(true);
						e.setDamage(0);
						p.setHealth(p.getMaxHealth());
						for (PotionEffect pe: p.getActivePotionEffects()) {
							p.removePotionEffect(pe.getType());
						}
						p.setFoodLevel(20);
						p.setFireTicks(0);
					}
				}
			}
		}
	}

}
