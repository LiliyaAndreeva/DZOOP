package Unit;

import java.util.ArrayList;

public class Sniper extends Shooter{

    public Sniper(String name, int x, int y) {
        super(35, "M", 15, 10, new int[]{5,8}, 6, 10,1 ,8,2);
    }
    private  void reArm(){};
    private void fire(){};

    @Override
    public String getInfo(){
        return "Shooter";
    }
    @Override
    public void step(ArrayList<BaseHero> teamProtivnic){
        if (this.healthcurent == 0 || arrows == 0) {return;}
        int k = super.findNearest(teamProtivnic);
        teamProtivnic.get(k).getDamage((this.damage[1]+this.damage[0])/2);

        for(BaseHero p: teamProtivnic) {
            if (p.getClass() == Peasant.class && p.status.equals("Stand")) {
                p.status.equals("Busy");
                if (this.arrows == 0) this.arrows += 1;
                return;
            }
        }
        this.arrows -=1;
    }
}
