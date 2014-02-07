package me.mrCookieSlime.Slimefun.Inventories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Items.ItemModifier;
import me.mrCookieSlime.Slimefun.Utilities.Calculator;
import me.mrCookieSlime.Slimefun.entities.SlimefunVillager;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SlimefunInventory {
	
	public static startup plugin;
	
	public SlimefunInventory(startup instance) {
		plugin = instance;
	}
	
	public static Map<Player, Inventory> lastInv = new HashMap<Player, Inventory>();
	
	
	public static Inventory craftGuide(Player p) {
		
		List<ItemStack> categories = Slimefun.getCategories();
		int lines = Calculator.formToLine(categories.size());
		Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GREEN + "Slimefun Guide");
		
		int slot = 0;
		
		for (int i = 0;i < categories.size(); i++) {
			boolean display = false;
			ItemStack[] contents = craftSubMenu(p, categories.get(i)).getContents();
			for (int j = 0; j < contents.length; j++) {
				if (contents[j] != null) {
					display = true;
				}
			}
			if (display) {
				inv.setItem(slot, categories.get(i));
				slot++;
			}
		}
		
		lastInv.put(p, inv);
		
		return inv;
	}
	
	public static Inventory craftSubMenu(Player p, ItemStack menu) {
		List<ItemStack> categories = Slimefun.getSubMenu(menu);
		int lines = Calculator.formToLine(categories.size());
		Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GREEN + "Slimefun Guide");
		
		int slot = 0;
		
		for (int i = 0;i < categories.size(); i++) {
			if (Slimefun.getResearches().containsKey(categories.get(i))) {
				if (PlayerResearch.hasResearched(p, Slimefun.getResearches().get(categories.get(i)))) {
					inv.setItem(slot, categories.get(i));
					slot++;
				}
			}
			else {
				inv.setItem(slot, categories.get(i));
				slot++;
			}
		}
		
		return inv;
	}
	
	public static Inventory craftCheat(Player p) {
		
		List<ItemStack> categories = Slimefun.getCategories();
		int lines = Calculator.formToLine(categories.size());
		Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GREEN + "Slimefun Cheat :O");
		
		int slot = 0;
		
		for (int i = 0;i < categories.size(); i++) {
			inv.setItem(slot, categories.get(i));
			slot++;
		}
		
		return inv;
	}
	
	public static Inventory craftSubCheat(Player p, ItemStack menu) {
		List<ItemStack> categories = Slimefun.getSubMenu(menu);
		int lines = Calculator.formToLine(categories.size());
		Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GREEN + "Slimefun Cheat :O");
		
		int slot = 0;
		
		for (int i = 0;i < categories.size(); i++) {
			inv.setItem(slot, categories.get(i));
			slot++;
		}
		
		return inv;
	}
	
	public static Inventory craftRecipe(Player p, ItemStack crafted) {
		List<ItemStack> categories = Slimefun.getRecipe(crafted);
		int lines = 3;
		Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GREEN + "Slimefun Guide");
		
		try {
			inv.setItem(3, categories.get(0));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(4, categories.get(1));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(5, categories.get(2));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(12, categories.get(3));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(13, categories.get(4));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(14, categories.get(5));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(21, categories.get(6));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(22, categories.get(7));
		}
		catch(Exception x) {
		}
		try {
			inv.setItem(23, categories.get(8));
		}
		catch(Exception x) {
		}
		
		inv.setItem(9, Slimefun.getRecipeType(crafted));
		inv.setItem(0, exit());
		inv.setItem(16, Slimefun.getOutput(crafted));
		
		return inv;
	}
	
	public static Inventory Team() {
		int lines = 2;
		Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.GREEN + "" + ChatColor.BOLD + "" + "Slimefun team:");
		int slot = 0;
		
		ItemStack Moewe1 = new ItemStack(Material.SKULL_ITEM, 1);
		List<String> ll = new ArrayList<String>();
		String l0 = "";
		String l1 = ChatColor.RED + "" + ChatColor.ITALIC + "Author";
		String l2 = ChatColor.AQUA + "" + ChatColor.ITALIC + "Manager";
		ll.add(l0);
		ll.add(l1);
		ll.add(l2);
		ItemMeta im = Moewe1.getItemMeta();
		im.setLore(ll);
		Moewe1.setItemMeta(im);
		Moewe1 = ItemModifier.Setname(Moewe1,ChatColor.GOLD + "Moewe1 (mrCookieSlime)");
		Moewe1 = ItemModifier.setOwner(Moewe1, "Moewe1");
		Moewe1 = ItemModifier.setDurability(Moewe1, 3);
		inv.setItem(slot, Moewe1);
		
		slot = 9;
		
		ItemStack J3h = new ItemStack(Material.SKULL_ITEM, 1);
		List<String> ll2 = new ArrayList<String>();
		String l02 = "";
		String l12 = ChatColor.GOLD + "" + ChatColor.ITALIC + "Tester";
		String l13 = ChatColor.RED + "" + ChatColor.ITALIC + "Donator";
		ll2.add(l02);
		ll2.add(l12);
		ll2.add(l13);
		ItemMeta im2 = J3h.getItemMeta();
		im2.setLore(ll2);
		J3h.setItemMeta(im2);
		J3h = ItemModifier.Setname(J3h,ChatColor.BLUE + "Jarrett78 (TheTechPony)");
		J3h = ItemModifier.setOwner(J3h, "TheTechPony");
		J3h = ItemModifier.setDurability(J3h, 3);
		inv.setItem(slot, J3h);
		
		return inv;
	}
	
	public static Inventory Villagers() {
		int lines = 1;
		  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.BOLD + "Slimefun Villagers:");
		int slot = 0;
		
		if (plugin.getConfig().getBoolean("mobs.villagers.merchant")) {
			inv.setItem(slot, SlimefunVillager.VILLAGER_MERCHANT);
			slot++;
		}
		if (plugin.getConfig().getBoolean("mobs.villagers.quest")) {
			inv.setItem(slot, SlimefunVillager.VILLAGER_QUEST);
			slot++;
		}
		if (plugin.getConfig().getBoolean("mobs.villagers.blacksmith")) {
			inv.setItem(slot, SlimefunVillager.VILLAGER_BLACKSMITH);
			slot++;
		}
		  return inv;
	}
	
	public static ItemStack exit() {
		ItemStack exit = new ItemStack(Material.EMERALD);
		exit = ItemModifier.Setname(exit, ChatColor.RED + "" + ChatColor.BOLD + "<-- Back");
		return exit;
	}

}
