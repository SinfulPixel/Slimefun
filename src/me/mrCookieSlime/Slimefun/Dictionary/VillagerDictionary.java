package me.mrCookieSlime.Slimefun.Dictionary;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VillagerDictionary {
	
	public static ItemStack getEgg(String ConfigName) {
		ItemStack item = new ItemStack(Material.AIR, 1);
		
		if (ConfigName.equalsIgnoreCase("Merchant")) {
			item.setType(Material.MONSTER_EGG);
			item = Setname(item, ChatColor.RESET + "Spawn \"" + ChatColor.GRAY + "Lost " + ChatColor.BLUE + "Merchant" + ChatColor.RESET + "\"");
			item = setDurability(item, 120);
		}
		if (ConfigName.equalsIgnoreCase("quest")) {
			item.setType(Material.MONSTER_EGG);
			item = Setname(item, ChatColor.RESET + "Spawn \"" + ChatColor.GREEN + "Quest " + ChatColor.BLUE + "Villager" + ChatColor.RESET + "\"");
			item = setDurability(item, 120);
		}
		if (ConfigName.equalsIgnoreCase("blacksmith")) {
			item.setType(Material.MONSTER_EGG);
			item = Setname(item, ChatColor.RESET + "Spawn \"" + ChatColor.GRAY + "Lost " + ChatColor.DARK_GRAY + "Blacksmith" + ChatColor.RESET + "\"");
			item = setDurability(item, 120);
		}
		return item;
	}
	
	public static ItemStack Setname(ItemStack item, String Name) {
   	    ItemMeta im = item.getItemMeta();
   	    im.setDisplayName(Name);
   	    item.setItemMeta(im);
   	    return item;
   	  }
		public static ItemStack setLore(ItemStack item, String lore){
         ItemMeta im = item.getItemMeta();
         List<String> ll = new ArrayList<String>();
         ll.add(lore);
         im.setLore(ll);
         item.setItemMeta(im);
         return item;
       }
		public static ItemStack setDurability(ItemStack item, int i) {
			item.setDurability((short) i);
			return item;
		}

}
