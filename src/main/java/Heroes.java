import Unit.*;

public class Heroes {
    public static void main(String[] args) {
        Monk monk = new Monk("Petr");
        Monk monk2 = new Monk("Kirill");
        Sniper sniper = new Sniper("Kyle");
        Robber robber = new Robber("Alex");
        Peasant peasant = new Peasant("Prohor");
        Witch witch = new Witch("Salma");
        Spearman spearman = new Spearman("Antip");

        monk.step();
        sniper.step();
        robber.step();
        peasant.step();
        witch.step();
        spearman.step();
    }
}
