package Game.Unit;

import Game.Interface.InGameInterface;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Magi extends BaseHero implements InGameInterface { // маги

    int mana;

    public Magi(String name,int healthcurent, int[] damage, int attack, int mana, int x, int y, int numberTeam, int initiative) {
        super(name, healthcurent, attack, damage, x, y, numberTeam, initiative);
        this.mana = mana;
    }




   // public void step(ArrayList<BaseHero> teamTwo, ArrayList<BaseHero> teamOne){}

    @Override
    public String getInfo() {
        return String.format("%s \u2747: %s", super.getInfo(), this.mana);
    }



    public BaseHero findDamagePerson(ArrayList<BaseHero> team){
        ArrayList<BaseHero> damageSort = new ArrayList<BaseHero>(10);
        damageSort = team;
        damageSort.sort(new Comparator<BaseHero>() {
            @Override
            public int compare(BaseHero o1, BaseHero o2) {
                return ((o1.healthMax - o1.healthcurent) - (o2.healthMax - o2.healthcurent));
            }
        });
        return damageSort.get(0);

    }
}
