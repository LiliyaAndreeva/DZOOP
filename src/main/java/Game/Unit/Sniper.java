package Game.Unit;

import java.util.ArrayList;

public class Sniper extends Shooter {

    public Sniper(String name, int x, int y, int numberTeam) {

        super(name, 10, new int[]{3, 5}, 5, 2, 15, x, y, numberTeam, 8);
    }

}


