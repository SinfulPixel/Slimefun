package me.mrCookieSlime.Slimefun;

import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class RunningTimer {
	
	public static void runRunnable(startup plugin) {
		plugin.getServer().getScheduler().runTaskTimer(plugin, new BukkitRunnable() {
			
			@Override
			public void run() {
				for (Player p: Bukkit.getOnlinePlayers()) {
					if (p.getInventory().getHelmet() != null) {
						// Glowstone Helmet
						if (p.getInventory().getHelmet().getEnchantments().containsKey(Enchantment.DURABILITY)) {
							if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.DURABILITY) == 8) {
				    			 p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999, 2));
					     }
						}
						
					}
				}
				
			}
		}, 0L, plugin.getConfig().getInt("armor.update-second-delay") * 20L);
	}

}
