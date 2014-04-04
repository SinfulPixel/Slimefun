package me.mrCookieSlime.Slimefun.Items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GuideItems {
	
	public static List<ItemStack> GoldChunkRecipe() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		items.add(new ItemStack(Material.GOLD_ORE));
		
		return items;
	}
	
	public static ItemStack GoldChunkOutput() {
		ItemStack item = SlimefunItem.GOLD_CHUNK.clone();
		
		item.setAmount(2);
		item = ItemModifier.setLore(item, ChatColor.GREEN + "With a 50% Chance to give 1 Extra");
		
		return item;
	}
	
	public static List<ItemStack> IronChunkRecipe() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		items.add(new ItemStack(Material.IRON_ORE));
		
		return items;
	}
	public static ItemStack IronChunkOutput() {
		ItemStack item = SlimefunItem.IRON_CHUNK.clone();
		
		item.setAmount(2);
		item = ItemModifier.setLore(item, ChatColor.GREEN + "With a 50% Chance to give 1 Extra");
		
		return item;
	}
	
	public static List<ItemStack> OreWasher() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		items.add(new ItemStack(Material.IRON_BLOCK));
		items.add(new ItemStack(Material.FURNACE));
		items.add(new ItemStack(Material.IRON_BLOCK));
		items.add(null);
		items.add(new ItemStack(Material.WATER));
		items.add(null);
		
		return items;
	}
	
	public static List<ItemStack> SwordHead() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack wither = new ItemStack(Material.SKULL_ITEM);
		wither.setDurability((short) 1);
		
		items.add(null);
		items.add(wither);
		items.add(null);
		items.add(null);
		items.add(wither);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Double_Jump() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(56);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Fast_Digging() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(50);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Feeder() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(60);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Strength() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(36);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Milk_Module() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(26);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Absorption() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(2);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Resistance() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(22);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Regeneration() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(2);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Fire_Resistance() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(60);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Arrow_Reflector() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(36);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Disco() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(20);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Repair() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(56);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_CLIMB() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(16);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_EnderFake() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(60);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_LongFall() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(60);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_NightVision() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(40);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Scuba() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(40);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_JumpAssist() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(50);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_KineticLegs() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(50);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Jetpack() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(64);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.SLIME_GEM.clone();
		item2.setAmount(16);
		items.add(item2);
		
		return items;
	}
	
	public static List<ItemStack> UUC_Glider() {
		List<ItemStack> items = new ArrayList<ItemStack>();
		
		ItemStack item = SlimefunItem.SLIME_GEM.clone();
		item.setAmount(60);
		items.add(item);
		
		return items;
	}
	
	public static List<ItemStack> UHelmet(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.IRON_BLOCK, 5));
		items.add(new ItemStack(Material.GHAST_TEAR, 8));
		
		ItemStack item = SlimefunItem.ADVANCED_CIRCUIT_BOARD.clone();
		item.setAmount(4);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.STEEL_PLATE.clone();
		item2.setAmount(1);
		items.add(item2);
		
		ItemStack item3 = SlimefunItem.UBER_FOCUS.clone();
		item3.setAmount(4);
		items.add(item3);
		
		return items;
	}
	
	public static List<ItemStack> UChest(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.IRON_BLOCK, 8));
		items.add(new ItemStack(Material.GHAST_TEAR, 10));
		
		ItemStack item = SlimefunItem.ADVANCED_CIRCUIT_BOARD.clone();
		item.setAmount(4);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.STEEL_PLATE.clone();
		item2.setAmount(2);
		items.add(item2);
		
		ItemStack item3 = SlimefunItem.UBER_FOCUS.clone();
		item3.setAmount(4);
		items.add(item3);
		
		return items;
	}
	
	public static List<ItemStack> UBoots(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.IRON_BLOCK, 4));
		items.add(new ItemStack(Material.GHAST_TEAR, 6));
		
		ItemStack item = SlimefunItem.ADVANCED_CIRCUIT_BOARD.clone();
		item.setAmount(4);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.STEEL_PLATE.clone();
		item2.setAmount(1);
		items.add(item2);
		
		ItemStack item3 = SlimefunItem.UBER_FOCUS.clone();
		item3.setAmount(4);
		items.add(item3);
		
		return items;
	}
	
	public static List<ItemStack> ULegs(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.IRON_BLOCK, 7));
		items.add(new ItemStack(Material.GHAST_TEAR, 9));
		
		ItemStack item = SlimefunItem.ADVANCED_CIRCUIT_BOARD.clone();
		item.setAmount(4);
		items.add(item);
		
		ItemStack item2 = SlimefunItem.STEEL_PLATE.clone();
		item2.setAmount(2);
		items.add(item2);
		
		ItemStack item3 = SlimefunItem.UBER_FOCUS.clone();
		item3.setAmount(4);
		items.add(item3);
		
		return items;
	}
	
	public static List<ItemStack> QHelmet(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		ItemStack item = SlimefunItem.QUANTUM_FOCUS.clone();
		item.setAmount(2);
		items.add(item);
		items.add(new ItemStack(Material.IRON_BLOCK, 2));
		items.add(SlimefunItem.SIMPLE_CIRCUIT_BOARD);
		return items;
	}

	public static List<ItemStack> QChest(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		ItemStack item = SlimefunItem.QUANTUM_FOCUS.clone();
		item.setAmount(2);
		items.add(item);
		items.add(new ItemStack(Material.IRON_BLOCK, 5));
		items.add(SlimefunItem.SIMPLE_CIRCUIT_BOARD);
		return items;
	}
	
	public static List<ItemStack> QLegs(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		ItemStack item = SlimefunItem.QUANTUM_FOCUS.clone();
		item.setAmount(2);
		items.add(item);
		items.add(new ItemStack(Material.IRON_BLOCK, 4));
		items.add(SlimefunItem.SIMPLE_CIRCUIT_BOARD);
		return items;
	}
	
	public static List<ItemStack> QBoots(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		ItemStack item = SlimefunItem.QUANTUM_FOCUS.clone();
		item.setAmount(2);
		items.add(item);
		items.add(new ItemStack(Material.IRON_BLOCK, 2));
		items.add(SlimefunItem.SIMPLE_CIRCUIT_BOARD);
		return items;
	}
	
	public static List<ItemStack> NHelmet(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.OBSIDIAN, 4));
		items.add(SlimefunItem.NANO_FOCUS);
		return items;
	}
	
	public static List<ItemStack> NChest(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.OBSIDIAN, 7));
		items.add(SlimefunItem.NANO_FOCUS);
		return items;
	}
	
	public static List<ItemStack> NLegs(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.OBSIDIAN, 6));
		items.add(SlimefunItem.NANO_FOCUS);
		return items;
	}
	
	public static List<ItemStack> NBoots(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.OBSIDIAN, 4));
		items.add(SlimefunItem.NANO_FOCUS);
		return items;
	}
	
	public static List<ItemStack> NanoFocus(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(null);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(new ItemStack(Material.NETHER_STAR));
		items.add(new ItemStack(Material.DIAMOND));
		items.add(null);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> QuantumFocus(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(SlimefunItem.STEEL_PLATE);
		items.add(null);
		items.add(SlimefunItem.STEEL_PLATE);
		items.add(SlimefunItem.NANO_FOCUS);
		items.add(SlimefunItem.STEEL_PLATE);
		items.add(null);
		items.add(SlimefunItem.STEEL_PLATE);
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> UberFocus(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.STEEL_PLATE);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.STEEL_PLATE);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.QUANTUM_FOCUS);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.STEEL_PLATE);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.STEEL_PLATE);
		return items;
	}
	
	public static List<ItemStack> NanoSaber(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.DIAMOND_SWORD));
		items.add(null);
		items.add(null);
		items.add(SlimefunItem.NANO_FOCUS);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> NanoAxel(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.DIAMOND_SPADE));
		items.add(SlimefunItem.NANO_FOCUS);
		items.add(new ItemStack(Material.DIAMOND_AXE));
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> NanoPick(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.DIAMOND_PICKAXE));
		items.add(SlimefunItem.NANO_FOCUS);
		items.add(new ItemStack(Material.DIAMOND_PICKAXE));
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> NanoHoe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.DIAMOND_HOE));
		items.add(SlimefunItem.NANO_FOCUS);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> Diamonddupe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(new ItemStack(Material.NETHER_STAR));
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		return items;
	}
	
	public static List<ItemStack> ECrepairing(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.ENDER_BACKPACK);
		items.add(new ItemStack(Material.EYE_OF_ENDER));
		items.add(SlimefunItem.ENDER_BACKPACK);
		items.add(SlimefunItem.ENDER_LUMP_3);
		items.add(SlimefunItem.CRYSTAL_OF_REPAIRING);
		items.add(SlimefunItem.ENDER_LUMP_3);
		items.add(SlimefunItem.ENDER_BACKPACK);
		items.add(new ItemStack(Material.EYE_OF_ENDER));
		items.add(SlimefunItem.ENDER_BACKPACK);
		return items;
	}
	
	public static List<ItemStack> Crepairing(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GLOWSTONE_DUST));
		items.add(new ItemStack(Material.EYE_OF_ENDER));
		items.add(new ItemStack(Material.GLOWSTONE_DUST));
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(new ItemStack(Material.NETHER_STAR));
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(new ItemStack(Material.GLOWSTONE_DUST));
		items.add(new ItemStack(Material.EYE_OF_ENDER));
		items.add(new ItemStack(Material.GLOWSTONE_DUST));
		return items;
	}
	
	public static List<ItemStack> Erepairing(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		items.add(null);
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		items.add(new ItemStack(Material.EMERALD));
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		items.add(null);
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> MultiTool(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.ADVANCED_CIRCUIT_BOARD);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(SlimefunItem.ADVANCED_CIRCUIT_BOARD);
		items.add(new ItemStack(Material.DIAMOND));
		return items;
	}
	
	public static List<ItemStack> Jetpack(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.ADVANCED_CIRCUIT_BOARD);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_THRUSTER);
		items.add(new ItemStack(Material.REDSTONE_BLOCK));
		items.add(SlimefunItem.STEEL_THRUSTER);
		return items;
	}
	
	public static List<ItemStack> GrapplingHook(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(SlimefunItem.HOOK);
		items.add(null);
		items.add(null);
		items.add(SlimefunItem.CHAIN);
		items.add(null);
		items.add(null);
		items.add(SlimefunItem.CHAIN);
		items.add(null);
		return items;
	}
	
	public static ItemStack GrapplingHookOutput() {
		ItemStack item = SlimefunItem.GRAPPLING_HOOK.clone();
		  item.setAmount(4);
		  return item;
	}
	
	public static List<ItemStack> hook(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(new ItemStack(Material.FLINT));
		items.add(SlimefunItem.STEEL_INGOT);
		return items;
	}
	
	public static List<ItemStack> chain(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		return items;
	}
	
	public static List<ItemStack> parachute(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(new ItemStack(Material.WOOL));
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(new ItemStack(Material.STRING));
		items.add(null);
		items.add(new ItemStack(Material.STRING));
		items.add(null);
		items.add(new ItemStack(Material.STRING));
		return items;
	}
	
	public static List<ItemStack> steelplate(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		return items;
	}
	
	public static List<ItemStack> compass(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		return items;
	}
	
	public static List<ItemStack>steelthruster(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(new ItemStack(Material.LAVA_BUCKET));
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		return items;
	}
	
	public static List<ItemStack>steel(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		ItemStack chunk = SlimefunItem.IRON_CHUNK.clone();
		chunk.setAmount(4);
		items.add(chunk);
		return items;
	}
	
	public static List<ItemStack> smelt(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.FURNACE));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.FIRE));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.NETHERRACK));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> aCircuitboard(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		ItemStack lapis = new ItemStack(Material.INK_SACK);
		lapis.setDurability((short) 4);
		items.add(lapis);
		items.add(lapis);
		items.add(lapis);
		items.add(new ItemStack(Material.REDSTONE));
		items.add(SlimefunItem.SIMPLE_CIRCUIT_BOARD);
		items.add(new ItemStack(Material.REDSTONE));
		items.add(lapis);
		items.add(lapis);
		items.add(lapis);
		return items;
	}
	
	public static List<ItemStack> BookoTeleporting(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.NETHER_STAR, 4));
		items.add(new ItemStack(Material.ENDER_PEARL, 4));
		items.add(new ItemStack(Material.BOOK_AND_QUILL));
		items.add(new ItemStack(Material.EYE_OF_ENDER));
		return items;
	}
	
	public static List<ItemStack> iTome(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GOLDEN_CARROT, 4));
		items.add(new ItemStack(Material.ENDER_PEARL, 4));
		items.add(new ItemStack(Material.BOOK_AND_QUILL));
		return items;
	}
	
	public static List<ItemStack> TomeofHomeland(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.BED, 4));
		items.add(new ItemStack(Material.ENDER_PEARL, 4));
		items.add(new ItemStack(Material.OBSIDIAN, 3));
		items.add(new ItemStack(Material.BOOK_AND_QUILL));
		items.add(new ItemStack(Material.EYE_OF_ENDER));
		return items;
	}
	
	public static List<ItemStack> pJB(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.JUKEBOX, 2));
		items.add(new ItemStack(Material.WOOD, 5));
		items.add(new ItemStack(Material.BOOK_AND_QUILL));
		return items;
	}
	
	public static List<ItemStack> pTB(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.TOOL_BENCH);
		items.add(new ItemStack(Material.STONE, 4));
		items.add(new ItemStack(Material.BOOK));
		return items;
	}
	
	public static List<ItemStack> pBB(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.BOOK, 8));
		items.add(new ItemStack(Material.GOLD_INGOT, 4));
		items.add(new ItemStack(Material.BOOK_AND_QUILL));
		items.add(new ItemStack(Material.WORKBENCH, 2));
		return items;
	}
	
	public static List<ItemStack> Elump3(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.ENDER_LUMP_2);
		items.add(SlimefunItem.ENDER_LUMP_2);
		items.add(SlimefunItem.ENDER_LUMP_2);
		items.add(SlimefunItem.ENDER_LUMP_2);
		return items;
	}
	
	public static List<ItemStack> Elump2(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.ENDER_LUMP_1);
		items.add(SlimefunItem.ENDER_LUMP_1);
		items.add(SlimefunItem.ENDER_LUMP_1);
		items.add(SlimefunItem.ENDER_LUMP_1);
		return items;
	}

	public static List<ItemStack> Elump1(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(null);
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.ENDER_PEARL));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(null);
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> Mlump3(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.MAGICAL_LUMP_2);
		items.add(SlimefunItem.MAGICAL_LUMP_2);
		items.add(SlimefunItem.MAGICAL_LUMP_2);
		items.add(SlimefunItem.MAGICAL_LUMP_2);
		return items;
	}
	
	public static List<ItemStack> Mlump2(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		items.add(SlimefunItem.MAGICAL_LUMP_1);
		return items;
	}

	public static List<ItemStack> Mlump1(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(null);
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.BLAZE_POWDER));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(null);
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> SBootsRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.SLIME_BALL, 4));
		items.add(new ItemStack(Material.IRON_INGOT, 1));
		return items;
	}
	
	public static List<ItemStack> SLegsRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.SLIME_BALL, 6));
		items.add(new ItemStack(Material.IRON_INGOT, 1));
		return items;
	}
	
	public static List<ItemStack> SChestRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.SLIME_BALL, 7));
		items.add(new ItemStack(Material.IRON_INGOT, 1));
		return items;
	}
	
	public static List<ItemStack> SHelmetRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.SLIME_BALL, 4));
		items.add(new ItemStack(Material.IRON_INGOT, 1));
		return items;
	}
	
	public static List<ItemStack> UberMeat(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.MAGIC_SUGAR);
		items.add(SlimefunItem.SUPER_MEAT);
		items.add(SlimefunItem.PARTIALLY_GOLDEN_APPLE);
		return items;
	}
	
	public static List<ItemStack> MagicSugar(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GLOWSTONE_DUST));
		items.add(new ItemStack(Material.SUGAR));
		items.add(new ItemStack(Material.BLAZE_POWDER));
		return items;
	}
	
	public static List<ItemStack> PGAppleRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.APPLE));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		items.add(new ItemStack(Material.GOLD_NUGGET));
		return items;
	}
	
	public static List<ItemStack> EHelmetRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.ENDER_PEARL, 8));
		items.add(new ItemStack(Material.OBSIDIAN, 1));
		items.add(new ItemStack(Material.EYE_OF_ENDER, 4));
		return items;
	}
	public static List<ItemStack> EChestRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.ENDER_PEARL, 12));
		items.add(new ItemStack(Material.OBSIDIAN, 2));
		items.add(new ItemStack(Material.EYE_OF_ENDER, 7));
		return items;
	}
	
	public static List<ItemStack> ELegsRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.ENDER_PEARL, 10));
		items.add(new ItemStack(Material.OBSIDIAN, 1));
		items.add(new ItemStack(Material.EYE_OF_ENDER, 6));
		return items;
	}
	
	public static List<ItemStack> EBootsRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.ENDER_PEARL, 6));
		items.add(new ItemStack(Material.OBSIDIAN, 1));
		items.add(new ItemStack(Material.EYE_OF_ENDER, 3));
		return items;
	}
	
	public static List<ItemStack> MEOERecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GOLD_INGOT));
		items.add(new ItemStack(Material.ENDER_PEARL));
		items.add(new ItemStack(Material.GOLD_INGOT));
		items.add(SlimefunItem.ENDER_LUMP_3);
		items.add(new ItemStack(Material.EYE_OF_ENDER));
		items.add(SlimefunItem.ENDER_LUMP_3);
		items.add(new ItemStack(Material.GOLD_INGOT));
		items.add(new ItemStack(Material.ENDER_PEARL));
		items.add(new ItemStack(Material.GOLD_INGOT));
		return items;
	}
	
	public static List<ItemStack> EnderBackpackRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.BLAZE_POWDER));
		items.add(new ItemStack(Material.ENDER_CHEST));
		items.add(new ItemStack(Material.BLAZE_POWDER));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LEATHER));
		return items;
	}
	
	public static List<ItemStack> GHelmetRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GOLD_INGOT, 2));
		items.add(new ItemStack(Material.GLOWSTONE, 5));
		return items;
	}
	
	public static List<ItemStack> GChestRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GOLD_INGOT, 4));
		items.add(new ItemStack(Material.GLOWSTONE, 8));
		return items;
	}
	
	public static List<ItemStack> GPantsRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GOLD_INGOT, 2));
		items.add(new ItemStack(Material.GLOWSTONE, 7));
		return items;
	}
	
	public static List<ItemStack> GBootsRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.GOLD_INGOT, 2));
		items.add(new ItemStack(Material.GLOWSTONE, 4));
		return items;
	}
	
	public static List<ItemStack> ToolBenchRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.STONE_PICKAXE));
		items.add(new ItemStack(Material.STONE));
		items.add(new ItemStack(Material.STONE_PICKAXE));
		items.add(new ItemStack(Material.STONE));
		items.add(new ItemStack(Material.WORKBENCH));
		items.add(new ItemStack(Material.STONE));
		items.add(new ItemStack(Material.STONE_PICKAXE));
		items.add(new ItemStack(Material.STONE));
		items.add(new ItemStack(Material.STONE_PICKAXE));
		return items;
	}
	
	public static List<ItemStack> DustbinRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.IRON_INGOT));
		items.add(null);
		items.add(new ItemStack(Material.IRON_INGOT));
		items.add(null);
		items.add(new ItemStack(Material.IRON_INGOT));
		items.add(null);
		items.add(new ItemStack(Material.IRON_INGOT));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> pEnchanterRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.BOOK));
		items.add(null);
		items.add(new ItemStack(Material.OBSIDIAN));
		items.add(new ItemStack(Material.DIAMOND));
		items.add(new ItemStack(Material.OBSIDIAN));
		items.add(new ItemStack(Material.OBSIDIAN));
		items.add(new ItemStack(Material.DIAMOND));
		items.add(new ItemStack(Material.OBSIDIAN));
		return items;
	}
	
	public static List<ItemStack> InkRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.DIAMOND));
		items.add(new ItemStack(Material.ENDER_PEARL));
		items.add(new ItemStack(Material.INK_SACK));
		return items;
	}
	
	public static List<ItemStack> SuperMeatRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.COOKED_BEEF));
		items.add(new ItemStack(Material.COOKED_CHICKEN));
		items.add(new ItemStack(Material.GRILLED_PORK));
		return items;
	}
	
	public static List<ItemStack> CookieRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.COOKIE));
		items.add(new ItemStack(Material.PAPER));
		return items;
	}
	
	public static List<ItemStack> BookBinderRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BOOKSHELF));
		items.add(new ItemStack(Material.WORKBENCH));
		items.add(new ItemStack(Material.BOOKSHELF));
		return items;
	}
	
	public static List<ItemStack> pCrafterRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.BOOK));
		items.add(new ItemStack(Material.WORKBENCH));
		return items;
	}
	
	public static List<ItemStack> GMSRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(new ItemStack(Material.LOG));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.LOG));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.LOG));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> GPSRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LOG));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LOG));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LEATHER));
		items.add(new ItemStack(Material.LOG));
		items.add(new ItemStack(Material.LEATHER));
		return items;
	}
	
	public static List<ItemStack> GFRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.GOLD_CHUNK);
		items.add(null);
		items.add(SlimefunItem.GOLD_CHUNK);
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(new ItemStack(Material.FEATHER));
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(SlimefunItem.GOLD_CHUNK);
		items.add(null);
		items.add(SlimefunItem.GOLD_CHUNK);
		return items;
	}
	
	public static ItemStack InkOutput() {
		ItemStack item = SlimefunItem.INK_OF_KNOWLEDGE.clone();
		item.setAmount(16);
		return item;
	}
	
	public static ItemStack HoleOutput() {
		ItemStack item = SlimefunItem.PORTABLE_HOLE.clone();
		item.setAmount(4);
		return item;
	}
	
	public static List<ItemStack> HoleRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.ENDER_LUMP_3);
		items.add(new ItemStack(Material.QUARTZ));
		items.add(SlimefunItem.ENDER_LUMP_3);
		items.add(new ItemStack(Material.QUARTZ));
		items.add(new ItemStack(Material.ENDER_PEARL));
		items.add(new ItemStack(Material.QUARTZ));
		items.add(SlimefunItem.ENDER_LUMP_3);
		items.add(new ItemStack(Material.QUARTZ));
		items.add(SlimefunItem.ENDER_LUMP_3);
		return items;
	}
	public static List<ItemStack> UberAxeRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.UBER_FOCUS);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(null);
		items.add(new ItemStack(Material.DIAMOND));
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> AmuletRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(SlimefunItem.PORTABLE_HOLE);
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(SlimefunItem.PORTABLE_HOLE);
		items.add(SlimefunItem.QUANTUM_FOCUS);
		items.add(SlimefunItem.PORTABLE_HOLE);
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		items.add(SlimefunItem.PORTABLE_HOLE);
		items.add(SlimefunItem.MAGICAL_LUMP_3);
		return items;
	}
	
	public static List<ItemStack> UberPickaxeRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(SlimefunItem.UBER_FOCUS);
		items.add(SlimefunItem.UBER_FOCUS);
		items.add(SlimefunItem.UBER_FOCUS);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> BatteryRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(SlimefunItem.STEEL_INGOT);
		items.add(null);
		items.add(new ItemStack(Material.GOLD_INGOT));
		items.add(new ItemStack(Material.REDSTONE));
		items.add(new ItemStack(Material.GOLD_INGOT));
		items.add(new ItemStack(Material.GOLD_INGOT));
		items.add(new ItemStack(Material.REDSTONE));
		items.add(new ItemStack(Material.GOLD_INGOT));
		return items;
	}
	
	public static List<ItemStack> SolarPanelRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.DAYLIGHT_DETECTOR));
		items.add(new ItemStack(Material.DAYLIGHT_DETECTOR));
		items.add(new ItemStack(Material.DAYLIGHT_DETECTOR));
		items.add(null);
		items.add(new ItemStack(Material.NETHER_FENCE));
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.PISTON_BASE));
		items.add(null);
		return items;
	}
	
	public static List<ItemStack> WaterMillRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.IRON_FENCE));
		items.add(new ItemStack(Material.PISTON_BASE));
		items.add(new ItemStack(Material.IRON_FENCE));
		items.add(new ItemStack(Material.STATIONARY_WATER));
		items.add(new ItemStack(Material.STATIONARY_WATER));
		items.add(new ItemStack(Material.STATIONARY_WATER));
		return items;
	}
	
	public static List<ItemStack> ThermalGeneratorRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.IRON_FENCE));
		items.add(new ItemStack(Material.PISTON_BASE));
		items.add(new ItemStack(Material.IRON_FENCE));
		items.add(new ItemStack(Material.STATIONARY_LAVA));
		items.add(new ItemStack(Material.STATIONARY_LAVA));
		items.add(new ItemStack(Material.STATIONARY_LAVA));
		return items;
	}
	
	public static List<ItemStack> ElectricFurnaceRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.PISTON_BASE));
		items.add(new ItemStack(Material.FURNACE));
		items.add(new ItemStack(Material.PISTON_BASE));
		return items;
	}
	
	public static List<ItemStack> RefuelingStationRecipe(){
		List<ItemStack> items = new ArrayList<ItemStack>();
		items.add(null);
		items.add(null);
		items.add(null);
		items.add(new ItemStack(Material.BREWING_STAND_ITEM));
		items.add(null);
		items.add(new ItemStack(Material.BREWING_STAND_ITEM));
		items.add(new ItemStack(Material.PISTON_BASE));
		items.add(new ItemStack(Material.DISPENSER));
		items.add(new ItemStack(Material.PISTON_BASE));
		return items;
	}
	
	public static ItemStack JetpackOutput() {
		ItemStack item = SlimefunItem.JETPACK.clone();
		item.setDurability(item.getType().getMaxDurability());
		return item;
	}
	
	public static ItemStack MTOutput() {
		ItemStack item = SlimefunItem.MULTI_TOOL_MODE_NONE.clone();
		item.setDurability(item.getType().getMaxDurability());
		return item;
	}
}
