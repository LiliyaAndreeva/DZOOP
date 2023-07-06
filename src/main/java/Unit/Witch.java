package Unit;

import java.util.ArrayList;

public class Witch extends Magi{
    public Witch(String name, int x, int y) {
        super(55, "F", 15, 1, new int[]{-1,2}, 10, 2, 6,2);
    }

    private void cure(){}; //лечение
    private void protection(){};

    @Override
    public String getInfo(){
        return "Magi";
    }
    @Override
    public void step(ArrayList<BaseHero> teamProtivnic) {
        cure();
        protection();
        manaCast();
        System.out.println("Излечение");


    }

}
