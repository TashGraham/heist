package heistTests.characterTests;

import org.junit.*;

import heist.characters.Civilian;

public class CivilianUnitTest {

    Civilian civ = new Civilian("TestCivilian", 50, 50);

    @Test
    public void civilianNameTest() {
        Assert.assertEquals("TestCivilian", civ.getName());
    }

    @Test
    public void civilianMaxTest() {
        Assert.assertEquals(50, civ.getMaxHealth());
    }

    @Test
    public void civilianCurrentTest() {
        Assert.assertEquals(50, civ.getCurrentHealth());
    }

    @Test
    public void consciousTest() {
        // should default as conscious
        Assert.assertTrue(civ.isConscious());
    }
    
    @Test
    public void civilianToString() {
        Assert.assertEquals("Name: TestCivilian, Max Health: 50, Current Health: 50", civ.toString());
    }
}
