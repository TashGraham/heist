package heist.entityTypes;

import heist.Damage;

public abstract class AggressiveEntity extends WorldEntity {

    protected Damage attack;

    public AggressiveEntity(String name, int maxHealth, int currentHealth, Damage attack) {
        super(name, maxHealth, currentHealth);
        this.attack = attack;
        // weapon will also be here
    }

    public void attack(WorldEntity worldEntity) {
        if (!worldEntity.isConscious()) {
            System.out.println(worldEntity.getName()+" is not consious there is no need to attack.");
        } else {
            worldEntity.takeDamage(attack);
        }
    }

    public Damage getAttack() {
        return attack;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Max Health: " + maxHealth + ", Current Health: " + currentHealth + ", Protection level: " + protectionLevel + ", Attack: " + attack.toString();
    }

}