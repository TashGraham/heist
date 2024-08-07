package heistTests.player;

import org.junit.*;

import heist.player.Player;

public class PlayerUnitTest {

    Player player = new Player("player", 100, 100, 15);

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
        Assert.assertEquals(15, player.getDamage());
    }

    @Test
    public void playerIsConscious() {
        Assert.assertTrue(player.isConscious());
    }

    @Test
    public void playerToStringTest() {
        Assert.assertEquals("Name: player, Max Health: 100, Current Health: 100, Damage: 15", player.toString());
    }
    
}
