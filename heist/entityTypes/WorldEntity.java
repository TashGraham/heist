package heist.entityTypes;

import heist.Damage;

public abstract class WorldEntity {
    // all entities will have these attributes
    protected String name;
    protected int maxHealth;
    protected int currentHealth;
    protected int protectionLevel;
    public boolean conscious = true;

    public WorldEntity(String name, int maxHealth, int currentHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.protectionLevel = 0; // defualt 0 unless for all except guard
    }

    public void takeDamage(Damage attack) {
        System.out.println("Taking damage of type " +  attack.getDamageType().toString());
        System.out.println("Health before attack: " + currentHealth);
        int amount = attack.getAmount();
        System.out.println("Taking " + amount + " points of damage.");
        if (amount > 0) {
            currentHealth -= amount;
            if (currentHealth <= 0) {
                currentHealth = 0;
                conscious = false;
            }
        }
        System.out.println("Health after attack: " + currentHealth);

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

    public int getProtectionLevel() {
        return protectionLevel;
    }

    public void setProtectionLevel(int newProtectLevel) {
        // entities can pick up protection
        protectionLevel = newProtectLevel;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Max Health: " + maxHealth + ", Current Health: " + currentHealth + ", Protection level: " + protectionLevel;
    }

}