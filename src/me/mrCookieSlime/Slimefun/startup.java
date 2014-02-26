package me.mrCookieSlime.Slimefun;


import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Inventories.SlimefunInventory;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Setup.Classes;
import me.mrCookieSlime.Slimefun.Setup.Commands;
import me.mrCookieSlime.Slimefun.Setup.Config;
import me.mrCookieSlime.Slimefun.Setup.Folder;
import me.mrCookieSlime.Slimefun.Setup.FortuneCookieMessages;
import me.mrCookieSlime.Slimefun.Setup.Guide;
import me.mrCookieSlime.Slimefun.Setup.Informations;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.Setup.Recipes;
import me.mrCookieSlime.Slimefun.Setup.Researches;
import me.mrCookieSlime.Slimefun.Setup.Statistics;
import me.mrCookieSlime.Slimefun.Setup.UberUpgrades;
import me.mrCookieSlime.Slimefun.Updater.UpdateType;
import me.mrCookieSlime.Slimefun.research.CraftingBlocker;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.plugin.java.JavaPlugin;


public class startup extends JavaPlugin {

	@Override
	public void onEnable() {
		AutoUpdate();
		
		Folder.cleanup();
		
		new PlayerResearch(this);
		new CraftingBlocker(this);
		
		new Slimefun(this);
		new SlimefunInventory(this);
		
		Recipes.setup(this);
		Informations.setup();
		Commands.setup(this);
		Config.setup(this);
		Statistics.setup(this);
		Messages.setup();
		Guide.setup(this);
		messages.init(this);
		FortuneCookieMessages.setup();
		Researches.setup();
		UberUpgrades.setup();
		Classes.setup(this);
		
		System.out.println("[Slimefun] " + "Config loaded");
		System.out.println("[Slimefun] " + "Slimefun v" + getDescription().getVersion() + " enabled!");
		
		System.out.println("[Slimefun] Starting Runnable...");
		RunningTimer.runRunnable(this);
		System.out.println("[Slimefun] Runnable started!");
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("Slimefun v" + this.getDescription().getVersion() + " disabled!");
	}
	
	public void AutoUpdate() {
		if (getConfig().getBoolean("options.auto-update")) {
			new Updater(this, 53485, getFile(), UpdateType.DEFAULT, true);
		}
	}
}