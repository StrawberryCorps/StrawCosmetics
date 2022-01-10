package bzh.strawberrycorps.cosmetics.titles;

import bzh.strawberrycorps.cosmetics.StrawCosmetics;
import bzh.strawberrycorps.cosmetics.titles.manager.Title;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
This file titleManager is part of a project StrawCosmetics.
It was created on 09/01/2022 at 21:19 by Uicias.
This file as the whole project shouldn't be modified by others without the express permission from StrawCosmetics author(s).
Also, this comment shouldn't get remove from the file. (see Licence.md)
*/
public class TitleManager {

    private List<Title> titles;

    private static TitleManager INSTANCE;

    private TitleManager() {
        this.titles = new ArrayList<>();
        this.readConfig();
    }

    public static TitleManager getInstance() {
        if (INSTANCE == null)
            new TitleManager();
        return INSTANCE;
    }

    private void readConfig() {
        for (String flatName : Objects.requireNonNull(StrawCosmetics.getINSTANCE().getConfig().getConfigurationSection("titles")).getKeys(false)) {
            //todo
        }
    }

    public Title getTitleByFlatName(String flatName) {
        return this.titles.stream().filter(title -> title.getFlatName().equalsIgnoreCase(flatName)).findFirst().orElse(null);
    }

}
