package me.mrCookieSlime.Slimefun.Setup;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Commands.CommandAliases;
import me.mrCookieSlime.Slimefun.Items.SlimefunGuide;
import me.mrCookieSlime.Slimefun.Listeners.VillagerListener;
import me.mrCookieSlime.Slimefun.Listeners.Armor.EnderArmorListener;
import me.mrCookieSlime.Slimefun.Listeners.Armor.NanoSuitListener;
import me.mrCookieSlime.Slimefun.Listeners.Armor.QuantumarmorListener;
import me.mrCookieSlime.Slimefun.Listeners.Armor.SlimeSuitListener;
import me.mrCookieSlime.Slimefun.Listeners.Armor.UberArmorListener;
import me.mrCookieSlime.Slimefun.Listeners.Blocks.ArmorCraftListener;
import me.mrCookieSlime.Slimefun.Listeners.Blocks.ToolBenchListener;
import me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks.BookBinderListener;
import me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks.OreWasherListener;
import me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks.SmelteryListener;
import me.mrCookieSlime.Slimefun.Listeners.Drops.SimpleCircuitBoardDropListener;
import me.mrCookieSlime.Slimefun.Listeners.Food.FortuneCookieListener;
import me.mrCookieSlime.Slimefun.Listeners.Food.MagicSugarListener;
import me.mrCookieSlime.Slimefun.Listeners.Food.PartiallyGoldenAppleListener;
import me.mrCookieSlime.Slimefun.Listeners.Food.SuperMeatListener;
import me.mrCookieSlime.Slimefun.Listeners.Food.UberMeatListener;
import me.mrCookieSlime.Slimefun.Listeners.Gear.GrapplingHookListener;
import me.mrCookieSlime.Slimefun.Listeners.Gear.JetpackListener;
import me.mrCookieSlime.Slimefun.Listeners.Gear.MultiToolListener;
import me.mrCookieSlime.Slimefun.Listeners.Gear.ParachuteListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.AmuletOfRevivalListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.BookoTeleportingListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.CircuitBoardListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.CrystalOfRepairingListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.DiamondOfDuplicatingListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.EmeraldOfRepairingListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.EnderBackpackListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.GoldenFeatherListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.MagicEnderEyeListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.MinersCompassListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.NanoAxelListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.NanoHoeListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.NanoPickaxeListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.NanoSaberListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.PortableCrafterListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.PortableEnchanterListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.PortableHoleListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.PortableJukeboxListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.PortabledustbinListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.SpawnVillagers;
import me.mrCookieSlime.Slimefun.Listeners.Items.SwordOfBeheadingListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.TomeofHomelandListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.UberAxeListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.UberPickaxeListener;
import me.mrCookieSlime.Slimefun.Listeners.Items.iTomeListener;
import me.mrCookieSlime.Slimefun.Listeners.Player.WelcomeListener;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.AbsorptionUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.ArrowReflectorUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.ClimbUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.DiscoUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.DoubleJumpUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.EnderFakeUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.FastDiggingUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.FeederUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.FireResistanceUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.GliderUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.JetpackUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.JumpAssistUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.KineticLegsUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.LongFallUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.MilkModuleUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.NightVisionUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.RegenerationUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.RepairUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.ResistanceUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.ScubaUpgrade;
import me.mrCookieSlime.Slimefun.Listeners.UberUpgrades.StrengthUpgrade;
import me.mrCookieSlime.Slimefun.WorldGenerators.HutGenerator;

public class Classes {
	
	public static startup plugin;
	
