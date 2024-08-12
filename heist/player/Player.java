package heist.player;

import heist.Damage;
import heist.entityTypes.Thief;

public class Player extends Thief {

    public Player(String name, int maxHealth, int currentHealth, Damage attack) {
        super(name, maxHealth, currentHealth, attack);
    }
    
}
