import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Location {
    private String name;
    private String description;
    private int id;
    private List<Item> items;
    private List<Enemy> enemies;
    private Location north;
    private Location south;
    private Location east;
    private Location west;

    public Location(String name, String description, int id, Object... objects) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.items = new ArrayList<>();
        this.enemies = new ArrayList<>();

        for (Object obj : objects) {
            if (obj instanceof Item) {
                this.items.add((Item) obj);
            } else if (obj instanceof Enemy) {
                this.enemies.add((Enemy) obj);
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Enemy> getEnemies() {
        return enemies;
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

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public void addItems(Item... newItems) {
        this.items.addAll(Arrays.asList(newItems));
    }

    public void addEnemies(Enemy... newEnemies) {
        this.enemies.addAll(Arrays.asList(newEnemies));
    }
}
