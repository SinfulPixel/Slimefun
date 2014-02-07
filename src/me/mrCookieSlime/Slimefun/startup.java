package me.mrCookieSlime.Slimefun;

import java.io.File;

import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Setup.Classes;
import me.mrCookieSlime.Slimefun.Setup.Commands;
import me.mrCookieSlime.Slimefun.Setup.Config;
import me.mrCookieSlime.Slimefun.Setup.FortuneCookieMessages;
import me.mrCookieSlime.Slimefun.Setup.Guide;
import me.mrCookieSlime.Slimefun.Setup.Informations;
import me.mrCookieSlime.Slimefun.Setup.Messages;
import me.mrCookieSlime.Slimefun.Setup.Recipes;
import me.mrCookieSlime.Slimefun.Setup.Researches;
import me.mrCookieSlime.Slimefun.Setup.Statistics;
import me.mrCookieSlime.Slimefun.Setup.UberUpgrades;
import me.mrCookieSlime.Slimefun.Updater.UpdateType;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public class startup extends JavaPlugin {
	
	
	public File ECP = new File("plugins/Slimefun/supported-plugins", "EnderChestPlus.yml");
	public FileConfiguration ECPcfg = YamlConfiguration.loadConfiguration(ECP);
	
	public File FB = new File("plugins/Slimefun/supported-plugins", "FoodBalance.yml");
	public FileConfiguration FBcfg = YamlConfiguration.loadConfiguration(FB);

	@Override
	public void onEnable() {
		AutoUpdate();
		
		Classes.setup(this);
		Recipes.setup(this);
		Informations.setup(this);
		Commands.setup(this);
		Config.setup(this);
		Statistics.setup(this);
		Messages.setup();
		Guide.setup(this);
		messages.init(this);
		FortuneCookieMessages.setup();
		Researches.setup();
		UberUpgrades.setup();
		
		System.out.println("[Slimefun] " + "Config loaded");
		System.out.println("[Slimefun] " + "Slimefun v" + getDescription().getVersion() + " enabled!");
		
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