	public static void setup(startup instance) {
		
		plugin = instance;
		
		new WelcomeListener(plugin);
		new NanoSuitListener(plugin);
		new QuantumarmorListener(plugin);
		new SlimeSuitListener(plugin);
		new EnderArmorListener(plugin);
		new UberArmorListener(plugin);
		new CircuitBoardListener(plugin);
		new CommandAliases(plugin);
		new SpawnVillagers(plugin);
		
		if (plugin.getConfig().getBoolean("items.NanoPickaxe") == true) {
			new NanoPickaxeListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.iTome") == true) {
			new iTomeListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.BookoTeleporting") == true) {
			new BookoTeleportingListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.Dustbin") == true) {
			new PortabledustbinListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.Enderbackpack") == true) {
			new EnderBackpackListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.pEnchanter") == true) {
			new PortableEnchanterListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.pCrafter") == true) {
			new PortableCrafterListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.SuperMeat") == true) {
			new SuperMeatListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.NanoHoe") == true) {
			new NanoHoeListener(plugin);
	    }
		if (plugin.getConfig().getBoolean("items.Nanosaber") == true) {
			new NanoSaberListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.ToolBench") == true) {
			new ToolBenchListener(plugin);
			new ArmorCraftListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.pBookBinder") == true) {
			new BookBinderListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.simplecircuitboard") == true) {
			new SimpleCircuitBoardDropListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.tomeofhomeland") == true) {
			new TomeofHomelandListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.jetpack") == true) {
			new JetpackListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.pJukebox") == true) {
			new PortableJukeboxListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.nanoaxel") == true) {
			new NanoAxelListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.magic-eye-of-ender") == true) {
			new MagicEnderEyeListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.parachute") == true) {
			new ParachuteListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.ubermeat") == true) {
			new UberMeatListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.PartiallyGoldenApple") == true) {
			new PartiallyGoldenAppleListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.MagicSugar") == true) {
			new MagicSugarListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.CrystalOfRepairing") == true) {
			new CrystalOfRepairingListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.Sword-of-Beheading") == true) {
			new SwordOfBeheadingListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.MultiTool") == true) {
			new MultiToolListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.Smeltery") == true) {
			new SmelteryListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.fortune-cookie") == true) {
			new FortuneCookieListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.grappling-hook") == true) {
			new GrapplingHookListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.Emerald-of-Repairing") == true) {
			new EmeraldOfRepairingListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.Diamond-of-Duplicating") == true) {
			new DiamondOfDuplicatingListener(plugin);
		}
		if (plugin.getConfig().getBoolean("mobs.villagers.merchant") == true) {
			new VillagerListener(plugin);
		}
		if (plugin.getConfig().getBoolean("structures.huts") == true) {
			new HutGenerator(plugin);
		}
		if (plugin.getConfig().getBoolean("items.guide") == true) {
			new SlimefunGuide(plugin);
		}
		if (plugin.getConfig().getBoolean("items.MinersCompass") == true) {
			new MinersCompassListener(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.glider")) {
			new GliderUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.jetpack")) {
			new JetpackUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.KineticLegs")) {
			new KineticLegsUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.jumpassist")) {
			new JumpAssistUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.scuba")) {
			new ScubaUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.nightvision")) {
			new NightVisionUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.longfall")) {
			new LongFallUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.enderfake")) {
			new EnderFakeUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.climb")) {
			new ClimbUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.repair")) {
			new RepairUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.disco")) {
			new DiscoUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.ArrowReflector")) {
			new ArrowReflectorUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.fire-resistance")) {
			new FireResistanceUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.regeneration")) {
			new RegenerationUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.resistance")) {
			new ResistanceUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.absorption")) {
			new AbsorptionUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.milk-module")) {
			new MilkModuleUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.strength")) {
			new StrengthUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.double-jump")) {
			new DoubleJumpUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.fast-digging")) {
			new FastDiggingUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("armor.uber.upgrades.feeder")) {
			new FeederUpgrade(plugin);
		}
		if (plugin.getConfig().getBoolean("items.OreWasher")) {
			new OreWasherListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.GoldenFeather")) {
			new GoldenFeatherListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.PortableHole")) {
			new PortableHoleListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.UberAxe")) {
			new UberAxeListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.AmuletOfRevival")) {
			new AmuletOfRevivalListener(plugin);
		}
		if (plugin.getConfig().getBoolean("items.UberPickaxe")) {
			new UberPickaxeListener(plugin);
		}
	}

}
