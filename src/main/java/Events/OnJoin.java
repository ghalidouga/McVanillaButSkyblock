package Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.block.Block;

import java.util.Random;

public class OnJoin implements Listener {
    @EventHandler
    public void onJoin (PlayerJoinEvent e){
        Player player = e.getPlayer();
//        Location firstJoinLocation = new Location(Bukkit.getWorld("Blast"),0.5, 5,0.5);
        Random randomGenerator = new Random();
        int randomX = randomGenerator.nextInt(901 + 900) - 900;
        int randomZ = randomGenerator.nextInt(901 + 900) - 900;
        Location randomLocation = new Location(Bukkit.getWorld("Blast"),randomX,100,randomZ);
        player.teleport(randomLocation);
        Location playerLocation = player.getLocation();
        Location platformLocation = playerLocation.subtract(0,10,0);
//        double playerY = platformLocation - 10;
        platformLocation.getBlock().setType(Material.STONE_BRICKS);

    }
}
