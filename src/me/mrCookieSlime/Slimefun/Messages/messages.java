package me.mrCookieSlime.Slimefun.Messages;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Setup.Messages;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class messages {
	
	public static String prefix = ChatColor.GREEN + "[Slimefun] ";
	public static startup plugin;
	
	public static void init(startup instance) {
		plugin = instance;
	}
	
	public static void NotEnoughMaterials(Player player) {
		player.sendMessage(ChatColor.GREEN + "[Slimefun] " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.not-enough-materials")));
	}
   public static void NoPermission(CommandSender sender, String permission) {
		String msg = Messages.msgcfg.getString("messages.no-permission");
		msg = msg.replace("%permission%", permission);
		sender.sendMessage(ChatColor.GREEN + "[Slimefun] " + ChatColor.translateAlternateColorCodes('&', msg));
	}	  
   public static void PlayerIsNotOnline(CommandSender sender, String name) {
	   String msg = Messages.msgcfg.getString("messages.player-is-not-online");
	   msg = msg.replace("%player%", name);
	   sender.sendMessage(ChatColor.GREEN + "[Slimefun] " + ChatColor.translateAlternateColorCodes('&', msg));
    
   	}
   public static void PlayerTeleported(Player player, String name) {
	   String msg = Messages.msgcfg.getString("messages.teleported-to");
	   msg = msg.replace("%player%", name);
	   player.sendMessage(ChatColor.GREEN + "[Slimefun] " + ChatColor.translateAlternateColorCodes('&', msg));
   }
   public static void CommandOnlyforPlayers() {
	   System.out.println("[Slimefun] " + Messages.msgcfg.getString("messages.command-only-for-players"));
   }
   public static void TooFewArguments(Player player) {
	   player.sendMessage(ChatColor.GREEN + "[Slimefun] " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.too-few-arguments")));
   }
   public static void TooManyArguments(CommandSender sender) {
	   sender.sendMessage(ChatColor.GREEN + "[Slimefun] " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.too-many-arguments")));
   }
   public static void Descriptionreload(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf reload          " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.reload")));
   }
   public static void Descriptionitems(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf items          " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.items")));
   }
   public static void Descriptiongive(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf give <Player> <item>    " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.give")));
   }
   public static void Descriptionguide(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf guide          " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.guide")));
   }
   public static void Descriptionteam(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf team          " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.team")));
   }
   public static void NotAValidArgument(CommandSender sender, String argument) {
	   String msg = Messages.msgcfg.getString("messages.not-a-valid-argument");
	   msg = msg.replace("%argument%", argument);
	   sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', msg));
   }
   public static void ConfigReload(CommandSender sender) {
	   sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.config-reload")));
   }
   public static void guide(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.guide-already-in-inventory")));
   }
   public static void nocheating(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.no-cheating")));
   }
   public static void Vanish(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.vanish")));
   }
   public static void UnVanish(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.visible")));
   }
   public static void NanoAxelAxe(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.NanoAxelMode-axe")));
   }
   public static  void NanoAxelShovel(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.NanoAxelMode-shovel")));
   }
   public static void BedTeleport(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.teleported-bed")));
   }
   public static void NoBed(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.no-bed")));
   }
   public static void MultiToolModeChanged(Player player, String mode) {
	   String msg = ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.multi-tool-mode-changed"));
	   msg = msg.replace("%mode%", mode);
	   player.sendMessage(prefix + msg);
   }
   public static void Usage(CommandSender sender, String usage) {
	   String msg = ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.usage"));
	   msg = msg.replace("%usage%", usage);
	   sender.sendMessage(prefix + msg);
   }
   public static void NoMoreLava(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.no-more-lava")));
   }
   public static void DecentLava(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.decent-lava")));
   }
   public static void QuestCompleted(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.quest-completed")));
   }
   public static void QuestCancel(Player player) {
	   player.sendMessage(ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.quest-cancel")));
   }
   public static void QuestCancelled(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.quest-cancelled")));
   }
   public static void NPCremove(CommandSender sender) {
	   sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.npc-remove")));
   }
   public static void NPCremoved(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.npc-removed")));
   }
   public static void DescriptionVillagers(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf villagers        " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.villagers")));
   }
   public static void DescriptionDonators(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf donators        " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.donators")));
   }
   public static void DescriptionKillnpc(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf killnpc        " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.killnpc")));
   }
   public static void NotResearched(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.not-researched")));
   }
   public static void AllResearched(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.all-researched")));
   }
   public static void NeverBeenOnTheSurface(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.never-surface")));
   }
   public static void Researched(Player player, String research) {
	   String msg = ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.researched"));
	   msg = msg.replace("%research%", ChatColor.GRAY + "\"" + ChatColor.GOLD + research + ChatColor.GRAY + "\"");
	   player.sendMessage(prefix + msg);
   }
   public static void DescriptionResearch(CommandSender sender) {
	   sender.sendMessage(ChatColor.BLUE + "/sf research      " + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("descriptions.research")));
   }
   public static void NoUber(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.no-uber")));
   }
   public static void AlreadyInstalled(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.already-installed")));
   }
   public static void NotEnabled(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.not-enabled")));
   }
   public static void NotDied(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.not-died")));
   }
   public static void NotEnoughXP(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.not-enough-xp")));
   }
   public static void AmuletSaved(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.amulet-saved")));
   }
   public static void AmuletTricked(Player player) {
	   player.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.amulet-tricked")));
   }
   public static void ItemGiven(Player player, int amount, String name) {
	   String msg = ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.item-given"));
	   msg = msg.replace("%amount%", String.valueOf(amount));
	   msg = msg.replace("%item%", ChatColor.translateAlternateColorCodes('&', "&7\"" + name + "&7\""));
	   player.sendMessage(prefix + msg);
   }
   public static void UberPickaxeModeChanged(Player player, String mode) {
	   String msg = ChatColor.translateAlternateColorCodes('&', Messages.msgcfg.getString("messages.uberPickaxe-changed"));
	   msg = msg.replace("%mode%", mode);
	   player.sendMessage(prefix + msg);
   }
}
