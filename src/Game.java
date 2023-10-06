import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    public ArrayList<Location> locations = new LocationBuilder().getLocations();
    public ArrayList<Item> items = new ItemBuilder().getItems();
    public ArrayList<Enemy> enemies = new EnemyBuilder().getEnemies();
    public Player merlina = new Player("Merlina", 100, 100, locations.get(0), new ArrayList<Item>(), null);
    public boolean gameOver = false;

    public Scanner userInput = new Scanner(System.in);

    private void run() {
        // Create a list of locations
        ArrayList<Location> locations = new LocationBuilder().getLocations();

/*        System.out.println(locations.get(0).getNorth().getName());
        System.out.println(locations.get(3).getNorth().getName());*/

        ArrayList<Item> items = new ItemBuilder().getItems();
        ArrayList<Enemy> enemies = new EnemyBuilder().getEnemies();


        for (int i = 0; i< items.size(); i++) {
            System.out.println(items.get(i).getName());
        }
      /*  for (int i = 0; i< enemies.size(); i++) {
            System.out.println(enemies.get(i).getName());
            System.out.println((enemies.get(i).getWeapon()).getName());
        }*/


      /*  System.out.println(locations.get(3).getEnemies().get(0).getName());

        for (int i = 0; i< locations.get(4).getEnemies().size(); i++) {
            System.out.println(locations.get(4).getEnemies().get(i).getName());
        }*/

                System.out.println(locations.get(2).getItems());

        for (int i = 0; i< locations.get(8).getItems().size(); i++) {
            System.out.println(locations.get(8).getItems().get(i).getName());
        }

        System.out.println(locations.get(8).getItems().size());


        startGame();
        while (!gameOver) {
            play();
        }



    }

    private class LocationBuilder {
        public ArrayList<Location> getLocations() {
            ArrayList<Location> locations = new ArrayList<>();
            ArrayList<Enemy> enemies = new EnemyBuilder().getEnemies();
            ArrayList<Item> items = new ItemBuilder().getItems();


            // Create arrays for enemies in given locations
            ArrayList<Enemy> l3Enemies = new ArrayList<>();
            l3Enemies.add(enemies.get(1));

            ArrayList<Enemy> l4Enemies = new ArrayList<>();
            l4Enemies.add(enemies.get(0));
            l4Enemies.add(enemies.get(2));

            // Create arrays for items on given locations
            ArrayList<Item> l2Items = new ArrayList<>();
            l2Items.add(items.get(7));

            ArrayList<Item> l6Items = new ArrayList<>();
            l6Items.add(items.get(0));

            ArrayList<Item> l7Items = new ArrayList<>();
            l7Items.add(items.get(4));

            ArrayList<Item> l8Items = new ArrayList<>();
            l8Items.add(items.get(1));
            l8Items.add(items.get(3));

            ArrayList<Item> l0Items = new ArrayList<>();
            l0Items.add(items.get(2));


            // Create your locations and set their attributes here -- repeat as needed
            // ex: Location lx = new Location("name", "desc", id);
            Location l0 = new Location("Town Square", "The heart of the town where villagers gather./nIn the center of the town lies the bustling Town Square./nMerchants peddle their wares, children play games, and the townspeople go about their daily activities./nA majestic fountain graces the square's center, its waters glittering in the sunlight./nColorful banners hang from surrounding buildings, creating a festive atmosphere./nThis is the heartbeat of the town, where stories are shared, news is spread, and adventures begin.", 0, l0Items);
            Location l1 = new Location("Village Inn", "A cozy inn where travelers rest and share stories./nThe Village Inn welcomes weary travelers with a warm hearth and the aroma of hearty meals./nOak beams cradle the structure, and the low ceiling gives a sense of intimacy./nAdventurers sit at wooden tables, recounting their journeys and listening to tales from distant lands./nThe innkeeper, a jovial figure, serves ale and stew to patrons, while a bard strums a lute in the corner, filling the air with a melodic tune.", 1);
            Location l2 = new Location("Blacksmith's Forge", "The clang of metal fills the air as the blacksmith hammers away./nSparks fly as the blacksmith works tirelessly at the forge./nThe location is dominated by an anvil and various tools, their edges worn from years of use./nThe heat of the furnace radiates throughout the chamber./nThe blacksmith's hands move with precision, shaping metal into weapons, armor, and tools that will aid adventurers in their quests.", 2, l2Items);
            Location l3 = new Location("Market Street", "Stalls line the road, selling goods from near and far./nThe Market Street is a bustling thoroughfare, where traders and merchants from distant lands showcase their wares./nColorful awnings shade a variety of stalls, each offering unique items./nExotic spices, intricate textiles, and rare artifacts draw the attention of passersby./nThe air is filled with the mingling scents of spices, perfumes, and the tantalizing aroma of freshly baked bread.", 3, l3Enemies);
            Location l4 = new Location("Village Common", "A grassy area with benches and a clear view of the night sky./nA sense of tranquility envelops the Village Common./nSoft grass cushions the feet of those who pause to admire the night sky./nWooden benches offer a comfortable vantage point for stargazing or engaging in quiet conversation./nThe canopy of stars above seems to hold countless secrets, a testament to the mysteries of the universe that surround the town.", 4, l4Enemies);
            Location l5 = new Location("Town Well", "A central well where villagers gather water and chat./nThe Town Well is a hub of activity and camaraderie./nVillagers gather here to draw fresh water, sharing tales and laughter as they take their turns at the bucket./nThe well's stone rim features intricate carvings, and flowers in colorful pots adorn its surroundings./nAt dusk, the well's magical glow creates a serene and enchanting atmosphere.", 5);
            Location l6 = new Location("Herbalist's Hut", "Filled with the aroma of herbs, potions, and remedies./nThe air is rich with the scent of herbs in the Herbalist's Hut./nShelves lined with dried plants, jars of potions, and bundles of fragrant flowers fill the space./nThe herbalist, a wise and gentle soul, moves with practiced grace, concocting remedies to mend ailments and ailments./nVisitors are drawn to the soothing aura of the hut, seeking both cures and knowledge.", 6, l6Items);
            Location l7 = new Location("Village Chapel", "A peaceful place of worship with intricate stained glass windows./nThe Village Chapel exudes an air of reverence and tranquility./nSunlight streams through intricate stained glass windows, casting a colorful glow on the worn pews and polished wood./nVillagers gather here to reflect, pray, and seek solace./nThe chapel's altar is adorned with candles and delicate flowers, creating a peaceful sanctuary where the worries of the world can be left behind.", 7, l7Items);
            Location l8 = new Location("Mayor's Manor", "A grand house overseeing the town's affairs./nThe Mayor's Manor stands as a symbol of authority and leadership./nIvy climbs its stone walls, and a sweeping staircase leads to the entrance./nInside, opulent furnishings and portraits of ancestors grace the rooms./nThe mayor, a wise and fair individual, welcomes visitors to discuss matters of importance./nThe manor's grandeur reflects the town's history and aspirations.", 8, l8Items);

            // Set direction attributes
            // l0 :
            l0.setNorth(l7);
            l0.setSouth(l8);
            l0.setEast(l4);
            l0.setWest(l3);
            // l1 :
            l1.setNorth(null);
            l1.setSouth(null);
            l1.setEast(l3);
            l1.setWest(null);
            // l2 :
            l2.setNorth(null);
            l2.setSouth(l3);
            l2.setEast(l7);
            l2.setWest(null);
            // l3 :
            l3.setNorth(l2);
            l3.setSouth(l6);
            l3.setEast(l0);
            l3.setWest(l1);
            // l4 :
            l4.setNorth(null);
            l4.setSouth(null);
            l4.setEast(l5);
            l4.setWest(null);
            // l5 :
            l5.setNorth(null);
            l5.setSouth(null);
            l5.setEast(null);
            l5.setWest(l4);
            // l6 :
            l6.setNorth(l3);
            l6.setSouth(null);
            l6.setEast(l8);
            l6.setWest(null);
            // l7 :
            l7.setNorth(null);
            l7.setSouth(l0);
            l7.setEast(null);
            l7.setWest(l2);
            // l8 :
            l8.setNorth(l0);
            l8.setSouth(null);
            l8.setEast(null);
            l8.setWest(l6);

            // Add items and enemies to locations
            l0.setItems(l0Items);
            l2.setItems(l2Items);
            l3.setEnemies(l3Enemies);
            l4.setEnemies(l4Enemies);
            l6.setItems(l6Items);
            l7.setItems(l7Items);
            l8.setItems(l8Items);


            // Add locations to the list
            locations.add(l0);
            locations.add(l1);
            locations.add(l2);
            locations.add(l3);
            locations.add(l4);
            locations.add(l5);
            locations.add(l6);
            locations.add(l7);
            locations.add(l8);

            return locations;
        }
    }

    private class ItemBuilder {

        public ArrayList<Item> getItems() {

            ArrayList<Item> items = new ArrayList<>();

            items.addAll(getLiquids());
            items.addAll(getFoods());
            items.addAll(getWeapons());

            return items;
        }

        public ArrayList<Liquid> getLiquids() {
            ArrayList<Liquid> liquids = new ArrayList<>();

            Liquid li0 = new Liquid("Health Potion", "A potion that will restore you to full health and your thirst!", 100, 100);
            Liquid li1 = new Liquid("Starlight Elixir", "A mysterious substance that looks as if the night sky was trapped in a bottle.", 50, 0);

            liquids.add(li0);
            liquids.add(li1);

            return liquids;

        }

        public ArrayList<Food> getFoods() {
            ArrayList<Food> foods = new ArrayList<>();

            Food f0 = new Food("Apple", "A delicious red apple. Do you dare to take a bite?", 15);
            Food f1 = new Food("Chicken Leg", "A chicken leg full of meat", 30);
            Food f2 = new Food("Blueberry Pie", "Nothing better than a warm blueberry pie. Just like granma used to make it", 40);

            foods.add(f0);
            foods.add(f1);
            foods.add(f2);

            return foods;

        }

        public ArrayList<Weapon> getWeapons() {
            ArrayList<Weapon> weapons = new ArrayList<>();

            Weapon w0 = new Weapon("Elven Bow", "A masterfully crafted bow with arrows that seem to find their target with uncanny precision.", 25, true);
            Weapon w1 = new Weapon("Druid's Staff", " staff carved with intricate symbols, often wielded by those who commune with nature's magic.", 39, false);
            Weapon w2 = new Weapon("Battle Axe", "A simple yet brutal axe. Forged by dwarves.", 40, false);
            Weapon w3 = new Weapon("Fangs", "A bears fangs", 34, false);
            Weapon w4 = new Weapon("Knife", "A simple knife.", 12, false);
            Weapon w5 = new Weapon("Boar Tusk", "Pointy tusks.", 20, false);

            weapons.add(w0);
            weapons.add(w1);
            weapons.add(w2);
            weapons.add(w3);
            weapons.add(w4);
            weapons.add(w5);

            return weapons;

        }

    }

    private class EnemyBuilder {
        public ArrayList<Enemy> getEnemies() {
            ArrayList<Enemy> enemies = new ArrayList<>();
            ArrayList<Weapon> weapons = new ItemBuilder().getWeapons();


            Enemy e0 = new Enemy("Bear", "An angry bear", 70, weapons.get(3));
            Enemy e1 = new Enemy("Thief", "A thief looking for trouble!", 40, weapons.get(4));
            Enemy e2 = new Enemy("Wild Boar", "An angry boar", 30, weapons.get(5));


            enemies.add(e0);
            enemies.add(e1);
            enemies.add(e2);


            return enemies;

        }


    }


    public void startGame(){
        System.out.println("The game starts");

    }

    public void play() {
        System.out.println("Merlina can :");
        System.out.println("take item, drop item, check inventory, examine item, get health stats, equip a weapon");
        System.out.println();
        System.out.println("What does Merlina do?");
        String userMove = userInput.nextLine();

        String action = "";
        String actionRecipient = "";

        if (userMove.contains(" ")) {
             action = userMove.substring(0, userMove.indexOf(" ")).trim().toLowerCase();
            actionRecipient = userMove.substring(userMove.indexOf(" ")).trim().toLowerCase();
        } else {
            action = userMove.trim().toLowerCase();
        }

        switch (action) {
            case "take" -> take(actionRecipient, merlina.getCurrentLocation());
            case "drop" -> drop(actionRecipient, merlina.getCurrentLocation());
            case "inventory" -> checkInventory(merlina.getInventory());
            case "examine" -> examine(actionRecipient, merlina.getInventory(), items);
            case "health" -> health();
            case "equip" -> equip(actionRecipient);
            case "attack" -> attack(actionRecipient);
            case "eat" -> eat(actionRecipient);
            case "drink" -> drink(actionRecipient);

        }


    }

    public void take(String itemName, Location currentLocation) {
        boolean itemFound = false;

        // Iterate through the current location's items
        for (Item item : new ArrayList<>(currentLocation.getItems())) {
            if (itemName.equalsIgnoreCase(item.getName())) {
                // Add the item to the player's inventory
                merlina.take(item);
                // Remove the item from the current location's items
                currentLocation.removeItem(item);
                itemFound = true;

            }
        }

        if (!itemFound) {
            System.out.println("There is no such item here. Try again.");
        }
    }

    public void drop(String itemName, Location currentLocation) {
        boolean itemFound = false;

        // Iterate through the player's inventory
        for (Item item : new ArrayList<>(merlina.getInventory())) {
            if (itemName.equalsIgnoreCase(item.getName())) {
                // Remove the item from the player's inventory
                merlina.drop(item);
                // Add the item to the current location's items
                currentLocation.addItems(item);
                itemFound = true;

            }
        }

        if (!itemFound) {
            System.out.println("You don't have that item.");
        }
    }

    public void checkInventory(ArrayList<Item> inventory) {
        if (!inventory.isEmpty()){
            System.out.println("Merlinas inventory contains:");
            for (Item item : inventory) {
                System.out.println(item.getName());
            }
        } else {
            System.out.println("Merlinas inventory is empty");
        }
    }

    public void examine(String itemName, ArrayList<Item> inventory, ArrayList<Item> items) {
        if (!inventory.isEmpty() || !items.isEmpty()){
            boolean itemFound = false;

            // Iterate through the player's inventory
            for (Item item : new ArrayList<>(inventory)) {
                if (itemName.equalsIgnoreCase(item.getName())) {
                    System.out.println(item.getDescription());
                    itemFound = true;

                }
            }

            for (Item item : new ArrayList<>(items)) {
                if (itemName.equalsIgnoreCase(item.getName())) {
                    System.out.println(item.getDescription());
                    itemFound = true;

                }
            }

            if (!itemFound) {
                System.out.println("Nothing by that name to examine");
            }

        }
    }

    public void health(){
        merlina.printHealthStats();
    }

    public void equip(String itemName) {
        boolean itemFound = false;

        // Iterate through the player's inventory
        for (Item item : new ArrayList<>(merlina.getInventory())) {
            if (itemName.equalsIgnoreCase(item.getName())) {
                // Remove the item from the player's inventory

                if (item instanceof Weapon) {
                    merlina.setEquippedWeapon((Weapon)item);
                } else {
                    System.out.println("this is not a weapon and cannot be quipped.");
                }

                itemFound = true;

            }
        }

        if (!itemFound) {
            System.out.println("You can't equip an item you dont have in your inventory");
        }
    }

    public void attack(String enemyName) {
        boolean enemyFound = false;
        Enemy attackedEnemy = null;

        // Iterate through the player's inventory
        for (Enemy enemy : merlina.getCurrentLocation().getEnemies()) {
            if (enemyName.equalsIgnoreCase(enemy.getName())) {
                attackedEnemy = enemy;
                enemyFound = true;
            }
        }

        if (enemyFound) {
            merlina.attack(attackedEnemy);
            merlina.hit(attackedEnemy.getWeapon().getDamage());
        }

        if (!enemyFound) {
            System.out.println("There are no enemies by this name here");
        }
    }

    public void eat(String itemName) {
        boolean itemFound = false;

        // Iterate through the player's inventory
        for (Item item : new ArrayList<>(merlina.getInventory())) {
            if (itemName.equalsIgnoreCase(item.getName())) {
                // Remove the item from the player's inventory

                if (item instanceof Food) {
                    merlina.eat((Food)item);
                } else {
                    System.out.println("this is not food and cannot be eaten.");
                }

                itemFound = true;

            }
        }

        if (!itemFound) {
            System.out.println("You can't eat a food you dont have in your inventory");
        }
    }

    public void drink(String itemName) {
        boolean itemFound = false;

        // Iterate through the player's inventory
        for (Item item : new ArrayList<>(merlina.getInventory())) {
            if (itemName.equalsIgnoreCase(item.getName())) {
                // Remove the item from the player's inventory

                if (item instanceof Liquid) {
                    merlina.drink((Liquid)item);
                } else {
                    System.out.println("this is not liquid and cannot be drunk.");
                }

                itemFound = true;

            }
        }

        if (!itemFound) {
            System.out.println("You can't drink a liquid you dont have in your inventory");
        }
    }


}
