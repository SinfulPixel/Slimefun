package me.mrCookieSlime.Slimefun.entities;

import me.mrCookieSlime.Slimefun.Dictionary.VillagerDictionary;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R1.entity.CraftVillager;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SlimefunVillager {
	
	public static void spawnMerchant(Location l) {
		Villager v = (Villager) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
		v.setAdult();
		v.setBreed(false);
		v.setCustomName(ChatColor.GRAY + "Lost " + ChatColor.BLUE + " Merchant");
		v.setCustomNameVisible(true);
		v.setRemoveWhenFarAway(false);
		((CraftVillager) v).getHandle().setProfession(5);
		v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 100));
		v.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, -10));
	}
	
	public static void spawnQuester(Location l) {
		Villager v = (Villager) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
		v.setAdult();
		v.setBreed(false);
		v.setCustomName(ChatColor.GREEN + "Quest " + ChatColor.BLUE + " Villager");
		v.setCustomNameVisible(true);
		v.setRemoveWhenFarAway(false);
		((CraftVillager) v).getHandle().setProfession(5);
		v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 100));
		v.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, -10));
	}
	
	public static void spawnBlacksmith(Location l) {
		Villager v = (Villager) l.getWorld().spawnEntity(l, EntityType.VILLAGER);
		v.setAdult();
		v.setBreed(false);
		v.setCustomName(ChatColor.GRAY + "Lost " + ChatColor.DARK_GRAY + " Blacksmith");
		v.setCustomNameVisible(true);
		v.setRemoveWhenFarAway(false);
		((CraftVillager) v).getHandle().setProfession(5);
		v.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 100));
		v.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, -10));
	}
	
	public static ItemStack VILLAGER_MERCHANT = VillagerDictionary.getEgg("merchant");
	public static ItemStack VILLAGER_QUEST = VillagerDictionary.getEgg("quest");
	public static ItemStack VILLAGER_BLACKSMITH = VillagerDictionary.getEgg("blacksmith");
}
