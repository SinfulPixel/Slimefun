package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.RingOfStorms.commands.ecp.chest;


public class EnderBackpackListener implements Listener {
	
	private startup plugin;

	  public EnderBackpackListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	@SuppressWarnings("deprecation")
	@EventHandler
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.LEATHER && p.getItemInHand().getEnchantmentLevel(Enchantment.ARROW_INFINITE) == 4 || p.getItemInHand().getType() == Material.LEATHER && p.getItemInHand().getDurability() == 1) {
	      Action a = e.getAction();
	      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
	    	  if (this.plugin.getServer().getPluginManager().isPluginEnabled("EnderChestPlus")) {
	    		  if (this.plugin.ECPcfg.getBoolean("use") == true) {
	    			  chest.openAC(p, p.getName());
		    		  p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
			    	  p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
	    		  }
	    		  else {
	    			  p.openInventory(p.getEnderChest());
			    	  p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
			    	  p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
	    		  }
	    	  }
	    	  else {
	    		  p.openInventory(p.getEnderChest());
		    	  p.playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 0);
		    	  p.playSound(p.getLocation(), Sound.ENDERMAN_TELEPORT, 1, 1);
	    	  }
	      }
	    }
	  }
}