package me.mrCookieSlime.Slimefun.Listeners.Food;

import me.mrCookieSlime.CSCoreLib.general.Player.PlayerInventory;
import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PartiallyGoldenAppleListener implements Listener{
	
	private startup plugin;

	  public PartiallyGoldenAppleListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	@EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.GOLDEN_APPLE && p.getItemInHand().getDurability() == 2) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  p.setFoodLevel(20);
	    	  p.setSaturation(10);
	    	  PlayerInventory.consumeItemInHand(p);
	    	  p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 60, 4));
	    	  p.playSound(p.getLocation(), Sound.EAT, 1, 1);
	      }
	      e.setCancelled(true);
	    }
	  }

}
