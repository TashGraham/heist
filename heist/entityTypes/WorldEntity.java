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