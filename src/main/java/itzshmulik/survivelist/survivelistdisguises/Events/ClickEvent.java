package itzshmulik.survivelist.survivelistdisguises.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class ClickEvent implements Listener {

    @EventHandler
    public void ClickEvent(InventoryClickEvent e){

        String title = "Choose a disguise";

        if(e.getView().getTitle().equals(title)){

            boolean isDisguised = false;

            Player player = (Player) e.getWhoClicked();

            switch(e.getCurrentItem().getType()){

                // Skelaton disguise
                case BONE:
                    if(player.hasPermission("disguise.skelaton")) {

                            player.closeInventory();
                            isDisguised = true;

                            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aYou're now disguised as a skelaton!"));

                            player.setInvisible(true);
                    }
                    break;

                // Zombie disguise
                case ROTTEN_FLESH:
                    if(player.hasPermission("disguise.zombie")){

                        player.closeInventory();
                        isDisguised = true;

                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aYou're now disguised as a zombie!"));

                        player.setInvisible(true);
                    }
                    break;

                case PLAYER_HEAD:
                    if(isDisguised = true){

                        player.closeInventory();
                        isDisguised = false;

                        player.setInvisible(false);
                    }
                    break;
            }

            e.setCancelled(true);

        }
    }

}
