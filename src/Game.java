import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        new Game().run();
    }

    private void run() {

        ArrayList<Item> items = new ItemBuilder().getItems();

        for (int i = 0; i< items.size(); i++) {
            System.out.println(items.get(i).getName());
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

            Weapon w0 = new Weapon("Elven Bow", "A masterfully crafted bow with arrows that seem to find their target with uncanny precision.", 85, true);
            Weapon w1 = new Weapon("Druid's Staff", " staff carved with intricate symbols, often wielded by those who commune with nature's magic.", 89, false);
            Weapon w2 = new Weapon("Battle Axe", "A simple yet brutal axe. Forged by dwarves.", 77, false);

            weapons.add(w0);
            weapons.add(w1);
            weapons.add(w2);

            return weapons;

        }

    }

}
