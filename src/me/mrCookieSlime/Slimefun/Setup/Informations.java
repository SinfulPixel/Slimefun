package me.mrCookieSlime.Slimefun.Setup;

import java.io.File;
import java.io.IOException;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Informations {
	
	private static startup plugin;
	
	public static File sounds = new File("plugins/Slimefun", "Sounds.yml");
	public static FileConfiguration scfg = YamlConfiguration.loadConfiguration(sounds);
	
	public static File ECP = new File("plugins/Slimefun/supported-plugins", "EnderChestPlus.yml");
	public static FileConfiguration ECPcfg = YamlConfiguration.loadConfiguration(ECP);
	
	public static File FB = new File("plugins/Slimefun/supported-plugins", "FoodBalance.yml");
	public static FileConfiguration FBcfg = YamlConfiguration.loadConfiguration(FB);
	
	public static File players = new File("plugins/Slimefun/data-storage", "players.yml");
	public static FileConfiguration pcfg = YamlConfiguration.loadConfiguration(players);
	
	
	public static void setup(startup instance) {
		
		plugin = instance;
		
		scfg.set("Available sounds", "click,ender,dragon,wither,ghast,step,piston,none");
		try {
			scfg.save(sounds);
			pcfg.save(players);
		} 
		catch (Exception x) {
		}
		
		if (plugin.getServer().getPluginManager().isPluginEnabled("EnderChestPlus")) {
			ECPcfg.set("Plugin found", true);
			if (!ECPcfg.contains("use")) {
				ECPcfg.set("use", true);
			}
			try {
				ECPcfg.save(ECP);
			} catch (IOException e) {
			}
		}
		else {
			ECPcfg.set("Plugin found", false);
			if (!ECPcfg.contains("use")) {
				ECPcfg.set("use", false);
			}
			try {
				ECPcfg.save(ECP);
			} catch (IOException e) {
			}
		}
		if (plugin.getServer().getPluginManager().isPluginEnabled("FoodBalance")) {
			FBcfg.set("Plugin found", true);
			if (!FBcfg.contains("use")) {
				FBcfg.set("use", true);
			}
			try {
				FBcfg.save(FB);
			} catch (IOException e) {
			}
		}
		else {
			FBcfg.set("Plugin found", false);
			if (!FBcfg.contains("use")) {
				FBcfg.set("use", false);
			}
			try {
				FBcfg.save(FB);
			} catch (IOException e) {
			}
		}
	}

}
