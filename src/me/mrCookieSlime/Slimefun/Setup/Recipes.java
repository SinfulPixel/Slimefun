package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.GuideItems;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;

import org.bukkit.Material;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

@SuppressWarnings("deprecation")
public class Recipes {
	
	private static startup plugin;
	
	
	  public static void setup(startup instance) {
		  
		  plugin = instance;
			
			if (plugin.getConfig().getBoolean("items.NanoPickaxe") == true) {
				NanoPickaxeRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Dustbin") == true) {
				DustbinRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Enderbackpack") == true) {
				EnderbackpackRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Grandpaswalkingstick") == true) {
				GrandpaswalkingStickRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Grandmaswalkingstick") == true) {
				GrandmaswalkingStickRecipe();
			}
			if (plugin.getConfig().getBoolean("items.pEnchanter") == true) {
				pEnchanterRecipe();
			}
			if (plugin.getConfig().getBoolean("items.pCrafter") == true) {
				pCrafterRecipe();
			}
			if (plugin.getConfig().getBoolean("items.SuperMeat") == true) {
				SuperMeatRecipe();
			}
			if (plugin.getConfig().getBoolean("items.NanoHoe") == true) {
				NanoHoeRecipe();
		    }
			if (plugin.getConfig().getBoolean("items.Nanosaber") == true) {
				NanosaberRecipe();
			}
			if (plugin.getConfig().getBoolean("items.ToolBench") == true) {
				ToolBenchRecipe();
			}
			if (plugin.getConfig().getBoolean("items.advancedcircuitboard") == true) {
				AdvancedcircuitboardRecipe();	
			}
			if (plugin.getConfig().getBoolean("items.steelthruster") == true) {
				SteelThrusterRecipe();
			}
			if (plugin.getConfig().getBoolean("items.jetpack") == true) {
				JetpackRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.3paper=>1book") == true) {
				BookRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.1quartzblock=>4quartz") == true) {
				QuartzRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.1wool=>4string") == true) {
				StringRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.4stonebricks=>4chiseledstonebricks") == true) {
				StonebrickRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.2blazepowder=>1blazerod") == true) {
				BlazeRodRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.enable-crafting-iron-horse-armor") == true) {
				IronHorseArmorRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.enable-crafting-gold-horse-armor") == true) {
				GoldHorseArmorRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.enable-crafting-diamond-horse-armor") == true) {
				DiamondHorseArmorRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.enable-crafting-saddle") == true) {
				SaddleRecipe();
			}
			if (plugin.getConfig().getBoolean("items.nanoaxel") == true) {
				NanoAxelRecipe();
			}
			if (plugin.getConfig().getBoolean("items.magic-eye-of-ender") == true) {
				MagicEnderEye();
			}
			if (plugin.getConfig().getBoolean("items.parachute") == true) {
				ParachuteRecipe();
			}
			if (plugin.getConfig().getBoolean("items.MagicSugar") == true) {
				MagicSugarRecipe();
			}
			if (plugin.getConfig().getBoolean("items.PartiallyGoldenApple") == true) {
				GoldenAppleRecipe();
			}
			if (plugin.getConfig().getBoolean("items.ubermeat") == true) {
				UberMeatRecipe();
			}
			if (plugin.getConfig().getBoolean("items.magicallump1") == true) {
				MagicalLump1Recipe();
			}
			if (plugin.getConfig().getBoolean("items.magicallump2") == true) {
				MagicalLump2Recipe();
			}
			if (plugin.getConfig().getBoolean("items.magicallump3") == true) {
				MagicalLump3Recipe();
			}
			if (plugin.getConfig().getBoolean("items.CrystalOfRepairing") == true) {
				CrystalOfRepairingRecipe();
			}
			if (plugin.getConfig().getBoolean("items.enderlump1") == true) {
				EnderLump1Recipe();
			}
			if (plugin.getConfig().getBoolean("items.enderlump2") == true) {
				EnderLump2Recipe();
			}
			if (plugin.getConfig().getBoolean("items.enderlump3") == true) {
				EnderLump3Recipe();
			}
			if (plugin.getConfig().getBoolean("items.EnderCrystalOfRepairing") == true) {
				EnderCrystalOfRepairingRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Sword-of-Beheading") == true) {
				SwordOfBeheadingRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Emerald-of-Repairing") == true) {
				EmeraldOfRepairingRecipe();
			}
			if (plugin.getConfig().getBoolean("items.MultiTool") == true) {
				MultiToolRecipe();
			}
			if (plugin.getConfig().getBoolean("items.SteelPlate") == true) {
				SteelPlateRecipe();
			}
			if (plugin.getConfig().getBoolean("items.chain") == true) {
				ChainRecipe();
			}
			if (plugin.getConfig().getBoolean("items.fortune-cookie") == true) {
				FortuneCookieRecipe();
			}
			if (plugin.getConfig().getBoolean("recipes.allow-crafting-chainmail-armor-with-chains") == true) {
				ChainArmorRecipe();
			}
			if (plugin.getConfig().getBoolean("items.hook") == true) {
				HookRecipe();
			}
			if (plugin.getConfig().getBoolean("items.grappling-hook") == true) {
				GrapplingHookRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Diamond-of-Duplicating") == true) {
				DiamondOfDuplicatingRecipe();
			}
			if (plugin.getConfig().getBoolean("items.InkOfKnowledge")) {
				InkRecipe();
			}
			if (plugin.getConfig().getBoolean("items.MinersCompass")) {
				MinersCompassRecipe();
			}
			if (plugin.getConfig().getBoolean("items.NanoFocus")) {
				NanoFocusRecipe();
			}
			if (plugin.getConfig().getBoolean("items.GoldenFeather")) {
				GoldenFeatherRecipe();
			}
			if (plugin.getConfig().getBoolean("items.PortableHole")) {
				PortableHoleRecipe();
			}
			if (plugin.getConfig().getBoolean("items.QuantumFocus")) {
				QuantumFocusRecipe();
			}
			if (plugin.getConfig().getBoolean("items.UberFocus")) {
				UberFocusRecipe();
			}
			if (plugin.getConfig().getBoolean("items.AmuletOfRevival")) {
				AmuletRecipe();
			}
			if (plugin.getConfig().getBoolean("items.UberPickaxe")) {
				UberPickaxeRecipe();
			}
			if (plugin.getConfig().getBoolean("items.Battery")) {
				BatteryRecipe();
			}
		}
	  
