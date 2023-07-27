package Game.Main;

import Game.Views.Mana;
import Game.Unit.*;
import Game.Views.View;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Heroes {

    public static ArrayList<BaseHero> allTeam;
    public static ArrayList<BaseHero> teamOne;
    public static ArrayList<BaseHero> teamTwo;

    public static void main(String[] args) {



        teamOne = fillList(1, 1);
        teamTwo = fillList(10, 2);
        allTeam = new ArrayList<BaseHero>(20);
        allTeam.addAll(teamOne);
        allTeam.addAll(teamTwo);
        allTeam.sort(new Comparator<BaseHero>() {
                         @Override
                         public int compare(BaseHero o1, BaseHero o2) {
                             return o1.initiative - o2.initiative;
                         }
                     });


            Scanner in = new Scanner(System.in);



        while(

            isNotLooser(teamOne) && isNotLooser(teamTwo)) {
                View.view();
                for (BaseHero p : allTeam) {

                    if (teamOne.contains(p)) {
                        p.step(teamTwo, teamOne);
                    } else {
                        p.step(teamOne, teamTwo);
                    }
                }
                in.nextLine();
            }
        View.view();

        if(isNotLooser(teamOne)) System.out.print("Green side win!");
        else System.out.print("Blue side win!");;
        }


            private static String getNames() {
                String s = String.valueOf(Mana.Names.values()[new Random().nextInt(Mana.Names.values().length)]);
                return s;
            }

    private static ArrayList<BaseHero> fillList(int k, int nT) {
        ArrayList<BaseHero> team = new ArrayList<BaseHero>(10);
        for (int i = 1; i < 11; i++) {

            int r = new Random().nextInt(0, 6);
            switch (r) {
                case 0: {
                    team.add(new Monk(getNames(), k, i, nT));
                    break;
                }
                case 1: {
                    team.add(new Witch(getNames(), k, i, nT));
                    break;
                }
                case 2: {
                    team.add(new Peasant(getNames(), k, i, nT));
                    break;
                }
                case 3: {
                    team.add(new Robber(getNames(), k, i, nT));
                    break;
                }
                case 4: {
                    team.add(new Sniper(getNames(), k, i, nT));
                    break;
                }
                default: {
                    team.add(new Spearman(getNames(), k, i, nT));
                    break;
                }
            }

        }
        return team;
    }



    private static boolean isNotLooser (ArrayList<BaseHero> team){
        int count=0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).isDead()) count++;
        }
        if (count == team.size()) return false;
        return true;
    }
}




