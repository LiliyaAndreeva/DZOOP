package Unit;

public abstract class Magi extends BaseHero { // маги


    public Magi(int age, String gender, int healthMax,  int atack, int[] damage, int def) {
        super(age, "M",  15, 5, new int []{-2,3}, 2);
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
