package com.fadecloud.utilz;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class Cooldown {

    HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();
    int time = 3;

    public boolean getCooldown(Player p) {

        return cooldown.containsKey(p.getUniqueId());

    }

    public void createCooldown(Player p) {

        cooldown.put(p.getUniqueId(), System.currentTimeMillis());

    }

    public boolean onCooldown(Player p) {

        long secLeft = (((cooldown.get(p.getUniqueId())) / 1000) + time) - (System.currentTimeMillis() / 1000);

        if (secLeft > 0) return false;
        else return true;

    }



}
