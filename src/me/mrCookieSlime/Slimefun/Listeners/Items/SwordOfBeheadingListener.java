package me.mrCookieSlime.Slimefun.Listeners.Items;

import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Skeleton.SkeletonType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class SwordOfBeheadingListener implements Listener {
	
	private startup plugin;
	
	public SwordOfBeheadingListener(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
	
	@EventHandler
	public void onHit(EntityDeathEvent e) {
		
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1);
		
		if (e.getEntity().getKiller() instanceof Player) {
			Player p = e.getEntity().getKiller();
		    if (p.getItemInHand().getEnchantmentLevel(Enchantment.DURABILITY) == 8 && p.getItemInHand().getType() == Material.DIAMOND_SWORD) {
				if (e.getEntity() instanceof Zombie) {
					
					skull.setDurability((short) 2);
					
					int r = new Random().nextInt(100);
					if (r < this.plugin.getConfig().getInt("drop-chance.beheading-chance.zombie")) {
						e.getDrops().add(skull);
					}
				}
				else if (e.getEntity() instanceof Skeleton) {
					
					if (((Skeleton) e.getEntity()).getSkeletonType() == SkeletonType.WITHER) {
						
						skull.setDurability((short) 1);
						
						int r = new Random().nextInt(100);
						if (r < this.plugin.getConfig().getInt("drop-chance.beheading-chance.wither-skeleton")) {
							e.getDrops().add(skull);
						}
					}
					else {
						int r = new Random().nextInt(100);
						if (r < this.plugin.getConfig().getInt("drop-chance.beheading-chance.skeleton")) {
							e.getDrops().add(skull);
						}
					}
				}
				else if (e.getEntity() instanceof Creeper) {
					
					skull.setDurability((short) 4);
					
					int r = new Random().nextInt(100);
					if (r < this.plugin.getConfig().getInt("drop-chance.beheading-chance.creeper")) {
						e.getDrops().add(skull);
					}
				}
				else if (e.getEntity() instanceof Player) {
					Player player = (Player) e.getEntity();
					skull.setDurability((short) 3);
					skull = setOwner(skull, player.getName());
					
					int r = new Random().nextInt(100);
					if (r < this.plugin.getConfig().getInt("drop-chance.beheading-chance.player")) {
						e.getDrops().add(skull);
					}
				}
			}
		}
	}
	
	public ItemStack setOwner(ItemStack item, String owner) {
	    SkullMeta meta = (SkullMeta)item.getItemMeta();
	    meta.setOwner(owner);
	    item.setItemMeta(meta);
	    return item;
	  }

}
