package Unit;

public class Spearman extends Infantry {
    public Spearman(String name) { //копейщик
        super(40, "M", 15, 4, new int[]{5, 7}, 7);
    }

    private void throwAvay() {
    }

    ; //кидать

    private void hit() {
    }

    ; // удар

    @Override
    public void step() {
        throwAvay();
        hit();
        System.out.println("Попадание");
    }
}
