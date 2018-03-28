package org.vx12.pets.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.vx12.pets.Pet;

public class PetCommand implements CommandExecutor{

    private Pet plugin;
    public PetCommand(Pet plugin){
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player){

        } else {
            sender.sendMessage("You are not allowed to execute this command!");
            return false;
        }

        return false;
    }


}
