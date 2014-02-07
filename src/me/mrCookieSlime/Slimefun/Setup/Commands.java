package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Commands.SlimefunCommand;
import me.mrCookieSlime.Slimefun.Commands.SlimefunTabCompleter;
import me.mrCookieSlime.Slimefun.Commands.commands;

public class Commands {
	
	public static startup plugin;
	
	public static void setup(startup instance) {
		
		plugin = instance;
		
		commands cmd = new commands(plugin);
		SlimefunCommand cmdi = new SlimefunCommand(plugin);
		SlimefunTabCompleter tab = new SlimefunTabCompleter();
		
		if (plugin.getConfig().getBoolean("disable-features-except-the-items") == false) {
			plugin.getCommand("milk").setExecutor(cmd);
		}
		
		plugin.getCommand("slimefun").setTabCompleter(tab);
		plugin.getCommand("sf").setTabCompleter(tab);
		
		plugin.getCommand("slimefun").setExecutor(cmdi);
		plugin.getCommand("sf").setExecutor(cmdi);
	}

}
