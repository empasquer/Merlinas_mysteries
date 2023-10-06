import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name = "Merlina";
    private Location currentLocation;
    private ArrayList<Item> inventory = new ArrayList<Item>(); // Arraylist of Items in inventory
    private int health = 100;
    private int thirst = 100;
    private Weapon equippedWeapon;





    public Player(/*int health, int thirst, Location currentLocation, ArrayList<Item> inventory, Weapon equippedWeapon*/) {
        this.name = name;
        this.health = health;
        this.thirst = thirst;
        this.currentLocation = currentLocation;
        this.inventory = inventory;
        this.equippedWeapon = equippedWeapon;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }


    public void printHealthStats() {
        System.out.printf("Your current health is %d%n",getHealth());
        System.out.printf("Your current thirst is %d",getThirst());
    }

    public void hit(int damage) {
        int currentHealth = health - damage;

        setHealth(currentHealth);
        if (currentHealth <= 0) {
            System.out.println("You DIED"); // skal arbejdes videre med. måske skal der være en retry?
        }

    }

/*    public void attack(Enemy enemy){
        int damage = equippedWeapon.getDamage();
        int enemyHealth = enemy.getHealth();
        enemyHealth.setHealth(enemyHealth - damage);
    }*/

    public void checkInventory(ArrayList<Item> inventory) {
        for (Item item : inventory) {

            System.out.println(item.getName());
        }
    }


    public void take(Item item) {
        if (inventory.size() < 7) {
            inventory.add(item);
        }
    }

    public void drop(Item item ){
        if (!inventory.isEmpty()) {
            inventory.remove(item);
        }
    }

    public void examine(Item item) {
        System.out.println(item.getDescription());
    }

    public void equip(Item item) {
        if (item instanceof Weapon) {
            setEquippedWeapon((Weapon)item);
        } else {
            System.out.println("This is not a weapon, and cannot be equipped");
        }

    }

    public void eat(Item item){
        if (item instanceof Food) {
            health = health + ((Food) item).getHealthPoints();
            setHealth(health);
        } else {
            System.out.println("this is not food");
        }
    }

    public void drink(Item item){
        if (item instanceof Liquid) {
            thirst = thirst + ((Liquid) item).getThirstPoints();
            setThirst(thirst);
            health = health + ((Liquid) item).getHealthPoints();
            setHealth(health);
        } else {
            System.out.println("this is not a liquid");
        }
    }

    public void goNorth(Location location) {
        setCurrentLocation(currentLocation.getNorth());
        System.out.println("You are now at" + currentLocation.getName());
    }
    public void goSouth(Location location) {
        setCurrentLocation(currentLocation.getSouth());
        System.out.println("You are now at" + currentLocation.getName());
    }
    public void goEast(Location location) {
        setCurrentLocation(currentLocation.getEast());
        System.out.println("You are now at" + currentLocation.getName());
    }
    public void goWest(Location location) {
        setCurrentLocation(currentLocation.getWest());
        System.out.println("You are now at" + currentLocation.getName());
    }

}


