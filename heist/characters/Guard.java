package heist.characters;

import heist.Damage;
import heist.entityTypes.AggressiveEntity;

public class Guard extends AggressiveEntity {

    public Guard(String name, int maxHealth, int currentHealth, Damage attack) {
        super(name, maxHealth, currentHealth, attack);
        this.protectionLevel = 5; // guards automatically start with protection/armour
    }
    
}
