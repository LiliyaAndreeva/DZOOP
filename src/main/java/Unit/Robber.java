package Unit;

import java.util.ArrayList;

public class Robber extends Infantry{ // разбойник
    public Robber(String name, int x, int y) {
        super(18, "M", 15, 7, new int[]{5,7}, 5, 8,8, 6, 1);
    }

    private void looting (){}; //грабеж
    private void hit (){}; // удар

    @Override
    public String getInfo(){
        return "Infantry";
    }
    @Override
    public void step(ArrayList<BaseHero> teamProtivnic) {
        looting();
        hit();
        System.out.println("Добыча моя!");
    }
}
