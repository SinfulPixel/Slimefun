package me.mrCookieSlime.Slimefun.Items;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class Category {
	
	public static ItemStack Basics() {
		ItemStack item = new ItemStack(Material.FEATHER);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Basic Tinkering");
		return item;
	}
	
	public static ItemStack CrystalsAndGems() {
		ItemStack item = new ItemStack(Material.EMERALD);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Crystals and Gems");
		return item;
	}
	
	public static ItemStack Portable() {
		ItemStack item = new ItemStack(Material.BOOK);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Portable Utilities");
		return item;
	}
	
	public static ItemStack Weaponry() {
		ItemStack item = new ItemStack(Material.GOLD_SWORD);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Weapons");
		return item;
	}
	
	public static ItemStack Food() {
		ItemStack item = new ItemStack(Material.GRILLED_PORK);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Food");
		return item;
	}
	
	public static ItemStack ArmorCrafting() {
		ItemStack item = new ItemStack(Material.GOLD_CHESTPLATE);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Armor Crafting");
		return item;
	}
	
	public static ItemStack MagicUtils() {
		ItemStack item = new ItemStack(Material.BLAZE_POWDER);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Magic Utilities");
		return item;
	}
	
	public static ItemStack LumpsAndMagic() {
		ItemStack item = new ItemStack(Material.GOLD_NUGGET);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Lumps and Magic");
		return item;
	}
	
	public static ItemStack Electric() {
		ItemStack item = new ItemStack(Material.REDSTONE);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Electric Work");
		return item;
	}
	
	public static ItemStack Smelting() {
		ItemStack item = new ItemStack(Material.FURNACE);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Smelting");
		return item;
	}
	
	public static ItemStack Materials() {
		ItemStack item = new ItemStack(Material.BUCKET);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Materials");
		return item;
	}
	
	public static ItemStack Gear() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemMeta im = item.getItemMeta();
		((LeatherArmorMeta) im).setColor(Color.GRAY);
		item.setItemMeta(im);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Gear");
		return item;
	}
	
	public static ItemStack Tools() {
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Tools");
		return item;
	}
	
	public static ItemStack UberUpgrades() {
		ItemStack item = new ItemStack(Material.FIREWORK_CHARGE);
		item = ItemModifier.Setname(item, ChatColor.GOLD + "Uber Upgrade Cores");
		return item;
	}
	
	public static ItemStack Machines() {
		ItemStack item = new ItemStack(Material.IRON_BLOCK);
		item = ItemModifier.Setname(item, ChatColor.GRAY + "Electric Machines");
		return item;
	}

}
