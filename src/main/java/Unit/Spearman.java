package Unit;

import java.util.ArrayList;

public class Spearman extends Infantry {
    public Spearman(String name, int x, int y) { //копейщик

        super(35, "M", 15, 10, new int[]{5,8}, 6, 1 ,4,2);
    }

    private void throwAvay() {
    }

    ; //кидать

    private void hit() {
    }

    ; // удар

    @Override
    public String getInfo(){
        return "Infantry";
    }
    @Override
    public void step(ArrayList<BaseHero> teamProtivnic) {
        throwAvay();
        hit();
        System.out.println("Попадание");
    }
}
