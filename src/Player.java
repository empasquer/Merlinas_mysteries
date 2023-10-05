import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private final String name = "Merlina";
    private Location currentLocation;
    private ArrayList<Item> inventory; // Arraylist of Items in inventory
    private final int baseHealth = 100; //ved ikke om det er nødvendigt??
    private int currentHealth;
    private int baseThirst = 100; // ????
    private int currentThirst;
    private Weapon equippedWeapon;

    public Player() {
        Player player = new Player(); // hvad laver jeg
        currentHealth = baseHealth;
        currentThirst = baseThirst;
        inventory = new ArrayList<>();
        //currentLocation = Ved ikke hvordan jeg skal gøre så currentlocation er en af locations fra arraylisten
    }

    public void health() {
        System.out.printf("Your current health is %d",currentHealth);
    }

    public int damageTaken(int x) { // x er den værdi players health falder med. x = damage
        currentHealth -= x;
        if (currentHealth <= 0) {
            System.out.println("You DIED"); // skal arbejdes videre med. måske skal der være en retry?
        }
        return currentHealth;
    }


    public void checkInventory() {
        for (Item item : inventory) {
            System.out.println(item.getName());
        }
    }


/*public void take() {
 inventory.add(currentLocation.getItem);
    System.out.printf("you took the %n", currentLocation.getItem().getName());  <--- THIS. Mit forsøg.
    }*/

    public void drop() {
        Scanner in = new Scanner(System.in);
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty.");
            return;}
        System.out.println("Enter the number/name? of the item you want to drop"); // Name or Number?
        checkInventory();
        String itemDrop = in.nextLine();
        // går i stå

    }

    public void examine() {

    }
}


