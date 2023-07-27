package Game.Unit;

import java.util.ArrayList;

public class Peasant extends Infantry { // крестьянин
    public Peasant(String name, int x, int y, int numberTeam) {

        super(name, 10, new int[]{6,7}, 2, 5, x, y, numberTeam, 3);
    }

    @Override
    public void step(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team) {
        if (this.healthcurent == 0) return;
        status ="Stand";
    }
}