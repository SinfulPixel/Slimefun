package me.mrCookieSlime.Slimefun.Dictionary;

import me.mrCookieSlime.Slimefun.Items.ItemModifier;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class VillagerDictionary {
	
	public static ItemStack getEgg(String ConfigName) {
		ItemStack item = new ItemStack(Material.AIR, 1);
		
		if (ConfigName.equalsIgnoreCase("Merchant")) {
			item.setType(Material.MONSTER_EGG);
			item = ItemModifier.Setname(item, ChatColor.RESET + "Spawn \"" + ChatColor.GRAY + "Lost " + ChatColor.BLUE + "Merchant" + ChatColor.RESET + "\"");
			item = ItemModifier.setDurability(item, 120);
		}
		if (ConfigName.equalsIgnoreCase("quest")) {
			item.setType(Material.MONSTER_EGG);
			item = ItemModifier.Setname(item, ChatColor.RESET + "Spawn \"" + ChatColor.GREEN + "Quest " + ChatColor.BLUE + "Villager" + ChatColor.RESET + "\"");
			item = ItemModifier.setDurability(item, 120);
		}
		if (ConfigName.equalsIgnoreCase("blacksmith")) {
			item.setType(Material.MONSTER_EGG);
			item = ItemModifier.Setname(item, ChatColor.RESET + "Spawn \"" + ChatColor.GRAY + "Lost " + ChatColor.DARK_GRAY + "Blacksmith" + ChatColor.RESET + "\"");
			item = ItemModifier.setDurability(item, 120);
		}
		return item;
	}
}
