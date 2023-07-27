package Game.Views;

public enum Mana {
    FireBolt(6,12,3), Speed(0,0,-4);

    private  int damage, hp, speed;
    Mana(int damage, int hp, int speed) {
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
    }
    public int getDamage(){
        return damage;
    }
    public int getHp(){
        return hp;
    }

    public int getSpeed(){
        return speed;
    }

    public enum Names {
        Иван, Семен, Василий, Ольга, Валерия, Светлана
    }
}
