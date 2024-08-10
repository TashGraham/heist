package heistTests.characterTests;

import org.junit.*;

import heist.characters.Civilian;
import heist.characters.Guard;

public class AttackTest {
    
    Guard guard = new Guard("guard", 70, 70, 20);
    Guard strongGuard = new Guard("string guard", 70, 70, 60);
    Civilian civ = new Civilian("civy", 50, 50);

    @Test
    public void attackLowersHealth() {
        // testing that an attack reduces the health correctly 
        // after getting attacked the civilians health should be 30
        guard.attack(civ);
        Assert.assertEquals(civ.getCurrentHealth(), 30);
    }

    @Test 
    public void testHealthNotNeg() {
        // testing that civilians health doesn't drop below 0
        strongGuard.attack(civ);
        Assert.assertEquals(civ.getCurrentHealth(), 0);
    }

    @Test
    public void civNowUnconsious() {
        strongGuard.attack(civ);
        // testing that the civilian is now unconsious
        Assert.assertFalse(civ.isConscious());
    }

}
