import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String description;
    private int id;
/*    private List<Item> items;
    private List<Enemy> enemies;*/
    private Location north;
    private Location south;
    private Location east;
    private Location west;

    public Location(String name, String description, int id) {
        // Default constructor, no parameters
/*        items = new ArrayList<Item>();*/
/*        enemies = new ArrayList<Enemy>();*/


        this.name = name;
        this.description = description;
        this.id = id;
    }

    // Getters and setters for attributes

    // You can add getters and setters for other attributes as needed


    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public Location getNorth() {
        return north;
    }

    public void setNorth(Location north) {
        this.north = north;
    }

    public Location getSouth() {
        return south;
    }

    public void setSouth(Location south) {
        this.south = south;
    }

    public Location getEast() {
        return east;
    }

    public void setEast(Location east) {
        this.east = east;
    }

    public Location getWest() {
        return west;
    }

    public void setWest(Location west) {
        this.west = west;
    }
}
