package me.mrCookieSlime.Slimefun.Utilities;

import java.util.List;

import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;

import org.bukkit.inventory.ItemStack;

public class FuelHandler {
	
	public static void registerFuelContainer(ItemStack item) {
		Slimefun.fuelContainers.add(item);
	}
	
	public static List<ItemStack> getContainers() {
		return Slimefun.fuelContainers;
	}

}
