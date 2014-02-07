package me.mrCookieSlime.Slimefun.Setup;


import org.bukkit.inventory.Inventory;

import com.RingOfStorms.ecp.vars;

public class EnderChestPlusSupporter {
	
	public static Inventory getInventoryObject (String inventoryName) {
        if(vars.activeInventories == null || vars.activeInventories.isEmpty())
                return null;
        for(Inventory iv : vars.activeInventories.keySet()) {
                String[] args = iv.getTitle().toLowerCase().split(" ");
                        if(args.length < 2) {
                                continue;
                        }
                if(args[0].equalsIgnoreCase(inventoryName))
                        return iv;
        }
        return null;
}
	
	

}
