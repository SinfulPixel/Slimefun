package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class NanoAxelListener implements Listener {
	
	private startup plugin;

	  public NanoAxelListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract4(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
				  if ((p.getItemInHand().getType() == Material.DIAMOND_AXE) && (p.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) == 10)) {
					  p.getItemInHand().setType(Material.DIAMOND_SPADE);
					  messages.NanoAxelShovel(p);
				  }
				  else if ((p.getItemInHand().getType() == Material.DIAMOND_SPADE) && (p.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) == 10)) {
					  p.getItemInHand().setType(Material.DIAMOND_AXE);
					  messages.NanoAxelAxe(p);
				  }
	      }
	    }
	  
	  @EventHandler
	    public void onPlayermove(PlayerMoveEvent e) {
		     Player p = e.getPlayer();
		    	 if ((p.getItemInHand().getType() == Material.DIAMOND_SPADE) && (p.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) == 10) || (p.getItemInHand().getType() == Material.DIAMOND_AXE) && (p.getItemInHand().getEnchantmentLevel(Enchantment.DIG_SPEED) == 10)) {
		    		 if (this.plugin.getConfig().getBoolean("durability.infinite-nanoaxel-durability") == true) {
		    			 p.getItemInHand().setDurability((short) 0); 
		    		 }
		         }
		}

}
