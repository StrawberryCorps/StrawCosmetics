package bzh.strawberrycorps.cosmetics;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.bukkit.plugin.java.JavaPlugin;

@Log4j
public class StrawCosmetics extends JavaPlugin {

    @Getter
    public static StrawCosmetics INSTANCE;

    @Override
    public void onEnable() {
        long begin = System.currentTimeMillis();
        INSTANCE = this;
        log.info("######################## [StrawCosmetics - " + getDescription().getVersion() + "] #################################");

        log.info("Plugin enabled in " + (System.currentTimeMillis() - begin) + " ms.");
        log.info("######################## [StrawCosmetics - " + getDescription().getVersion() + "] #################################");
    }
}
