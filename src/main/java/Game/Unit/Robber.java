package Game.Unit;

public class Robber extends Infantry{ // разбойник
    public Robber(String name, int x, int y, int nT) {

        super(name, 10, new int[]{3,7}, 7,  5, x, y, nT, 7);
    }




//    public void step(ArrayList<BaseHero> teamProtivnic, ArrayList<BaseHero> team) {
//        System.out.println("Добыча моя!");
//    }
}
