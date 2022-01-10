package bzh.strawberrycorps.cosmetics.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * This file AbstractCommand is part of a project StrawTitles.
 * It was created on 10/01/2022 18:38 by Eclixal.
 * This file as the whole project shouldn't be modify by others without the express permission from StrawberryCorps author(s).
 * Also this comment shouldn't get remove from the file. (see Licence)
 */
public abstract class AbstractCommand implements CommandExecutor {

    protected final Plugin plugin;
    protected final String permission;

    public AbstractCommand(Plugin plugin, String permission) {
        this.plugin = plugin;
        this.permission = permission;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!commandSender.isOp() && !commandSender.hasPermission(this.permission)) {
            commandSender.sendMessage("§cYou don't have permission to execute this command (REQUIRE_{permission})".replace("{permission}", permission.toUpperCase()));
            return false;
        }
        return onCommand(commandSender, s, strings);
    }

    protected abstract boolean onCommand(CommandSender sender, String label, String[] arguments);
}