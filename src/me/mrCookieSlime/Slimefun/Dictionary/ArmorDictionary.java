package me.mrCookieSlime.Slimefun.Dictionary;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ArmorDictionary {
	
	public static ItemStack getItem(String ConfigName) {
		ItemStack item = new ItemStack(Material.AIR, 1);
		
		if (ConfigName.equalsIgnoreCase("SlimeHelmet")) {
			item.setType(Material.LEATHER_HELMET);
			  LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			  meta.setColor(Color.LIME);
			  item.setItemMeta(meta);
			  item = Setname(item, ChatColor.GREEN + "Slime helmet");
			  item = setLore(item, ChatColor.GREEN + "Feeling like a slime!");
			  item.addUnsafeEnchantment(Enchantment.OXYGEN, 3);
			  item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			  item.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
		}
		if (ConfigName.equalsIgnoreCase("SlimeChestplate")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.LIME);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.GREEN + "Slime chestplate");
			item = setLore(item, ChatColor.GREEN + "Feeling like a slime!");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
		}
		if (ConfigName.equalsIgnoreCase("SlimeLeggings")) {
			item.setType(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.LIME);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.GREEN + "Slime leggings");
			item = setLore(item, ChatColor.GREEN + "Feeling like a slime!");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 3);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
		}
		if (ConfigName.equalsIgnoreCase("SlimeBoots")) {
			item.setType(Material.LEATHER_BOOTS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.LIME);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.GREEN + "Slime boots");
			item = setLore(item, ChatColor.GREEN + "Feeling like a slime!");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 3);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
		}
		
		if (ConfigName.equalsIgnoreCase("NanoHelmet")) {
			item.setType(Material.LEATHER_HELMET);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.BLACK);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.DARK_GRAY + "NanoSuit helmet");
			item.addUnsafeEnchantment(Enchantment.OXYGEN, 10);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}
		
		if (ConfigName.equalsIgnoreCase("NanoChestplate")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.BLACK);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.DARK_GRAY + "NanoSuit chestplate");
			item.addUnsafeEnchantment(Enchantment.THORNS, 10);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}

		if (ConfigName.equalsIgnoreCase("NanoLeggings")) {
			item.setType(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.BLACK);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.DARK_GRAY + "NanoSuit leggings");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 10);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}

		if (ConfigName.equalsIgnoreCase("NanoBoots")) {
			item.setType(Material.LEATHER_BOOTS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.BLACK);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.DARK_GRAY + "NanoSuit boots");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 10);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}
		if (ConfigName.equalsIgnoreCase("QuantumHelmet")) {
			item.setType(Material.LEATHER_HELMET);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.WHITE);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.WHITE + "Quantumarmor helmet");
			item.addUnsafeEnchantment(Enchantment.OXYGEN, 100);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 100);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}
		if (ConfigName.equalsIgnoreCase("QuantumChestplate")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.WHITE);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.WHITE + "Quantumarmor chestplate");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 100);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}
		if (ConfigName.equalsIgnoreCase("QuantumLeggings")) {
			item.setType(Material.LEATHER_LEGGINGS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.WHITE);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.WHITE + "Quantumarmor leggings");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 100);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 100);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}
		if (ConfigName.equalsIgnoreCase("QuantumBoots")) {
			item.setType(Material.LEATHER_BOOTS);
			LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			meta.setColor(Color.WHITE);
			item.setItemMeta(meta);
			item = Setname(item, ChatColor.WHITE + "Quantumarmor boots");
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 100);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 100);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 100);
		}
		if (ConfigName.equalsIgnoreCase("GlowstoneHelmet")) {
			item.setType(Material.LEATHER_HELMET);
			  LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			  meta.setColor(Color.fromRGB(255, 228, 175));
			  item.setItemMeta(meta);
			  item = Setname(item, ChatColor.YELLOW + "Glowstone helmet");
			  item = setLore(item, ChatColor.GREEN + "Glowing like the sun!");
			  item.addUnsafeEnchantment(Enchantment.OXYGEN, 1);
			  item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
			  item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
		}
		if (ConfigName.equalsIgnoreCase("GlowstoneChestplate")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			  LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			  meta.setColor(Color.fromRGB(255, 228, 175));
			  item.setItemMeta(meta);
			  item = Setname(item, ChatColor.YELLOW + "Glowstone chestplate");
			  item = setLore(item, ChatColor.GREEN + "Glowing like the sun!");
			  item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			  item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
		}
		if (ConfigName.equalsIgnoreCase("GlowstoneLeggings")) {
			item.setType(Material.LEATHER_LEGGINGS);
			  LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			  meta.setColor(Color.fromRGB(255, 228, 175));
			  item.setItemMeta(meta);
			  item = Setname(item, ChatColor.YELLOW + "Glowstone leggings");
			  item = setLore(item, ChatColor.GREEN + "Glowing like the sun!");
			  item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 3);
			  item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			  item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
		}
		if (ConfigName.equalsIgnoreCase("GlowstoneBoots")) {
			item.setType(Material.LEATHER_BOOTS);
			  LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
			  meta.setColor(Color.fromRGB(255, 228, 175));
			  item.setItemMeta(meta);
			  item = Setname(item, ChatColor.YELLOW + "Glowstone boots");
			  item = setLore(item, ChatColor.GREEN + "Glowing like the sun!");
			  item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 3);
			  item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
			  item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
		}
		if (ConfigName.equalsIgnoreCase("EnderHelmet")) {
			item.setType(Material.LEATHER_HELMET);
			  ItemMeta im5 = item.getItemMeta();
			  ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
		      item.setItemMeta(im5);
		      item = Setname(item, ChatColor.DARK_PURPLE + "Ender helmet");
		      item = setLore(item, ChatColor.GRAY + "Teleportation III");
		      item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 7);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		}
		if (ConfigName.equalsIgnoreCase("EnderChestplate")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			  ItemMeta im5 = item.getItemMeta();
			  ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
		      item.setItemMeta(im5);
		      item = Setname(item, ChatColor.DARK_PURPLE + "Ender chestplate");
		      item = setLore(item, ChatColor.GRAY + "Teleportation IV");
		      item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 7);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		}
		if (ConfigName.equalsIgnoreCase("EnderLeggings")) {
			item.setType(Material.LEATHER_LEGGINGS);
			  ItemMeta im5 = item.getItemMeta();
			  ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
		      item.setItemMeta(im5);
		      item = Setname(item, ChatColor.DARK_PURPLE + "Ender leggings");
		      item = setLore(item, ChatColor.GRAY + "Teleportation III");
		      item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 7);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		}
		if (ConfigName.equalsIgnoreCase("EnderBoots")) {
			item.setType(Material.LEATHER_BOOTS);
			  ItemMeta im5 = item.getItemMeta();
			  ((LeatherArmorMeta) im5).setColor(Color.fromRGB(85,20,120));
		      item.setItemMeta(im5);
		      item = Setname(item, ChatColor.DARK_PURPLE + "Ender boots");
		      item = setLore(item, ChatColor.GRAY + "Teleportation IV");
		      item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 7);
		      item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
		}
		if (ConfigName.equalsIgnoreCase("UberHelmet")) {
			item.setType(Material.LEATHER_HELMET);
			ItemMeta im = item.getItemMeta();
			List<String> ll = new ArrayList<String>();
			ll.add(ChatColor.GREEN + "Installed Upgrades:");
			im.setLore(ll);
			((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
			item.setItemMeta(im);
			item = Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Helmet");
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 500);
			item.addUnsafeEnchantment(Enchantment.OXYGEN, 500);
		}
		if (ConfigName.equalsIgnoreCase("UberChestplate")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			ItemMeta im = item.getItemMeta();
			List<String> ll = new ArrayList<String>();
			ll.add(ChatColor.GREEN + "Installed Upgrades:");
			im.setLore(ll);
			((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
			item.setItemMeta(im);
			item = Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Chestplate");
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 500);
		}
		if (ConfigName.equalsIgnoreCase("UberLeggings")) {
			item.setType(Material.LEATHER_LEGGINGS);
			ItemMeta im = item.getItemMeta();
			List<String> ll = new ArrayList<String>();
			ll.add(ChatColor.GREEN + "Installed Upgrades:");
			im.setLore(ll);
			((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
			item.setItemMeta(im);
			item = Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Leggings");
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 500);
		}
		if (ConfigName.equalsIgnoreCase("UberBoots")) {
			item.setType(Material.LEATHER_BOOTS);
			ItemMeta im = item.getItemMeta();
			List<String> ll = new ArrayList<String>();
			ll.add(ChatColor.GREEN + "Installed Upgrades:");
			im.setLore(ll);
			((LeatherArmorMeta)im).setColor(Color.fromRGB(40, 80, 100));
			item.setItemMeta(im);
			item = Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber" + ChatColor.GOLD + "" + ChatColor.BOLD + "Boots");
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 500);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 500);
		}
		return item;
	}
	
	public static ItemStack Setname(ItemStack iss, String Name) {
   	    ItemStack tree = iss;
   	    ItemMeta orange = tree.getItemMeta();
   	    orange.setDisplayName(Name);
   	    tree.setItemMeta(orange);
   	    return tree;
   	  }
		public static ItemStack setLore(ItemStack item, String lore){
         ItemMeta im = item.getItemMeta();
         List<String> ll = new ArrayList<String>();
         ll.add(lore);
         im.setLore(ll);
         item.setItemMeta(im);
         return item;
       }
}
