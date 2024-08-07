package heistTests.characterTests;

import org.junit.*;

import heist.characters.Teammate;

public class TeammateUnitTest {

    Teammate teamie = new Teammate("Buddy", 70, 70, 10);

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
        Assert.assertEquals(10, teamie.getDamage());
    }

    @Test
    public void teamconsciousTest() {
        // should default as conscious
        Assert.assertTrue(teamie.isConscious());
    }

    @Test
    public void teamToStringTest() {
        Assert.assertEquals("Name: Buddy, Max Health: 70, Current Health: 70, Damage: 10", teamie.toString());
    }
    
}
