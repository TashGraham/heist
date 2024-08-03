// factory interface 

package heist.rooms.factories;

import heist.rooms.products.Room;

public interface RoomFactory {

    // number of guards and civilians per room can be chosen
    Room createRoom(int numOfGuards, int numOfCivilians);
    
}
