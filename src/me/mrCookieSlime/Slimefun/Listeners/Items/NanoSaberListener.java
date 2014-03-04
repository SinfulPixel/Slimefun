package me.mrCookieSlime.Slimefun.Listeners.Items;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class NanoSaberListener implements Listener {
private startup plugin;
	
	public NanoSaberListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getEnchantmentLevel(Enchantment.DAMAGE_ALL) == 10 && p.getItemInHand().getType() == Material.DIAMOND_SWORD && p.getItemInHand().getEnchantmentLevel(Enchantment.FIRE_ASPECT) == 10) {
	    	Action a = e.getAction();
	    	if (this.plugin.getConfig().getBoolean("durability.infinite-nanosaber-durability") == true) {
	    		p.getItemInHand().setDurability((short) 0);
	    	}
		      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
		    	   
		    	  Vector direction = e.getPlayer().getEyeLocation().getDirection().multiply(1);
		    	  Projectile projectile = (Projectile)e.getPlayer().getWorld().spawn(e.getPlayer().getEyeLocation().add(direction.getX(), direction.getY(), direction.getZ()), Arrow.class);
		    	  projectile.setShooter(e.getPlayer());
		    	  projectile.setVelocity(direction);
		      }
	    }
	}
}