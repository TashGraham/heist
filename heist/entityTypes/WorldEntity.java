package heist.entityTypes;

public abstract class WorldEntity {
    // all entities will have these attributes
    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    public boolean conscious = true;

    public WorldEntity(String name, int maxHealth, int currentHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
    }

    public void takeDamage(int damage) {
        System.out.println("Taking "+damage+" points of damage.");
        System.out.println("Health before damage: "+currentHealth);
        if (damage > 0) {
            currentHealth -= damage;
            if (currentHealth <= 0) {
                // health will not be negative just 0
                currentHealth = 0;
                conscious = false;
            }
        }
        System.out.println("Health after taking attack: "+currentHealth);
        if (!conscious) {
            System.out.println(name+" is no longer consious.");
        }

    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public boolean isConscious() {
        return conscious;
    }

    public void setCurrentHealth(int health) {
        currentHealth = health;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Max Health: " + maxHealth + ", Current Health: " + currentHealth;
    }

}