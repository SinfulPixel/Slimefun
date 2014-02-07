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
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		File players = new File("data-storage/Slimefun/Players", p.getName() + ".yml");
		FileConfiguration pcfg = YamlConfiguration.loadConfiguration(players);
		
		File Researches = new File("data-storage/Slimefun/Researches", p.getName() + ".yml");
		FileConfiguration rcfg = YamlConfiguration.loadConfiguration(Researches);
		
		if (plugin.getConfig().getBoolean("options.enable-researching")) {
			for (int i = 0; i < PlayerResearch.getResearchNames().size(); i++) {
				if (!rcfg.contains(p.getName() + "." + PlayerResearch.getResearchNames().get(i))) {
					rcfg.set(p.getName() + "." + PlayerResearch.getResearchNames().get(i), false);
					try {
						rcfg.save(Researches);
					} catch (IOException e1) {
					}
				}
			}
		}
		else {
			for (int i = 0; i < PlayerResearch.getResearchNames().size(); i++) {
				if (!rcfg.contains(p.getName() + "." + PlayerResearch.getResearchNames().get(i))) {
					rcfg.set(p.getName() + "." + PlayerResearch.getResearchNames().get(i), true);
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
