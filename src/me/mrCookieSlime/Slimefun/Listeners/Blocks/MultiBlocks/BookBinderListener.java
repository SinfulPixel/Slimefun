package me.mrCookieSlime.Slimefun.Listeners.Blocks.MultiBlocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.mrCookieSlime.CSCoreLib.general.Block.BlockAdjacents;
import me.mrCookieSlime.CSCoreLib.general.Player.PlayerInventory;
import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;
import me.mrCookieSlime.Slimefun.research.PlayerResearch;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BookBinderListener implements Listener {
	
	private HashMap<String, String> inv = new HashMap<String, String>();
	private startup plugin;

	  public BookBinderListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  public void closeInv(Player p) {
		  try {
		  if (this.inv.containsKey(p.getName())) {
			  p.closeInventory();
			  this.inv.remove(p.getName());
		  }
		  }
		  catch(Exception x) {
			  
		  }
	  }
	  
	  @EventHandler
      public void in(InventoryCloseEvent e) {
   	   try {
   	   Player p = (Player) e.getPlayer();
   	   if (this.inv.get(p.getName()).equals("book")) {
   		this.inv.remove(p.getName());
   	   	   }
   	   }
   	   catch (Exception x) {
   	   }
      }
	  
	  @EventHandler
		public void onPlayerInteract(PlayerInteractEvent e) {
			Player p = e.getPlayer();
			Action a = e.getAction();
			if ((a == Action.RIGHT_CLICK_BLOCK)) {
				if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 7) {
				   this.openInv(p);
				}
				else if (e.getClickedBlock().getType() == Material.WORKBENCH) {
					if (BlockAdjacents.hasMaterialOnBothSides(e.getClickedBlock(), Material.BOOKSHELF)) {
						if (!p.isSneaking()) {
							
						}
						e.setCancelled(true);
						this.openInv(p);
					}
				}
			}
			else if ((a == Action.RIGHT_CLICK_AIR)) {
				if (p.getItemInHand().getType() == Material.BOOK && p.getItemInHand().getDurability() == 7) {
					   this.openInv(p);
					}
			}
		}
		
		public void openInv(Player p) {
			int lines = 3;
			  Inventory inv = Bukkit.createInventory(null, lines*9, ChatColor.BOLD + "Book Binder");
			  int slot = 18;
			  
			  ItemStack book = new ItemStack(Material.BOOK_AND_QUILL);
			  ItemMeta bim = book.getItemMeta();
			  List<String> bll = new ArrayList<String>();
			  bll.add(ChatColor.BLUE + "Click " + ChatColor.GREEN + "to unlock new Secrets");
			  bll.add("");
			  bll.add(ChatColor.BLUE + "Research Requirement:");
			  bll.add(ChatColor.BLUE + "" + plugin.getConfig().getInt("options.research-cost") + " Levels of XP");
			  bim.setLore(bll);
			  book.setItemMeta(bim);
			  book = Setname(book, ChatColor.GOLD + "Research Notes", "");
			  inv.setItem(0, book);
			  
			  for (int i = 0; i < 9; i++) {
				  inv.setItem(9 + i, Setname(new ItemStack(Material.THIN_GLASS), " ", ""));
			  }
			  
				  if (PlayerResearch.hasResearched(p, "Portable Jukebox")) {
					  if(this.plugin.getConfig().getBoolean("items.pJukebox") == true) {
						  ItemStack SlimeHelmet = new ItemStack(Material.BOOK, 1);
						    ItemMeta im = SlimeHelmet.getItemMeta();
					         List<String> ll = new ArrayList<String>();
					         String l1 = ChatColor.YELLOW + "[Click to craft]";
					         String l0 = "";
					         String l2 = ChatColor.BLUE + "Materials needed:";
					         String l3 = ChatColor.BLUE + "2 Jukeboxes";
					         String l4 = ChatColor.BLUE + "5 wooden planks (Oak)";
					         String l5 = ChatColor.BLUE + "1 Book and Quill";
					         ll.add(l1);
					         ll.add(l0);
					         ll.add(l2);
					         ll.add(l3);
					         ll.add(l4);
					         ll.add(l5);
					         im.setLore(ll);
					         SlimeHelmet.setItemMeta(im);
							SlimeHelmet = Setname(SlimeHelmet, ChatColor.GOLD + "Portable Jukebox", " ");
							inv.setItem(slot, SlimeHelmet);
							slot++;
					  }
				  }
				  if (PlayerResearch.hasResearched(p, "Invisible Tome")) {
					  if(this.plugin.getConfig().getBoolean("items.iTome") == true) {
						  if (p.hasPermission("slimefun.craft.itome")) {
							  ItemStack SlimeHelmet = new ItemStack(Material.BOOK, 1);
							    ItemMeta im = SlimeHelmet.getItemMeta();
						         List<String> ll = new ArrayList<String>();
						         String l1 = ChatColor.YELLOW + "[Click to craft]";
						         String l0 = "";
						         String l2 = ChatColor.BLUE + "Materials needed:";
						         String l3 = ChatColor.BLUE + "4 golden carrots";
						         String l4 = ChatColor.BLUE + "4 ender pearls";
						         String l5 = ChatColor.BLUE + "1 Book and Quill";
						         ll.add(l1);
						         ll.add(l0);
						         ll.add(l2);
						         ll.add(l3);
						         ll.add(l4);
						         ll.add(l5);
						         im.setLore(ll);
						         SlimeHelmet.setItemMeta(im);
								SlimeHelmet = Setname(SlimeHelmet, ChatColor.GOLD + "Invisible Tome", " ");
								inv.setItem(slot, SlimeHelmet);
								slot++;
						  } 
					  }
				  }
			  
				  if (PlayerResearch.hasResearched(p, "Book o Teleporting")) {
					  if (this.plugin.getConfig().getBoolean("items.BookoTeleporting")) {
						  if (p.hasPermission("slimefun.craft.BookoTeleporting")) {
							  ItemStack SlimeHelmet = new ItemStack(Material.BOOK, 1);
							    ItemMeta im = SlimeHelmet.getItemMeta();
						         List<String> ll = new ArrayList<String>();
						         String l1 = ChatColor.YELLOW + "[Click to craft]";
						         String l0 = "";
						         String l2 = ChatColor.BLUE + "Materials needed:";
						         String l3 = ChatColor.BLUE + "4 Nether Stars";
						         String l4 = ChatColor.BLUE + "4 ender pearls";
						         String l5 = ChatColor.BLUE + "1 Book and Quill";
						         String l6 = ChatColor.BLUE + "1 Eye of Ender";
						         ll.add(l1);
						         ll.add(l0);
						         ll.add(l2);
						         ll.add(l3);
						         ll.add(l4);
						         ll.add(l5);
						         ll.add(l6);
						         im.setLore(ll);
						         SlimeHelmet.setItemMeta(im);
								SlimeHelmet = Setname(SlimeHelmet, ChatColor.GOLD + "Book o' Teleporting", " ");
								inv.setItem(slot, SlimeHelmet);
								slot++;
						  }
					  }
				  }
			  
				  if (PlayerResearch.hasResearched(p, "Tome of Homeland")) {
					  if (this.plugin.getConfig().getBoolean("items.tomeofhomeland") == true) {
						  if (p.hasPermission("slimefun.craft.tomeofhomeland")) {
							  ItemStack SlimeHelmet = new ItemStack(Material.BOOK, 1);
							    ItemMeta im = SlimeHelmet.getItemMeta();
						         List<String> ll = new ArrayList<String>();
						         String l1 = ChatColor.YELLOW + "[Click to craft]";
						         String l0 = "";
						         String l2 = ChatColor.BLUE + "Materials needed:";
						         String l3 = ChatColor.BLUE + "4 beds";
						         String l4 = ChatColor.BLUE + "4 ender pearls";
						         String l5 = ChatColor.BLUE + "1 Book and Quill";
						         String l6 = ChatColor.BLUE + "1 Eye of Ender";
						         String l7 = ChatColor.BLUE + "3 obsidian";
						         ll.add(l1);
						         ll.add(l0);
						         ll.add(l2);
						         ll.add(l3);
						         ll.add(l4);
						         ll.add(l5);
						         ll.add(l6);
						         ll.add(l7);
						         im.setLore(ll);
						         SlimeHelmet.setItemMeta(im);
								SlimeHelmet = Setname(SlimeHelmet, ChatColor.GOLD + "Tome of homeland", " ");
								inv.setItem(slot, SlimeHelmet);
								slot++;
						  }
					  }
				  }
				  if (PlayerResearch.hasResearched(p, "Portable Tool Bench")) {
					  if (this.plugin.getConfig().getBoolean("items.pToolbench") == true) {
						    ItemStack SlimeHelmet = new ItemStack(Material.BOOK, 1);
						    ItemMeta im = SlimeHelmet.getItemMeta();
					         List<String> ll = new ArrayList<String>();
					         String l1 = ChatColor.YELLOW + "[Click to craft]";
					         String l0 = "";
					         String l2 = ChatColor.BLUE + "Materials needed:";
					         String l3 = ChatColor.BLUE + "1 tool bench";
					         String l4 = ChatColor.BLUE + "4 stones";
					         String l5 = ChatColor.BLUE + "1 book";
					         ll.add(l1);
					         ll.add(l0);
					         ll.add(l2);
					         ll.add(l3);
					         ll.add(l4);
					         ll.add(l5);
					         im.setLore(ll);
					         SlimeHelmet.setItemMeta(im);
							SlimeHelmet = Setname(SlimeHelmet, ChatColor.BLUE + "Portable Tool bench", " ");
							inv.setItem(slot, SlimeHelmet);
							slot++;
						  }
				  }
				  if (PlayerResearch.hasResearched(p, "Portable Book Binder")) {
					  if (this.plugin.getConfig().getBoolean("items.pBookBinder") == true) {
						    ItemStack SlimeHelmet = new ItemStack(Material.BOOK, 1);
						    ItemMeta im = SlimeHelmet.getItemMeta();
					         List<String> ll = new ArrayList<String>();
					         String l1 = ChatColor.YELLOW + "[Click to craft]";
					         String l0 = "";
					         String l2 = ChatColor.BLUE + "Materials needed:";
					         String l3 = ChatColor.BLUE + "8 books";
					         String l4 = ChatColor.BLUE + "4 gold ingots";
					         String l5 = ChatColor.BLUE + "1 Book and Quill";
					         String l6 = ChatColor.BLUE + "2 Crafting table";
					         ll.add(l1);
					         ll.add(l0);
					         ll.add(l2);
					         ll.add(l3);
					         ll.add(l4);
					         ll.add(l5);
					         ll.add(l6);
					         im.setLore(ll);
					         SlimeHelmet.setItemMeta(im);
							SlimeHelmet = Setname(SlimeHelmet, ChatColor.AQUA + "Portable Book Binder", " ");
							inv.setItem(slot, SlimeHelmet);
							slot++;
					    }
				  }
			  
			  p.openInventory(inv);
			  this.inv.put(p.getName(), "book");
	       }
		
	       @EventHandler
	 	  public void onClick(InventoryClickEvent e) {
	      try {
	 			  Player p = (Player) e.getWhoClicked();
	 				  if (this.inv.get(p.getName()).equals("book")) {
	 					  
	 					  e.setCancelled(true);
	 					  
	 					  if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Research Notes")) {
	 						  int level = plugin.getConfig().getInt("options.research-cost");
	 						  if (p.getLevel() >= level) {
	 							  
	 							  List<String> Researches = PlayerResearch.getResearchNames();
	 							  for (int i = 0; i < Researches.size() + 1; i++) {
	 								 if (i == Researches.size()) {
										  messages.AllResearched(p);
										  break;
									 }
	 								 else {
	 									if (!PlayerResearch.hasResearched(p, Researches.get(i))) {
		 									  
	 										  p.setLevel(p.getLevel() - level);
		 									  
		 									  PlayerResearch.research(p, Researches.get(i));
		 									  messages.Researched(p, Researches.get(i));
		 									  
		 									  p.playSound(p.getLocation(), Sound.BAT_TAKEOFF, (float) 0.7, 1);
		 									  break;
		 								  }
	 								 }
	 							  }
	 						  }
	 						  else {
	 							  messages.NotEnoughXP(p);
	 							 p.playSound(p.getLocation(), Sound.WITHER_SHOOT, 1, 1);
	 						  }
	 					  }
	 					  
	 					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Portable Book Binder")) {
							  if (p.getInventory().contains(Material.BOOK, 8) && p.getInventory().contains(Material.GOLD_INGOT, 4) && p.getInventory().contains(Material.BOOK_AND_QUILL, 1) && p.getInventory().contains(Material.WORKBENCH, 2)) {
								  
								  PlayerInventory.removeItemIgnoringMeta(p, Material.BOOK, 8);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.GOLD_INGOT, 4);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.BOOK_AND_QUILL, 1);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.WORKBENCH, 2);
								  
								  p.getInventory().addItem(SlimefunItem.PORTABLE_BOOK_BINDER);
								  e.setCancelled(true);
								  p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1, 1);
							  }
							  else {
								  messages.NotEnoughMaterials(p);
								  e.setCancelled(true);
								  p.playSound(p.getLocation(), Sound.WITHER_SHOOT, 1, 1);
							  }
						  	}
	 					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "Portable Tool bench")) {
							 if (p.getInventory().contains(Material.BOOK, 1) && p.getInventory().contains(Material.ENDER_PORTAL_FRAME, 1) && p.getInventory().contains(Material.STONE, 4)) {
								 
								 PlayerInventory.removeItemIgnoringMeta(p, Material.BOOK, 1);
								 PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PORTAL_FRAME, 1);
								 PlayerInventory.removeItemIgnoringMeta(p, Material.STONE, 4);
								 
								 p.getInventory().addItem(SlimefunItem.PORTABLE_TOOL_BENCH);
								 e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1, 1);
							 }
							 else {
								 messages.NotEnoughMaterials(p);
								e.setCancelled(true);
								p.playSound(p.getLocation(), Sound.WITHER_SHOOT, 1, 1);
							 }
						  }
	 					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Portable Jukebox")) {
							  if (p.getInventory().contains(Material.JUKEBOX, 2) && p.getInventory().contains(Material.BOOK_AND_QUILL, 1) && p.getInventory().contains(Material.WOOD, 5)) {
								  
								  PlayerInventory.removeItemIgnoringMeta(p, Material.JUKEBOX, 2);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.BOOK_AND_QUILL, 1);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.WOOD, 5);
								  
								  p.getInventory().addItem(SlimefunItem.PORTABLE_JUKEBOX);
								  e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1, 1);
							  }
							  else {
								  messages.NotEnoughMaterials(p);
								  e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SHOOT, 1, 1);
							  }
						  	}
	 					 
	 					 if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Invisible Tome")) {
							  if (p.getInventory().contains(Material.GOLDEN_CARROT, 4) && p.getInventory().contains(Material.BOOK_AND_QUILL, 1) && p.getInventory().contains(Material.ENDER_PEARL, 4)) {
								  
								  PlayerInventory.removeItemIgnoringMeta(p, Material.GOLDEN_CARROT, 4);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.BOOK_AND_QUILL, 1);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PEARL, 4);
								  
								  p.getInventory().addItem(SlimefunItem.INVISIBLE_TOME);
								  e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1, 1);
							  }
							  else {
								  messages.NotEnoughMaterials(p);
								  e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SHOOT, 1, 1);
							  }
						  	}
	 					 
	 					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Book o' Teleporting")) {
							  if (p.getInventory().contains(Material.NETHER_STAR, 4) && p.getInventory().contains(Material.BOOK_AND_QUILL, 1) && p.getInventory().contains(Material.ENDER_PEARL, 4) && p.getInventory().contains(Material.EYE_OF_ENDER, 1)) {
								  
								  PlayerInventory.removeItemIgnoringMeta(p, Material.NETHER_STAR, 4);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.BOOK_AND_QUILL, 1);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PEARL, 4);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.EYE_OF_ENDER, 1);
								  
								  p.getInventory().addItem(SlimefunItem.BOOK_O_TELEPORTING);
								  e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1, 1);
							  }
							  else {
								  messages.NotEnoughMaterials(p);
								  e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SHOOT, 1, 1);
							  }
						  	}
	 					if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "Tome of homeland")) {
							  if (p.getInventory().contains(Material.BED, 4) && p.getInventory().contains(Material.BOOK_AND_QUILL, 1) && p.getInventory().contains(Material.ENDER_PEARL, 4) && p.getInventory().contains(Material.EYE_OF_ENDER, 1) && p.getInventory().contains(Material.OBSIDIAN, 3)) {
								  
								  PlayerInventory.removeItemIgnoringMeta(p, Material.BED, 4);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.BOOK_AND_QUILL, 1);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.ENDER_PEARL, 4);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.EYE_OF_ENDER, 1);
								  PlayerInventory.removeItemIgnoringMeta(p, Material.OBSIDIAN, 3);
								 
								  p.getInventory().addItem(SlimefunItem.TOME_OF_HOMELAND);
								  e.setCancelled(true);
								 p.playSound(p.getLocation(), Sound.WITHER_SPAWN, 1, 1);
							  }
							  else {
								  	messages.NotEnoughMaterials(p);							  
									  e.setCancelled(true);
									  p.playSound(p.getLocation(), Sound.WITHER_SHOOT, 1, 1);
							  }
						  	}
	 					
	 				  }
	         }
	         catch (Exception x) {
	         }
	 	 }
	  
	  public ItemStack Setname(ItemStack iss, String Name, String Description) {
	   	    ItemStack tree = iss;
	   	    ItemMeta orange = tree.getItemMeta();
	   	    orange.setDisplayName(Name);
	   	    tree.setItemMeta(orange);
	   	    return tree;
	   	  }
	  public ItemStack setLore(ItemStack item, String lore){
	         ItemMeta im = item.getItemMeta();
	         List<String> ll = new ArrayList<String>();
	         ll.add(lore);
	         im.setLore(ll);
	         item.setItemMeta(im);
	         return item;
	       }
	  public ItemStack setDurability(ItemStack item, int i) {
			item.setDurability((short) i);
			return item;
			}

}
