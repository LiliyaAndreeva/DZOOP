package Unit;

import java.util.ArrayList;

public abstract class BaseHero implements InGameInterface {

    static public String name;
    protected int age;
    protected String gender;
    protected int healthMax;
    protected int healthcurent;
    protected int atack;

    protected int numberTeam;
    protected Coordinats coordinats;


    public enum Weapon {
        spear, // копье
        crossbow, // арбалет
        magicWand,
        rifle, //винтовка
        nothing
    }

    int[] damage; // повреждения можно посчиттаь по формуле
    int def; //защита

    public BaseHero(int age, String gender, int healthMax, int atack, int[] damage, int def, int x, int y, int nT) {
        this.age = age;
        this.gender = gender;
        this.healthMax = healthMax = this.healthcurent;
        this.atack = atack;
        this.damage = damage;
        this.def = def;
        this.coordinats = new Coordinats(x, y);
        this.numberTeam = nT;
    }

    @Override
    public String toString() {
        return name;
    }

    public void step() {
    }

    ;

    protected static String getWeapon() {
        String w = String.valueOf(BaseHero.Weapon.values().length);
        return w;
    }

    public int findNearest(ArrayList<BaseHero> teamProtivnic) {
//        teamProtivnic.forEach(n->);

        double minR = Coordinats.Distance(coordinats.x, teamProtivnic.get(0).coordinats.x, coordinats.y,
                teamProtivnic.get(0).coordinats.y);
        int k = 0;

        for (int i = 1; i < 10; i++) {
            double R = Coordinats.Distance(coordinats.x, teamProtivnic.get(i).coordinats.x, coordinats.y,
                    teamProtivnic.get(i).coordinats.y);
            if (R < minR) {
                minR = R;
                k = i;
            }
        }
        System.out.println(getClass().getName()+" "+name+"- "+teamProtivnic.get(k).name+" "+minR);
        return k;
    }
    }






