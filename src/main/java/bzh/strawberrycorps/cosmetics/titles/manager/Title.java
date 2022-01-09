package bzh.strawberrycorps.cosmetics.titles.manager;

/*
This file Title is part of a project StrawCosmetics.
It was created on 09/01/2022 at 21:20 by Uicias.
This file as the whole project shouldn't be modified by others without the express permission from StrawCosmetics author(s).
Also, this comment shouldn't get remove from the file. (see Licence.md)
*/

public class Title {

    private int id;

    private String flatName;

    private String displayName;

    public Title(int id, String flatName, String displayName) {
        this.id = id;
        this.flatName = flatName;
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlatName() {
        return flatName;
    }

    public void setFlatName(String flatName) {
        this.flatName = flatName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", flatName='" + flatName + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }
}
