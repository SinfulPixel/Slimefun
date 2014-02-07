package me.mrCookieSlime.Slimefun.Listeners.Gear;

import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.BlockFace;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class ParachuteListener implements Listener {
	
private startup plugin;
	
	public ParachuteListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onJetpackThrust(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		try {
		if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_FALL) == 20) {
				if(p.isSneaking()) {
					if (p.hasPermission("slimefun.parachute")) {
									if(p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType().equals(Material.AIR)){
										if(p.getLocation().getPitch() > -5){
											if (p.getInventory().getChestplate().getDurability() < 79) {
												int r = new Random().nextInt(30);
										    	   if (r == 1) {
										    		   p.getInventory().getChestplate().setDurability((short) (p.getInventory().getChestplate().getDurability() + 1));
										    	   }
										       }
										       else {
										    	   p.getInventory().setChestplate(null);
										    	   p.playSound(p.getLocation(), Sound.WOLF_SHAKE, 1, 1);
										       }
											if(p.getLocation().getPitch() < 5){
												p.setVelocity(p.getLocation().getDirection().multiply(0.2));
											}else{
												p.setVelocity(p.getLocation().getDirection().multiply(0.2));
											}
											p.setFallDistance(0F);
										}
									
									}
							}
							else {
								messages.NoPermission(p, "slimefun.parachute");
								}
				}
			}
		}
		catch(Exception x) {
			
		}
	}
}
