package me.mrCookieSlime.Slimefun.AddonHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.inventory.ItemStack;

public class Slimefun {
	
	private static startup plugin;
	
	public Slimefun(startup instance) {
		plugin = instance;
	}
	
	public static List<ItemStack> categories = new ArrayList<ItemStack>();
	
	public static List<ItemStack> UberUpgrades = new ArrayList<ItemStack>();
	
	public static List<ItemStack> items = new ArrayList<ItemStack>();
	
	public static Map<ItemStack, List<ItemStack>> index = new HashMap<ItemStack, List<ItemStack>>();
	
	public static Map<ItemStack, List<ItemStack>> recipes = new HashMap<ItemStack, List<ItemStack>>();
	
	public static Map<ItemStack, ItemStack> recipetypes = new HashMap<ItemStack, ItemStack>();
	
	public static Map<ItemStack, ItemStack> outputs = new HashMap<ItemStack, ItemStack>();
	
	public static Map<ItemStack, String> UberPrices = new HashMap<ItemStack, String>();
	
	public static Map<String, ItemStack> NameIndex = new HashMap<String, ItemStack>();
	public static List<String> NameList = new ArrayList<String>();
	
	public static List<ItemStack> fuelContainers = new ArrayList<ItemStack>();
	
	public static void registerResearch(ItemStack item, String research) {
		PlayerResearch.map.put(item, research);
		if (!PlayerResearch.ll.contains(research)) {
			PlayerResearch.ll.add(research);
		}
	}
	
	public static void addResearch(String research) {
		if (!PlayerResearch.ll.contains(research)) {
			PlayerResearch.ll.add(research);
		}
	}
	
	public static List<String> getResearchNames() {
		return PlayerResearch.ll;
	}
	
	public static Map<ItemStack, String> getResearches() {
		return PlayerResearch.map;
	}
	
	public static ItemStack getOutput(ItemStack item) {
		return outputs.get(item);
	}
	
	public static ItemStack getRecipeType(ItemStack item) {
		return recipetypes.get(item);
	}
	
	public static List<ItemStack> getRecipe(ItemStack item) {
		return recipes.get(item);
	}
	
	public static List<ItemStack> getCategories() {
		return categories;
	}
	
	public static List<ItemStack> getSubMenu(ItemStack menu) {
		return index.get(menu);
	}
	
	public static boolean isEnabled(String world) {
		boolean b = true;
		
		if (plugin.getConfig().getBoolean("world-blacklist.enabled")) {
			if (plugin.getConfig().getStringList("world-blacklist.list").contains(world)) {
				b = false;
			}
		}
		
		return b;
	}
	
	public static void registerItem(ItemStack item, ItemStack category, List<ItemStack> recipe, ItemStack RecipeType, ItemStack output) {
		
		if (!categories.contains(category)) {
			categories.add(category);
		}
		
		if (!items.contains(item)) {
			items.add(item);
		}
		
		if (!index.containsKey(category)) {
			List<ItemStack> items = new ArrayList<ItemStack>();
			items.add(item);
			index.put(category, items);
		}
		else {
			List<ItemStack> items = index.get(category);
			items.add(item);
			index.put(category, items);
		}
		
		recipes.put(item, recipe);
		recipetypes.put(item, RecipeType);
		outputs.put(item, output);
	}
	
	public static List<ItemStack> getItems() {
		return items;
	}
	
	public static void registerUberUpgrade(ItemStack upgrade, String price) {
		UberUpgrades.add(upgrade);
		UberPrices.put(upgrade, price);
		registerResearch(upgrade, "Uber Upgrade Cores");
	}
	
	public static List<ItemStack> getUberUpgrades() {
		return UberUpgrades;
	}
	
	public static String getUpgradePrice(ItemStack upgrade) {
		if (UberPrices.containsKey(upgrade)) {
			return UberPrices.get(upgrade);
		}
		else {
			return "ERROR";
		}
	}
	
	public static void registerDigitalName(ItemStack item, String digitalName) {
		if (!NameList.contains(digitalName)) {
			NameList.add(digitalName);
		}
		if (!NameIndex.containsKey(digitalName)) {
			NameIndex.put(digitalName, item);
		}
	}
	
	public static ItemStack getByName(String digitalName) {
		if (NameIndex.containsKey(digitalName)) {
			return NameIndex.get(digitalName);
		}
		else {
			return null;
		}
	}
	
	public static List<String> getNames() {
		return NameList;
	}
}
