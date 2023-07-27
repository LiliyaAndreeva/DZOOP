package Game.Interface;

import Game.Unit.BaseHero;

import java.util.ArrayList;

public interface InGameInterface {
    void step(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team);
    //void stepTwo(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team);
    String getInfo();
}

