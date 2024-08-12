package heistTests.player;

import org.junit.*;

import heist.Damage;
import heist.DamageType;
import heist.player.Player;

public class PlayerUnitTest {

    Damage damage = new Damage(5, DamageType.FISTS);
    Player player = new Player("player", 100, 100, damage);

    @Test
    public void playerNameTest() {
        Assert.assertEquals("player", player.getName());
    }

    @Test
    public void playerMaxHealthTest() {
        Assert.assertEquals(100, player.getMaxHealth());
    }

    @Test
    public void playerCurHealthTest() {
        Assert.assertEquals(100, player.getCurrentHealth());
    }

    @Test
    public void playerDamageTest() {
        Assert.assertEquals(5, player.getAttack().getAmount());
    }

    @Test
    public void playerIsConscious() {
        Assert.assertTrue(player.isConscious());
    }

    @Test
    public void playerToStringTest() {
        Assert.assertEquals("Name: player, Max Health: 100, Current Health: 100, Attack: FISTS(5)", player.toString());
    }
    
}
