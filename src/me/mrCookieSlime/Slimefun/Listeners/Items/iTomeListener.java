package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class iTomeListener implements Listener {
	
	private startup plugin;
	
	public iTomeListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 8 || p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 5) {
	      Action a = e.getAction();
	      if (p.hasPermission("slimefun.itome")) {
	    	  if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    		  Player[] players = this.plugin.getServer().getOnlinePlayers();
	    		  Player target;
	    	  
	    		  for(int i = 0; i < players.length; i++) {
	    			  target = players[i];
	    			  target.hidePlayer(p);
	    			  if (target.hasPermission("slimefun.iTome.see-players")) {
	    				  target.showPlayer(p);
	    			  }
	    	  			}
	    		  messages.Vanish(p);
	    	  			p.playEffect(p.getLocation(), Effect.SMOKE, 4);
	    	  			p.playSound(p.getLocation(), Sound.AMBIENCE_CAVE, 1, 1);
	      			}
	      			if ((a == Action.LEFT_CLICK_AIR) || (a == Action.LEFT_CLICK_BLOCK)) {
	      				Player[] players = this.plugin.getServer().getOnlinePlayers();
	      				Player target;
	    	  
	      				for(int i = 0; i < players.length; i++) {
	      					target = players[i];
	      					target.showPlayer(p);
	      				}
	      				messages.UnVanish(p);
	      				p.playEffect(p.getLocation(), Effect.SMOKE, 4);
	      				p.playSound(p.getLocation(), Sound.AMBIENCE_CAVE, 1, 1);
	          }
	      }
	      else {
	    	  messages.NoPermission(p, "slimefun.iTome");
	      }
	    }
	}

}
