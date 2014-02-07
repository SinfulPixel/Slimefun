package me.mrCookieSlime.Slimefun.Dictionary;

import me.mrCookieSlime.Slimefun.Items.ItemModifier;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class UpgradeDictionary {
	
	public static ItemStack get(String name) {
		ItemStack item = new ItemStack(Material.AIR);
		
		if (name.equalsIgnoreCase("glider")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Glider");
		}
		else if (name.equalsIgnoreCase("jetpack")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Jetpack");
		}
		else if (name.equalsIgnoreCase("KineticLegs")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Kinetic Legs");
		}
		else if (name.equalsIgnoreCase("jumpassist")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Jump Assist");
		}
		else if (name.equalsIgnoreCase("scuba")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Scuba Helmet");
		}
		else if (name.equalsIgnoreCase("nightvision")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Night Vision Goggles");
		}
		else if (name.equalsIgnoreCase("longfall")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Long Fall Boots");
		}
		else if (name.equalsIgnoreCase("enderfake")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Ender Fake");
		}
		else if (name.equalsIgnoreCase("climb")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Spider Climb");
		}
		else if (name.equalsIgnoreCase("repair")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Armor-Repair");
		}
		else if (name.equalsIgnoreCase("disco")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Disco");
		}
		else if (name.equalsIgnoreCase("ArrowReflector")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Arrow Reflector");
		}
		else if (name.equalsIgnoreCase("fire-resistance")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Fire Resistance");
		}
		else if (name.equalsIgnoreCase("regeneration")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Regeneration");
		}
		else if (name.equalsIgnoreCase("resistance")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Resistance");
		}
		else if (name.equalsIgnoreCase("absorption")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Absorption");
		}
		else if (name.equalsIgnoreCase("milk-module")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Milk Module");
		}
		else if (name.equalsIgnoreCase("strength")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Strength");
		}
		else if (name.equalsIgnoreCase("double-jump")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Double Jump");
		}
		else if (name.equalsIgnoreCase("fast-digging")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Fast Digging");
		}
		else if (name.equalsIgnoreCase("feeder")) {
			item.setType(Material.FIREWORK_CHARGE);	
			item = ItemModifier.Setname(item,ChatColor.GOLD + "Uber Upgrade Core");
			item = ItemModifier.setLore(item, ChatColor.GRAY + "Feeder");
		}
		
		return item;
	}

}
