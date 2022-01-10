package bzh.strawberrycorps.cosmetics.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * This file AdminTitleCommand is part of a project StrawTitles.
 * It was created on 10/01/2022 18:40 by Eclixal.
 * This file as the whole project shouldn't be modified by others without the express permission from StrawberryCorps author(s).
 * Also, this comment shouldn't get remove from the file. (see Licence)
 */

public class AdminTitleCommand extends AbstractCommand {

    public AdminTitleCommand(Plugin plugin) {
        super(plugin, "strawcosmetics.title.admin");
    }

    @Override
    protected boolean onCommand(CommandSender sender, String label, String[] arguments) {
        return false;
    }
}
