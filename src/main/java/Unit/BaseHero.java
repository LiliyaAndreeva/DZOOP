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
    public String status;
    protected int initiative;



    public enum Weapon {
        spear, // копье
        crossbow, // арбалет
        magicWand,
        rifle, //винтовка
        nothing
    }

    int[] damage; // повреждения можно посчиттаь по формуле
    int def; //защита

    public BaseHero(int age, String gender, int healthMax, int atack, int[] damage, int def, int initiative, int x, int y, int nT) {
        this.age = age;
        this.gender = gender;
        this.healthMax = healthMax = this.healthcurent;
        this.atack = atack;
        this.damage = damage;
        this.def = def;
        this.initiative = initiative;
        this.coordinats = new Coordinats(x, y);
        this.numberTeam = nT;
        this.status = "Stand";
    }

    public int findNearest (ArrayList < BaseHero > teamProtivnic) {
//
        ArrayList<BaseHero> notDeadTeam = new ArrayList<BaseHero>();
        for (BaseHero p : teamProtivnic) {
            if (!p.isDead()) notDeadTeam.add(p);
        }


        double minR = Coordinats.Distance(coordinats.x, notDeadTeam.get(0).coordinats.x, coordinats.y,
                notDeadTeam.get(0).coordinats.y);
        int k = 0;
        for (int i = 1; i < 10; i++) {
            double R = Coordinats.Distance(coordinats.x, notDeadTeam.get(i).coordinats.x, coordinats.y,
                    notDeadTeam.get(i).coordinats.y);
            if (R < minR) {
                minR = R;
                k = i;
            }
        }
        System.out.println(getClass().getName() + " " + name + "- " + teamProtivnic.get(k).name + " " + minR);
        return k;
    }
    @Override
    public String toString() {
        return name;
    }

    public void step() {
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
        ;

//    protected static String getWeapon() {
//        String w = String.valueOf(BaseHero.Weapon.values().length);
//        return w;
//    }

    }
    public String getInfo() {
        return  String.format("nm: %s,  st: %s, hp: %d/%d, dmg: %d, def: %d, init: %d,", this.name, this.status, this.healthcurent, this.healthMax, this.damage, this.def, this.initiative);
    }

    public int getInitiative () {
        return this.initiative;
    }
}


//
//1.Если жизни 0 вернуть управление
//        2.Если стрел 0 вернуть управление
//        3.Найти ближайшего противника
//        4.Нанести ему среднее повреждение
//        5.Если среди своих есть крестьянин вернут ь управление
//        6.уменьшить кол-во стрел на одну и вернуть управление

//        Вызывать персонажей из обеих комманд в порядке инициативы.



