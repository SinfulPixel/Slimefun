package me.mrCookieSlime.Slimefun.Commands;


import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class commands implements CommandExecutor {
	
	private startup plugin;
	
	public commands(startup instance) {
		this.plugin = instance;
	}
	

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("milk")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(args.length == 0) {
					if (p.hasPermission("slimefun.milk.self")) {
					p.playSound(p.getLocation(), Sound.DRINK, 1, 1);
					for(int i = 1; i < 100; i++) {
						try {
							p.removePotionEffect(PotionEffectType.getById(i));
						}
						catch(Exception x) {
							
						}
					}
					messages.MilkSelf(p);
					}
					else {
						messages.NoPermission(p, "slimefun.milk.self");
					}
				}
				else if(args.length == 1) {
					if (p.hasPermission("slimefun.milk.other")) {
					        if(this.plugin.getServer().getPlayer(args[0]).isOnline()) {
					    	Player target = this.plugin.getServer().getPlayer(args[0]);
					    	target.playSound(p.getLocation(), Sound.DRINK, 1, 1);
					    	for(int i = 0; i < 100; i++) {
								try {
									target.removePotionEffect(PotionEffectType.getById(i));
								}
								catch(Exception x) {
									
								}
					    	}
								messages.MilkOtherTarget(target, p.getName());
								messages.MilkOtherSender(p, target.getName());
					        }
					        else {
					        	messages.PlayerIsNotOnline(p, args[0]);
							}
					}
					else {
						messages.NoPermission(p, "slimefun.milk.other");
					}
				}
			}
			else {
				messages.CommandOnlyforPlayers();
			}	
		}
	    return true;
	
	}
}