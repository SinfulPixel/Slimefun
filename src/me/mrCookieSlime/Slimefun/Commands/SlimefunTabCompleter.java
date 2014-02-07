package me.mrCookieSlime.Slimefun.Commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

public class SlimefunTabCompleter implements TabCompleter {
	
	public SlimefunTabCompleter() {
	}
	
	@Override
	public List<String> onTabComplete(CommandSender sender, Command cmd,String label, String[] args) {
		return getArguments();
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
		return commands;
	}

}
