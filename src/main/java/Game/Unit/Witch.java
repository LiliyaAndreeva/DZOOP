package Game.Unit;

import java.util.ArrayList;

public class Witch extends Magi {

    public Witch(String name, int x, int y, int numberTeam) {
        super(name, 10, new int[]{-3, -6}, 4, 10, x, y, numberTeam, 5);
        //this.mana = mana;
    }


    @Override
    public void step(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team) {
        if (mana <= 0) return;
        if (super.findDamagePerson(team).healthcurent == super.findDamagePerson(team).healthcurent) return;

        else {
            super.findDamagePerson(team).getDamage(damage[0]);
            mana += damage[0];
            if (super.findDamagePerson(team).healthcurent > super.findDamagePerson(team).healthcurent)
                super.findDamagePerson(team).healthcurent = super.findDamagePerson(team).healthMax;
        }
    }
}


