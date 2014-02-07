package me.mrCookieSlime.Slimefun.Listeners.Food;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.GameMode;
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

public class UberMeatListener implements Listener {
	
	private startup plugin;

	  public UberMeatListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	@EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.COOKED_BEEF && p.getItemInHand().getDurability() == 1) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  p.setFoodLevel(20);
	    	  p.setSaturation(25);
	    	  p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1200, 4));
	    	  p.setHealth((double) 20);
	    	  if (p.getItemInHand().getAmount() != 1) {
	    		  if (p.getGameMode() != GameMode.CREATIVE) {
	    			  p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
	    		  }
	    	  }
	    	  else {
	    		  if (p.getGameMode() != GameMode.CREATIVE) {
	    			  p.setItemInHand(null);
	    		  }
	    	  }
	    	  p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 2));
	    	  p.playSound(p.getLocation(), Sound.EAT, 1, 1);
	      }
	      e.setCancelled(true);
	    }
	  }

}
