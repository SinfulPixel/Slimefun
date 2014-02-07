package me.mrCookieSlime.Slimefun.Items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class RecipeType {
		
		public static ItemStack SHAPED_RECIPE = getRecipeType("shaped");
		public static ItemStack SHAPELESS_RECIPE = getRecipeType("shapeless");
		public static ItemStack DROP_BY_IRON_GOLEM = getRecipeType("drop");
		public static ItemStack BOOK_BINDER_RECIPE = getRecipeType("bookbinder");
		public static ItemStack TOOL_BENCH_RECIPE = getRecipeType("toolbench");
		public static ItemStack SMELTING = getRecipeType("furnace");
		public static ItemStack SMELTERY = getRecipeType("smeltery");
		public static ItemStack MULTIBLOCK = getRecipeType("multiblock");
		public static ItemStack QUEST = getRecipeType("quest");
		public static ItemStack BLACKSMITH = getRecipeType("blacksmith");
		public static ItemStack ORE_WASHER = getRecipeType("orewasher");
		
		
		public static ItemStack getRecipeType(String type) {
			
			if (type.equalsIgnoreCase("shaped")) {
				ItemStack shaped = new ItemStack(Material.WORKBENCH);
				shaped = Setname(shaped, ChatColor.DARK_PURPLE + "Recipe Type:");
				shaped = setLore(shaped, ChatColor.GREEN + "Shaped Recipe");
				
				return shaped;
			}
			else if (type.equalsIgnoreCase("shapeless")) {
				ItemStack shapeless = new ItemStack(Material.WORKBENCH);
				shapeless = Setname(shapeless, ChatColor.DARK_PURPLE + "Recipe Type:");
				shapeless = setLore(shapeless, ChatColor.GREEN + "Shapeless Recipe");
					
				return shapeless;
			}
			else if (type.equalsIgnoreCase("drop")) {
				ItemStack drop = new ItemStack(Material.MONSTER_EGG);
				drop = Setname(drop, ChatColor.DARK_PURPLE + "Mob drop from:");
				drop = setLore(drop, ChatColor.GREEN + "Iron Golem");
						
				return drop;
			}
			else if (type.equalsIgnoreCase("bookbinder")) {
				ItemStack bookbinder = new ItemStack(Material.BOOK_AND_QUILL);
				bookbinder = Setname(bookbinder, ChatColor.DARK_PURPLE + "Recipe Type:");
				bookbinder = setLore(bookbinder, ChatColor.GREEN + "Book Binder Recipe");
							
				return bookbinder;
			}
			else if (type.equalsIgnoreCase("toolbench")) {
				ItemStack toolbench = new ItemStack(Material.ENDER_PORTAL_FRAME);
				toolbench = Setname(toolbench, ChatColor.DARK_PURPLE + "Recipe Type:");
				toolbench = setLore(toolbench, ChatColor.GREEN + "Tool Bench Recipe");
								
				return toolbench;
			}
			else if (type.equalsIgnoreCase("furnace")) {
				ItemStack furnace = new ItemStack(Material.FURNACE);
				furnace = Setname(furnace, ChatColor.DARK_PURPLE + "Recipe Type:");
				furnace = setLore(furnace, ChatColor.GREEN + "Furnace Recipe");
									
				return furnace;
			}
			else if (type.equalsIgnoreCase("smeltery")) {
				ItemStack smeltery = new ItemStack(Material.LAVA);
				smeltery = Setname(smeltery, ChatColor.DARK_PURPLE + "Recipe Type:");
				smeltery = setLore(smeltery, ChatColor.GREEN + "Smeltery Recipe");
										
				return smeltery;
			}
			else if (type.equalsIgnoreCase("multiblock")) {
				ItemStack multiblock = new ItemStack(Material.GRASS);
				multiblock = Setname(multiblock, ChatColor.DARK_PURPLE + "Recipe Type:");
				multiblock = setLore(multiblock, ChatColor.GREEN + "MultiBlock (Build it)");
				
				return multiblock;
			}
			else if (type.equalsIgnoreCase("quest")) {
				ItemStack multiblock = new ItemStack(Material.MONSTER_EGG);
				multiblock = Setname(multiblock, ChatColor.DARK_PURPLE + "Recipe Type:");
				multiblock = setLore(multiblock, ChatColor.GREEN + "Completing Quests");
				multiblock = setDurability(multiblock, 120);
				
				return multiblock;
			}
			else if (type.equalsIgnoreCase("blacksmith")) {
				ItemStack multiblock = new ItemStack(Material.MONSTER_EGG);
				multiblock = Setname(multiblock, ChatColor.DARK_PURPLE + "Recipe Type:");
				multiblock = setLore(multiblock, ChatColor.GREEN + "Trading with Blacksmith");
				multiblock = setDurability(multiblock, 120);
				
				return multiblock;
			}
			else if (type.equalsIgnoreCase("orewasher")) {
				ItemStack multiblock = new ItemStack(Material.FURNACE);
				multiblock = Setname(multiblock, ChatColor.DARK_PURPLE + "Recipe Type:");
				multiblock = setLore(multiblock, ChatColor.GREEN + "Ore Washer");
				
				return multiblock;
			}
			else {
				return null;
			}
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
			
			public static ItemStack setDurability(ItemStack item, int i) {
				item.setDurability((short) i);
				return item;
			}
}
