package heistTests.characterTests;

import org.junit.*;

import heist.characters.Guard;

public class GuardUnitTest {

    Guard guard = new Guard("guard", 70, 70, 10);

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
        Assert.assertEquals(10, guard.getDamage());
    }

    @Test
    public void consciousTest() {
        // should default as conscious
        Assert.assertTrue(guard.isConscious());
    }

    @Test
    public void guardToStringTest() {
        Assert.assertEquals("Name: guard, Max Health: 70, Current Health: 70, Damage: 10", guard.toString());
    }


    
}
