package com.fadecloud.events;

import com.fadecloud.utilz.Juul;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlaceEvent implements Listener {

    @EventHandler
    public void onPlaceEvent(PlayerInteractEvent event) {
        Player p = event.getPlayer();

        if (p.getItemInHand().equals(null)) {
            return;
        }

        if (p.getItemInHand().isSimilar(Juul.getJuulItem()) || p.getItemInHand().isSimilar(Juul.getMangoJuul())) {

            event.setCancelled(true);

        }
    }
}
