package me.mrCookieSlime.Slimefun.Listeners.Gear;

import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class JetpackListener implements Listener {
	private startup plugin;
	
	public JetpackListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onJetpackThrust(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		try {
		if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_FIRE) == 20 || p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 20) {
				if(p.isSneaking()) {
					if (p.hasPermission("slimefun.jetpack")) {
					p.getWorld().playSound(p.getLocation(), Sound.EXPLODE, (float) 0.25, 1);
					p.getWorld().playEffect(p.getLocation(), Effect.SMOKE, 1, 1);
					Location l = p.getLocation();
					l.setPitch(1000);
				       Vector d = l.getDirection();
				       d.multiply(0.55);
				       p.setVelocity(d);
				       
				       p.setFallDistance(0F);
				       
				       if (p.getInventory().getChestplate().getDurability() < 79) {
				    	   int r = new Random().nextInt(50);
				    	   if (r == 1) {
				    		   p.getInventory().getChestplate().setDurability((short) (p.getInventory().getChestplate().getDurability() + 1));
				    	   }
				       }
				       else {
				    	   p.getInventory().setChestplate(null);
				    	   p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
				       }
				       
					}
					else {
						messages.NoPermission(p, "slimefun.jetpack");
					}
				}
			}
		}
		catch(Exception x) {
			
		}
	}
}
