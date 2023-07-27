package Game.Unit;

import java.util.ArrayList;

public abstract class Shooter extends BaseHero { //стрелки

     int range;
     int capacity;


    public Shooter(String name,int healthcurent, int[] damage, int attack, int range, int capacity, int x, int y, int numberTeam, int initiative) {
        super(name, healthcurent,  attack, damage, x, y, numberTeam, initiative);
        this.range = range;
       this.capacity = capacity;
    }
    @Override
    public void step(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team){
        if (this.healthcurent == 0) return;
        if (this.capacity == 0) return;

        int k = super.findNearest(teamProtivnic);
        teamProtivnic.get(k).getDamage((this.damage[1]+this.damage[0])/2);

        for(BaseHero p: team) {
            if (p.getClass() == Peasant.class && p.status.equals("Stand")) {
                p.status.equals("Busy");
                if (this.capacity == 0) this.capacity += 1;
                return;
            }
        }
        this.capacity -=1;
    }


    @Override
    public boolean isDead() {
        return false;
    }
    @Override
    public String getInfo() {
        return String.format("%s \u27B3: %s", super.getInfo(), this.capacity);
    }


}
