package me.mrCookieSlime.Slimefun.Listeners.Items;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.CropState;
import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.TreeType;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Crops;
import org.bukkit.material.Tree;

public class NanoHoeListener implements Listener {
	
	private startup plugin;

	  public NanoHoeListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@SuppressWarnings("deprecation")
	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent e){
		Player p = e.getPlayer();
	    if ((e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && (p.getItemInHand().getType() == Material.DIAMOND_HOE) && (p.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) == 10)) {
	    	if (this.plugin.getConfig().getBoolean("durability.infinite-nanohoe-durability") == true) {
	    		p.getItemInHand().setDurability((short) 0);
	    	}
	      if (e.getClickedBlock().getType().equals(Material.CROPS)) {
	        Block wheat = e.getClickedBlock();
			Crops wheatCrop = new Crops(wheat.getTypeId(), wheat.getData());
	        if (wheatCrop.getState() != CropState.RIPE) {
	        }
	        wheatCrop.setState(CropState.RIPE);
	        wheat.setData(wheatCrop.getData());
	      } else if (e.getClickedBlock().getType().equals(Material.SAPLING)) {
	        Block sapling = e.getClickedBlock();

	        Tree tree = new Tree(sapling.getTypeId(), sapling.getData());
	        TreeSpecies t = tree.getSpecies();

	        TreeType type = null;
	        if (t.equals(TreeSpecies.BIRCH)) {
	          type = TreeType.BIRCH;
	        } else if (t.equals(TreeSpecies.JUNGLE)) {
	        } else if (t.equals(TreeSpecies.REDWOOD)) {
	          this.plugin.getServer().broadcastMessage("redwood");
	          type = TreeType.REDWOOD;
	        }
	        else if (Math.random() > 0.5D) {
	          type = TreeType.BIG_TREE;
	        } else {
	          type = TreeType.TREE;
	        }

	        if (!t.equals(TreeSpecies.JUNGLE)) {
	          sapling.setType(Material.AIR);
	          if (!sapling.getWorld().generateTree(sapling.getLocation(), type))
	            sapling.setType(Material.SAPLING);
	          else {
	          }
	        }
	      }
	    }
	  }

	  @SuppressWarnings("deprecation")
	public boolean generateJungleTree(Block block){
	    int x = block.getX();
	    int y = block.getY();
	    int z = block.getZ();
	    World world = block.getWorld();
	    boolean pass = false;

	    Block block1 = world.getBlockAt(x + 1, y, z);
	    Block block2 = world.getBlockAt(x + 1, y, z + 1);
	    Block block3 = world.getBlockAt(x, y, z + 1);

	    if ((block1.getData() == block2.getData()) && (block2.getData() == block3.getData()) && (block1.getData() == block3.getData()) && (block1.getData() == block.getData())) {
	      pass = true;
	    }

	    if (!pass) {
	      block1 = world.getBlockAt(x, y, z + 1);
	      block2 = world.getBlockAt(x - 1, y, z + 1);
	      block3 = world.getBlockAt(x - 1, y, z);

	      if ((block1.getData() == block2.getData()) && (block2.getData() == block3.getData()) && (block1.getData() == block3.getData()) && (block1.getData() == block.getData())) {
	        pass = true;
	      }

	    }

	    if (!pass) {
	      block1 = world.getBlockAt(x - 1, y, z);
	      block2 = world.getBlockAt(x - 1, y, z - 1);
	      block3 = world.getBlockAt(x, y, z - 1);

	      if ((block1.getData() == block2.getData()) && (block2.getData() == block3.getData()) && (block1.getData() == block3.getData()) && (block1.getData() == block.getData())) {
	        pass = true;
	      }

	    }

	    if (!pass) {
	      block1 = world.getBlockAt(x, y, z - 1);
	      block2 = world.getBlockAt(x + 1, y, z - 1);
	      block3 = world.getBlockAt(x + 1, y, z);

	      if ((block1.getData() == block2.getData()) && (block2.getData() == block3.getData()) && (block1.getData() == block3.getData()) && (block1.getData() == block.getData()))
	        pass = true;
	    }
	    TreeType type;
	    if (pass) {
	      block1.setType(Material.AIR);
	      block2.setType(Material.AIR);
	      block3.setType(Material.AIR);
	      block.setType(Material.AIR);
	      type = TreeType.JUNGLE;
	    } else {
	      type = TreeType.SMALL_JUNGLE;
	    }

	    if (!block.getWorld().generateTree(block.getLocation(), type)) {
	    	block.setType(Material.SAPLING);
	      if (pass) {
	        block1.setType(Material.SAPLING);
	        block2.setType(Material.SAPLING);
	        block3.setType(Material.SAPLING);
	      }
	      return false;
	    }
	    return true;
	  }
}
