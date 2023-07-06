package Unit;

import java.util.ArrayList;

public class Sniper extends Shooter{

    public Sniper(String name, int x, int y) {
        super(35, "M", 15, 10, new int[]{5,8}, 6, 1 ,8,2);
    }
    private  void reArm(){};
    private void fire(){};

    @Override
    public String getInfo(){
        return "Shooter";
    }
    @Override
    public void step(ArrayList<BaseHero> teamProtivnic){
        reArm();
        fire();
        System.out.println("Выстрел!");
    }
}
