package Unit;

import java.util.ArrayList;

public class Peasant extends Infantry { // крестьянин
    public Peasant(String name, int x, int y) {
        super(45, "F", 15, 1, new int[]{1, 2}, 2, 9, 1, 1);
    }

    private void working() {
    }

    ;

    private void gardering() {
    }

    ;
    @Override
    public String getInfo(){
        return "Infantry";
    }

    @Override
    public void step(ArrayList<BaseHero> teamProtivnic) {
        working();
        gardering();
        System.out.println("Не мешай работать");
    }
}