	  public static void AmuletRecipe() {
		  ShapedRecipe r = new ShapedRecipe(SlimefunItem.AMULET_OF_REVIVAL);
		  r.shape(new String [] { "lhl", "hfh", "lhl" });
		  r.setIngredient('f', Material.NETHER_STAR, 2);
		  r.setIngredient('h', Material.ENDER_PEARL, 1);
		  r.setIngredient('l', Material.GOLD_NUGGET, 3);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void NanoFocusRecipe() {
		  ShapedRecipe r = new ShapedRecipe(SlimefunItem.NANO_FOCUS);
		  r.shape(new String [] { " d ", "dnd", " d " });
		  r.setIngredient('n', Material.NETHER_STAR);
		  r.setIngredient('d', Material.DIAMOND);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void QuantumFocusRecipe() {
		  ShapedRecipe r = new ShapedRecipe(SlimefunItem.QUANTUM_FOCUS);
		  r.shape(new String [] { " s ", "sns", " s " });
		  r.setIngredient('n', Material.WATCH, 1);
		  r.setIngredient('s', Material.PAPER, 1);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void UberFocusRecipe() {
		  ShapedRecipe r = new ShapedRecipe(SlimefunItem.UBER_FOCUS);
		  r.shape(new String [] { "sds", "dnd", "sds" });
		  r.setIngredient('n', Material.WATCH, 2);
		  r.setIngredient('d', Material.DIAMOND);
		  r.setIngredient('s', Material.PAPER, 1);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void InkRecipe() {
		  ItemStack i = SlimefunItem.INK_OF_KNOWLEDGE.clone();
		  i.setAmount(16);
		  ShapelessRecipe r = new ShapelessRecipe(i);
		  r.addIngredient(Material.INK_SACK);
		  r.addIngredient(Material.ENDER_PEARL);
		  r.addIngredient(Material.DIAMOND);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void DiamondOfDuplicatingRecipe() {
		  ShapedRecipe r = new ShapedRecipe(SlimefunItem.DIAMOND_OF_DUPLICATING);
		  r.shape(new String [] { "ldl", "dmd", "ldl" });
		  r.setIngredient('l', Material.GOLD_NUGGET, 3);
		  r.setIngredient('m', Material.NETHER_STAR);
		  r.setIngredient('d', Material.DIAMOND);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void HookRecipe() {
		  ShapedRecipe r = new ShapedRecipe(SlimefunItem.HOOK);
		  r.shape(new String [] { " s ", "sfs", "   " });
		  r.setIngredient('s', Material.IRON_INGOT, 1);
		  r.setIngredient('f', Material.FLINT);
		  plugin.getServer().addRecipe(r);
	  }
	  
	public static void GrapplingHookRecipe() {
		  ItemStack item = SlimefunItem.GRAPPLING_HOOK.clone();
		  item.setAmount(4);
		  ShapedRecipe r = new ShapedRecipe(item);
		  r.shape(new String [] { " h ", " c ", " c " });
		  r.setIngredient('h', Material.FLINT, 1);
		  r.setIngredient('c', Material.STRING, 1);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void FortuneCookieRecipe() {
		  ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.FORTUNE_COOKIE);
		  r.addIngredient(Material.COOKIE);
		  r.addIngredient(Material.PAPER);
		  plugin.getServer().addRecipe(r);
	  }
	  
	  public static void ChainArmorRecipe() {
		  ShapedRecipe r = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET));
		  r.shape(new String [] { "ccc", "c c", "   " });
		  r.setIngredient('c', Material.getMaterial(132));
		  plugin.getServer().addRecipe(r);
		  
		  ShapedRecipe r2 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		  r2.shape(new String [] { "c c", "ccc", "ccc" });
		  r2.setIngredient('c', Material.getMaterial(132));
		  plugin.getServer().addRecipe(r2);
		  
		 
		  ShapedRecipe r3 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS));
		  r3.shape(new String [] { "ccc", "c c", "c c" });
		  r3.setIngredient('c', Material.getMaterial(132));
		  plugin.getServer().addRecipe(r3);
		  
		  
		  ShapedRecipe r4 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS));
		  r4.shape(new String [] { "   ", "c c", "c c" });
		  r4.setIngredient('c', Material.getMaterial(132));
		  plugin.getServer().addRecipe(r4);
		  
		  ShapedRecipe r5 = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET));
		  r5.shape(new String [] { "   ", "ccc", "c c" });
		  r5.setIngredient('c', Material.getMaterial(132));
		  plugin.getServer().addRecipe(r5);
	  }
	  public static void ChainRecipe() {
		  ItemStack chain = SlimefunItem.CHAIN.clone();
		  chain.setAmount(3);
		  ShapelessRecipe r = new ShapelessRecipe(chain);
		  r.addIngredient(Material.IRON_INGOT, 1);
		  r.addIngredient(Material.IRON_INGOT, 1);
		  r.addIngredient(Material.IRON_INGOT, 1);
		  plugin.getServer().addRecipe(r);
	  }
	  public static void SteelPlateRecipe() {
		  ShapedRecipe r = new ShapedRecipe(SlimefunItem.STEEL_PLATE);
		  r.shape(new String [] { "aaa", "aaa", "aaa" });
		  r.setIngredient('a', Material.IRON_INGOT, 1);
		  plugin.getServer().addRecipe(r);
	  }/*
	  public static void FirewoodRecipe() {
		  ItemStack wood = SlimefunItem.FIREWOOD.clone();
		  wood.setAmount(16);
		  
		  ShapedRecipe r = new ShapedRecipe(wood);
		  r.shape(new String [] { " c ", "cwc", " c " });
		  r.setIngredient('c', Material.COAL);
		  r.setIngredient('w', Material.WOOD);
		  plugin.getServer().addRecipe(r);
		  
		  ShapedRecipe r2 = new ShapedRecipe(wood);
		  r2.shape(new String [] { " c ", "cwc", " c " });
		  r2.setIngredient('c', Material.COAL);
		  r2.setIngredient('w', Material.WOOD, 1);
		  plugin.getServer().addRecipe(r2);
		  
		 
		  ShapedRecipe r3 = new ShapedRecipe(wood);
		  r3.shape(new String [] { " c ", "cwc", " c " });
		  r3.setIngredient('c', Material.COAL);
		  r3.setIngredient('w', Material.WOOD, 2);
		  plugin.getServer().addRecipe(r3);
		  
		  
		  ShapedRecipe r4 = new ShapedRecipe(wood);
		  r4.shape(new String [] { " c ", "cwc", " c " });
		  r4.setIngredient('c', Material.COAL);
		  r4.setIngredient('w', Material.WOOD, 3);
		  plugin.getServer().addRecipe(r4);
	  }
	  public static void AshRecipe() {
		  ShapedRecipe r = new ShapedRecipe(new ItemStack(Material.COAL));
		  r.shape(new String [] { "aaa", "aaa", "aaa" });
		  r.setIngredient('a', Material.MELON_SEEDS, 1);
		  plugin.getServer().addRecipe(r);
	  }*/
	  public static void MultiToolRecipe() {
		  ItemStack item = GuideItems.MTOutput();
		  ShapedRecipe r = new ShapedRecipe(item);
		  r.shape(new String [] { " s ", "sas", "dad" });
		  r.setIngredient('s', Material.IRON_INGOT, 1);
		  r.setIngredient('d', Material.DIAMOND);
		  r.setIngredient('a', Material.POWERED_RAIL, 1);
		  plugin.getServer().addRecipe(r);
	  }
	  public static void EmeraldOfRepairingRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.EMERALD_OF_REPAIRING);
			r.shape(new String[] { " l ", "lel", " l " });
			r.setIngredient('e', Material.EMERALD);
			r.setIngredient('l', Material.GOLD_NUGGET, 1);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void SwordOfBeheadingRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.SWORD_OF_BEHEADING);
			r.shape(new String[] { " s ", " s ", " b " });
			r.setIngredient('b', Material.BLAZE_ROD);
			r.setIngredient('s', Material.SKULL_ITEM, 1);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void EnderCrystalOfRepairingRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING);
			r.shape(new String[] { "gyg", "mnm", "gyg" });
			r.setIngredient('m', Material.GOLD_NUGGET, 6);
			r.setIngredient('y', Material.EYE_OF_ENDER);
			r.setIngredient('g', Material.LEATHER, 1);
			r.setIngredient('n', Material.NETHER_STAR, 1);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void EnderLump3Recipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.ENDER_LUMP_3);
			r.addIngredient(Material.GOLD_NUGGET, 5);
			r.addIngredient(Material.GOLD_NUGGET, 5);
			r.addIngredient(Material.GOLD_NUGGET, 5);
			r.addIngredient(Material.GOLD_NUGGET, 5);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void EnderLump2Recipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.ENDER_LUMP_2);
			r.addIngredient(Material.GOLD_NUGGET, 4);
			r.addIngredient(Material.GOLD_NUGGET, 4);
			r.addIngredient(Material.GOLD_NUGGET, 4);
			r.addIngredient(Material.GOLD_NUGGET, 4);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void EnderLump1Recipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.ENDER_LUMP_1);
			r.shape(new String[] { " g ", "gbg", " g " });
			r.setIngredient('g', Material.GOLD_NUGGET);
			r.setIngredient('b', Material.EYE_OF_ENDER);
			plugin.getServer().addRecipe(r);
		}
	  
	public static void CrystalOfRepairingRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.CRYSTAL_OF_REPAIRING);
			r.shape(new String[] { "gyg", "mnm", "gyg" });
			r.setIngredient('m', Material.GOLD_NUGGET, 3);
			r.setIngredient('y', Material.EYE_OF_ENDER);
			r.setIngredient('g', Material.GLOWSTONE_DUST);
			r.setIngredient('n', Material.NETHER_STAR);
			plugin.getServer().addRecipe(r);
		}
	  public static void MagicalLump3Recipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.MAGICAL_LUMP_3);
			r.addIngredient(Material.GOLD_NUGGET, 2);
			r.addIngredient(Material.GOLD_NUGGET, 2);
			r.addIngredient(Material.GOLD_NUGGET, 2);
			r.addIngredient(Material.GOLD_NUGGET, 2);
			plugin.getServer().addRecipe(r);
		}
	  public static void MagicalLump2Recipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.MAGICAL_LUMP_2);
			r.addIngredient(Material.GOLD_NUGGET, 1);
			r.addIngredient(Material.GOLD_NUGGET, 1);
			r.addIngredient(Material.GOLD_NUGGET, 1);
			r.addIngredient(Material.GOLD_NUGGET, 1);
			plugin.getServer().addRecipe(r);
		}
	  public static void MagicalLump1Recipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.MAGICAL_LUMP_1);
			r.shape(new String[] { " g ", "gbg", " g " });
			r.setIngredient('g', Material.GOLD_NUGGET);
			r.setIngredient('b', Material.BLAZE_POWDER);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void IronHorseArmorRecipe() {
			ItemStack supermeat = new ItemStack(Material.IRON_BARDING, 1);
			ShapedRecipe r = new ShapedRecipe(supermeat);
			r.shape(new String[] { "  i", "ili", "iii" });
			r.setIngredient('i', Material.IRON_INGOT);
			r.setIngredient('l', Material.LEATHER);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void GoldHorseArmorRecipe() {
			ItemStack supermeat = new ItemStack(Material.GOLD_BARDING, 1);
			ShapedRecipe r = new ShapedRecipe(supermeat);
			r.shape(new String[] { "  i", "ili", "iii" });
			r.setIngredient('i', Material.GOLD_INGOT);
			r.setIngredient('l', Material.LEATHER);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void DiamondHorseArmorRecipe() {
			ItemStack supermeat = new ItemStack(Material.DIAMOND_BARDING, 1);
			ShapedRecipe r = new ShapedRecipe(supermeat);
			r.shape(new String[] { "  i", "ili", "iii" });
			r.setIngredient('i', Material.DIAMOND);
			r.setIngredient('l', Material.LEATHER);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void SaddleRecipe() {
			ItemStack supermeat = new ItemStack(Material.SADDLE, 1);
			ShapedRecipe r = new ShapedRecipe(supermeat);
			r.shape(new String[] { "iii", "ili", "   " });
			r.setIngredient('i', Material.LEATHER);
			r.setIngredient('l', Material.STRING);
			plugin.getServer().addRecipe(r);
		}
	  
	public static void UberMeatRecipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.UBER_MEAT);
			r.addIngredient(Material.GOLDEN_APPLE, 2);
			r.addIngredient(Material.SUGAR, 1);
			r.addIngredient(Material.GRILLED_PORK, 1);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void MagicSugarRecipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.MAGIC_SUGAR);
			r.addIngredient(Material.BLAZE_POWDER);
			r.addIngredient(Material.SUGAR);
			r.addIngredient(Material.GLOWSTONE_DUST);
			plugin.getServer().addRecipe(r);
		}
	  
	  public static void ParachuteRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.PARACHUTE);
			r.shape(new String[] { "twt", "s s", " s " });
			r.setIngredient('t', Material.IRON_INGOT, 1);
			r.setIngredient('w', Material.WOOL);
			r.setIngredient('s', Material.STRING);
			plugin.getServer().addRecipe(r);
		}
		public static void BlazeRodRecipe() {
			ItemStack brick = new ItemStack(Material.BLAZE_ROD, 1);
			ShapelessRecipe r = new ShapelessRecipe(brick);
			r.addIngredient(Material.BLAZE_POWDER);
			r.addIngredient(Material.BLAZE_POWDER);
			plugin.getServer().addRecipe(r);
		}
		public static void StonebrickRecipe() {
			ItemStack brick = new ItemStack(Material.SMOOTH_BRICK, 4);
			brick.setDurability((short) 3);
			ShapelessRecipe r = new ShapelessRecipe(brick);
			r.addIngredient(Material.SMOOTH_BRICK);
			r.addIngredient(Material.SMOOTH_BRICK);
			r.addIngredient(Material.SMOOTH_BRICK);
			r.addIngredient(Material.SMOOTH_BRICK);
			plugin.getServer().addRecipe(r);
		}
		public static void StringRecipe() {
			ItemStack BookoTeleportingRecipe = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r = new ShapelessRecipe(BookoTeleportingRecipe);
			r.addIngredient(Material.WOOL);
			plugin.getServer().addRecipe(r);
			
			ItemStack BookoTeleportingRecipe2 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r2 = new ShapelessRecipe(BookoTeleportingRecipe2);
			r2.addIngredient(Material.WOOL, (short) 1);
			plugin.getServer().addRecipe(r2);
			
			ItemStack BookoTeleportingRecipe3 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r3 = new ShapelessRecipe(BookoTeleportingRecipe3);
			r3.addIngredient(Material.WOOL, (short) 2);
			plugin.getServer().addRecipe(r3);
			
			ItemStack BookoTeleportingRecipe4 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r4 = new ShapelessRecipe(BookoTeleportingRecipe4);
			r4.addIngredient(Material.WOOL, (short) 3);
			plugin.getServer().addRecipe(r4);
			
			ItemStack BookoTeleportingRecipe5 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r5 = new ShapelessRecipe(BookoTeleportingRecipe5);
			r5.addIngredient(Material.WOOL, (short) 4);
			plugin.getServer().addRecipe(r5);
			
			ItemStack BookoTeleportingRecipe6 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r6 = new ShapelessRecipe(BookoTeleportingRecipe6);
			r6.addIngredient(Material.WOOL, (short) 5);
			plugin.getServer().addRecipe(r6);
			
			ItemStack BookoTeleportingRecipe7 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r7 = new ShapelessRecipe(BookoTeleportingRecipe7);
			r7.addIngredient(Material.WOOL, (short) 6);
			plugin.getServer().addRecipe(r7);
			
			ItemStack BookoTeleportingRecipe8 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r8 = new ShapelessRecipe(BookoTeleportingRecipe8);
			r8.addIngredient(Material.WOOL, (short) 7);
			plugin.getServer().addRecipe(r8);
			
			ItemStack BookoTeleportingRecipe9 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r9 = new ShapelessRecipe(BookoTeleportingRecipe9);
			r9.addIngredient(Material.WOOL, (short) 8);
			plugin.getServer().addRecipe(r9);
			
			ItemStack BookoTeleportingRecipe10 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r10 = new ShapelessRecipe(BookoTeleportingRecipe10);
			r10.addIngredient(Material.WOOL, (short) 9);
			plugin.getServer().addRecipe(r10);
			
			ItemStack BookoTeleportingRecipe11 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r11 = new ShapelessRecipe(BookoTeleportingRecipe11);
			r11.addIngredient(Material.WOOL, (short) 10);
			plugin.getServer().addRecipe(r11);
			
			ItemStack BookoTeleportingRecipe12 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r12 = new ShapelessRecipe(BookoTeleportingRecipe12);
			r12.addIngredient(Material.WOOL, (short) 11);
			plugin.getServer().addRecipe(r12);
			
			ItemStack BookoTeleportingRecipe13 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r13 = new ShapelessRecipe(BookoTeleportingRecipe13);
			r13.addIngredient(Material.WOOL, (short) 12);
			plugin.getServer().addRecipe(r13);
			
			ItemStack BookoTeleportingRecipe14 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r14 = new ShapelessRecipe(BookoTeleportingRecipe14);
			r14.addIngredient(Material.WOOL, (short) 13);
			plugin.getServer().addRecipe(r14);
			
			ItemStack BookoTeleportingRecipe15 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r15 = new ShapelessRecipe(BookoTeleportingRecipe15);
			r15.addIngredient(Material.WOOL, (short) 14);
		    plugin.getServer().addRecipe(r15);
			
			ItemStack BookoTeleportingRecipe16 = new ItemStack(Material.STRING, 4);
			ShapelessRecipe r16 = new ShapelessRecipe(BookoTeleportingRecipe16);
			r16.addIngredient(Material.WOOL, (short) 15);
			plugin.getServer().addRecipe(r16);
		}
		public static void QuartzRecipe() {
			ItemStack BookoTeleportingRecipe = new ItemStack(Material.QUARTZ, 4);
			ShapelessRecipe r = new ShapelessRecipe(BookoTeleportingRecipe);
			r.addIngredient(Material.QUARTZ_BLOCK);
		    plugin.getServer().addRecipe(r);
		}
		public static void BookRecipe() {
			ItemStack BookoTeleportingRecipe = new ItemStack(Material.BOOK, 1);
			ShapelessRecipe r = new ShapelessRecipe(BookoTeleportingRecipe);
			r.addIngredient(Material.PAPER);
			r.addIngredient(Material.PAPER);
			r.addIngredient(Material.PAPER);
			plugin.getServer().addRecipe(r);
		}
		public static void MinersCompassRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.MINERS_COMPASS);
			r.shape(new String[] { " s ", "sgs", " s " });
			r.setIngredient('s', Material.IRON_INGOT, (short) 1);
			r.setIngredient('g', Material.GOLD_NUGGET, 3);
			plugin.getServer().addRecipe(r);
		}
		public static void JetpackRecipe() {
			ItemStack item = GuideItems.JetpackOutput();
			ShapedRecipe r = new ShapedRecipe(item);
			r.shape(new String[] { "sss", "sas", "trt" });
			r.setIngredient('s', Material.IRON_INGOT, (short) 1);
			r.setIngredient('a', Material.POWERED_RAIL, 1);
			r.setIngredient('t', Material.BUCKET, (short) 2);
			r.setIngredient('r', Material.REDSTONE_BLOCK);
			plugin.getServer().addRecipe(r);
		}
		public static void SteelThrusterRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.STEEL_THRUSTER);
			r.shape(new String[] { "s s", "sls", " s " });
			r.setIngredient('s', Material.IRON_INGOT, (short) 1);
			r.setIngredient('l', Material.LAVA_BUCKET);
			plugin.getServer().addRecipe(r);
		}
		public static void AdvancedcircuitboardRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.ADVANCED_CIRCUIT_BOARD);
			r.shape(new String[] { "lll", "rbr", "lll" });
			r.setIngredient('l', Material.INK_SACK, (short) 4);
			r.setIngredient('r', Material.REDSTONE);
			r.setIngredient('b', Material.ACTIVATOR_RAIL, 1);
			plugin.getServer().addRecipe(r);
		}
		public static void SteelRecipe() {
			FurnaceRecipe r = new FurnaceRecipe(SlimefunItem.STEEL_INGOT, Material.IRON_INGOT);
			plugin.getServer().addRecipe(r);
		}
		public static void ToolBenchRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.TOOL_BENCH);
			r.shape(new String[] { "scs", "cwc", "scs" });
			r.setIngredient('w', Material.WORKBENCH);
			r.setIngredient('s', Material.STONE_PICKAXE);
			r.setIngredient('c', Material.STONE);
			plugin.getServer().addRecipe(r);
		}
		public static void NanoAxelRecipe() {
			if (plugin.getConfig().getBoolean("craftable-items.nanoaxel-is-craftable") == true) {
				ShapedRecipe r = new ShapedRecipe(SlimefunItem.NANO_AXEL);
				r.shape(new String[] { "ans", " b ", " b " });
				r.setIngredient('n', Material.WATCH, 1);
				r.setIngredient('b', Material.BLAZE_ROD);
				r.setIngredient('a', Material.DIAMOND_AXE);
				r.setIngredient('s', Material.DIAMOND_SPADE);
				plugin.getServer().addRecipe(r);
				
				ShapedRecipe r2 = new ShapedRecipe(SlimefunItem.NANO_AXEL);
				r2.shape(new String[] { "sna", " b ", " b " });
				r2.setIngredient('n', Material.WATCH, 1);
				r2.setIngredient('b', Material.BLAZE_ROD);
				r2.setIngredient('a', Material.DIAMOND_AXE);
				r2.setIngredient('s', Material.DIAMOND_SPADE);
				plugin.getServer().addRecipe(r2);
			}
		}
		public static void NanosaberRecipe() {
			if (plugin.getConfig().getBoolean("craftable-items.nanosaber-is-craftable") == true) {
				ShapedRecipe r = new ShapedRecipe(SlimefunItem.NANO_SABER);
				r.shape(new String[] { " s ", " n ", " b " });
				r.setIngredient('n', Material.WATCH, 1);
				r.setIngredient('b', Material.BLAZE_ROD);
				r.setIngredient('s', Material.DIAMOND_SWORD);
				plugin.getServer().addRecipe(r);
			}
		}
		public static void NanoPickaxeRecipe() {
			if (plugin.getConfig().getBoolean("craftable-items.nanopickaxe-is-craftable") == true) {
				ShapedRecipe r = new ShapedRecipe(SlimefunItem.NANO_PICKAXE);
				r.shape(new String[] { "pnp", " b ", " b " });
				r.setIngredient('n', Material.WATCH, 1);
				r.setIngredient('b', Material.BLAZE_ROD);
				r.setIngredient('p', Material.DIAMOND_PICKAXE);
				plugin.getServer().addRecipe(r);
			}
		}
		public static void NanoHoeRecipe() {
			if (plugin.getConfig().getBoolean("craftable-items.nanohoe-is-craftable") == true) {
				ShapedRecipe r = new ShapedRecipe(SlimefunItem.NANO_HOE);
				r.shape(new String[] { "hn ", " b ", " b " });
				r.setIngredient('n', Material.WATCH, 1);
				r.setIngredient('b', Material.BLAZE_ROD);
				r.setIngredient('h', Material.DIAMOND_HOE);
				plugin.getServer().addRecipe(r);
				
				ShapedRecipe r2 = new ShapedRecipe(SlimefunItem.NANO_HOE);
				r2.shape(new String[] { " nh", " b ", " b " });
				r2.setIngredient('n', Material.WATCH, 1);
				r2.setIngredient('b', Material.BLAZE_ROD);
				r2.setIngredient('h', Material.DIAMOND_HOE);
				plugin.getServer().addRecipe(r2);
			}
		}
		public static void MagicEnderEye() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.MAGIC_EYE_OF_ENDER);
			r.shape(new String[] { "geg", "mym", "geg" });
			r.setIngredient('g', Material.GOLD_INGOT);
			r.setIngredient('e', Material.ENDER_PEARL);
			r.setIngredient('y', Material.EYE_OF_ENDER);
			r.setIngredient('m', Material.GOLD_NUGGET, 6);
			plugin.getServer().addRecipe(r);
		}
		public static void DustbinRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.PORTABLE_DUSTBIN);
			r.shape(new String[] { " i ", "i i", " i " });
			r.setIngredient('i', Material.IRON_INGOT);
			plugin.getServer().addRecipe(r);
		}
		public static void GrandpaswalkingStickRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.GRANDPAS_WALKING_STICK);
			r.shape(new String[] { "lwl", "lwl", "lwl" });
			r.setIngredient('w', Material.LOG);
			r.setIngredient('l', Material.LEATHER);
			plugin.getServer().addRecipe(r);
		}
		public static void GrandmaswalkingStickRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.GRANDMAS_WALKING_STICK);
			r.shape(new String[] { " w ", " w ", " w " });
			r.setIngredient('w', Material.LOG);
			plugin.getServer().addRecipe(r);
		}
		public static void EnderbackpackRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.ENDER_BACKPACK);
			r.shape(new String[] { "lll", "beb", "lll" });
			r.setIngredient('e', Material.ENDER_CHEST);
			r.setIngredient('b', Material.BLAZE_POWDER);
			r.setIngredient('l', Material.LEATHER);
			plugin.getServer().addRecipe(r);
		}
		public static void pEnchanterRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.PORTABLE_ENCHANTER);
			r.shape(new String[] { " b ", "odo", "odo" });
			r.setIngredient('b', Material.BOOK);
			r.setIngredient('d', Material.DIAMOND);
			r.setIngredient('o', Material.OBSIDIAN);
			plugin.getServer().addRecipe(r);
		}
		public static void pCrafterRecipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.PORTABLE_CRAFTER);
			r.addIngredient(Material.BOOK);
			r.addIngredient(Material.WORKBENCH);
			plugin.getServer().addRecipe(r);
		}
		public static void SuperMeatRecipe() {
			ShapelessRecipe r = new ShapelessRecipe(SlimefunItem.SUPER_MEAT);
			r.addIngredient(Material.COOKED_BEEF);
			r.addIngredient(Material.COOKED_CHICKEN);
			r.addIngredient(Material.GRILLED_PORK);
			plugin.getServer().addRecipe(r);
		}
		public static void GoldenAppleRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.PARTIALLY_GOLDEN_APPLE);
			r.shape(new String[] { "ggg", "gag", "ggg" });
			r.setIngredient('g', Material.GOLD_NUGGET);
			r.setIngredient('a', Material.APPLE);
			plugin.getServer().addRecipe(r);
		}
		public static void GoldenFeatherRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.GOLDEN_FEATHER);
			r.shape(new String[] { "g g", "lfl", "g g" });
			r.setIngredient('f', Material.FEATHER);
			r.setIngredient('l', Material.GOLD_NUGGET, 3);
			r.setIngredient('g', Material.FLINT, 2);
			plugin.getServer().addRecipe(r);
		}
		public static void PortableHoleRecipe() {
			ItemStack hole = SlimefunItem.PORTABLE_HOLE.clone();
			hole.setAmount(4);
			ShapedRecipe r = new ShapedRecipe(hole);
			r.shape(new String[] { "eqe", "qpq", "eqe" });
			r.setIngredient('p', Material.ENDER_PEARL);
			r.setIngredient('e', Material.GOLD_NUGGET, 6);
			r.setIngredient('q', Material.QUARTZ);
			plugin.getServer().addRecipe(r);
		}
		public static void UberAxeRecipe() {
			if (true) {
				ShapedRecipe r = new ShapedRecipe(SlimefunItem.UBER_AXE);
				r.shape(new String[] { "fd ", "db ", " b " });
				r.setIngredient('f', Material.WATCH, 3);
				r.setIngredient('d', Material.DIAMOND);
				r.setIngredient('b', Material.BLAZE_ROD);
				plugin.getServer().addRecipe(r);
			}
			if (true) {
				ShapedRecipe r = new ShapedRecipe(SlimefunItem.UBER_AXE);
				r.shape(new String[] { " df", " bd", " b " });
				r.setIngredient('f', Material.WATCH, 3);
				r.setIngredient('d', Material.DIAMOND);
				r.setIngredient('b', Material.BLAZE_ROD);
				plugin.getServer().addRecipe(r);
			}
		}
		
		public static void UberPickaxeRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.UBER_PICKAXE);
			r.shape(new String[] { "fff", " s ", " s " });
			r.setIngredient('f', Material.WATCH, 3);
			r.setIngredient('s', Material.IRON_INGOT, 1);
			plugin.getServer().addRecipe(r);
		}
		
		public static void BatteryRecipe() {
			ShapedRecipe r = new ShapedRecipe(SlimefunItem.BATTERY);
			r.shape(new String[] { " s ", "grg", "grg" });
			r.setIngredient('r', Material.REDSTONE);
			r.setIngredient('s', Material.IRON_INGOT, 1);
			r.setIngredient('g', Material.GOLD_INGOT);
			plugin.getServer().addRecipe(r);
		}
}
