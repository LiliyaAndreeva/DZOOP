package Unit;

public abstract class Shooter extends BaseHero { //стрелки

    protected int range;

    protected  int arrows;

    protected int maxArrows;
    public Shooter(int age, String gender, int healthMax, int atack, int[] damage, int def, int initiative, int x, int y, int nT) {
        super(30, "M", 15, 7, new int[]{}, 5,initiative, x,y, nT);
        this.range = range;
        this.arrows = arrows;
        this.maxArrows = maxArrows;
    }
    @Override
    public void step(){}

    @Override
    public boolean isDead() {
        return false;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" ammo: %d/%d", this.arrows, this.maxArrows);
    }


}
