package Game.Unit;

import Game.Interface.InGameInterface;
import Game.Map.Coordinats;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements InGameInterface {

    static public String name;
    protected int healthMax;
    protected int healthcurent;
    protected int atack;
    protected int numberTeam;
    protected Coordinats coordinats;
    public String status;
    public int initiative;


    int[] damage; // повреждения можно посчиттаь по формуле


    public BaseHero(String name, int healthMax, int atack, int[] damage, int x, int y, int nT, int initiative) {

        this.name = name;
        this.healthMax =  this.healthcurent = healthMax;
        this.atack = atack;
        this.damage = damage;
        this.initiative = initiative;
        this.coordinats = new Coordinats(x, y);
        this.numberTeam = nT;
        this.status ="Stand";

    }

    public int findNearest (ArrayList < BaseHero > teamProtivnic) {
//
        ArrayList<BaseHero> notDeadTeam = new ArrayList<BaseHero>();
        for (BaseHero p : teamProtivnic) {
            if (!p.isDead()) notDeadTeam.add(p);
        }

        int minR = this.coordinats.distance(notDeadTeam.get(0).coordinats);
        int k = 0;

        for (int i = 1; i < notDeadTeam.size(); i++) {
            int R = this.coordinats.distance(notDeadTeam.get(i).coordinats);
            if (R < minR) {
                minR = R;
                k = i;
            }
        }
        return k;
    }

    public void step(ArrayList<BaseHero> teamTwo, ArrayList<BaseHero> teamOne) {
    }

    protected void getDamage(float damage) {
        this.healthcurent -= damage;
        if (this.healthcurent <= 0) {
            this.status = "Die";
            this.healthcurent = 0;
        }
        if (this.healthcurent > this.healthMax) {
            this.healthcurent = this.healthMax;
        }
    }

//
    public int[] getCoords() {
        int[] coord = new int[2];
        coord[0] = this.coordinats.x;
        coord[1] = this.coordinats.y;

        return coord;
    }

    public float getHp(){
        return this.healthcurent;
    }

    public String getInfo() {
        return  String.format(" %s %s %s \u2764: %s \u2661: %s \u2694: %s In: %s  X: %s Y: %s",this.getClass().getSimpleName(),this.name,
                this.status, this.healthMax, this.healthcurent, Arrays.toString(this.damage) , this.initiative, this.coordinats.x, this.coordinats.y);
    }
    public boolean isDead(){
        if (this.status == "Die") return true;
        return false;
    }

}





