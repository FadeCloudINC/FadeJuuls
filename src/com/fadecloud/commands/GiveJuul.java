package com.fadecloud.commands;

import com.fadecloud.utilz.Chat;
import com.fadecloud.utilz.Juul;
import com.fadecloud.utilz.Pods;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveJuul implements CommandExecutor {

    private Juul juul = new Juul();
    private Pods pods = new Pods();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if (p.hasPermission("juul.use")) {

            if (cmd.getName().equalsIgnoreCase("juul")) {

                if (args.length == 0) {

                    sender.sendMessage(Chat.c("&b&lFadeCloud Juuling"));
                    sender.sendMessage(Chat.c(""));
                    sender.sendMessage(Chat.c("&b/juul give <player>"));
                    sender.sendMessage(Chat.c("&7Gives a player a regular juul"));
                    sender.sendMessage(Chat.c(""));
                    sender.sendMessage(Chat.c("&b/juul pods <player> <type>"));
                    sender.sendMessage(Chat.c("&7Types: Mango, Mint, Rainbow"));
                    sender.sendMessage(Chat.c(""));
                    return false;
                }

                if (args.length == 2) {

                    if (args[0].equalsIgnoreCase("give")) {

                        Player player = Bukkit.getPlayer(args[1]);

                        if (player != null) {

                            player.getInventory().addItem(Juul.getJuulItem());
                            player.sendMessage(Chat.c("&6&l[!] &eCongradulations you have received a &6JUUL&r&e!"));
                            return false;

                        } else sender.sendMessage(Chat.c("&4&l[!] &cThis player is offline"));
                        return false;
                    }
                }

                if (args.length == 3) {

                    if (args[0].equalsIgnoreCase("pods")) {

                        Player player = Bukkit.getPlayer(args[1]);

                        if (player != null) {

                            if (args[2].equalsIgnoreCase("mango")) {

                                player.getInventory().addItem(Pods.getMangoPod());
                                player.sendMessage(Chat.c("&6&l[!] &eYou have received a new pod: &cMango&e!"));
                                return false;

                            }

                        } else sender.sendMessage(Chat.c("&4&l[!] &cThis player is offline")); return false;
                    }
                }

            }
        } return false;
    }
}
