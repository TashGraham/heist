package heistTests.roomTests;

import org.junit.*;

import heist.rooms.factories.BedroomFactory;
import heist.rooms.factories.LivingRoomFactory;
import heist.rooms.factories.RoomFactory;
import heist.rooms.products.Room;

public class RoomFactoryTest {

    private RoomFactory bedroomFactory = new BedroomFactory();
    private Room bedroom = bedroomFactory.createRoom(0, 1);
    private RoomFactory livRoomFactory = new LivingRoomFactory();
    private Room livingRoom = livRoomFactory.createRoom(0, 1);

    @Test
    public void testBedroomName() {
        Assert.assertEquals(bedroom.getName(), "bedroom");
    }

    @Test
    public void testBedFurniture() {
        Assert.assertEquals(bedroom.getFurniture(), "wardrobe");
    }

    @Test
    public void testBedGuards() {
        // checking number of guards is an integer
        Assert.assertEquals(bedroom.getNumGuards()%1, 0);
    }

    @Test
    public void testBedCivs() {
        // checking number of civilians is an integer
        Assert.assertEquals(bedroom.getNumCivilians()%1, 0);
    }

    @Test
    public void testLivingRoomName() {
        Assert.assertEquals(livingRoom.getName(), "living room");
    }

    @Test
    public void testLivFurniture() {
        Assert.assertEquals(livingRoom.getFurniture(), "coffee table");
    }

    @Test
    public void testLivGuards() {
        // checking number of guards is an integer
        Assert.assertEquals(livingRoom.getNumGuards()%1, 0);
    }

    @Test
    public void testLivCivs() {
        // checking number of civilians is an integer
        Assert.assertEquals(livingRoom.getNumCivilians()%1, 0);
    }

}
