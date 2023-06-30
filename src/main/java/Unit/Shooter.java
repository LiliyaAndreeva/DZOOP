package Unit;

public abstract class Shooter extends BaseHero { //стрелки
    public Shooter(int age, String gender, int healthMax,  int atack, int[] damage, int def) {
        super(30, "M", 15, 7, new int[]{}, 5);
    }
    @Override
    public void step(){}

    @Override
    public boolean isDead() {
        return false;
    }


}
