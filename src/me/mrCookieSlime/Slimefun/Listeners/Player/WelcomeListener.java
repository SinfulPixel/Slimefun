package me.mrCookieSlime.Slimefun.Listeners.Player;


import java.io.File;
import java.io.IOException;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WelcomeListener implements Listener {
	
	private startup plugin;
	
	public WelcomeListener(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) throws IOException {
		Player p = e.getPlayer();
		
		File oldP = new File("data-storage/Slimefun/Players", p.getName() + ".yml");
		File oldR = new File("data-storage/Slimefun/Researches", p.getName() + ".yml");
		
		File players = new File("data-storage/Slimefun/Players", p.getUniqueId() + ".yml");
		FileConfiguration pcfg = YamlConfiguration.loadConfiguration(players);
		
		File Researches = new File("data-storage/Slimefun/Researches", p.getUniqueId() + ".yml");
		FileConfiguration rcfg = YamlConfiguration.loadConfiguration(Researches);
		
		if (oldP.exists() || oldR.exists()) {
			oldP.renameTo(players);
			
			oldR.delete();
			Researches.createNewFile();
			
			System.out.println("The Database of Player \"" + p.getName() + "\" has been migrated to \"" + p.getUniqueId() + "\"");
		}
		
		if (plugin.getConfig().getBoolean("options.enable-researching")) {
			for (int i = 0; i < PlayerResearch.getResearchNames().size(); i++) {
				if (!rcfg.contains("researches." + PlayerResearch.getResearchNames().get(i))) {
					rcfg.set("researches." + PlayerResearch.getResearchNames().get(i), false);
					try {
						rcfg.save(Researches);
					} catch (IOException e1) {
					}
				}
			}
		}
		else {
			for (int i = 0; i < PlayerResearch.getResearchNames().size(); i++) {
				if (!rcfg.contains("researches." + PlayerResearch.getResearchNames().get(i))) {
					rcfg.set("researches." + PlayerResearch.getResearchNames().get(i), true);
					try {
						rcfg.save(Researches);
					} catch (IOException e1) {
					}
				}
			}
		}
			
			if (!pcfg.contains(p.getName())) {
	   			if (this.plugin.getConfig().getBoolean("items.guide") == true) {
					p.getInventory().addItem(SlimefunItem.SLIMEFUN_GUIDE);
				}
				pcfg.set(p.getName(), " ");
				try {
					pcfg.save(players);
				} catch (IOException x) {
				}
			}
		}
	}
