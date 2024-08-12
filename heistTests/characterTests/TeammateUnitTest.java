package heistTests.characterTests;

import org.junit.*;

import heist.Damage;
import heist.DamageType;
import heist.characters.Teammate;

public class TeammateUnitTest {

    Damage damage = new Damage(10, DamageType.KNIFE);
    Teammate teamie = new Teammate("Buddy", 70, 70, damage);

    @Test
    public void teamNameTest() {
        Assert.assertEquals("Buddy", teamie.getName());
    }

    @Test
    public void teamMaxHealthTest() {
        Assert.assertEquals(70, teamie.getMaxHealth());
    }

    @Test
    public void teamCurHealthTest() {
        Assert.assertEquals(70, teamie.getCurrentHealth());
    }

    @Test
    public void teamDamageTest() {
        Assert.assertEquals(10, teamie.getAttack().getAmount());
    }

    @Test
    public void teamconsciousTest() {
        // should default as conscious
        Assert.assertTrue(teamie.isConscious());
    }

    @Test
    public void teamToStringTest() {
        Assert.assertEquals("Name: Buddy, Max Health: 70, Current Health: 70, Attack: KNIFE(10)", teamie.toString());
    }
    
}
