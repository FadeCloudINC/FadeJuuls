package com.fadecloud.events;

import com.fadecloud.utilz.Chat;
import com.fadecloud.utilz.Cooldown;
import com.fadecloud.utilz.Juul;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ClickEvent implements Listener {

    private Juul juul = new Juul();
    private Cooldown cd = new Cooldown();

    int count = 0;

    @EventHandler
    public void onClickEvent(PlayerInteractEvent event) {
        Player p = event.getPlayer();

        if (p.getItemInHand().getType().equals(Material.LEVER) && p.getItemInHand().getItemMeta().getLore().contains(Chat.c("&7&o(( &f&oRemember &7&oto charge your juul! ))"))) {

            if (cd.getCooldown(p)) {

                if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK ||
                        event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {

                    if (cd.onCooldown(p)) {

                        if (p.getItemInHand().getItemMeta().getLore().contains(Chat.c("&7Pod Type Inserted &c&lMANGO"))) {

                            p.getWorld().spigot().playEffect(p.getLocation(), Effect.FLAME, 0, 0, (float) 1.0, (float) 1.0, (float) 1.0, (float) 0.01, 50, 50);
                            count++;

                        } else {

                            p.getWorld().spigot().playEffect(p.getLocation(), Effect.CLOUD, 0, 0, (float) 1.0, (float) 1.0, (float) 1.0, (float) 0.01, 50, 50);
                            count++;

                        }

                        if (count == 10) {

                            p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
                            count = 0;
                            p.sendMessage(Chat.c("&e&l[!] &eYou got nauseous, please calm down before you can puff again."));
                            cd.createCooldown(p);

                        }

                    } else p.sendMessage(Chat.c("&e&l[!] &ePlease wait before hitting your juul"));
                }

            } else if (event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {

                p.getWorld().spigot().playEffect(p.getLocation(), Effect.CLOUD, 0, 0, (float) 1.0, (float) 1.0, (float) 1.0, (float) 0.01, 50, 50);
                count++;
                cd.createCooldown(p);

            }
        }
    }
}
