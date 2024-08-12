package heist.entityTypes;

import heist.Damage;

public abstract class Thief extends AggressiveEntity {
    // theives can also have the money or know the pin to the safe
    protected boolean hasMoney = false;
    protected boolean knowsPin = false;
    
    public Thief (String name, int maxHealth, int currentHealth, Damage attack) {
        super(name, maxHealth, currentHealth, attack);
    }

    public boolean hasMoney() {
        return hasMoney;
    }

    public boolean knowsPin() {
        return knowsPin;
    }
    
}
