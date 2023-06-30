package Unit;

public abstract class  Infantry extends BaseHero{ //пехота
    public Infantry(int age, String gender, int healthMax, int atack, int[] damage, int def) {
        super(age, "M", 15, atack, damage, 7);
    }
    @Override
    public boolean isDead() {
        return false;
    }

}
