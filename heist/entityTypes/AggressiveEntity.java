package heist.entityTypes;

public abstract class AggressiveEntity extends WorldEntity {

    protected int damage;
    // will be adding weapon class
    //protected Weapon weapon;

    public AggressiveEntity(String name, int maxHealth, int currentHealth, int damage) {
        super(name, maxHealth, currentHealth);
        this.damage = damage;
        // weapon will also be here
    }

    public int getDamage() {
        return damage;
    }

}