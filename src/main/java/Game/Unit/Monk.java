package Game.Unit;

import java.util.ArrayList;

public class Monk extends Magi { // монах
    public Monk(String name, int x, int y, int numberTeam) {
        super(name, 10, new int[]{1,5}, 2, 10, x, y, numberTeam, 4);

    }

    @Override
    public void step(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team) {
        if (mana <= 0) return;
        super.findDamagePerson(teamProtivnic).getDamage(damage[0]);
        mana -= damage[0];
    }


}