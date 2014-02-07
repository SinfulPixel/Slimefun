package me.mrCookieSlime.Slimefun.Listeners.Food;

import java.io.File;
import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class FortuneCookieListener implements Listener {
	
	public static File messages = new File("plugins/Slimefun", "fortune-cookie-messages.yml");
	public static FileConfiguration msgcfg = YamlConfiguration.loadConfiguration(messages);
	
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
	    	  int r = new Random().nextInt(msgcfg.getStringList("messages").size());
	    	  p.sendMessage((String) msgcfg.getStringList("messages").get(r));
	    	  p.setFoodLevel(p.getFoodLevel() + 8);
	    	  p.playSound(p.getLocation(), Sound.EAT, 1, 1);
	      }
	      e.setCancelled(true);
	    }
	  }

}
