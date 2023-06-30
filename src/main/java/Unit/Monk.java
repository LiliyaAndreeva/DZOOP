package Unit;

public class Monk extends Magi { // монах
    public Monk(String name) {
        super(50, "M", 15, 5, new int[]{-1, -3}, 5);

    }

    private boolean manaAdd(){return true;};


    @Override
    public void step() {
        manaCast();
        manaAdd();
        System.out.println("Кастанул магию!");


    }

}