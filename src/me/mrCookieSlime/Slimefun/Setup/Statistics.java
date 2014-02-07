package me.mrCookieSlime.Slimefun.Setup;

import java.io.IOException;

import me.mrCookieSlime.Slimefun.Metrics;
import me.mrCookieSlime.Slimefun.startup;

public class Statistics {
	
	public static startup plugin;
	
	public static void setup(startup instance) {
		
		plugin = instance;
		
		try {
		    Metrics metrics = new Metrics(plugin);
		    metrics.start();
		} catch (IOException e) {
		}
	}

}
