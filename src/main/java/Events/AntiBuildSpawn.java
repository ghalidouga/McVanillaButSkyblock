package Events;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;



public class AntiBuildSpawn implements Listener {
    @EventHandler

    public void CantBuildSpawn (BlockPlaceEvent e){
        Player player = e.getPlayer();
        Location playerLocation = player.getLocation();
        double playerX = playerLocation.getX();
        double playerZ = playerLocation.getZ();



        if(playerX < 20 && playerZ < 20 && playerX < 20 && playerZ > -20 && playerX > -20 && playerZ < 20 && playerX > -20 && playerZ > -20){
            if(!player.isOp()) {
                e.setCancelled(true);
                player.sendMessage(ChatColor.RED + "Sorry, can't do that here");
            }
            else {
                e.setCancelled(false);
            }
        }
    }
}
