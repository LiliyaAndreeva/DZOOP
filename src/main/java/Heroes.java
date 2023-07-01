import Unit.*;

import java.util.ArrayList;
import java.util.Random;

public class Heroes {
    public static void main(String[] args) {
        BaseHero monk = new Monk(getNames(), getWeapon());

        BaseHero monk2 = new Monk("Kirill", getWeapon());
        BaseHero sniper = new Sniper("Kyle");
        BaseHero robber = new Robber("Alex");
        BaseHero peasant = new Peasant("Prohor");
        BaseHero witch = new Witch("Salma");
        BaseHero spearman = new Spearman("Antip");

        monk.step();
        sniper.step();
        robber.step();
        peasant.step();
        witch.step();
        spearman.step();

        ArrayList<BaseHero> teamOne = new ArrayList<>();
        ArrayList<BaseHero> teamTwo = new ArrayList<>();
        fillList(teamOne);
        fillList(teamTwo);
        for (BaseHero c :
                teamOne) {
            System.out.println(c.getInfo());
        }
        for (BaseHero c :
                teamTwo) {
            System.out.println(c.getInfo());
        }
    }



        public static void fillList (ArrayList<BaseHero> list){
            for(int i=0; i<10; i++){
                int r = new Random().nextInt(0,6);
                switch (r) {
                    case 0: {
                        list.add(new Monk(getNames(), getWeapon()));
                        break;
                    }
                    case 1: {
                        list.add(new Witch("Salma"));
                        break;
                    }
                    case 2: {
                        list.add(new Peasant("Prohor"));
                        break;
                    }
                    case 3: {
                        list.add(new Robber("Alex"));
                        break;
                    }
                    case 4: {
                        list.add(new Sniper("Kyle"));
                        break;
                    }
                    default: {
                        list.add(new Spearman("Antip"));
                        break;

                    }
                }

            }
        }


    private static String getNames() {
        String s = String.valueOf(Mana.Names.values()[new Random().nextInt(Mana.Names.values().length)]);
        return s;
    }

    protected static String getWeapon() {
        String w = String.valueOf(BaseHero.Weapon.values());
        return w;
    }

    // сделать 2 списка в каждом из которых по 10 персонажей
    public static enum Classes {
        Monk, Peasant, Robber, Sniper, Spearman, Witch
    }


}
