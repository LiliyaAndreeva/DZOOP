package Unit;

public class Witch extends Magi{
    public Witch(String name) {
        super(55, "F", 15, 1, new int[]{-1,2}, 10);
    }

    private void cure(){}; //лечение
    private void protection(){};

    @Override
    public String getInfo(){
        return "Magi";
    }
    @Override
    public void step() {
        cure();
        protection();
        manaCast();
        System.out.println("Излечение");


    }

}
