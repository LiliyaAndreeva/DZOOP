package Unit;

import java.util.Random;

public abstract class Magi extends BaseHero { // маги


    public Magi(int age, String gender, int healthMax,  int atack, int[] damage, int def, int x, int y, int nT) {
        super(age, "M",  15, 5, new int []{-2,3}, 2, x,y, nT);
    }



    @Override
    public void step(){}


    protected void manaCast(){};

    @Override
    public boolean isDead() {
        return false;
    }

    ;


}
