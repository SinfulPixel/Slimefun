package me.mrCookieSlime.Slimefun.Listeners.Food;

import java.io.File;
import java.util.Random;

import me.mrCookieSlime.CSCoreLib.Configuration.Config;
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

public class FortuneCookieListener implements Listener {
	
	private startup plugin;

	  public FortuneCookieListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.COOKIE && p.getItemInHand().getDurability() == 1) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  PlayerInventory.consumeItemInHand(p);
	    	  Config msg = new Config(new File("plugins/Slimefun", "fortune-cookie-messages.yml"));
	    	  int r = new Random().nextInt(msg.getStringList("messages").size());
	    	  p.sendMessage(msg.getStringList("messages").get(r));
	    	  p.setFoodLevel(p.getFoodLevel() + 8);
	    	  p.playSound(p.getLocation(), Sound.EAT, 1, 1);
	      }
	      e.setCancelled(true);
	    }
	  }

}
