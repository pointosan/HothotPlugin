package com.gmail.pointchanneru.hothotlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHot implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {


        if (!sender.isOp())
        {
            sender.sendMessage(ChatColor.RED + "権限がありません.");
            return true;
        }




        for(Player p:Bukkit.getOnlinePlayers()) {
            p.setFireTicks(1999999999);//(単位はtick<-1秒=20ticks)

        }
        return true;
    }
}
            