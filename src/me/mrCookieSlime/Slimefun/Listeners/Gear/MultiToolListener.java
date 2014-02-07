package me.mrCookieSlime.Slimefun.Listeners.Gear;

import java.util.HashMap;
import java.util.Random;

import me.mrCookieSlime.Slimefun.startup;
import me.mrCookieSlime.Slimefun.Items.SlimefunItem;
import me.mrCookieSlime.Slimefun.Messages.messages;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Bat;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import com.RingOfStorms.commands.ecp.chest;

public class MultiToolListener implements Listener {
	
	private startup plugin;
	
	public HashMap<String, String> jump = new HashMap<String, String>();
	public HashMap<String, String> damage = new HashMap<String, String>();

	  public MultiToolListener(startup instance)
	  {
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	  
	  @SuppressWarnings("deprecation")
	@EventHandler
	  public void onInteract(PlayerInteractEvent e) {
		  try {
			  Player p = e.getPlayer();
			  if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
				  if (p.getItemInHand().getType() == Material.SHEARS) {
					  if (p.isSneaking()) {
						  if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_NONE.getItemMeta().getLore().toString())) {
							  ItemStack MultiTool = SlimefunItem.MULTI_TOOL_MODE_MAGIC_EYE_OF_ENDER;
							  MultiTool.setDurability(p.getItemInHand().getDurability());
							  p.setItemInHand(MultiTool);
							  messages.MultiToolModeChanged(p, "Magic Eye of Ender");
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_MAGIC_EYE_OF_ENDER.getItemMeta().getLore().toString())) {
							  ItemStack MultiTool = SlimefunItem.MULTI_TOOL_MODE_PORTABLE_CRAFTER;
							  MultiTool.setDurability(p.getItemInHand().getDurability());
							  p.setItemInHand(MultiTool);
							  messages.MultiToolModeChanged(p, "Portable Crafter");
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_PORTABLE_CRAFTER.getItemMeta().getLore().toString())) {
							  ItemStack MultiTool = SlimefunItem.MULTI_TOOL_MODE_ARROW_CANNON;
							  MultiTool.setDurability(p.getItemInHand().getDurability());
							  p.setItemInHand(MultiTool);
							  messages.MultiToolModeChanged(p, "Arrow Cannon");
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_ARROW_CANNON.getItemMeta().getLore().toString())) {
							  ItemStack MultiTool = SlimefunItem.MULTI_TOOL_MODE_ENDER_BACKPACK;
							  MultiTool.setDurability(p.getItemInHand().getDurability());
							  p.setItemInHand(MultiTool);
							  messages.MultiToolModeChanged(p, "Ender backpack");
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_ENDER_BACKPACK.getItemMeta().getLore().toString())) {
							  ItemStack MultiTool = SlimefunItem.MULTI_TOOL_MODE_WRENCH;
							  MultiTool.setDurability(p.getItemInHand().getDurability());
							  p.setItemInHand(MultiTool);
							  messages.MultiToolModeChanged(p, "Wrench");
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_WRENCH.getItemMeta().getLore().toString())) {
							  ItemStack MultiTool = SlimefunItem.MULTI_TOOL_MODE_GRAPPLING_HOOK;
							  MultiTool.setDurability(p.getItemInHand().getDurability());
							  p.setItemInHand(MultiTool);
							  messages.MultiToolModeChanged(p, "Grappling hook");
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_GRAPPLING_HOOK.getItemMeta().getLore().toString())) {
							  ItemStack MultiTool = SlimefunItem.MULTI_TOOL_MODE_MAGIC_EYE_OF_ENDER;
							  MultiTool.setDurability(p.getItemInHand().getDurability());
							  p.setItemInHand(MultiTool);
							  messages.MultiToolModeChanged(p, "Magic Eye of Ender");
						  }
					  }
					  else {
						  if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_MAGIC_EYE_OF_ENDER.getItemMeta().getLore().toString())) {
							  
							  if (p.getItemInHand().getDurability() < 237) {
									int r = new Random().nextInt(15);
							    	   if (r == 4) {
							    		   p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
							    	   }
							       }
							       else {
							    	   p.setItemInHand(null);
							    	   p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
							       }
							  
							  try {
					    		  if (p.getInventory().getHelmet().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
					    			  if (p.getInventory().getChestplate().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
					    				  if (p.getInventory().getLeggings().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
					    					  if (p.getInventory().getBoots().getEnchantmentLevel(Enchantment.PROTECTION_EXPLOSIONS) == 7) {
					    			    		  p.launchProjectile(EnderPearl.class);
					    			    	  }
					    		    	  }
					    	    	  }
						    	  }
					    	  }
					    	  catch(Exception x) {
					    		  
					    	  }
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_PORTABLE_CRAFTER.getItemMeta().getLore().toString())) {
							  
							  if (p.getItemInHand().getDurability() < 237) {
									int r = new Random().nextInt(15);
							    	   if (r == 4) {
							    		   p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
							    	   }
							       }
							       else {
							    	   p.setItemInHand(null);
							    	   p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
							       }
							  
							  p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1, 1);
					    	  p.openWorkbench(null, true);
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_ARROW_CANNON.getItemMeta().getLore().toString())) {
							  
							  if (p.getItemInHand().getDurability() < 237) {
									int r = new Random().nextInt(15);
							    	   if (r == 4) {
							    		   p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
							    	   }
							       }
							       else {
							    	   p.setItemInHand(null);
							    	   p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
							       }
							  
							  Vector direction = e.getPlayer().getEyeLocation().getDirection().multiply(1);
					    	  Projectile projectile = (Projectile)e.getPlayer().getWorld().spawn(e.getPlayer().getEyeLocation().add(direction.getX(), direction.getY(), direction.getZ()), Arrow.class);
					    	  projectile.setShooter(e.getPlayer());
					    	  projectile.setVelocity(direction);
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_ENDER_BACKPACK.getItemMeta().getLore().toString())) {
							  
							  if (p.getItemInHand().getDurability() < 237) {
									int r = new Random().nextInt(15);
							    	   if (r == 4) {
							    		   p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
							    	   }
							       }
							       else {
							    	   p.setItemInHand(null);
							    	   p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
							       }
							  
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
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_WRENCH.getItemMeta().getLore().toString())) {
							  
							  if (p.getItemInHand().getDurability() < 237) {
									int r = new Random().nextInt(15);
							    	   if (r == 4) {
							    		   p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
							    	   }
							       }
							       else {
							    	   p.setItemInHand(null);
							    	   p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
							       }
							  try {
								  if (e.getClickedBlock().getType() == Material.ENDER_PORTAL_FRAME) {
									  p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
									  e.getClickedBlock().breakNaturally();
									  p.getWorld().dropItemNaturally(e.getClickedBlock().getLocation(), SlimefunItem.TOOL_BENCH);
									  e.setCancelled(true);
								  }
							  }
							  catch(Exception x) {
								  
							  }
						  }
						  else if (p.getItemInHand().getItemMeta().getLore().toString().equalsIgnoreCase(SlimefunItem.MULTI_TOOL_MODE_GRAPPLING_HOOK.getItemMeta().getLore().toString())) {
							  
							  if (p.getItemInHand().getDurability() < 237) {
									int r = new Random().nextInt(15);
							    	   if (r == 4) {
							    		   p.getItemInHand().setDurability((short) (p.getItemInHand().getDurability() + 1));
							    	   }
							       }
							       else {
							    	   p.setItemInHand(null);
							    	   p.playSound(p.getLocation(), Sound.ZOMBIE_METAL, 1, 1);
							       }
							  try {
								  Vector direction = e.getPlayer().getEyeLocation().getDirection().multiply(3);
						    	  Projectile projectile = (Projectile)e.getPlayer().getWorld().spawn(e.getPlayer().getEyeLocation().add(direction.getX(), direction.getY(), direction.getZ()), Arrow.class);
						    	  projectile.setShooter(e.getPlayer());
						    	  projectile.setVelocity(direction);
						    	  Arrow arrow = (Arrow) projectile;
						    	  Bat bat = p.getWorld().spawn(
						    	  p.getEyeLocation(), Bat.class);
						    	  
						    	  bat.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100000, 100000));
						    	  bat.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100000, 100000));
						    	   
						    	  bat.setLeashHolder(arrow);
						    	  
						    	  jump.put(p.getName(), "true");
						    	  
						    	  bat.setHealth((double)0);
						    	  
						    	  damage.put(p.getName(), "true");
							  }
							  catch(Exception x) {
								  
							  }
						  }
					  }
				  }
			  }
		  }
		  catch(Exception x) {
			  
		  }
	  }
	  
	  @EventHandler
		public void onLand(ProjectileHitEvent e) {
			if (e.getEntity() instanceof Arrow) {
				if (e.getEntity().getShooter() instanceof Player) {
					Player p = (Player) e.getEntity().getShooter();
					Arrow a = (Arrow) e.getEntity();
					Location l = a.getLocation();
					Location pl = p.getLocation();
					try {
						if (jump.get(p.getName()).equalsIgnoreCase("true")) {
							  if (pl.distance(l) < 3.0D) {
								  if (l.getY() > pl.getY()) {
								      p.setVelocity(new Vector(0.0D, 0.25D, 0.0D));
								      return;
								  }

								    Vector vector = l.toVector().subtract(pl.toVector());
								    p.setVelocity(vector);
								    
							      } else {
							    	    pl.setY(pl.getY() + 0.5D);
							    	    p.teleport(pl);

							    	    double g = -0.08D;
							    	    double d = l.distance(pl);
							    	    double t = d;
							    	    double v_x = (1.0D + 0.08000000000000001D * t) * (l.getX() - pl.getX()) / t;
							    	    double v_y = (1.0D + 0.04D * t) * (l.getY() - pl.getY()) / t - 0.5D * g * t;
							    	    double v_z = (1.0D + 0.08000000000000001D * t) * (l.getZ() - pl.getZ()) / t;

							    	    Vector v = p.getVelocity();
							    	    v.setX(v_x);
							    	    v.setY(v_y);
							    	    v.setZ(v_z);
							    	    p.setVelocity(v);
							    	    
							      }
						    	  
						    	jump.remove(p.getName());
							}
					}
					catch(Exception x) {
						
					}
				}
			}
		}
	  
	  @EventHandler
		public void onDamage(EntityDamageByEntityEvent e) {
			if (e.getDamager() instanceof Arrow) {
				Arrow a = (Arrow) e.getDamager();
				if (a.getShooter() instanceof Player) {
					Player p = (Player) a.getShooter();
					if (damage.containsKey(p.getName())) {
						e.setCancelled(true);
					}
				}
			}
		}
	  
	  @EventHandler
	  public void onEntityDamaged(EntityDamageEvent e){
	      if (((e.getEntity() instanceof Player)) && (e.getCause().equals(EntityDamageEvent.DamageCause.FALL))) {
	        Player p = (Player)e.getEntity();
	        try {
	        	if (damage.get(p.getName()).equalsIgnoreCase("true")) {
		        	e.setCancelled(true);
		        	damage.remove(p.getName());
		        }
	        }
	        catch(Exception x) {
	        	
	        }
	    }
	}

}
