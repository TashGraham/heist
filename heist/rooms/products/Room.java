// product class representing a room
package heist.rooms.products;

public abstract class Room {

    protected String name; 
    protected String furniture;
    protected int numOfGuards;
    protected int numOfCivilians;

    public Room(String name, String furniture, int numOfGuards, int numOfCivilians) {
        this.name = name;
        this.furniture = furniture;
        this.numOfGuards = numOfGuards;
        this.numOfCivilians = numOfCivilians;
    }

    public String getName() {
        return name;
    }

    public String getFurniture() {
        return furniture;
    }

    public int getNumGuards() {
        return numOfGuards;
    }

    public int getNumCivilians() {
        return numOfCivilians;
    }

    public String pluralOrNotGuards() {
        // guards or guard for num of guards
        if (numOfGuards == 0) {
            return " guard";
        }
        return " guards";
    }

    public String plurOrNotCivilians() {
        if (numOfCivilians == 0) {
            return " civilian";
        }
        return " civilians";
    }

    @Override
    public String toString() {
        return name+", in it there is a "+furniture+", "+numOfGuards+pluralOrNotGuards()+" and "+numOfCivilians+plurOrNotCivilians()+".";
    }
    
}
