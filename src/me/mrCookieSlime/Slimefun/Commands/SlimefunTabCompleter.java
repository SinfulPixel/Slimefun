package me.mrCookieSlime.Slimefun.Commands;

import java.util.ArrayList;
import java.util.List;

import me.mrCookieSlime.Slimefun.AddonHandler.Slimefun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class SlimefunTabCompleter implements TabCompleter {
	
	public SlimefunTabCompleter() {
	}
	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd,String label, String[] args) {
		if (args.length == 0) {
			return getArguments();
		}
		else {
			if (args[0].equalsIgnoreCase("give")) {
				return Slimefun.getNames();
			}
			else {
				return getArguments();
			}
		}
	}
	
	public static List<String> getArguments() {
		List<String> commands = new ArrayList<String>();
		commands.add("items");
		commands.add("guide");
		commands.add("reload");
		commands.add("team");
		commands.add("villagers");
		commands.add("killnpc");
		commands.add("research");
		commands.add("give");
		return commands;
	}

}
