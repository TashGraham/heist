package heist.entityTypes;

public abstract class Thief extends AggressiveEntity {
    // theives can also have the money or know the pin to the safe
    protected boolean hasMoney = false;
    protected boolean knowsPin = false;
    
    public Thief (String name, int maxHealth, int currentHealth, int damage) {
        super(name, maxHealth, currentHealth, damage);
    }

    public boolean hasMoney() {
        return hasMoney;
    }

    public boolean knowsPin() {
        return knowsPin;
    }
    
}
