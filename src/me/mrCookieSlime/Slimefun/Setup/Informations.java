package me.mrCookieSlime.Slimefun.Setup;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Informations {
	
	public static File sounds = new File("plugins/Slimefun", "Sounds.yml");
	public static FileConfiguration scfg = YamlConfiguration.loadConfiguration(sounds);
	
	public static File players = new File("plugins/Slimefun/data-storage", "players.yml");
	public static FileConfiguration pcfg = YamlConfiguration.loadConfiguration(players);
	
	
	public static void setup() {
		
		scfg.set("Available sounds", "click,ender,dragon,wither,ghast,step,piston,none");
		try {
			scfg.save(sounds);
			pcfg.save(players);
		} 
		catch (Exception x) {
		}
	}

}
