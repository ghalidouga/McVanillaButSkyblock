package Events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class StartJourney implements Listener {
    @EventHandler
    public void rightClickStarter (PlayerInteractEvent e){
        Player player = e.getPlayer();
        Location playerLocation1 = player.getLocation();
        double playerX = playerLocation1.getX();
        double playerZ = playerLocation1.getZ();
        if(!e.hasItem()) return;
        if(e.getItem().getType().equals(Material.STICK) && playerX < 20 && playerZ < 20 && playerX < 20 && playerZ > -20 && playerX > -20 && playerZ < 20 && playerX > -20 && playerZ > -20) {
            player.sendMessage("teleporting to random location");
            player.getInventory().clear();

            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 100, 3));
            Random randomGenerator = new Random();
            int randomX = randomGenerator.nextInt(901 + 900) - 900;
            int randomZ = randomGenerator.nextInt(901 + 900) - 900;
            int randomY = randomGenerator.nextInt(195);
            player.sendMessage("X = "+randomX+" Y = "+randomY+" Z = "+randomZ);
            Location randomLocation = new Location(Bukkit.getWorld("Blast"),randomX,randomY+21,randomZ);
            player.teleport(randomLocation);
            player.getInventory().addItem(new ItemStack(Material.ICE,2));
            player.getInventory().addItem(new ItemStack(Material.MELON));
            player.getInventory().addItem(new ItemStack(Material.TORCH,2));
            player.getInventory().addItem(new ItemStack(Material.LAVA_BUCKET));
            player.getInventory().addItem(new ItemStack(Material.PUMPKIN_SEEDS));
            player.getInventory().addItem(new ItemStack(Material.SUGAR_CANE));
            player.getInventory().addItem(new ItemStack(Material.WHEAT));
            player.getInventory().addItem(new ItemStack(Material.OAK_SAPLING));
            player.getInventory().addItem(new ItemStack(Material.GRASS_BLOCK,14));
            player.getInventory().addItem(new ItemStack(Material.WOODEN_HOE));
            player.getInventory().addItem(new ItemStack(Material.SHEEP_SPAWN_EGG,2));
            Location playerLocation = player.getLocation();

            Location platformLocation00 = playerLocation.subtract(0,5,0); // Center platform
            platformLocation00.getBlock().setType(Material.GRASS_BLOCK);


        }



    }

}
