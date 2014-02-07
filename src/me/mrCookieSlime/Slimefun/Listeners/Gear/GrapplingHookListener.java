package me.mrCookieSlime.Slimefun.Listeners.Gear;

import java.util.HashMap;

import me.mrCookieSlime.Slimefun.startup;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class GrapplingHookListener implements Listener {
	
	private startup plugin;
	public HashMap<String, String> jump = new HashMap<String, String>();
	public HashMap<String, String> damage = new HashMap<String, String>();
	
	public GrapplingHookListener(startup instance){
	    this.plugin = instance;
	    this.plugin.getServer().getPluginManager().registerEvents(this, this.plugin);
	  }
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onShoot(PlayerInteractEvent e) {
		Player p = e.getPlayer();
	    if (p.getItemInHand().getType() == Material.LEASH && p.getItemInHand().getDurability() == 1) {
	    	Action a = e.getAction();
		      if ((a == Action.RIGHT_CLICK_AIR) || (a == Action.RIGHT_CLICK_BLOCK)) {
		    	  
		    	  if (p.getItemInHand().getAmount() != 1) {
		    		  if (p.getGameMode() != GameMode.CREATIVE) {
		    			  p.getItemInHand().setAmount(p.getItemInHand().getAmount() - 1);
		    		  }
		    	  }
		    	  else {
		    		  if (p.getGameMode() != GameMode.CREATIVE) {
		    			  p.setItemInHand(null);
		    		  }
		    		  
		    	  }
		    	   
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
	    }
	}
	
	@SuppressWarnings("deprecation")
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
	
	@SuppressWarnings("deprecation")
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
	public void onLeash(PlayerInteractEntityEvent e) {
		Player p = e.getPlayer();
		if (p.getItemInHand().getType() == Material.LEASH && p.getItemInHand().getDurability() == 1) {
			e.setCancelled(true);
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
