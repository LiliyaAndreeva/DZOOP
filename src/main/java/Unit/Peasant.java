package Unit;

public class Peasant extends Infantry { // крестьянин
    public Peasant(String name) {
        super(45, "F", 15, 1, new int[]{1, 2}, 2);
    }

    private void working() {
    }

    ;

    private void gardering() {
    }

    ;

    @Override
    public void step() {
        working();
        gardering();
        System.out.println("Не мешай работать");
    }
}
