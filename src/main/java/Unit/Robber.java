package Unit;

public class Robber extends Infantry{ // разбойник
    public Robber(String name) {
        super(18, "M", 15, 7, new int[]{5,7}, 5);
    }

    private void looting (){}; //грабеж
    private void hit (){}; // удар

    @Override
    public void step() {
        looting();
        hit();
        System.out.println("Добыча моя!");
    }
}
