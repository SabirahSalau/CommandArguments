package me.glasswaves.commandarguments.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length == 0){
                player.sendMessage("Suicide is unacceptable.");
                player.setHealth(0);
            }
            else{
                Player target = Bukkit.getPlayerExact(args[0]);
                if(target instanceof Player){
                    player.sendMessage("You just tried to kill " + target.getDisplayName());
                    target.setHealth(5);
                    target.sendMessage(ChatColor.RED + player.getDisplayName() + " just tried to kill you!");
                }
                else{
                    player.sendMessage("That player does not exist.");
                }
            }
        }
        return false;
    }
}
