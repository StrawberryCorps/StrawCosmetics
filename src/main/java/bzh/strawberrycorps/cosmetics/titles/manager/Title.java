package bzh.strawberrycorps.cosmetics.titles.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
This file Title is part of a project StrawCosmetics.
It was created on 09/01/2022 at 21:20 by Uicias.
This file as the whole project shouldn't be modified by others without the express permission from StrawCosmetics author(s).
Also, this comment shouldn't get remove from the file. (see Licence.md)
*/

@AllArgsConstructor
@Data
@ToString
public class Title {

    private int id;
    private String flatName;
    private String displayName;
}