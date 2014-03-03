package me.mrCookieSlime.Slimefun.Setup;

import java.io.File;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Messages {
	
	public static File messages = new File("plugins/Slimefun", "messages.yml");
	public static FileConfiguration msgcfg = YamlConfiguration.loadConfiguration(messages);

	  public static void setup() {
			if (!msgcfg.contains("messages.not-enough-materials")) {
				msgcfg.set("messages.not-enough-materials", "&cYou dont have enough Materials to craft this Item!");
			}
			if (!msgcfg.contains("messages.no-permission")) {
				msgcfg.set("messages.no-permission", "&cYou don't have the permission %permission%");
			}
			if (!msgcfg.contains("messages.player-is-not-online")) {
				msgcfg.set("messages.player-is-not-online", "&6%player% &cis not online");
			}
			if (!msgcfg.contains("messages.teleported-to")) {
				msgcfg.set("messages.teleported-to", "&9You were teleported to &6%player%");
			}
			if (!msgcfg.contains("messages.too-few-arguments")) {
				msgcfg.set("messages.too-few-arguments", "&cToo few arguments");
			}
			if (!msgcfg.contains("messages.command-only-for-players")) {
				msgcfg.set("messages.command-only-for-players", "This Command is only for Players!");
			}
			if (!msgcfg.contains("messages.too-many-arguments")) {
				msgcfg.set("messages.too-many-arguments", "&cToo many arguments");
			}
			if (!msgcfg.contains("descriptions.reload")) {
				msgcfg.set("descriptions.reload", "&bReloads the config");
			}
			if (!msgcfg.contains("descriptions.items")) {
				msgcfg.set("descriptions.items", "&bShows you all Slimefun items");
			}
			if (!msgcfg.contains("descriptions.guide")) {
				msgcfg.set("descriptions.guide", "&bGives you the Slimefun guide");
			}
			if (!msgcfg.contains("descriptions.team")) {
				msgcfg.set("descriptions.team", "&bShows you the Slimefun team");
			}
			if (!msgcfg.contains("messages.config-reload")) {
				msgcfg.set("messages.config-reload", "&9Config reloaded");
			}
			if (!msgcfg.contains("messages.guide-already-in-inventory")) {
				msgcfg.set("messages.guide-already-in-inventory", "&cYou already have a slimefun guide in your inventory");
			}
			if (!msgcfg.contains("messages.no-cheating")) {
				msgcfg.set("messages.no-cheating", "&cDid you think you could cheat them in? ^^");
			}
			if (!msgcfg.contains("messages.milkSelf")) {
				msgcfg.set("messages.milkSelf", "&9You are drinking a glass of milk :D");
			}
			if (!msgcfg.contains("messages.milkOther-Sender")) {
				msgcfg.set("messages.milkOther-Sender", "&9You gave %player% a glass of milk :D");
			}
			if (!msgcfg.contains("messages.milkOther-Target")) {
				msgcfg.set("messages.milkOther-Target", "&9%player% gave you a glass of milk :D");
			}
			if (!msgcfg.contains("messages.vanish")) {
				msgcfg.set("messages.vanish", "&bYou vanished!");
			}
			if (!msgcfg.contains("messages.visible")) {
				msgcfg.set("messages.visible", "&bYou are now visible!");
			}
			if (!msgcfg.contains("messages.NanoAxelMode-axe")) {
				msgcfg.set("messages.NanoAxelMode-axe", "&9Nano Axel mode set to: &b&lAxe");
			}
			if (!msgcfg.contains("messages.NanoAxelMode-shovel")) {
				msgcfg.set("messages.NanoAxelMode-shovel", "&9Nano Axel mode set to: &b&lshovel");
			}
			if (!msgcfg.contains("messages.teleported-bed")) {
				msgcfg.set("messages.teleported-bed", "&9You were teleported to your bed");
			}
			if (!msgcfg.contains("messages.no-bed")) {
				msgcfg.set("messages.no-bed", "&cYou don't have a bed to teleport to");
			}
			if (!msgcfg.contains("messages.not-a-valid-argument")) {
				msgcfg.set("messages.not-a-valid-argument", "&6%argument% &cis not a valid argument!");
			}
			if (!msgcfg.contains("messages.multi-tool-mode-changed")) {
				msgcfg.set("messages.multi-tool-mode-changed", "&9Multi Tool mode changed to: &b&l%mode%");
			}
			if (!msgcfg.contains("messages.usage")) {
				msgcfg.set("messages.usage", "&7Correct Usage: &9&l%usage%");
			}
			if (!msgcfg.contains("messages.no-more-lava")) {
				msgcfg.set("messages.no-more-lava", "&cThis Smeltery ran out of Lava! Please refill it");
			}
			if (!msgcfg.contains("messages.decent-lava")) {
				msgcfg.set("messages.decent-lava", "&9The Amount of Lava in this Smeltery is still pretty decent");
			}
			if (!msgcfg.contains("descriptions.villagers")) {
				msgcfg.set("descriptions.villagers", "&bShows all Villager Types");
			}
			if (!msgcfg.contains("descriptions.killnpc")) {
				msgcfg.set("descriptions.killnpc", "&bRemoves a Slimefun Villager");
			}
			if (!msgcfg.contains("messages.quest-completed")) {
				msgcfg.set("messages.quest-completed", "&9Thank you much, Sir! Here's your reward!");
			}
			if (!msgcfg.contains("messages.quest-cancel")) {
				msgcfg.set("messages.quest-cancel", "&7Type \"&9/quest cancel&7\" to cancel the Quest");
			}
			if (!msgcfg.contains("messages.quest-cancelled")) {
				msgcfg.set("messages.quest-cancelled", "&cQuest cancelled");
			}
			if (!msgcfg.contains("messages.npc-remove")) {
				msgcfg.set("messages.npc-remove", "&9Right click &aa Villager to remove it");
			}
			if (!msgcfg.contains("messages.npc-removed")) {
				msgcfg.set("messages.npc-removed", "&aSuccessfully removed the Villager");
			}
			if (!msgcfg.contains("messages.not-researched")) {
				msgcfg.set("messages.not-researched", "&cYou don't have the knowledge to understand this");
			}
			if (!msgcfg.contains("messages.researched")) {
				msgcfg.set("messages.researched", "&9You learned %research%");
			}
			if (!msgcfg.contains("messages.all-researched")) {
				msgcfg.set("messages.all-researched", "&bYou already know everything I can teach you right now");
			}
			if (!msgcfg.contains("messages.never-surface")) {
				msgcfg.set("messages.never-surface", "&cYou've never been on the surface 0.0");
			}
			if (!msgcfg.contains("descriptions.research")) {
				msgcfg.set("descriptions.research", "&bCheats Researches");
			}
			if (!msgcfg.contains("descriptions.donators")) {
				msgcfg.set("descriptions.donators", "&bShows all Donators");
			}
			if (!msgcfg.contains("messages.no-uber")) {
				msgcfg.set("messages.no-uber", "&cYou're not wearing the appropriate part of Uber armor");
			}
			if (!msgcfg.contains("messages.already-installed")) {
				msgcfg.set("messages.already-installed", "&cYou already installed this Upgrade");
			}
			if (!msgcfg.contains("messages.not-enabled")) {
				msgcfg.set("messages.not-enabled", "&4Slimefun is not enabled in this World");
			}
			if (!msgcfg.contains("messages.not-died")) {
				msgcfg.set("messages.not-died", "&cYou have not died yet");
			}
			if (!msgcfg.contains("messages.not-enough-xp")) {
				msgcfg.set("messages.not-enough-xp", "&cYou don't have enough XP for this");
			}
			if (!msgcfg.contains("descriptions.give")) {
				msgcfg.set("descriptions.give", "&bGives Items");
			}
			try {
				msgcfg.save(messages);
			} catch (Exception e1) {
			}
		}

}
