package Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class StartJourney implements Listener {
    @EventHandler
    public void rightClickStarter (PlayerInteractEvent e){
        Player player = e.getPlayer();
        if(!e.hasItem()) return;
        if(e.getItem().getType().equals(Material.GOLD_BLOCK)) {
            player.sendMessage("teleporting to random location");
            player.getInventory().remove(Material.GOLD_BLOCK);

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
            player.getInventory().addItem(new ItemStack(Material.DIRT,14));
            player.getInventory().addItem(new ItemStack(Material.WOODEN_HOE));
            Location playerLocation = player.getLocation();

            Location platformLocation00 = playerLocation.subtract(0,5,0); // Center platform
            platformLocation00.getBlock().setType(Material.GRASS_BLOCK);


        }


//        if(e.getAction() == Action.RIGHT_CLICK_BLOCK && player.getInventory().containsAtLeast(starter,1)){

//        }

    }

}
