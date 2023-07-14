package Unit;

import java.util.ArrayList;

public class Monk extends Magi { // монах
    public Monk(String name, int x, int y) {
        super(50, "M",  15, 5, new int []{-2,3}, 2, 5,9,3, 1);

    }

    private boolean manaAdd(){return true;};

    @Override
    public String getInfo(){
        return "Magi";
    }



    @Override
    public void step(ArrayList<BaseHero> teamProtivnic) {
        manaCast();
        manaAdd();
        System.out.println("Кастанул магию!");


    }

}