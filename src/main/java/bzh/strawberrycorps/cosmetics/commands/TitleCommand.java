package bzh.strawberrycorps.cosmetics.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

/**
 * This file TitleCommand is part of a project StrawTitles.
 * It was created on 10/01/2022 18:41 by Eclixal.
 * This file as the whole project shouldn't be modified by others without the express permission from StrawberryCorps author(s).
 * Also, this comment shouldn't get remove from the file. (see Licence)
 */

public class TitleCommand extends AbstractCommand {

    public TitleCommand(Plugin plugin) {
        super(plugin, "strawcosmetics.title.player");
    }

    @Override
    protected boolean onCommand(CommandSender sender, String label, String[] arguments) {
        return false;
    }
}
