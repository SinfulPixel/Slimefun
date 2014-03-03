package me.mrCookieSlime.Slimefun.Commands;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;
import me.mrCookieSlime.Slimefun.Dictionary.ItemDictionary;
import me.mrCookieSlime.Slimefun.Inventories.SlimefunInventory;
import me.mrCookieSlime.Slimefun.Items.SlimefunGuide;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.Utilities.Players;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class SlimefunCommand implements Listener, CommandExecutor {
	
	private startup plugin;

	public SlimefunCommand(startup instance) {
		this.plugin = instance;
		this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	}
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
			if ((cmd.getName().equalsIgnoreCase("slimefun")) || cmd.getName().equalsIgnoreCase("sf")) {
				
				boolean yes = true;
				
				if (sender instanceof Player) {
					if (!Slimefun.isEnabled(((Player) sender).getWorld().getName())) {
						yes = false;
					}
				}
				
				if (yes) {
					if (args.length >= 1) {
						if (!SlimefunTabCompleter.getArguments().contains(args[0].toLowerCase())) {
							messages.NotAValidArgument(sender, args[0]);
						}
					}
					
					if (args.length == 0) {
							sender.sendMessage(ChatColor.GREEN + "====================================");
							sender.sendMessage(ChatColor.GOLD + "Slimefun v" + this.plugin.getDescription().getVersion() + " by mrCookieSlime");
							sender.sendMessage(ChatColor.GREEN + "====================================");
							if(sender.hasPermission("slimefun.reload")) {
								messages.Descriptionreload(sender);
							}
							messages.Descriptionitems(sender);
							messages.Descriptionguide(sender);
							messages.Descriptionteam(sender);
							messages.DescriptionVillagers(sender);
							if (sender.hasPermission("slimefun.killnpc")) {
								messages.DescriptionKillnpc(sender);
							}
							if (sender.hasPermission("slimefun.cheat.research") || sender instanceof ConsoleCommandSender) {
								messages.DescriptionResearch(sender);
							}
							if (sender.hasPermission("slimefun.items") || sender instanceof ConsoleCommandSender) {
								messages.Descriptiongive(sender);
							}
					}
					else {
						if (args.length == 1) {
							if (args[0].equalsIgnoreCase("guide")) {
								if (sender instanceof Player) {
									if (this.plugin.getConfig().getBoolean("items.guide") == true) {
										if (!((Player) sender).getInventory().contains(SlimefunItem.SLIMEFUN_GUIDE)) {
											((Player) sender).getInventory().addItem(SlimefunItem.SLIMEFUN_GUIDE);
											((Player) sender).playSound(((Player) sender).getLocation(), Sound.LEVEL_UP, (float) 0.4, 1);
										}
									}
								}
								else {
									messages.CommandOnlyforPlayers();
								}
								
							}
							else if (args[0].equalsIgnoreCase("items")) {
								if (sender instanceof Player) {
									if (sender.hasPermission("slimefun.items")) {
										((Player) sender).openInventory(SlimefunInventory.craftCheat((Player) sender));
										SlimefunGuide.inv.put(sender.getName(), "cheat");
									}
									else {
										messages.NoPermission(sender, "slimefun.items");
									  }
								}
								else {
									messages.CommandOnlyforPlayers();
								}
							}
							else if (args[0].equalsIgnoreCase("reload")) {
								if(sender.hasPermission("slimefun.reload")) {
									messages.ConfigReload(sender);
									this.plugin.reloadConfig();
								}
								else {
									messages.NoPermission(sender, "slimefun.reload");
								}
							}
							else if (args[0].equalsIgnoreCase("villagers")) {
								if (sender instanceof Player) {
									if(sender.hasPermission("slimefun.items")) {
										((Player) sender).openInventory(SlimefunInventory.Villagers());
									}
									else {
										messages.NoPermission(sender, "slimefun.items");
									}
								}
								else {
									messages.CommandOnlyforPlayers();
								}
							}
							else if (args[0].equalsIgnoreCase("killnpc")) {
								if (sender instanceof Player) {
									if (sender.hasPermission("slimefun.killnpc")) {
										messages.NPCremove(sender);
									}
									else {
										messages.NoPermission(sender, "slimefun.killnpc");
									}
								}
								else {
									messages.CommandOnlyforPlayers();
								}
							}
							else if (args[0].equalsIgnoreCase("team")) {
								if (sender instanceof Player) {
									if (sender.hasPermission("slimefun.items")) {
										((Player) sender).openInventory(SlimefunInventory.Team());
									}
									else {
										((Player) sender).openInventory(SlimefunInventory.Team());
										SlimefunGuide.inv.put(sender.getName(), "noob");
										}
								}
								else {
									messages.CommandOnlyforPlayers();
								}
						}
							else if (args[0].equalsIgnoreCase("research")) {
								if (sender.hasPermission("slimefun.cheat.research")) {
									messages.Usage(sender, "/sf research <Player> <Research/all>");
								}
								else {
									messages.NoPermission(sender, "slimefun.cheat.research");
								}
							}
							else if (args[0].equalsIgnoreCase("give")) {
								if (sender.hasPermission("slimefun.items")) {
									messages.Usage(sender, "/sf give <Player> <item>");
								}
								else {
									messages.NoPermission(sender, "slimefun.items");
								}
							}
						}
						else if (args.length == 2) {
							if (args[0].equalsIgnoreCase("research")) {
								if (sender.hasPermission("slimefun.cheat.research")) {
									messages.Usage(sender, "/sf research <Player> <Research/all>");
								}
								else {
									messages.NoPermission(sender, "slimefun.cheat.research");
								}
							}
							else if (args[0].equalsIgnoreCase("give")) {
								if (sender.hasPermission("slimefun.items")) {
									messages.Usage(sender, "/sf give <Player> <item>");
								}
								else {
									messages.NoPermission(sender, "slimefun.items");
								}
							}
						}
						else if (args.length >= 3) {
							if (args[0].equalsIgnoreCase("research")) {
								if (sender.hasPermission("slimefun.cheat.research")) {
									
									String research = args[2];
									if (args.length > 3) {
										for (int i = 3; i < args.length; i++) {
											research = research + " " + args[i];
										}
									}
									
									if (Slimefun.getResearchNames().contains(research) || args[2].equalsIgnoreCase("all")) {
										if(Players.isOnline(args[1])) {
											Player target = plugin.getServer().getPlayer(args[1]);
											
											if (args[2].equalsIgnoreCase("all")) {
												for (int i = 0; i < Slimefun.getResearchNames().size(); i++) {
													PlayerResearch.research(target, Slimefun.getResearchNames().get(i));
													messages.Researched(target, Slimefun.getResearchNames().get(i));
												}
											}
											else {
												
												PlayerResearch.research(target, research);
												messages.Researched(target, research);
											}
									    }
									    else {
									        messages.PlayerIsNotOnline(sender, args[1]);
									    }
									}
									else {
										messages.NotAValidArgument(sender, research);
									}
								}
								else {
									messages.NoPermission(sender, "slimefun.cheat.research");
								}
							}
							else if (args[0].equalsIgnoreCase("give")) {
								if (sender.hasPermission("slimefun.items")) {
									if(Players.isOnline(args[1])) {
										if (Slimefun.getNames().contains(args[2])) {
											Player target = plugin.getServer().getPlayer(args[1]);
											
											target.getWorld().dropItem(target.getLocation(), ItemDictionary.getItem(args[2]));
										}
										else {
											messages.NotAValidArgument(sender, args[2]);
										}
									}
									else {
										messages.PlayerIsNotOnline(sender, args[1]);
									}
								}
								else {
									messages.NoPermission(sender, "slimefun.items");
								}
							}
							else {
								messages.TooManyArguments(sender);
							}
						}
					}
				}
				else {
					messages.NotEnabled((Player) sender);
				}
			}
			return true;
		}
}
