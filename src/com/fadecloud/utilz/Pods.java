package com.fadecloud.utilz;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Pods {

    public static ItemStack getMangoPod () {

        ItemStack item = new ItemStack(Material.STORAGE_MINECART);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore= new ArrayList<String>();

        meta.setDisplayName(Chat.c("&4&l*&c&l*&f&l* &c&lMANGO &4&lPOD &f&l*&c&l*&4&l*"));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7Feel the power of the mango pod as you"));
        lore.add(Chat.c("&7puff until the fire is lit inside you!"));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7&o(( &f&oDrop and drag &7&oto your juul! ))"));

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;

    }

}
