// concrete factory class for bedroom

package heist.rooms.factories;

import heist.rooms.products.Bedroom;
import heist.rooms.products.Room;

public class BedroomFactory implements RoomFactory {

    @Override
    public Room createRoom(int numOfGuards, int numOfCivilians) {
        return new Bedroom("bedroom", "wardrobe", numOfGuards, numOfCivilians);
    }
    
}
