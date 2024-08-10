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

    public void attack(WorldEntity worldEntity) {
        if (!worldEntity.isConscious()) {
            System.out.println(worldEntity.getName()+" is not consious there is no need to attack.");
        } else {
            worldEntity.takeDamage(damage);
        }
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Max Health: " + maxHealth + ", Current Health: " + currentHealth + ", Damage: " + damage;
    }

}