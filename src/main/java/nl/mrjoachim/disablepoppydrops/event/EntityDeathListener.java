package nl.mrjoachim.disablepoppydrops.event;

import org.bukkit.Material;
import org.bukkit.entity.IronGolem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class EntityDeathListener implements Listener {

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e){


        if(e.getEntity() instanceof IronGolem){
            for (ItemStack i : e.getDrops()) {
                if(i.getType() == Material.POPPY){
                    i.setType(Material.AIR);
                }
            }
        }

    }

}
