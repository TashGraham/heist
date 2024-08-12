package heist.characters;

import heist.Damage;
import heist.entityTypes.Thief;

public class Teammate extends Thief {
    
    public Teammate(String name, int maxHealth, int currentHealth, Damage attack) {
        super(name, maxHealth, currentHealth, attack);
    }
}
