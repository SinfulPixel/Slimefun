package me.mrCookieSlime.Slimefun.Listeners.Items;


import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class NanoPickaxeListener implements Listener {
	
private startup plugin;
	
	public NanoPickaxeListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerInteract(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE && p.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 10) {
	      if (this.plugin.getConfig().getBoolean("durability.infinite-nanopickaxe-durability") == true) {
	    		p.getItemInHand().setDurability((short) 0);
	    	}
	    }
	  }

}
