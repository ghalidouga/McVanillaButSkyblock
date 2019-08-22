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
//
//        ItemStack starter = new ItemStack(Material.FIREWORK_ROCKET);
//        ItemMeta starterMeta = starter.getItemMeta();
//        starterMeta.setDisplayName(ChatColor.GREEN + "Start your journey!");
//        starter.setItemMeta(starterMeta);
        if(!e.hasItem()) return;
        if(e.getItem().getType().equals(Material.GOLD_BLOCK)) {
            e.getPlayer().sendMessage("teleporting to random location");
            player.getInventory().remove(Material.GOLD_BLOCK);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, 100, 3));
            Random randomGenerator = new Random();
            int randomX = randomGenerator.nextInt(901 + 900) - 900;
            int randomZ = randomGenerator.nextInt(901 + 900) - 900;
            Location randomLocation = new Location(Bukkit.getWorld("Blast"),randomX,100,randomZ);
            player.teleport(randomLocation);
            Location playerLocation = player.getLocation();
            Location platformLocation = playerLocation.subtract(0,10,0);
            platformLocation.getBlock().setType(Material.GRASS_BLOCK);
        }


//        if(e.getAction() == Action.RIGHT_CLICK_BLOCK && player.getInventory().containsAtLeast(starter,1)){

//        }

    }

}
