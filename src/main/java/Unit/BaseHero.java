package Unit;

public abstract class BaseHero implements InGameInterface{

    static public String name;
    protected int age;
    protected String gender;
    protected int healthMax;
    protected int healthcurent;
    protected int atack;



    public  enum  Weapon{
        spear, // копье
        crossbow, // арбалет
        magicWand,
        rifle, //винтовка
        nothing
    }
    int [] damage; // повреждения можно посчиттаь по формуле
    int def; //защита

    public BaseHero(int age, String gender, int healthMax, int atack, int[] damage, int def) {
        this.age = age;
        this.gender = gender;
        this.healthMax = healthMax = this.healthcurent;
        this.atack = atack;
        this.damage = damage;
        this.def = def;
    }
    @Override
    public String toString() {
        return name;
    }
    public void step(){};
}





