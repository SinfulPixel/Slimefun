package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Commands.SlimefunCommand;
import me.mrCookieSlime.Slimefun.Commands.SlimefunTabCompleter;

public class Commands {
	
	public static startup plugin;
	
	public static void setup(startup instance) {
		
		plugin = instance;
		
		SlimefunCommand cmdi = new SlimefunCommand(plugin);
		SlimefunTabCompleter tab = new SlimefunTabCompleter();
		
		plugin.getCommand("slimefun").setTabCompleter(tab);
		plugin.getCommand("sf").setTabCompleter(tab);
		
		plugin.getCommand("slimefun").setExecutor(cmdi);
		plugin.getCommand("sf").setExecutor(cmdi);
	}

}
