package Unit;

public abstract class Shooter extends BaseHero { //стрелки
    public Shooter(int age, String gender, int healthMax,  int atack, int[] damage, int def, int x, int y, int nT) {
        super(30, "M", 15, 7, new int[]{}, 5, x,y, nT);
    }
    @Override
    public void step(){}

    @Override
    public boolean isDead() {
        return false;
    }


}
