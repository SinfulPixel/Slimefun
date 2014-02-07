package me.mrCookieSlime.Slimefun.Items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemModifier {
	
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
		public static ItemStack setDurability(ItemStack item, int i) {
			item.setDurability((short) i);
			return item;
		}
		public static ItemStack setOwner(ItemStack item, String owner) {
		    SkullMeta meta = (SkullMeta)item.getItemMeta();
		    meta.setOwner(owner);
		    item.setItemMeta(meta);
		    return item;
		  }
}
