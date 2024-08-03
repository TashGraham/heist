package heist;

import java.util.Scanner;

import heist.player.Player;
import heist.rooms.factories.BedroomFactory;
import heist.rooms.factories.LivingRoomFactory;
import heist.rooms.products.Room;

public class World {
    
    public boolean gameOver = false;
    private Player player;
    private Room room1;
    private Room room2;
    

    private BedroomFactory bedFactory = new BedroomFactory();
    private LivingRoomFactory livFactory = new LivingRoomFactory();

    public void initialiseWorld(boolean firstTime) {
        // currently just making one of each room with no guards and a civilian
        room1 = livFactory.createRoom(0, 1);
        room2 = bedFactory.createRoom(0, 1);
        if (firstTime) {
            player = new Player("Peter", 100, 100, 10);
        }
    }

    public void run() {
        int turnTimer = 1;
        while (!gameOver) {
            System.out.println("-------------------------------");
            System.out.println("TURN:" + turnTimer);
            System.out.println("-------------------------------");
            System.out.println("Welcome to Heist");
            System.out.println(" You: " + player.toString());
            System.out.println("Infront of you is a "+room1.getName()+". Would you like to enter? [y/n]");
            // tidy up!
            Scanner scanner = new Scanner(System.in);
            char input = scanner.next().charAt(0);
            scanner.close();
            if (input=='y') {
                System.out.println("You enter the "+room1.toString());
            } else if (input=='n') {
                System.out.println("Okay goodbye then");
                gameOver = true;
            }
            System.out.println("thank you for playing ");
            gameOver = true;

        }
    }


    public static void main(String[] args) {
        World world = new World();
        world.initialiseWorld(true);
        world.run();
    }

}
