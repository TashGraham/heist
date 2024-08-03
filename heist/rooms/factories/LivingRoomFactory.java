// concrete factory class for living room

package heist.rooms.factories;

import heist.rooms.products.LivingRoom;
import heist.rooms.products.Room;

public class LivingRoomFactory implements RoomFactory {

    @Override
    public Room createRoom(int numOfGuards, int numOfCivilians) {
        return new LivingRoom("living room", "coffee table", numOfGuards, numOfCivilians);
    }
    
}
