package me.mrCookieSlime.Slimefun.Listeners.UberUpgrades;

import java.util.List;

import me.mrCookieSlime.CSCoreLib.general.Player.PlayerInventory;
import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Dictionary.UpgradeDictionary;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ArrowReflectorUpgrade implements Listener {
	
private startup plugin;
	
	public ArrowReflectorUpgrade(startup instance) {
		plugin = instance;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onInstall(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		ItemStack upgrade = p.getItemInHand();
		ItemStack armor = p.getInventory().getChestplate();
		String arm = "Chestplate";
		String dic = "ArrowReflector";
		
		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (upgrade.isSimilar(UpgradeDictionary.get(dic))) {
				if (armor != null) {
					if (armor.hasItemMeta()) {
						if (armor.getItemMeta().hasDisplayName()) {
							if (armor.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + arm)) {
								if (!armor.getItemMeta().getLore().contains(upgrade.getItemMeta().getLore().get(0))) {
									PlayerInventory.consumeItemInHand(p);
									p.playSound(p.getLocation(), Sound.ANVIL_USE, 1, 1);
									ItemMeta im = armor.getItemMeta();
									List<String> lore = armor.getItemMeta().getLore();
									lore.add(upgrade.getItemMeta().getLore().get(0));
									im.setLore(lore);
									armor.setItemMeta(im);
									p.updateInventory();
								}
								else {
									messages.AlreadyInstalled(p);
								}
							}
							else {
								messages.NoUber(p);
							}
						}
						else {
							messages.NoUber(p);
						}
					}
					else {
						messages.NoUber(p);
					}
				}
				else {
					messages.NoUber(p);
				}
			}
		}
	}

}
