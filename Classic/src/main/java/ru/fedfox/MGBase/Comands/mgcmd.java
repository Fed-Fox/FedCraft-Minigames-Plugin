package ru.fedfox.MGBase.Comands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class mgcmd extends Command {
    public mgcmd() {
        super("mgcmd","Test description");
        this.setPermission("mgcmd.use");
    }

    @Override
    public boolean execute(CommandSender s, String str, String[] args) {
        if (args.length <= 1){
            s.sendMessage("§o§7Usage /mgcmd <join/leave> <player>");
        }else if (args[0].length() <= 1){
            s.sendMessage("§o§7Usage /mgcmd <join/leave> <player>");
        }else if (args[1].length() <= 1){
            s.sendMessage("§o§7Usage /mgcmd <join/leave> <player>");
        }else{
            Player pl = s.getServer().getPlayer(args[1]);
            if (pl == null){
                s.sendMessage("The player %pl is not on the server, check the spelling of the player".replace("%pl", args[1]));
            }else{
                switch (args[0]){
                    case "join":
                        //TODO
                    case "leave":
                        //TODO
                    default:
                        s.sendMessage("The %arg argument was not found".replace("%arg", args[0]));
                }
            }
        }
        return false;
    }
}
