package heist;

import heist.entityTypes.AggressiveEntity;

public class Damage {
    // plan to do:
    // amount of damage an aggressive entity can inflict depends on the type of damage
    // eg Gun would inflict the most and Fists the least
    // will be possible to wear a bullet proof vest to make guns less affective

    private int amount;
    private DamageType damageType;
    private AggressiveEntity source;

    public Damage(int amount, DamageType damageType) {
        this.amount = amount;
        this.damageType = damageType;
    }

    public int getAmount() {
        return amount;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public AggressiveEntity getSource() {
        return source;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Damage) {
            if (((Damage)obj).getAmount() == amount) {
                if (((Damage)obj).getDamageType().equals(damageType)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return damageType + "(" + amount + ")";
    }
}
