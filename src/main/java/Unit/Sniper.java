package Unit;

public class Sniper extends Shooter{

    public Sniper(String name) {
        super(35, "M", 15, 10, new int[]{5,8}, 6);
    }
    private  void reArm(){};
    private void fire(){};

    @Override
    public void step(){
        reArm();
        fire();
        System.out.println("Выстрел!");
    }
}
