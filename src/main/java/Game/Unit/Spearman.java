package Game.Unit;

import java.util.ArrayList;

public class Spearman extends Infantry {
    public Spearman(String name, int x, int y, int numberTeam) { //копейщик

        super(name, 10, new int[]{3, 5}, 12, 7, x, y, numberTeam, 5);
    }
}
