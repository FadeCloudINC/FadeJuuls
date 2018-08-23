package com.fadecloud.utilz;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Juul {

    public static ItemStack getJuulItem () {

        String check = "\u2713";

        ItemStack item = new ItemStack(Material.LEVER, 1);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore= new ArrayList<String>();

        meta.setDisplayName(Chat.c("&7&l*&f&l*&7&l* &b&lF&f&lC &e&lJ&a&lU&b&lU&d&lL &7&l*&f&l*&7&l*"));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7Fade Juuls are the future of fade. It will help"));
        lore.add(Chat.c("&7you relief stress from this block game."));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7Christian Verified &a&l" + check));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7&o(( &f&oRemember &7&oto charge your juul! ))"));

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;

    }

    public static ItemStack getMangoJuul () {

        String check = "\u2713";

        ItemStack item = new ItemStack(Material.LEVER, 1);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore= new ArrayList<String>();

        meta.setDisplayName(Chat.c("&7&l*&f&l*&7&l* &b&lF&f&lC &e&lJ&a&lU&b&lU&d&lL &7&l*&f&l*&7&l*"));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7Fade Juuls are the future of fade. It will help"));
        lore.add(Chat.c("&7you relief stress from this block game."));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7Christian Verified &a&l" + check));
        lore.add(Chat.c("&7Pod Type Inserted &c&lMANGO"));
        lore.add(Chat.c(""));
        lore.add(Chat.c("&7&o(( &f&oRemember &7&oto charge your juul! ))"));

        meta.setLore(lore);
        item.setItemMeta(meta);

        return item;

    }
}
