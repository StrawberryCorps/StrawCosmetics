package bzh.strawberrycorps.cosmetics;

import bzh.strawberrycorps.cosmetics.titles.TitleManager;
import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

/**
 * This file StrawCosmetics is part of a project StrawTitles.
 * It was created on 10/01/2022 18:30 by Eclixal and Uicias.
 * This file as the whole project shouldn't be modified by others without the express permission from StrawberryCorps author(s).
 * Also, this comment shouldn't get remove from the file. (see Licence)
 */

@Log4j
public class StrawCosmetics extends JavaPlugin {

    @Getter
    public static StrawCosmetics INSTANCE;

    @Getter
    public static TitleManager titleManager;

    @Override
    public void onEnable() {
        long begin = System.currentTimeMillis();
        INSTANCE = this;
        log.info("######################## [StrawCosmetics - " + getDescription().getVersion() + "] #################################");
        log.info("######################## [Plugin by - " + Arrays.toString(this.getDescription().getAuthors().toArray()) + "] #################################");

        log.info("Started loading titles.");
        titleManager = TitleManager.getInstance();
        log.info("Loaded titles.");

        log.info("Plugin enabled in " + (System.currentTimeMillis() - begin) + " ms.");
        log.info("######################## [StrawCosmetics - " + getDescription().getVersion() + "] #################################");
    }
}
