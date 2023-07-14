import Unit.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Heroes {
    public static void main(String[] args) {
        BaseHero monk = new Monk(getNames(), 1, 1 );

        BaseHero monk2 = new Monk("Kirill", 1, 1);
        BaseHero monk3 = new Monk(getNames(),1, 1);
        BaseHero sniper = new Sniper("Kyle", 1,1);
        BaseHero robber = new Robber("Alex", 1,1);
        BaseHero peasant = new Peasant("Prohor",1,1);
        BaseHero witch = new Witch("Salma",1, 1);
        BaseHero spearman = new Spearman("Antip", 1, 1);

        monk.step();
        sniper.step();
        robber.step();
        peasant.step();
        witch.step();
        spearman.step();


        ArrayList<BaseHero> teamOne = new ArrayList<>();
        ArrayList<BaseHero> teamTwo = new ArrayList<>();
        ArrayList<BaseHero> allTeam = new ArrayList<>();
        fillList(teamOne, 1, 10);
        fillList(teamTwo,10,1);
        allTeam.addAll(teamOne);
        allTeam.addAll(teamTwo);
        allTeam.sort(Comparator.comparingInt(BaseHero::getInitiative));

        for (BaseHero c :
                teamOne) {
            System.out.println(c.getInfo());
        }
        for (BaseHero c :
                teamTwo) {
            System.out.println(c.getInfo());
        }

        teamOne.forEach(n->n.step(teamTwo));
        teamTwo.forEach(n->n.step(teamOne));
    }



        public static void fillList (ArrayList<BaseHero> list, int x, int y){
            for(int i=0; i<10; i++){
                int r = new Random().nextInt(0,6);
                switch (r) {
                    case 0: {
                        list.add(new Monk(getNames(),1, 1));
                        break;
                    }
                    case 1: {
                        list.add(new Witch("Salma", 1,1));
                        break;
                    }
                    case 2: {
                        list.add(new Peasant("Prohor", 1, 1));
                        break;
                    }
                    case 3: {
                        list.add(new Robber("Alex", 1, 1));
                        break;
                    }
                    case 4: {
                        list.add(new Sniper("Kyle",1 ,1));
                        break;
                    }
                    default: {
                        list.add(new Spearman("Antip",1,1));
                        break;

                    }
                }

            }
        }


    public void step(ArrayList<BaseHero> teamProtivnic) {
        System.out.println("Шаг вперед");
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
