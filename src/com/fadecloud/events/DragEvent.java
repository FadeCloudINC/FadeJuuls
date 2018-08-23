package com.fadecloud.events;

import com.fadecloud.utilz.Chat;
import com.fadecloud.utilz.Juul;
import com.fadecloud.utilz.Pods;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class DragEvent implements Listener {

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onDragEvent(InventoryClickEvent e) {

        if (e.getClick().isLeftClick()) {

            Pods.getMangoPod();

            if (e.getCursor().isSimilar(Pods.getMangoPod()) && e.getCurrentItem().getType() == Material.LEVER && e.getCurrentItem().isSimilar(Juul.getJuulItem())) {

                if (e.getCurrentItem().getAmount() == 1) {

                    e.setCancelled(true);
                    e.setCurrentItem(null);
                    e.setCursor(null);
                    e.getWhoClicked().closeInventory();
                    e.getWhoClicked().getInventory().setItem(e.getSlot(), Juul.getMangoJuul());
                    e.getWhoClicked().sendMessage(Chat.c("&e&l[!] &eYou have inserted the &c&lMANGO &epod!"));

                } else e.getWhoClicked().sendMessage(Chat.c("&e&l[!] &ePlease unstack juuls to apply pod!"));
            }
        }
    }
}
