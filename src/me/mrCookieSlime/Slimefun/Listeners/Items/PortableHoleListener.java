package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.io.File;
import java.io.IOException;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.api.PlayerInventory;

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
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class PortableHoleListener implements Listener {
	
	public static File Locations = new File("data-storage/Slimefun", "Deaths.yml");
	public static FileConfiguration lcfg = YamlConfiguration.loadConfiguration(Locations);
	
	private startup plugin;
	
	public PortableHoleListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onUse(PlayerInteractEvent e) {
		if (e.getItem().getType() == Material.ENDER_PEARL && e.getItem().getDurability() == 1) {
			if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
				e.setCancelled(true);
				Player p = e.getPlayer();
				if (lcfg.contains(p.getName() + ".X")) {
					Location death = p.getLocation();
					death.setX(lcfg.getDouble(p.getName() + ".X"));
					death.setY(lcfg.getDouble(p.getName() + ".Y"));
					death.setZ(lcfg.getDouble(p.getName() + ".Z"));
					death.setYaw(lcfg.getInt(p.getName() + ".YAW"));
					death.setPitch(lcfg.getInt(p.getName() + ".PITCH"));
					death.setWorld(Bukkit.getWorld(lcfg.getString(p.getName() + ".WORLD")));
					
					p.teleport(death);
					death.getWorld().playSound(death, Sound.ENDERMAN_TELEPORT, 1, 1);
					death.getWorld().playEffect(death, Effect.ENDER_SIGNAL, 1);
					PlayerInventory.consumeItemInHand(p);
				}
				else {
					messages.NotDied(p);
				}
			}
		}
	}
	
	@EventHandler
	public void onDeath(EntityDeathEvent e) {
		if (e.getEntity() instanceof Player) {
			Player p = (Player) e.getEntity();
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
