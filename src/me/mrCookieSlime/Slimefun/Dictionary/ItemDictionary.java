package me.mrCookieSlime.Slimefun.Dictionary;

import java.util.ArrayList;
import java.util.List;

import me.mrCookieSlime.Slimefun.Items.ItemModifier;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ItemDictionary {
	
	public static ItemStack getItem(String ConfigName) {
		ItemStack item = new ItemStack(Material.AIR, 1);
		
		if (ConfigName.equalsIgnoreCase("NanoPickaxe")) {
		      item.setType(Material.DIAMOND_PICKAXE);
		      item = ItemModifier.Setname(item, ChatColor.DARK_BLUE + "Nano pickaxe");
		      item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 10);
		      item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		      item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		      item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
		    }
		    if (ConfigName.equalsIgnoreCase("Dustbin")) {
		      item.setType(Material.BUCKET);
		      List<String> ll = new ArrayList<String>();
		      String l0 = "";
		      String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
		      ll.add(l0);
		      ll.add(l1);
		      ItemMeta im = item.getItemMeta();
		      im.setLore(ll);
		      item.setItemMeta(im);
		      item = ItemModifier.Setname(item, ChatColor.DARK_BLUE + "Portable dustbin");
		      item = ItemModifier.setDurability(item, 1);
		    }
		    if (ConfigName.equalsIgnoreCase("Enderbackpack")) {
		      item.setType(Material.LEATHER);
		      List<String> ll = new ArrayList<String>();
		      String l0 = "";
		      String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
		      ll.add(l0);
		      ll.add(l1);
		      ItemMeta im = item.getItemMeta();
		      im.setLore(ll);
		      item.setItemMeta(im);
		      item = ItemModifier.Setname(item, ChatColor.AQUA + "Ender backpack");
		      item = ItemModifier.setDurability(item, 1);
		    }
		    if (ConfigName.equalsIgnoreCase("Grandpaswalkingstick")) {
		      item.setType(Material.STICK);
		      item = ItemModifier.Setname(item, ChatColor.AQUA + "grandpa's walking stick");
		      item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10);
		      item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 10);
		    }
		    if (ConfigName.equalsIgnoreCase("Grandmaswalkingstick")) {
		      item.setType(Material.STICK);
		      item = ItemModifier.Setname(item, ChatColor.AQUA + "grandma's walking stick");
		      item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);
		    }
		    if (ConfigName.equalsIgnoreCase("SuperMeat")) {
		      item.setType(Material.GRILLED_PORK);
		      item = ItemModifier.Setname(item, ChatColor.GOLD + "Super meat");
		      item = ItemModifier.setDurability(item, 1);
		      item = ItemModifier.setLore(item, ChatColor.GREEN + "" + ChatColor.BOLD + ChatColor.ITALIC + "Saturating!");
		    }
		    if (ConfigName.equalsIgnoreCase("NanoHoe")) {
		      item.setType(Material.DIAMOND_HOE);
		      item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		      item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 10);
		      item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
		      List<String> ll = new ArrayList<String>();
		      String l0 = "";
		      String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to grow plants";
		      ll.add(l0);
		      ll.add(l1);
		      ItemMeta im = item.getItemMeta();
		      im.setLore(ll);
		      item.setItemMeta(im);
		      item = ItemModifier.Setname(item, ChatColor.DARK_BLUE + "Nano hoe");
		    }
		    if (ConfigName.equalsIgnoreCase("Nanosaber")) {
		      item.setType(Material.DIAMOND_SWORD);
		      item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
		      item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 10);
		      item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 10);
		      item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 10);
		      List<String> ll = new ArrayList<String>();
		      String l0 = "";
		      String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to shoot arrows";
		      ll.add(l0);
		      ll.add(l1);
		      ItemMeta im = item.getItemMeta();
		      im.setLore(ll);
		      item.setItemMeta(im);
		      item = ItemModifier.Setname(item, ChatColor.DARK_BLUE + "Nano saber");
		    }
		    if (ConfigName.equalsIgnoreCase("ToolBench")) {
		      item.setType(Material.ENDER_PORTAL_FRAME);
		      item = ItemModifier.Setname(item, ChatColor.AQUA + "Tool bench");
		    }
		    if (ConfigName.equalsIgnoreCase("simplecircuitboard")) {
		      item.setType(Material.ACTIVATOR_RAIL);
		      item = ItemModifier.Setname(item, ChatColor.AQUA + "Simple Circuit Board");
		    }
		    if (ConfigName.equalsIgnoreCase("iTome")) {
		      item.setType(Material.BOOK);
		      item = ItemModifier.Setname(item, ChatColor.GOLD + "Invisible Tome");
		      List<String> ll = new ArrayList<String>();
		      String l0 = "";
		      String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to vanish";
		      String l2 = ChatColor.BLUE + "left click " + ChatColor.GREEN + "to become visible";
		      ll.add(l0);
		      ll.add(l1);
		      ll.add(l2);
		      ItemMeta im = item.getItemMeta();
		      im.setLore(ll);
		      item.setItemMeta(im);
		      item = ItemModifier.setDurability(item, 5);
		    }
		    if (ConfigName.equalsIgnoreCase("BookoTeleporting")) {
		      item.setType(Material.BOOK);
		      item = ItemModifier.Setname(item, ChatColor.GOLD + "Book o' Teleporting");
		      List<String> ll = new ArrayList<String>();
		      String l0 = "";
		      String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
		      ll.add(l0);
		      ll.add(l1);
		      ItemMeta im = item.getItemMeta();
		      im.setLore(ll);
		      item.setItemMeta(im);
		      item = ItemModifier.setDurability(item, 3);
		    }
		    if (ConfigName.equalsIgnoreCase("pEnchanter")) {
		      item.setType(Material.BOOK);
		      List<String> ll = new ArrayList<String>();
		      String l0 = "";
		      String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
		      ll.add(l0);
		      ll.add(l1);
		      ItemMeta im = item.getItemMeta();
		      im.setLore(ll);
		      item.setItemMeta(im);
		      item = ItemModifier.Setname(item, ChatColor.GOLD + "Portable Enchanter");
		      item = ItemModifier.setDurability(item, 2);
		    }
		if (ConfigName.equalsIgnoreCase("pCrafter")) {
			item.setType(Material.BOOK);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
			ll.add(l0);
			ll.add(l1);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Portable Crafter");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("tomeofhomeland")) {
			item.setType(Material.BOOK);
			  item = ItemModifier.Setname(item, ChatColor.GOLD + "Tome of homeland");
			  List<String> ll = new ArrayList<String>();
			  String l0 = "";
			  String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to teleport to your bed";
			  ll.add(l0);
			  ll.add(l1);
			  ItemMeta im = item.getItemMeta();
			  im.setLore(ll);
			  item.setItemMeta(im);
			  item = ItemModifier.setDurability(item, 8);
		}
		if (ConfigName.equalsIgnoreCase("pToolbench")) {
			item.setType(Material.BOOK);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
			ll.add(l0);
			ll.add(l1);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "Portable Tool bench");
			item = ItemModifier.setDurability(item, 6);
		}
		if (ConfigName.equalsIgnoreCase("pBookBinder")) {
			item.setType(Material.BOOK);
			  List<String> ll = new ArrayList<String>();
			  String l0 = "";
			  String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
			  String l2 = ChatColor.YELLOW + "Bind your favourite Items to a book!";
			  ll.add(l0);
			  ll.add(l1);
			  ll.add(l2);
			  ItemMeta im = item.getItemMeta();
			  im.setLore(ll);
			  item.setItemMeta(im);
			  item = ItemModifier.Setname(item, ChatColor.AQUA + "Portable Book Binder");
			  item = ItemModifier.setDurability(item, 7);
		}
		if (ConfigName.equalsIgnoreCase("steelingot")) {
			item.setType(Material.IRON_INGOT);
			item = ItemModifier.Setname(item, ChatColor.GRAY + "Steel Ingot");
			item = ItemModifier.setLore(item, "Harder than every metal you have seen before");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("advancedcircuitboard")) {
			item.setType(Material.POWERED_RAIL);
			item = ItemModifier.Setname(item, ChatColor.AQUA + "Advanced Circuit Board");
		}
		if (ConfigName.equalsIgnoreCase("steelthruster")) {
			item.setType(Material.BUCKET);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Steel thruster");
			item = ItemModifier.setDurability(item, 2);
		}
		if (ConfigName.equalsIgnoreCase("jetpack")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			  ItemMeta im = item.getItemMeta();
			  ((LeatherArmorMeta) im).setColor(Color.GRAY);
			  List<String> ll = new ArrayList<String>();
				String l0 = "";
				String l1 = ChatColor.BLUE + "Sneak " + ChatColor.GREEN + "to use";
				ll.add(l0);
				ll.add(l1);
				im.setLore(ll);
			  item.setItemMeta(im);
				item = ItemModifier.Setname(item, ChatColor.GOLD + "Jetpack");
				item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 20);
				item.addUnsafeEnchantment(Enchantment.DURABILITY, 20);
		}
		if (ConfigName.equalsIgnoreCase("pJukebox")) {
			item.setType(Material.BOOK);
			  item = ItemModifier.Setname(item, ChatColor.GOLD + "Portable Jukebox");
			  List<String> ll = new ArrayList<String>();
			  String l0 = "";
			  String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
			  ll.add(l0);
			  ll.add(l1);
			  ItemMeta im = item.getItemMeta();
			  im.setLore(ll);
			  item.setItemMeta(im);
			  item = ItemModifier.setDurability(item, 10);
		}
		if (ConfigName.equalsIgnoreCase("nanoaxel")) {
			item.setType(Material.DIAMOND_AXE);
			item.addUnsafeEnchantment(Enchantment.DIG_SPEED,10);
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
			item.addUnsafeEnchantment(Enchantment.SILK_TOUCH,1);
			List<String> ll = new ArrayList<String>();
			String ench = ChatColor.GRAY + "Changing III";
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to change the Tool Type";
			ll.add(ench);
			ll.add(l0);
			ll.add(l1);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_BLUE + "Nano axel");
		}
		if (ConfigName.equalsIgnoreCase("magic-eye-of-ender")) {
			item.setType(Material.EYE_OF_ENDER);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to throw an enderpearl";
			String l2 = ChatColor.RED + "" + ChatColor.UNDERLINE + "You need the Ender armor to use it!!!";
			ll.add(l0);
			ll.add(l1);
			ll.add(l2);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "" + ChatColor.BOLD + "The Magic Eye of Ender");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("parachute")) {
			item.setType(Material.LEATHER_CHESTPLATE);
			ItemMeta im = item.getItemMeta();
			((LeatherArmorMeta) im).setColor(Color.WHITE);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "Sneak " + ChatColor.GREEN + "to use";
			ll.add(l0);
			ll.add(l1);
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.WHITE + "" + ChatColor.BOLD + "Parachute");
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
			item.addUnsafeEnchantment(Enchantment.PROTECTION_FALL, 20);
		}
		if (ConfigName.equalsIgnoreCase("ubermeat")) {
			item.setType(Material.COOKED_BEEF);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Ubermeat");
			item = ItemModifier.setDurability(item, 1);
			item = ItemModifier.setLore(item, ChatColor.GREEN + "" + ChatColor.ITALIC + "It can't get better!");
		}
		if (ConfigName.equalsIgnoreCase("PartiallyGoldenApple")) {
			item.setType(Material.GOLDEN_APPLE);
			item = ItemModifier.setLore(item, ChatColor.GREEN + "" + ChatColor.ITALIC + "Are you sure it's made out of gold?");
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Partially Golden Apple");
			item = ItemModifier.setDurability(item, 2);
		}
		if (ConfigName.equalsIgnoreCase("MagicSugar")) {
			item.setType(Material.SUGAR);
			item = ItemModifier.setDurability(item, 1);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Magic Sugar");
		}
		if (ConfigName.equalsIgnoreCase("magicallump1")) {
			item.setType(Material.GOLD_NUGGET);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Magical Lump");
			item = ItemModifier.setDurability(item, 1);
			item = ItemModifier.setLore(item, ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Tier: I");
		}
		if (ConfigName.equalsIgnoreCase("magicallump2")) {
			item.setType(Material.GOLD_NUGGET);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Magical Lump");
			item = ItemModifier.setDurability(item, 2);
			item = ItemModifier.setLore(item, ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Tier: II");
		}
		if (ConfigName.equalsIgnoreCase("magicallump3")) {
			item.setType(Material.GOLD_NUGGET);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Magical Lump");
			item = ItemModifier.setDurability(item, 3);
			item = ItemModifier.setLore(item, ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Tier: III");
		}
		if (ConfigName.equalsIgnoreCase("enderlump1")) {
			item.setType(Material.GOLD_NUGGET);
			item = ItemModifier.Setname(item, ChatColor.DARK_PURPLE + "Ender Lump");
			item = ItemModifier.setDurability(item, 4);
			item = ItemModifier.setLore(item, ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Tier: I");
		}
		if (ConfigName.equalsIgnoreCase("enderlump2")) {
			item.setType(Material.GOLD_NUGGET);
			item = ItemModifier.Setname(item, ChatColor.DARK_PURPLE + "Ender Lump");
			item = ItemModifier.setDurability(item, 5);
			item = ItemModifier.setLore(item, ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Tier: II");
		}
		if (ConfigName.equalsIgnoreCase("enderlump3")) {
			item.setType(Material.GOLD_NUGGET);
			item = ItemModifier.Setname(item, ChatColor.DARK_PURPLE + "Ender Lump");
			item = ItemModifier.setDurability(item, 6);
			item = ItemModifier.setLore(item, ChatColor.RED + "" + ChatColor.BOLD + "" + ChatColor.ITALIC + "Tier: III");
		}
		if (ConfigName.equalsIgnoreCase("CrystalOfRepairing")) {
			item.setType(Material.NETHER_STAR);
			item = ItemModifier.Setname(item, ChatColor.AQUA + "Crystal of Repairing");
			item = ItemModifier.setDurability(item, 1);
			List<String> ll = new ArrayList<String>();
			ll.add(ChatColor.DARK_AQUA + "Slowly but surely repairs your");
			ll.add(ChatColor.DARK_AQUA + "Armor and Item in your Hand");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("EnderCrystalOfRepairing")) {
			item.setType(Material.NETHER_STAR);
			item = ItemModifier.Setname(item, ChatColor.DARK_PURPLE + "Ender Crystal of Repairing");
			item = ItemModifier.setDurability(item, 2);
			List<String> ll = new ArrayList<String>();
			ll.add(ChatColor.DARK_AQUA + "Slowly but surely repairs your");
			ll.add(ChatColor.DARK_AQUA + "Armor and Item in your Hand");
			ll.add("");
			ll.add(ChatColor.DARK_AQUA + "Also works, if you have it");
			ll.add(ChatColor.DARK_AQUA + "in your Enderchest");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("guide")) {
			item.setType(Material.ENCHANTED_BOOK);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to open";
			String l3 = ChatColor.BLUE + "Click " + ChatColor.GREEN + "on an Item to learn more...";
			ll.add(l0);
			ll.add(l1);
			ll.add(l3);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.GREEN + "Slimefun Guide");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("Sword-of-Beheading")) {
			item.setType(Material.DIAMOND_SWORD);
			List<String> ll = new ArrayList<String>();
			ll.add(ChatColor.GRAY + "Beheading V");
			ll.add(ChatColor.AQUA + "Has a big chance to drop");
			ll.add(ChatColor.AQUA + "heads/skulls, even for");
			ll.add(ChatColor.AQUA + "Wither skeletons");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_AQUA + "Sword of Beheading");
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 8);
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
			item.addUnsafeEnchantment(Enchantment.KNOCKBACK, 1);
			item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS, 3);
		}
		if (ConfigName.equalsIgnoreCase("Emerald-of-Repairing")) {
			item.setType(Material.EMERALD);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to repair 1 item of your choice";
			String l2 = ChatColor.RED + "Single-Use";
			ll.add(l0);
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.GREEN + "Emerald of Repairing");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("MultiTool")) {
			item.setType(Material.SHEARS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GRAY + "Changing VI";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to use";
			String l3 = ChatColor.BLUE + "Sneak + right click " + ChatColor.GREEN + "to change mode";
			String l4 = ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "None";
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ll.add(l3);
			ll.add(l0);
			ll.add(l4);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Multi Tool");
		}
		if (ConfigName.equalsIgnoreCase("MultiTool1")) {
			item.setType(Material.SHEARS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GRAY + "Changing VI";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to use";
			String l3 = ChatColor.BLUE + "Sneak + right click " + ChatColor.GREEN + "to change mode";
			String l4 = ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "Magic Eye of Ender";
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ll.add(l3);
			ll.add(l0);
			ll.add(l4);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Multi Tool");
		}
		if (ConfigName.equalsIgnoreCase("MultiTool2")) {
			item.setType(Material.SHEARS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GRAY + "Changing VI";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to use";
			String l3 = ChatColor.BLUE + "Sneak + right click " + ChatColor.GREEN + "to change mode";
			String l4 = ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "Portable Crafter";
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ll.add(l3);
			ll.add(l0);
			ll.add(l4);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Multi Tool");
		}
		if (ConfigName.equalsIgnoreCase("MultiTool3")) {
			item.setType(Material.SHEARS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GRAY + "Changing VI";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to use";
			String l3 = ChatColor.BLUE + "Sneak + right click " + ChatColor.GREEN + "to change mode";
			String l4 = ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "Arrow Cannon";
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ll.add(l3);
			ll.add(l0);
			ll.add(l4);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Multi Tool");
		}
		if (ConfigName.equalsIgnoreCase("MultiTool4")) {
			item.setType(Material.SHEARS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GRAY + "Changing VI";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to use";
			String l3 = ChatColor.BLUE + "Sneak + right click " + ChatColor.GREEN + "to change mode";
			String l4 = ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "Ender backpack";
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ll.add(l3);
			ll.add(l0);
			ll.add(l4);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Multi Tool");
		}
		if (ConfigName.equalsIgnoreCase("MultiTool5")) {
			item.setType(Material.SHEARS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GRAY + "Changing VI";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to use";
			String l3 = ChatColor.BLUE + "Sneak + right click " + ChatColor.GREEN + "to change mode";
			String l4 = ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "Wrench";
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ll.add(l3);
			ll.add(l0);
			ll.add(l4);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Multi Tool");
		}
		if (ConfigName.equalsIgnoreCase("MultiTool6")) {
			item.setType(Material.SHEARS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GRAY + "Changing VI";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to use";
			String l3 = ChatColor.BLUE + "Sneak + right click " + ChatColor.GREEN + "to change mode";
			String l4 = ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "Grappling hook";
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ll.add(l3);
			ll.add(l0);
			ll.add(l4);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Multi Tool");
		}
		if (ConfigName.equalsIgnoreCase("SteelPlate")) {
			item.setType(Material.PAPER);
			item = ItemModifier.Setname(item, ChatColor.DARK_GRAY + "Steel Plate");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("smeltery")) {
			item.setType(Material.FURNACE);
			item = ItemModifier.Setname(item, ChatColor.GRAY + "Smeltery");
		}
		if (ConfigName.equalsIgnoreCase("bookbinder")) {
			item.setType(Material.BOOKSHELF);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Book Binder");
		}
		if (ConfigName.equalsIgnoreCase("chain")) {
			item.setType(Material.STRING);
			item = ItemModifier.Setname(item, ChatColor.GRAY + "Chain");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("fortune-cookie")) {
			item.setType(Material.COOKIE);
			item = ItemModifier.setDurability(item, 1);
			item = ItemModifier.Setname(item, ChatColor.RESET + "Fortune Cookie");
		}
		if (ConfigName.equalsIgnoreCase("grappling-hook")) {
			item.setType(Material.LEASH);
			item = ItemModifier.setDurability(item, 1);
			item = ItemModifier.Setname(item, ChatColor.RESET + "Grappling hook");
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l2 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to throw";
			ll.add(l0);
			ll.add(l2);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			
		}
		if (ConfigName.equalsIgnoreCase("hook")) {
			item.setType(Material.FLINT);
			item = ItemModifier.Setname(item, ChatColor.GRAY + "Hook");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("Diamond-of-Duplicating")) {
			item.setType(Material.DIAMOND);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to duplicate 1 tool/armor piece of your choice";
			String l2 = ChatColor.RED + "Single-Use";
			ll.add(l0);
			ll.add(l1);
			ll.add(l0);
			ll.add(l2);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.AQUA + "Diamond of Duplicating");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("SlimeGem")) {
			item.setType(Material.EMERALD);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.GOLD + "" + ChatColor.BOLD + "Currency";
			ll.add(l0);
			ll.add(l1);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.GREEN + "Slime Gem");
			item = ItemModifier.setDurability(item, 2);
		}
		if (ConfigName.equalsIgnoreCase("InkOfKnowledge")) {
			item.setType(Material.INK_SACK);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Ink of Knowledge");
		}
		if (ConfigName.equalsIgnoreCase("MinersCompass")) {
			item.setType(Material.COMPASS);
			List<String> ll = new ArrayList<String>();
			String l0 = "";
			String l1 = ChatColor.BLUE + "right click " + ChatColor.GREEN + "to teleport to the last Location";
			String l2 = ChatColor.GREEN + "where you saw the sunlight";
			ll.add(l0);
			ll.add(l1);
			ll.add(l2);
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Miner's Compass");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("NanoFocus")) {
			item.setType(Material.WATCH);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Nano Focus");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("QuantumFocus")) {
			item.setType(Material.WATCH);
			item = ItemModifier.Setname(item, ChatColor.WHITE + "Quantum Focus");
			item = ItemModifier.setDurability(item, 2);
		}
		if (ConfigName.equalsIgnoreCase("UberFocus")) {
			item.setType(Material.WATCH);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Focus");
			item = ItemModifier.setDurability(item, 3);
		}
		if (ConfigName.equalsIgnoreCase("OreWasher")) {
			item.setType(Material.FURNACE);
			item = ItemModifier.Setname(item, ChatColor.AQUA + "Ore Washer");
		}
		if (ConfigName.equalsIgnoreCase("IronChunk")) {
			item.setType(Material.FLINT);
			item = ItemModifier.Setname(item, ChatColor.GRAY + "Iron Chunk");
			item = ItemModifier.setDurability(item, 1);
		}
		if (ConfigName.equalsIgnoreCase("GoldChunk")) {
			item.setType(Material.FLINT);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "Gold Chunk");
			item = ItemModifier.setDurability(item, 2);
		}
		if (ConfigName.equalsIgnoreCase("GoldenFeather")) {
			item.setType(Material.FEATHER);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "" + ChatColor.BOLD + "Golden Feather");
			item = ItemModifier.setDurability(item, 1);
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.GREEN + "Saves you from Fall Damage");
			ll.add("");
			ll.add(ChatColor.DARK_RED + "But it costs some Hunger");
			ll.add(ChatColor.DARK_RED + "If you have not enough Hunger");
			ll.add(ChatColor.DARK_RED + "this won't save you anymore");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("PortableHole")) {
			item.setType(Material.ENDER_PEARL);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Portable Hole");
			item = ItemModifier.setDurability(item, 1);
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.DARK_PURPLE + "Creates a temporary black");
			ll.add(ChatColor.DARK_PURPLE + "Hole at your Position");
			ll.add(ChatColor.DARK_PURPLE + "which leads to the Place");
			ll.add(ChatColor.DARK_PURPLE + "where you died the last time");
			ll.add("");
			ll.add(ChatColor.RED + "Single-Use only");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("UberAxe")) {
			item.setType(Material.DIAMOND_AXE);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Axe");
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.GOLD + "Can chop whole Trees...");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
			item.addUnsafeEnchantment(Enchantment.DURABILITY, 20);
			item.addUnsafeEnchantment(Enchantment.DIG_SPEED, 2);
			item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 4);
		}
		if (ConfigName.equalsIgnoreCase("AmuletOfRevival")) {
			item.setType(Material.EMERALD);
			item = ItemModifier.Setname(item, ChatColor.GOLD + "" + ChatColor.BOLD + "Amulet of Revival");
			item = ItemModifier.setDurability(item, 3);
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.GREEN + "This mighty Amulet has");
			ll.add(ChatColor.GREEN + "made a deal with the devil");
			ll.add(ChatColor.GREEN + "thousands of years ago that");
			ll.add(ChatColor.GREEN + "it can save the Everyone who");
			ll.add(ChatColor.GREEN + "has it in his Inventory from");
			ll.add(ChatColor.GREEN + "Death one time. But if someone");
			ll.add(ChatColor.GREEN + "tries to trick it and have");
			ll.add(ChatColor.GREEN + "multiple Amulets he will feel");
			ll.add(ChatColor.GREEN + "way more damage when given.");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("UberPickaxe")) {
			item.setType(Material.DIAMOND_PICKAXE);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Pickaxe");
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.BLUE + "Right Click " + ChatColor.GREEN + "to change the Mining Mode");
			ll.add("");
			ll.add(ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "1x1");
			ll.add("");
			ll.add(ChatColor.RED + "Fortune has no Effect on this mighty Tool");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("UberPickaxe2")) {
			item.setType(Material.DIAMOND_PICKAXE);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Pickaxe");
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.BLUE + "Right Click " + ChatColor.GREEN + "to change the Mining Mode");
			ll.add("");
			ll.add(ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "3x3");
			ll.add("");
			ll.add(ChatColor.RED + "Fortune has no Effect on this mighty Tool");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("UberPickaxe3")) {
			item.setType(Material.DIAMOND_PICKAXE);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Pickaxe");
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.BLUE + "Right Click " + ChatColor.GREEN + "to change the Mining Mode");
			ll.add("");
			ll.add(ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "5x5");
			ll.add("");
			ll.add(ChatColor.RED + "Fortune has no Effect on this mighty Tool");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		if (ConfigName.equalsIgnoreCase("UberPickaxe4")) {
			item.setType(Material.DIAMOND_PICKAXE);
			item = ItemModifier.Setname(item, ChatColor.BLUE + "" + ChatColor.BOLD + "Uber Pickaxe");
			List<String> ll = new ArrayList<String>();
			ll.add("");
			ll.add(ChatColor.BLUE + "Right Click " + ChatColor.GREEN + "to change the Mining Mode");
			ll.add("");
			ll.add(ChatColor.GRAY + "Current Mode: " +  ChatColor.DARK_GRAY + "" + ChatColor.ITALIC + "1x3");
			ll.add("");
			ll.add(ChatColor.RED + "Fortune has no Effect on this mighty Tool");
			ItemMeta im = item.getItemMeta();
			im.setLore(ll);
			item.setItemMeta(im);
		}
		return item;
	}
}
