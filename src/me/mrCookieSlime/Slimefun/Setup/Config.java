package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {
	
	public static startup plugin;
	
	public static void setup(startup instance) {
		
		plugin = instance;
		
		FileConfiguration cfg = plugin.getConfig();
		
		cfg.options().copyDefaults(true);
		plugin.saveConfig();
	}

}
