package bzh.strawberrycorps.cosmetics.tasks;

import bzh.strawberrycorps.cosmetics.StrawCosmetics;
import org.bukkit.entity.Player;

/*
 * This file RenderTask is part of a project StrawTitles.
 * It was created on 11/01/2022 18:37 by Eclixal.
 * This file as the whole project shouldn't be modified by others without the express permission from StrawberryCorps author(s).
 * Also this comment shouldn't get remove from the file. (see Licence)
 */
public class RenderTask implements Runnable {

    @Override
    public void run() {
        for (Player player : StrawCosmetics.INSTANCE.getServer().getOnlinePlayers()) {

        }
    }

}