package me.mrCookieSlime.Slimefun.Listeners.Items;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class GoldenFeatherListener implements Listener{
	
	private startup plugin;
	
	public GoldenFeatherListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler
	public void onEntityDamaged(EntityDamageEvent e){
	    if (((e.getEntity() instanceof Player)) && (e.getCause().equals(EntityDamageEvent.DamageCause.FALL))) {
	        Player p = (Player)e.getEntity();
	    	if (p.getInventory().contains(SlimefunItem.GOLDEN_FEATHER)) {
	    		if (p.getFoodLevel() >= plugin.getConfig().getInt("options.GoldenFeather-hunger-cost")) {
	    			e.setCancelled(true);
	    			p.setFoodLevel(p.getFoodLevel() - plugin.getConfig().getInt("options.GoldenFeather-hunger-cost"));
	    		}
	    	}
	    }
	}
}
