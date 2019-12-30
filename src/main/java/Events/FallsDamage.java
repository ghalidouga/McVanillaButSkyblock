package Events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallsDamage implements Listener {
    @EventHandler
    public void fallDamage (EntityDamageEvent e){
        EntityDamageEvent.DamageCause cause = e.getCause();
        Entity entity = e.getEntity();
        if(e.getCause() == EntityDamageEvent.DamageCause.FALL)
        {
            e.setDamage(100);
        }
    }
}
