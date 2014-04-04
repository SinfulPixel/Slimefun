package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Items.Category;
import me.mrCookieSlime.Slimefun.Items.GuideItems;
import me.mrCookieSlime.Slimefun.Items.RecipeType;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Utilities.FuelHandler;


public class Guide {
	
	public static void setup(startup plugin) {
		if (plugin.getConfig().getBoolean("items.InkOfKnowledge")) {
			Slimefun.registerItem(SlimefunItem.INK_OF_KNOWLEDGE, Category.Basics(), GuideItems.InkRecipe(), RecipeType.SHAPELESS_RECIPE, GuideItems.InkOutput());
		}
		if (plugin.getConfig().getBoolean("items.BookBinder")) {
			Slimefun.registerItem(SlimefunItem.BOOK_BINDER, Category.Basics(), GuideItems.BookBinderRecipe(), RecipeType.MULTIBLOCK, SlimefunItem.BOOK_BINDER);
		}
		if (plugin.getConfig().getBoolean("items.SlimeGem")) {
			Slimefun.registerItem(SlimefunItem.SLIME_GEM, Category.CrystalsAndGems(), null, RecipeType.QUEST, SlimefunItem.SLIME_GEM);
		}
		if (plugin.getConfig().getBoolean("items.pCrafter")) {
			Slimefun.registerItem(SlimefunItem.PORTABLE_CRAFTER, Category.Portable(), GuideItems.pCrafterRecipe(), RecipeType.SHAPELESS_RECIPE, SlimefunItem.PORTABLE_CRAFTER);
		}
		if (plugin.getConfig().getBoolean("items.Grandmaswalkingstick")) {
			Slimefun.registerItem(SlimefunItem.GRANDMAS_WALKING_STICK, Category.Weaponry(), GuideItems.GMSRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.GRANDMAS_WALKING_STICK);
		}
		if (plugin.getConfig().getBoolean("items.Grandpaswalkingstick")) {
			Slimefun.registerItem(SlimefunItem.GRANDPAS_WALKING_STICK, Category.Weaponry(), GuideItems.GPSRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.GRANDPAS_WALKING_STICK);
		}
		if (plugin.getConfig().getBoolean("items.SuperMeat")) {
			Slimefun.registerItem(SlimefunItem.SUPER_MEAT, Category.Food(), GuideItems.SuperMeatRecipe(), RecipeType.SHAPELESS_RECIPE, SlimefunItem.SUPER_MEAT);
		}
		if (plugin.getConfig().getBoolean("items.fortune-cookie")) {
			Slimefun.registerItem(SlimefunItem.FORTUNE_COOKIE, Category.Food(), GuideItems.CookieRecipe(), RecipeType.SHAPELESS_RECIPE, SlimefunItem.FORTUNE_COOKIE);
		}
		if (plugin.getConfig().getBoolean("items.pEnchanter")) {
			Slimefun.registerItem(SlimefunItem.PORTABLE_ENCHANTER, Category.Portable(), GuideItems.pEnchanterRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.PORTABLE_ENCHANTER);
		}
		if (plugin.getConfig().getBoolean("items.Dustbin")) {
			Slimefun.registerItem(SlimefunItem.PORTABLE_DUSTBIN, Category.Portable(), GuideItems.DustbinRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.PORTABLE_DUSTBIN);
		}
		if (plugin.getConfig().getBoolean("items.ToolBench")) {
			Slimefun.registerItem(SlimefunItem.TOOL_BENCH, Category.ArmorCrafting(), GuideItems.ToolBenchRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.TOOL_BENCH);
		}
		if (plugin.getConfig().getBoolean("items.glowstonehelmet")) {
			Slimefun.registerItem(SlimefunItem.GLOWSTONE_HELMET, Category.ArmorCrafting(), GuideItems.GHelmetRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.GLOWSTONE_HELMET);
		}
		if (plugin.getConfig().getBoolean("items.glowstonechestplate")) {
			Slimefun.registerItem(SlimefunItem.GLOWSTONE_CHESTPLATE, Category.ArmorCrafting(), GuideItems.GChestRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.GLOWSTONE_CHESTPLATE);
		}
		if (plugin.getConfig().getBoolean("items.glowstoneleggings")) {
			Slimefun.registerItem(SlimefunItem.GLOWSTONE_LEGGINGS, Category.ArmorCrafting(), GuideItems.GPantsRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.GLOWSTONE_LEGGINGS);
		}
		if (plugin.getConfig().getBoolean("items.glowstoneboots")) {
			Slimefun.registerItem(SlimefunItem.GLOWSTONE_BOOTS, Category.ArmorCrafting(), GuideItems.GBootsRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.GLOWSTONE_BOOTS);
		}
		if (plugin.getConfig().getBoolean("items.Enderbackpack")) {
			Slimefun.registerItem(SlimefunItem.ENDER_BACKPACK, Category.Portable(), GuideItems.EnderBackpackRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.ENDER_BACKPACK);
		}
		if (plugin.getConfig().getBoolean("items.magic-eye-of-ender")) {
			Slimefun.registerItem(SlimefunItem.MAGIC_EYE_OF_ENDER, Category.MagicUtils(), GuideItems.MEOERecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.MAGIC_EYE_OF_ENDER);
		}
		if (plugin.getConfig().getBoolean("items.EnderHelmet")) {
			Slimefun.registerItem(SlimefunItem.ENDER_HELMET, Category.ArmorCrafting(), GuideItems.EHelmetRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.ENDER_HELMET);
		}
		if (plugin.getConfig().getBoolean("items.EnderChestplate")) {
			Slimefun.registerItem(SlimefunItem.ENDER_CHESTPLATE, Category.ArmorCrafting(), GuideItems.EChestRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.ENDER_CHESTPLATE);
		}
		if (plugin.getConfig().getBoolean("items.EnderLeggings")) {
			Slimefun.registerItem(SlimefunItem.ENDER_LEGGINGS, Category.ArmorCrafting(), GuideItems.ELegsRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.ENDER_LEGGINGS);
		}
		if (plugin.getConfig().getBoolean("items.EnderBoots")) {
			Slimefun.registerItem(SlimefunItem.ENDER_BOOTS, Category.ArmorCrafting(), GuideItems.EBootsRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.ENDER_BOOTS);
		}
		if (plugin.getConfig().getBoolean("items.PartiallyGoldenApple")) {
			Slimefun.registerItem(SlimefunItem.PARTIALLY_GOLDEN_APPLE, Category.Food(), GuideItems.PGAppleRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.PARTIALLY_GOLDEN_APPLE);
		}
		if (plugin.getConfig().getBoolean("items.MagicSugar")) {
			Slimefun.registerItem(SlimefunItem.MAGIC_SUGAR, Category.Food(), GuideItems.MagicSugar(), RecipeType.SHAPELESS_RECIPE, SlimefunItem.MAGIC_SUGAR);
		}
		if (plugin.getConfig().getBoolean("items.ubermeat")) {
			Slimefun.registerItem(SlimefunItem.UBER_MEAT, Category.Food(), GuideItems.UberMeat(), RecipeType.SHAPELESS_RECIPE, SlimefunItem.UBER_MEAT);
		}
		if (plugin.getConfig().getBoolean("items.SlimeHelmet")) {
			Slimefun.registerItem(SlimefunItem.SLIME_HELMET, Category.ArmorCrafting(), GuideItems.SHelmetRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.SLIME_HELMET);
		}
		if (plugin.getConfig().getBoolean("items.SlimeChestplate")) {
			Slimefun.registerItem(SlimefunItem.SLIME_CHESTPLATE, Category.ArmorCrafting(), GuideItems.SChestRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.SLIME_CHESTPLATE);
		}
		if (plugin.getConfig().getBoolean("items.SlimeLeggings")) {
			Slimefun.registerItem(SlimefunItem.SLIME_LEGGINGS, Category.ArmorCrafting(), GuideItems.SLegsRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.SLIME_LEGGINGS);
		}
		if (plugin.getConfig().getBoolean("items.SlimeBoots")) {
			Slimefun.registerItem(SlimefunItem.SLIME_BOOTS, Category.ArmorCrafting(), GuideItems.SBootsRecipe(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.SLIME_BOOTS);
		}
		if (plugin.getConfig().getBoolean("items.Sword-of-Beheading")) {
			Slimefun.registerItem(SlimefunItem.SWORD_OF_BEHEADING, Category.Weaponry(), GuideItems.SwordHead(), RecipeType.SHAPED_RECIPE, SlimefunItem.SWORD_OF_BEHEADING); 
		}
		if (plugin.getConfig().getBoolean("items.magicallump1")) {
			Slimefun.registerItem(SlimefunItem.MAGICAL_LUMP_1, Category.LumpsAndMagic(), GuideItems.Mlump1(), RecipeType.SHAPED_RECIPE, SlimefunItem.MAGICAL_LUMP_1);
		}
		if (plugin.getConfig().getBoolean("items.magicallump2")) {
			Slimefun.registerItem(SlimefunItem.MAGICAL_LUMP_2, Category.LumpsAndMagic(), GuideItems.Mlump2(), RecipeType.SHAPED_RECIPE, SlimefunItem.MAGICAL_LUMP_2);
		}
		if (plugin.getConfig().getBoolean("items.magicallump3")) {
			Slimefun.registerItem(SlimefunItem.MAGICAL_LUMP_3, Category.LumpsAndMagic(), GuideItems.Mlump3(), RecipeType.SHAPED_RECIPE, SlimefunItem.MAGICAL_LUMP_3);
		}
		if (plugin.getConfig().getBoolean("items.enderlump1")) {
			Slimefun.registerItem(SlimefunItem.ENDER_LUMP_1, Category.LumpsAndMagic(), GuideItems.Elump1(), RecipeType.SHAPED_RECIPE, SlimefunItem.ENDER_LUMP_1);
		}
		if (plugin.getConfig().getBoolean("items.enderlump2")) {
			Slimefun.registerItem(SlimefunItem.ENDER_LUMP_2, Category.LumpsAndMagic(), GuideItems.Elump2(), RecipeType.SHAPED_RECIPE, SlimefunItem.ENDER_LUMP_2);
		}
		if (plugin.getConfig().getBoolean("items.enderlump3")) {
			Slimefun.registerItem(SlimefunItem.ENDER_LUMP_3, Category.LumpsAndMagic(), GuideItems.Elump3(), RecipeType.SHAPED_RECIPE, SlimefunItem.ENDER_LUMP_3);
		}
		if (plugin.getConfig().getBoolean("items.pBookBinder")) {
			Slimefun.registerItem(SlimefunItem.PORTABLE_BOOK_BINDER, Category.Portable(), GuideItems.pBB(), RecipeType.BOOK_BINDER_RECIPE, SlimefunItem.PORTABLE_BOOK_BINDER);
		}
		if (plugin.getConfig().getBoolean("items.pToolbench")) {
			Slimefun.registerItem(SlimefunItem.PORTABLE_TOOL_BENCH , Category.Portable(), GuideItems.pTB(), RecipeType.BOOK_BINDER_RECIPE, SlimefunItem.PORTABLE_TOOL_BENCH);
		}
		if (plugin.getConfig().getBoolean("items.pJukebox")) {
			Slimefun.registerItem(SlimefunItem.PORTABLE_JUKEBOX, Category.Portable(), GuideItems.pJB(), RecipeType.BOOK_BINDER_RECIPE, SlimefunItem.PORTABLE_JUKEBOX);
		}
		if (plugin.getConfig().getBoolean("items.tomeofhomeland")) {
			Slimefun.registerItem(SlimefunItem.TOME_OF_HOMELAND, Category.MagicUtils(), GuideItems.TomeofHomeland(), RecipeType.BOOK_BINDER_RECIPE, SlimefunItem.TOME_OF_HOMELAND);
		}
		if (plugin.getConfig().getBoolean("items.iTome")) {
			Slimefun.registerItem(SlimefunItem.INVISIBLE_TOME, Category.MagicUtils(), GuideItems.iTome(), RecipeType.BOOK_BINDER_RECIPE, SlimefunItem.INVISIBLE_TOME);
		}
		if (plugin.getConfig().getBoolean("items.BookoTeleporting")) {
			Slimefun.registerItem(SlimefunItem.BOOK_O_TELEPORTING, Category.MagicUtils(), GuideItems.BookoTeleporting(), RecipeType.BOOK_BINDER_RECIPE, SlimefunItem.BOOK_O_TELEPORTING);
		}
		if (plugin.getConfig().getBoolean("items.simplecircuitboard")) {
			Slimefun.registerItem(SlimefunItem.SIMPLE_CIRCUIT_BOARD, Category.Electric(), null, RecipeType.DROP_BY_IRON_GOLEM, SlimefunItem.SIMPLE_CIRCUIT_BOARD);
		}
		if (plugin.getConfig().getBoolean("items.advancedcircuitboard")) {
			Slimefun.registerItem(SlimefunItem.ADVANCED_CIRCUIT_BOARD, Category.Electric(), GuideItems.aCircuitboard(), RecipeType.SHAPED_RECIPE, SlimefunItem.ADVANCED_CIRCUIT_BOARD);
		}
		if (plugin.getConfig().getBoolean("items.Smeltery")) {
			Slimefun.registerItem(SlimefunItem.SMELTERY, Category.Smelting(),GuideItems.smelt() , RecipeType.MULTIBLOCK, SlimefunItem.SMELTERY);
		}
		if (plugin.getConfig().getBoolean("items.steelingot")) {
			Slimefun.registerItem(SlimefunItem.STEEL_INGOT, Category.Smelting(), GuideItems.steel(), RecipeType.SMELTERY, SlimefunItem.STEEL_INGOT);
		}
		if (plugin.getConfig().getBoolean("items.MinersCompass")) {
			Slimefun.registerItem(SlimefunItem.MINERS_COMPASS, Category.MagicUtils(),GuideItems.compass() , RecipeType.SHAPED_RECIPE, SlimefunItem.MINERS_COMPASS);
		}
		if (plugin.getConfig().getBoolean("items.steelthruster")) {
			Slimefun.registerItem(SlimefunItem.STEEL_THRUSTER, Category.Materials(), GuideItems.steelthruster(), RecipeType.SHAPED_RECIPE, SlimefunItem.STEEL_THRUSTER);
		}
		if (plugin.getConfig().getBoolean("items.SteelPlate")) {
			Slimefun.registerItem(SlimefunItem.STEEL_PLATE, Category.Materials(), GuideItems.steelplate(), RecipeType.SHAPED_RECIPE, SlimefunItem.STEEL_PLATE);
		}
		if (plugin.getConfig().getBoolean("items.parachute")) {
			Slimefun.registerItem(SlimefunItem.PARACHUTE, Category.Gear(), GuideItems.parachute(), RecipeType.SHAPED_RECIPE, SlimefunItem.PARACHUTE);
		}
		if (plugin.getConfig().getBoolean("items.chain")) {
			Slimefun.registerItem(SlimefunItem.CHAIN, Category.Materials(), GuideItems.chain(), RecipeType.SHAPELESS_RECIPE, SlimefunItem.CHAIN);
		}
		if (plugin.getConfig().getBoolean("items.hook")) {
			Slimefun.registerItem(SlimefunItem.HOOK, Category.Materials(), GuideItems.hook(), RecipeType.SHAPED_RECIPE, SlimefunItem.HOOK);
		}
		if (plugin.getConfig().getBoolean("items.grappling-hook")) {
			Slimefun.registerItem(SlimefunItem.GRAPPLING_HOOK, Category.Gear(), GuideItems.GrapplingHook(), RecipeType.SHAPED_RECIPE, GuideItems.GrapplingHookOutput());
		}
		if (plugin.getConfig().getBoolean("items.jetpack")) {
			Slimefun.registerItem(SlimefunItem.JETPACK, Category.Gear(), GuideItems.Jetpack(), RecipeType.SHAPED_RECIPE, GuideItems.JetpackOutput());
			FuelHandler.registerFuelContainer(SlimefunItem.JETPACK);
		}
		if (plugin.getConfig().getBoolean("items.MultiTool")) {
			Slimefun.registerItem(SlimefunItem.MULTI_TOOL_MODE_NONE, Category.Gear(), GuideItems.MultiTool(), RecipeType.SHAPED_RECIPE, GuideItems.MTOutput());
			FuelHandler.registerFuelContainer(SlimefunItem.MULTI_TOOL_MODE_ARROW_CANNON);
			FuelHandler.registerFuelContainer(SlimefunItem.MULTI_TOOL_MODE_ENDER_BACKPACK);
			FuelHandler.registerFuelContainer(SlimefunItem.MULTI_TOOL_MODE_GRAPPLING_HOOK);
			FuelHandler.registerFuelContainer(SlimefunItem.MULTI_TOOL_MODE_MAGIC_EYE_OF_ENDER);
			FuelHandler.registerFuelContainer(SlimefunItem.MULTI_TOOL_MODE_NONE);
			FuelHandler.registerFuelContainer(SlimefunItem.MULTI_TOOL_MODE_PORTABLE_CRAFTER);
			FuelHandler.registerFuelContainer(SlimefunItem.MULTI_TOOL_MODE_WRENCH);
		}
		if (plugin.getConfig().getBoolean("items.Emerald-of-Repairing")) {
			Slimefun.registerItem(SlimefunItem.EMERALD_OF_REPAIRING, Category.CrystalsAndGems(), GuideItems.Erepairing(), RecipeType.SHAPED_RECIPE, SlimefunItem.EMERALD_OF_REPAIRING);
		}
		if (plugin.getConfig().getBoolean("items.CrystalOfRepairing")) {
			Slimefun.registerItem(SlimefunItem.CRYSTAL_OF_REPAIRING, Category.CrystalsAndGems(), GuideItems.Crepairing(), RecipeType.SHAPED_RECIPE, SlimefunItem.CRYSTAL_OF_REPAIRING);
		}
		if (plugin.getConfig().getBoolean("items.EnderCrystalOfRepairing")) {
			Slimefun.registerItem(SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING, Category.CrystalsAndGems(), GuideItems.ECrepairing(), RecipeType.SHAPED_RECIPE, SlimefunItem.ENDER_CRYSTAL_OF_REPAIRING);
		}
		if (plugin.getConfig().getBoolean("items.Diamond-of-Duplicating")) {
			Slimefun.registerItem(SlimefunItem.DIAMOND_OF_DUPLICATING, Category.CrystalsAndGems(), GuideItems.Diamonddupe(), RecipeType.SHAPED_RECIPE, SlimefunItem.DIAMOND_OF_DUPLICATING);
		}
		if (plugin.getConfig().getBoolean("items.NanoFocus")) {
			Slimefun.registerItem(SlimefunItem.NANO_FOCUS, Category.Materials(), GuideItems.NanoFocus(), RecipeType.SHAPED_RECIPE, SlimefunItem.NANO_FOCUS);
		}
		if (plugin.getConfig().getBoolean("items.NanoHoe")) {
			Slimefun.registerItem(SlimefunItem.NANO_HOE, Category.Tools(), GuideItems.NanoHoe(), RecipeType.SHAPED_RECIPE, SlimefunItem.NANO_HOE);
		}
		if (plugin.getConfig().getBoolean("items.NanoPickaxe")) {
			Slimefun.registerItem(SlimefunItem.NANO_PICKAXE, Category.Tools(), GuideItems.NanoPick(), RecipeType.SHAPED_RECIPE, SlimefunItem.NANO_PICKAXE);
		}
		if (plugin.getConfig().getBoolean("items.nanoaxel")) {
			Slimefun.registerItem(SlimefunItem.NANO_AXEL, Category.Tools(), GuideItems.NanoAxel(), RecipeType.SHAPED_RECIPE, SlimefunItem.NANO_AXEL);
		}
		if (plugin.getConfig().getBoolean("items.Nanosaber")) {
			Slimefun.registerItem(SlimefunItem.NANO_SABER, Category.Weaponry(), GuideItems.NanoSaber(), RecipeType.SHAPED_RECIPE, SlimefunItem.NANO_SABER);
		}
		if (plugin.getConfig().getBoolean("items.NanoHelmet")) {
			Slimefun.registerItem(SlimefunItem.NANO_HELMET, Category.ArmorCrafting(), GuideItems.NHelmet(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.NANO_HELMET);
		}
		if (plugin.getConfig().getBoolean("items.NanoChestplate")) {
			Slimefun.registerItem(SlimefunItem.NANO_CHESTPLATE, Category.ArmorCrafting(), GuideItems.NChest(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.NANO_CHESTPLATE);
		}
		if (plugin.getConfig().getBoolean("items.NanoLeggings")) {
			Slimefun.registerItem(SlimefunItem.NANO_LEGGINGS, Category.ArmorCrafting(), GuideItems.NLegs(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.NANO_LEGGINGS);
		}
		if (plugin.getConfig().getBoolean("items.NanoBoots")) {
			Slimefun.registerItem(SlimefunItem.NANO_BOOTS, Category.ArmorCrafting(), GuideItems.NBoots(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.NANO_BOOTS);
		}
		if (plugin.getConfig().getBoolean("items.QuantumHelmet")) {
			Slimefun.registerItem(SlimefunItem.QUANTUM_HELMET, Category.ArmorCrafting(), GuideItems.QHelmet(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.QUANTUM_HELMET);
		}
		if (plugin.getConfig().getBoolean("items.QuantumChestplate")) {
			Slimefun.registerItem(SlimefunItem.QUANTUM_CHESTPLATE, Category.ArmorCrafting(), GuideItems.QChest(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.QUANTUM_CHESTPLATE);
		}
		if (plugin.getConfig().getBoolean("items.QuantumLeggings")) {
			Slimefun.registerItem(SlimefunItem.QUANTUM_LEGGINGS, Category.ArmorCrafting(), GuideItems.QLegs(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.QUANTUM_LEGGINGS);
		}
		if (plugin.getConfig().getBoolean("items.QuantumBoots")) {
			Slimefun.registerItem(SlimefunItem.QUANTUM_BOOTS, Category.ArmorCrafting(), GuideItems.QBoots(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.QUANTUM_BOOTS);
		}
		if (plugin.getConfig().getBoolean("items.UberHelmet")) {
			Slimefun.registerItem(SlimefunItem.UBER_HELMET, Category.ArmorCrafting(), GuideItems.UHelmet(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.UBER_HELMET);
		}
		if (plugin.getConfig().getBoolean("items.UberChestplate")) {
			Slimefun.registerItem(SlimefunItem.UBER_CHESTPLATE, Category.ArmorCrafting(), GuideItems.UChest(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.UBER_CHESTPLATE);
		}
		if (plugin.getConfig().getBoolean("items.UberLeggings")) {
			Slimefun.registerItem(SlimefunItem.UBER_LEGGINGS, Category.ArmorCrafting(), GuideItems.ULegs(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.UBER_LEGGINGS);
		}
		if (plugin.getConfig().getBoolean("items.UberBoots")) {
			Slimefun.registerItem(SlimefunItem.UBER_BOOTS, Category.ArmorCrafting(), GuideItems.UBoots(), RecipeType.TOOL_BENCH_RECIPE, SlimefunItem.UBER_BOOTS);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.glider")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_GLIDER, Category.UberUpgrades(), GuideItems.UUC_Glider(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_GLIDER);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.jetpack")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_JETPACK, Category.UberUpgrades(), GuideItems.UUC_Jetpack(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_JETPACK);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.KineticLegs")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_KINETIC_LEGS, Category.UberUpgrades(), GuideItems.UUC_KineticLegs(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_KINETIC_LEGS);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.jumpassist")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_JUMP_ASSIST, Category.UberUpgrades(), GuideItems.UUC_JumpAssist(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_JUMP_ASSIST);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.nightvision")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_NIGHT_VISION_GOGGLES, Category.UberUpgrades(), GuideItems.UUC_NightVision(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_NIGHT_VISION_GOGGLES);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.scuba")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_SCUBA_HELMET, Category.UberUpgrades(), GuideItems.UUC_Scuba(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_SCUBA_HELMET);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.longfall")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_LONG_FALL, Category.UberUpgrades(), GuideItems.UUC_LongFall(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_LONG_FALL);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.enderfake")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_ENDER_FAKE, Category.UberUpgrades(), GuideItems.UUC_EnderFake(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_ENDER_FAKE);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.climb")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_CLIMB, Category.UberUpgrades(), GuideItems.UUC_CLIMB(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_CLIMB);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.repair")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_REPAIR, Category.UberUpgrades(), GuideItems.UUC_Repair(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_REPAIR);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.disco")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_DISCO, Category.UberUpgrades(), GuideItems.UUC_Disco(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_DISCO);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.ArrowReflector")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_ARROW_REFLECTOR, Category.UberUpgrades(), GuideItems.UUC_Arrow_Reflector(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_ARROW_REFLECTOR);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.fire-resistance")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_FIRE_RESISTANCE, Category.UberUpgrades(), GuideItems.UUC_Fire_Resistance(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_FIRE_RESISTANCE);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.regeneration")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_REGENERATION, Category.UberUpgrades(), GuideItems.UUC_Regeneration(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_REGENERATION);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.resistance")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_RESISTANCE, Category.UberUpgrades(), GuideItems.UUC_Resistance(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_RESISTANCE);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.absorption")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_ABSORPTION, Category.UberUpgrades(), GuideItems.UUC_Absorption(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_ABSORPTION);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.milk-module")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_MILK_MODULE, Category.UberUpgrades(), GuideItems.UUC_Milk_Module(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_MILK_MODULE);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.strength")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_STRENGTH, Category.UberUpgrades(), GuideItems.UUC_Strength(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_STRENGTH);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.double-jump")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_DOUBLE_JUMP, Category.UberUpgrades(), GuideItems.UUC_Double_Jump(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_DOUBLE_JUMP);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.fast-digging")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_FAST_DIGGING, Category.UberUpgrades(), GuideItems.UUC_Fast_Digging(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_FAST_DIGGING);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.feeder")) {
			Slimefun.registerItem(SlimefunItem.UBER_UPGRADE_FEEDER, Category.UberUpgrades(), GuideItems.UUC_Feeder(), RecipeType.BLACKSMITH, SlimefunItem.UBER_UPGRADE_FEEDER);
		}
		if (plugin.getConfig().getBoolean("items.OreWasher")) {
			Slimefun.registerItem(SlimefunItem.ORE_WASHER, Category.Smelting(), GuideItems.OreWasher(), RecipeType.MULTIBLOCK, SlimefunItem.ORE_WASHER);
		}
		if (plugin.getConfig().getBoolean("items.IronChunk")) {
			Slimefun.registerItem(SlimefunItem.IRON_CHUNK, Category.Smelting(), GuideItems.IronChunkRecipe(), RecipeType.ORE_WASHER, GuideItems.IronChunkOutput());
		}
		if (plugin.getConfig().getBoolean("items.GoldChunk")) {
			Slimefun.registerItem(SlimefunItem.GOLD_CHUNK, Category.Smelting(), GuideItems.GoldChunkRecipe(), RecipeType.ORE_WASHER, GuideItems.GoldChunkOutput());
		}
		if (plugin.getConfig().getBoolean("items.GoldenFeather")) {
			Slimefun.registerItem(SlimefunItem.GOLDEN_FEATHER, Category.MagicUtils(), GuideItems.GFRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.GOLDEN_FEATHER);
		}
		if (plugin.getConfig().getBoolean("items.PortableHole")) {
			Slimefun.registerItem(SlimefunItem.PORTABLE_HOLE, Category.MagicUtils(), GuideItems.HoleRecipe(), RecipeType.SHAPED_RECIPE, GuideItems.HoleOutput());
		}
		if (plugin.getConfig().getBoolean("items.QuantumFocus")) {
			Slimefun.registerItem(SlimefunItem.QUANTUM_FOCUS, Category.Materials(), GuideItems.QuantumFocus(), RecipeType.SHAPED_RECIPE, SlimefunItem.QUANTUM_FOCUS);
		}
		if (plugin.getConfig().getBoolean("items.UberFocus")) {
			Slimefun.registerItem(SlimefunItem.UBER_FOCUS, Category.Materials(), GuideItems.UberFocus(), RecipeType.SHAPED_RECIPE, SlimefunItem.UBER_FOCUS);
		}
		if (plugin.getConfig().getBoolean("items.UberAxe")) {
			Slimefun.registerItem(SlimefunItem.UBER_AXE, Category.Tools(), GuideItems.UberAxeRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.UBER_AXE);
		}
		if (plugin.getConfig().getBoolean("items.AmuletOfRevival")) {
			Slimefun.registerItem(SlimefunItem.AMULET_OF_REVIVAL, Category.CrystalsAndGems(), GuideItems.AmuletRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.AMULET_OF_REVIVAL);
		}
		if (plugin.getConfig().getBoolean("items.UberPickaxe")) {
			Slimefun.registerItem(SlimefunItem.UBER_PICKAXE, Category.Tools(), GuideItems.UberPickaxeRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.UBER_PICKAXE);
		}
		if (plugin.getConfig().getBoolean("items.Battery")) {
			Slimefun.registerItem(SlimefunItem.BATTERY, Category.Electric(), GuideItems.BatteryRecipe(), RecipeType.SHAPED_RECIPE, SlimefunItem.BATTERY);
		}
		if (plugin.getConfig().getBoolean("items.SolarPanel")) {
			Slimefun.registerItem(SlimefunItem.SOLAR_PANEL, Category.Machines(), GuideItems.SolarPanelRecipe(), RecipeType.MULTIBLOCK, SlimefunItem.SOLAR_PANEL);
		}
		if (plugin.getConfig().getBoolean("items.WaterMill")) {
			Slimefun.registerItem(SlimefunItem.WATER_MILL, Category.Machines(), GuideItems.WaterMillRecipe(), RecipeType.MULTIBLOCK, SlimefunItem.WATER_MILL);
		}
		if (plugin.getConfig().getBoolean("items.ThermalGenerator")) {
			Slimefun.registerItem(SlimefunItem.THERMAL_GENERATOR, Category.Machines(), GuideItems.ThermalGeneratorRecipe(), RecipeType.MULTIBLOCK, SlimefunItem.THERMAL_GENERATOR);
		}
		if (plugin.getConfig().getBoolean("items.ElectricFurnace")) {
			Slimefun.registerItem(SlimefunItem.ELECTRIC_FURNACE, Category.Machines(), GuideItems.ElectricFurnaceRecipe(), RecipeType.MULTIBLOCK, SlimefunItem.ELECTRIC_FURNACE);
		}
		if (plugin.getConfig().getBoolean("items.RefuelingStation")) {
			Slimefun.registerItem(SlimefunItem.REFUELING_STATION, Category.Machines(), GuideItems.RefuelingStationRecipe(), RecipeType.MULTIBLOCK, SlimefunItem.REFUELING_STATION);
		}
	}
}
