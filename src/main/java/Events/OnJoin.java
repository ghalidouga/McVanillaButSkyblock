package Events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class OnJoin implements Listener {
    @EventHandler
    public void onJoin (PlayerJoinEvent e){
        Player player = e.getPlayer();
        ItemStack starter = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta starterMeta = starter.getItemMeta();
        starterMeta.setDisplayName(ChatColor.GREEN + "Start your journey!");
        starter.setItemMeta(starterMeta);

        Location lobbySpawn = new Location(Bukkit.getWorld("Blast"),0.5,5,0.5,0,0);
        if(!player.hasPlayedBefore()){
           player.teleport(lobbySpawn);
           player.getInventory().addItem(starter);
        }


    }


}

