package Unit;

public abstract class  Infantry extends BaseHero{ //пехота
    public Infantry(int age, String gender, int healthMax, int atack, int[] damage, int def, int initiative, int x, int y, int nT) {
        super(age, "M", 15, atack, damage,  def, initiative, x,y,nT);
    }
    @Override
    public boolean isDead() {
        return false;
    }

}
