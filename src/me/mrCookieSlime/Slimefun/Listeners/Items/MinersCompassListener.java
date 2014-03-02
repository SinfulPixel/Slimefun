package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.io.File;
import java.io.IOException;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Utilities.Calculator;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class MinersCompassListener implements Listener{
	
	private startup plugin;
	
	public static File Locations = new File("data-storage/Slimefun", "Locations.yml");
	public static FileConfiguration lcfg = YamlConfiguration.loadConfiguration(Locations);
	
	public MinersCompassListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onSunlight(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		
		if (p.getInventory().contains(SlimefunItem.MINERS_COMPASS)) {
			
			boolean b = true;
			for (int i = (int) p.getLocation().getY() + 2; i < p.getWorld().getMaxHeight(); i++) {
				
				if (p.getWorld().getBlockAt((int)p.getLocation().getX(), i, (int)p.getLocation().getZ()).getType() != Material.AIR) {
					b = false;
					break;
				}
			}
			
			if (b) {
				lcfg.set(p.getName() + ".X", p.getLocation().getX());
				lcfg.set(p.getName() + ".Y", p.getLocation().getY());
				lcfg.set(p.getName() + ".Z", p.getLocation().getZ());
				lcfg.set(p.getName() + ".YAW", p.getLocation().getYaw());
				lcfg.set(p.getName() + ".PITCH", p.getLocation().getPitch());
				lcfg.set(p.getName() + ".WORLD", p.getLocation().getWorld().getName());
				try {
					lcfg.save(Locations);
				} catch (IOException x) {
				}
			}
		}
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onTP(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (p.getItemInHand().getType() == Material.COMPASS && p.getItemInHand().getDurability() == 1) {
				
				e.setCancelled(true);
				
				if (lcfg.contains(p.getName())) {
					Location l = p.getLocation();
					
					l.setX(lcfg.getDouble(p.getName() + ".X"));
					l.setY(lcfg.getDouble(p.getName() + ".Y"));
					l.setZ(lcfg.getDouble(p.getName() + ".Z"));
					l.setYaw(lcfg.getInt(p.getName() + ".YAW"));
					l.setPitch(lcfg.getInt(p.getName() + ".PITCH"));
					l.setWorld(Bukkit.getWorld(lcfg.getString(p.getName() + ".WORLD")));
					
					p.teleport(Calculator.centerPosition(l));
					p.playSound(l, Sound.ENDERDRAGON_GROWL, 1, 1);
					p.playEffect(l, Effect.SMOKE, 1);
				}
				else {
					messages.NeverBeenOnTheSurface(p);
				}
			}
		}
	}
}
