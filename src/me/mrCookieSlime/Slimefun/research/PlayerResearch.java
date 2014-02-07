package me.mrCookieSlime.Slimefun.research;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PlayerResearch {
	
	public static startup plugin;
	
	public static Map<ItemStack, String> map = new HashMap<ItemStack, String>();
	public static List<String> ll = new ArrayList<String>();
	
	public PlayerResearch(startup instance) {
		plugin = instance;
	}
	
	public static boolean hasResearched(Player p, String research) {
		boolean b = false;
		
		File Researches = new File("data-storage/Slimefun/Researches", p.getName() + ".yml");
		FileConfiguration rcfg = YamlConfiguration.loadConfiguration(Researches);
		
		if (plugin.getConfig().contains("researches." + research)) {
			if (plugin.getConfig().getBoolean("researches." + research)) {
				if (rcfg.contains(p.getName() + "." + research)) {
					if (rcfg.getBoolean(p.getName() + "." + research)) {
						b = true;
					}
				}
			}
			else {
				b = true;
			}
		}
		else {
			if (rcfg.contains(p.getName() + "." + research)) {
				if (rcfg.getBoolean(p.getName() + "." + research)) {
					b = true;
				}
			}
		}
		
		return b;
	}
	
	public static void research(Player p, String research) {
		
		File Researches = new File("data-storage/Slimefun/Researches", p.getName() + ".yml");
		FileConfiguration rcfg = YamlConfiguration.loadConfiguration(Researches);
		
		rcfg.set(p.getName() + "." + research, true);
		try {
			rcfg.save(Researches);
		} catch (IOException e) {
		}
	}
	
	public static List<String> getResearchNames() {
		List<String> researches = new ArrayList<String>();
		
		for (int i = 0; i < ll.size(); i++) {
			if (plugin.getConfig().contains("researches." + ll.get(i))) {
				if (plugin.getConfig().getBoolean("researches." + ll.get(i))) {
					researches.add(ll.get(i));
				}
			}
			else {
				researches.add(ll.get(i));
			}
		}
		return researches;
	}

}
