package heistTests.characterTests;

import org.junit.*;

import heist.Damage;
import heist.DamageType;
import heist.characters.Teammate;
import heist.characters.Guard;

public class AttackAndProtectionTest {

    Damage damage = new Damage(10, DamageType.KNIFE);
    Damage gunDamage = new Damage(30, DamageType.GUN);
    Damage randomIntDamage = new Damage(37, DamageType.BATON);
    Teammate teamie = new Teammate("Dave", 50, 50, damage);
    Guard guard = new Guard("guard", 70, 70, gunDamage);
    Guard guard2 = new Guard("gaurd2", 70, 70, randomIntDamage);

    @Test
    public void protectionAgainstAttack() {
        // testing that the guards protection levels will correctly reduce damage taken
        // guard has protection level of 5 meaning 50% of damage is taken
        teamie.attack(guard);
        // teammate would normally cause 10 points of damage
        // but guard should only lose 5 points
        Assert.assertEquals(65, guard.getCurrentHealth());
    }

    @Test
    public void protectionTestAgain() {
        teamie.setProtectionLevel(7);
        // if protection level 7 then should take 30% of attack
        guard.attack(teamie);
        // teamie taking 30% of 30 = 9 points of damage
        Assert.assertEquals(41, teamie.getCurrentHealth());
    }

    @Test
    public void testingRoundingDamageWorks() {
        teamie.setProtectionLevel(3);
        // teammate will take 70% of damage inflicted
        guard2.attack(teamie);
        // teammate taking 70% of 37 = 25.9
        // rounded to the nearest int is 26 points of damage
        Assert.assertEquals(24, teamie.getCurrentHealth());

    }

    
}
