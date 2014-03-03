package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.util.ArrayList;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Utilities.TreeCalculator;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class UberAxeListener implements Listener{
	
	private startup plugin;
	
	public UberAxeListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onChop(BlockBreakEvent e) {
		if (!e.isCancelled()) {
			Player p = e.getPlayer();
			if (p.getItemInHand() != null) {
				if (p.getItemInHand().getType() == Material.DIAMOND_AXE) {
					if (p.getItemInHand().containsEnchantment(Enchantment.DURABILITY)) {
						if (p.getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY) == 20) {
							if (e.getBlock().getType() == Material.LOG || e.getBlock().getType() == Material.LOG_2) {
								e.setCancelled(true);
								ArrayList<Block> logs = new ArrayList<Block>();
								logs.add(e.getBlock());
								TreeCalculator.getTree(e.getBlock(), logs, new ArrayList<Block>());
								
								for (Block b: logs) {
									for (ItemStack drop: b.getDrops()) {
										b.getWorld().dropItem(b.getLocation(), drop);
									}
									b.getWorld().playEffect(b.getLocation(), Effect.STEP_SOUND, b.getType());
									b.setType(Material.AIR);
								}
							}
						}
					}
				}
			}
		}
	}
}
