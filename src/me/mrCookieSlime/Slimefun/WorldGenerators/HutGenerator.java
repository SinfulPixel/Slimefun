package me.mrCookieSlime.Slimefun.WorldGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Dictionary.ItemDictionary;
import me.mrCookieSlime.Slimefun.entities.SlimefunVillager;

public class HutGenerator implements Listener {
	
	private static startup plugin;
	
	public HutGenerator(startup instance)
	  {
	    plugin = instance;
	    plugin.getServer().getPluginManager().registerEvents(this, plugin);
	  }
	
	@EventHandler
	public void onVillageGen(ChunkPopulateEvent e) {
		Chunk c = e.getChunk();
		if (Slimefun.isEnabled(e.getWorld().getName())) {
			generateHut(c);
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void create(Location l) {
		
		Block b = l.getBlock();
	        
	        if (b.getBiome() != Biome.OCEAN && b.getBiome() != Biome.RIVER && b.getBiome() != Biome.HELL && b.getBiome() != Biome.SKY) {
	        		
	        		for (int i = 0; i < 5; i++) {
		        		for (int j = 0; j < 8; j++) {
				        	for (int k = 0; k < 8; k++) {
					        	l.getWorld().getBlockAt((int) l.getX() + i + 1 , (int) l.getY() + k + 1 , (int) l.getZ() + j + 1).setType(Material.AIR);
					        }
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() , (int) l.getZ() + j).setType(Material.SMOOTH_BRICK);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 1 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 1 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i + 5 , (int) l.getY() + 1 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i + 5 , (int) l.getY() + 1 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 1 , (int) l.getZ() + j + 5).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 1 , (int) l.getZ() + j + 5).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
			        		if (j != 2 && j != 3) {
			        			l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 1 , (int) l.getZ() + j).setType(Material.WOOD);
			        			l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 1 , (int) l.getZ() + j).setData((byte) 0);
			        		}
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 2 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 2 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 2 , (int) l.getZ() + j + 5).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 2 , (int) l.getZ() + j + 5).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i + 5 , (int) l.getY() + 2 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i + 5 , (int) l.getY() + 2 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
			        		if (j != 2 && j != 3) {
			        			l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 2 , (int) l.getZ() + j).setType(Material.WOOD);
			        			l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 2 , (int) l.getZ() + j).setData((byte) 0);
			        		}
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 3 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 3 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 3 , (int) l.getZ() + j + 5).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 3 , (int) l.getZ() + j + 5).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i + 5 , (int) l.getY() + 3 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i + 5 , (int) l.getY() + 3 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
			        		l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 3 , (int) l.getZ() + j).setType(Material.WOOD);
			        		l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 3 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 4 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 4 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 4; i++) {
			        	for (int j = 0; j < 4; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i + 1 , (int) l.getY() + 6 , (int) l.getZ() + j + 1).setType(Material.getMaterial(44));
				        	l.getWorld().getBlockAt((int) l.getX() + i + 1 , (int) l.getY() + 6 , (int) l.getZ() + j + 1).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 8; i++) {
			        	for (int j = 0; j < 8; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i - 1 , (int) l.getY() + 5 , (int) l.getZ() + j - 1).setType(Material.getMaterial(44));
				        	l.getWorld().getBlockAt((int) l.getX() + i - 1 , (int) l.getY() + 5 , (int) l.getZ() + j - 1).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 5 , (int) l.getZ() + j).setType(Material.getMaterial(43));
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 5 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 4 , (int) l.getZ() + j).setType(Material.WOOD);
				        	l.getWorld().getBlockAt((int) l.getX() + i , (int) l.getY() + 4 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 4; i++) {
			        	for (int j = 0; j < 4; j++) {
			        		if (i == 0) {
			        			if (j != 1 && j != 2) {
				        			l.getWorld().getBlockAt((int) l.getX() + i + 1 , (int) l.getY() + 4 , (int) l.getZ() + j + 1).setType(Material.GLOWSTONE);
				        		}
			        		}
			        		else if (i == 3) {
			        			if (j != 1 && j != 2) {
				        			l.getWorld().getBlockAt((int) l.getX() + i + 1 , (int) l.getY() + 4 , (int) l.getZ() + j + 1).setType(Material.GLOWSTONE);
				        		}
			        		}
			        		
				        }
			        }
		        	
		        	for (int i = 0; i < 3; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i + 1 , (int) l.getY() + 1 , (int) l.getZ() + j + 1).setType(Material.BOOKSHELF);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	l.getWorld().getBlockAt((int) l.getX() + i + 2 , (int) l.getY() + 1 , (int) l.getZ() + j + 1).setType(Material.WORKBENCH);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	fillChest(l.getWorld().getBlockAt((int) l.getX() + i + 2 , (int) l.getY() + 1 , (int) l.getZ() + j + 4));
				        }
			        }
		        	
		        	int r = new Random().nextInt(90);
		        	if (r < 30) {
		        		SlimefunVillager.spawnMerchant(new Location(l.getWorld(), l.getX() + 3, (int) l.getY() + 1, l.getZ() + 3));
		        	}
		        	else if (r < 60){
		        		SlimefunVillager.spawnQuester(new Location(l.getWorld(), l.getX() + 3, (int) l.getY() + 1, l.getZ() + 3));
		        	}
		        	else {
		        		SlimefunVillager.spawnBlacksmith(new Location(l.getWorld(), l.getX() + 3, (int) l.getY() + 1, l.getZ() + 3));
		        	}
	        }
	}
	
	@SuppressWarnings("deprecation")
	public void generateHut(Chunk c) {
		if (new Random().nextInt(plugin.getConfig().getInt("generation-chance.huts.of")) < plugin.getConfig().getInt("generation-chance.huts.in")) {
			int X = (c.getX() * 16) + new Random().nextInt(15);
	        int Z = (c.getZ() * 16) + new Random().nextInt(15);
	        int Y = 0;
	        
	        for (int i = 0; i < c.getWorld().getMaxHeight() - 1; i++) {
	            if (c.getWorld().getBlockAt(X, i, Z).getType() == Material.AIR
	            		&& c.getWorld().getBlockAt(X, i + 1, Z).getType() == Material.AIR
	                    && c.getWorld().getBlockAt(X, i + 2, Z).getType() == Material.AIR
	                    && c.getWorld().getBlockAt(X, i + 4, Z).getType() == Material.AIR
	                    && c.getWorld().getBlockAt(X, i + 5, Z).getType() == Material.AIR
	            		&& c.getWorld().getBlockAt(X, i + 6, Z).getType() == Material.AIR
	            		&& c.getWorld().getBlockAt(X, i + 7, Z).getType() == Material.AIR
	            		&& c.getWorld().getBlockAt(X, i + 8, Z).getType() == Material.AIR
	            		&& c.getWorld().getBlockAt(X, i + 9, Z).getType() == Material.AIR
	            		&& c.getWorld().getBlockAt(X, i + 10, Z).getType() == Material.AIR
	            		&& c.getWorld().getBlockAt(X, i - 1, Z).getType() != Material.AIR)
	            {
	                Y = i--;
	                break;
	            }
	        }
	        
	        Block b = c.getWorld().getBlockAt(X, Y, Z);
	        Location l = b.getLocation();
	        
	        if (b.getBiome() != Biome.OCEAN && b.getBiome() != Biome.RIVER && b.getBiome() != Biome.HELL && b.getBiome() != Biome.SKY) {
	        		
	        		for (int i = 0; i < 5; i++) {
		        		for (int j = 0; j < 8; j++) {
				        	for (int k = 0; k < 8; k++) {
					        	c.getWorld().getBlockAt((int) l.getX() + i + 1 , Y + k + 1 , (int) l.getZ() + j + 1).setType(Material.AIR);
					        }
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y , (int) l.getZ() + j).setType(Material.SMOOTH_BRICK);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 1 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 1 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i + 5 , Y + 1 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i + 5 , Y + 1 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 1 , (int) l.getZ() + j + 5).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 1 , (int) l.getZ() + j + 5).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
			        		if (j != 2 && j != 3) {
			        			c.getWorld().getBlockAt((int) l.getX() + i , Y + 1 , (int) l.getZ() + j).setType(Material.WOOD);
			        			c.getWorld().getBlockAt((int) l.getX() + i , Y + 1 , (int) l.getZ() + j).setData((byte) 0);
			        		}
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 2 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 2 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 2 , (int) l.getZ() + j + 5).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 2 , (int) l.getZ() + j + 5).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i + 5 , Y + 2 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i + 5 , Y + 2 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
			        		if (j != 2 && j != 3) {
			        			c.getWorld().getBlockAt((int) l.getX() + i , Y + 2 , (int) l.getZ() + j).setType(Material.WOOD);
			        			c.getWorld().getBlockAt((int) l.getX() + i , Y + 2 , (int) l.getZ() + j).setData((byte) 0);
			        		}
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 3 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 3 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 3 , (int) l.getZ() + j + 5).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 3 , (int) l.getZ() + j + 5).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i + 5 , Y + 3 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i + 5 , Y + 3 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 6; j++) {
			        		c.getWorld().getBlockAt((int) l.getX() + i , Y + 3 , (int) l.getZ() + j).setType(Material.WOOD);
			        		c.getWorld().getBlockAt((int) l.getX() + i , Y + 3 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 4 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 4 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 4; i++) {
			        	for (int j = 0; j < 4; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i + 1 , Y + 6 , (int) l.getZ() + j + 1).setType(Material.getMaterial(44));
				        	c.getWorld().getBlockAt((int) l.getX() + i + 1 , Y + 6 , (int) l.getZ() + j + 1).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 8; i++) {
			        	for (int j = 0; j < 8; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i - 1 , Y + 5 , (int) l.getZ() + j - 1).setType(Material.getMaterial(44));
				        	c.getWorld().getBlockAt((int) l.getX() + i - 1 , Y + 5 , (int) l.getZ() + j - 1).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 5 , (int) l.getZ() + j).setType(Material.getMaterial(43));
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 5 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 6; i++) {
			        	for (int j = 0; j < 6; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 4 , (int) l.getZ() + j).setType(Material.WOOD);
				        	c.getWorld().getBlockAt((int) l.getX() + i , Y + 4 , (int) l.getZ() + j).setData((byte) 0);
				        }
			        }
		        	
		        	for (int i = 0; i < 4; i++) {
			        	for (int j = 0; j < 4; j++) {
			        		if (i == 0) {
			        			if (j != 1 && j != 2) {
				        			c.getWorld().getBlockAt((int) l.getX() + i + 1 , Y + 4 , (int) l.getZ() + j + 1).setType(Material.GLOWSTONE);
				        		}
			        		}
			        		else if (i == 3) {
			        			if (j != 1 && j != 2) {
				        			c.getWorld().getBlockAt((int) l.getX() + i + 1 , Y + 4 , (int) l.getZ() + j + 1).setType(Material.GLOWSTONE);
				        		}
			        		}
			        		
				        }
			        }
		        	
		        	for (int i = 0; i < 3; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i + 1 , Y + 1 , (int) l.getZ() + j + 1).setType(Material.BOOKSHELF);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	c.getWorld().getBlockAt((int) l.getX() + i + 2 , Y + 1 , (int) l.getZ() + j + 1).setType(Material.WORKBENCH);
				        }
			        }
		        	
		        	for (int i = 0; i < 1; i++) {
			        	for (int j = 0; j < 1; j++) {
				        	fillChest(c.getWorld().getBlockAt((int) l.getX() + i + 2 , Y + 1 , (int) l.getZ() + j + 4));
				        }
			        }
		        	
		        	int r = new Random().nextInt(90);
		        	if (r < 30) {
		        		SlimefunVillager.spawnMerchant(new Location(l.getWorld(), l.getX() + 3, Y + 1, l.getZ() + 3));
		        	}
		        	else if (r < 60){
		        		SlimefunVillager.spawnQuester(new Location(l.getWorld(), l.getX() + 3, Y + 1, l.getZ() + 3));
		        	}
		        	else {
		        		SlimefunVillager.spawnBlacksmith(new Location(l.getWorld(), l.getX() + 3, Y + 1, l.getZ() + 3));
		        	}
	        }
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void fillChest(Block b) {
		
		b.setType(Material.CHEST);
		
		Chest c = (Chest) b.getState();
		
		List<ItemStack> possibleLoot = new ArrayList<ItemStack>();
		
		List<String>loot = plugin.getConfig().getStringList("loot-in-chest.hut");
		
		for (int i = 0; i < loot.size(); i++) {
			try {
				int id = Integer.parseInt(loot.get(i));
				possibleLoot.add(new ItemStack(id));
			}
			catch(Exception x) {
				possibleLoot.add(ItemDictionary.getItem(loot.get(i)));
			}
		}
		
		Inventory inv = c.getInventory();
		
		for (int i = 0; i < 6; i++) {
			int slot = new Random().nextInt(inv.getSize());
			int item = new Random().nextInt(possibleLoot.size());
			
			inv.setItem(slot, possibleLoot.get(item));
		}
	}

}
