package Unit;

import java.util.ArrayList;

public interface InGameInterface {
    void step(ArrayList<BaseHero> teamProtivnic);

  String getInfo();

    boolean isDead();
}
