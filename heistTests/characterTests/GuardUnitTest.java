package heistTests.characterTests;

import org.junit.*;

import heist.Damage;
import heist.DamageType;
import heist.characters.Guard;

public class GuardUnitTest {

    Damage damage = new Damage(10, DamageType.BATON);
    Guard guard = new Guard("guard", 70, 70, damage);

    @Test
    public void guardNameTest() {
        Assert.assertEquals("guard", guard.getName());
    }

    @Test
    public void guardMaxHealthTest() {
        Assert.assertEquals(70, guard.getMaxHealth());
    }

    @Test
    public void guardCurHealthTest() {
        Assert.assertEquals(70, guard.getCurrentHealth());
    }

    @Test
    public void guardDamageTest() {
        Assert.assertEquals(10, guard.getAttack().getAmount());
    }

    @Test
    public void guardProtectionTest() {
        Assert.assertEquals(5, guard.getProtectionLevel());
    }

    @Test
    public void guardChangeProtectionTest() {
        guard.setProtectionLevel(7);
        Assert.assertEquals(7, guard.getProtectionLevel());
    }

    @Test
    public void consciousTest() {
        // should default as conscious
        Assert.assertTrue(guard.isConscious());
    }

    @Test
    public void guardToStringTest() {
        Assert.assertEquals("Name: guard, Max Health: 70, Current Health: 70, Protection level: 5, Attack: BATON(10)", guard.toString());
    }


    
}
