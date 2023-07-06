package Unit;

public abstract class  Infantry extends BaseHero{ //пехота
    public Infantry(int age, String gender, int healthMax, int atack, int[] damage, int def, int i, int i1, int nT) {
        super(age, "M", 15, atack, damage, 7, 1,1, nT);
    }
    @Override
    public boolean isDead() {
        return false;
    }

}
