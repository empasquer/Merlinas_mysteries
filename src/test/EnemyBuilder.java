package test;

import java.util.ArrayList;
import java.util.List;

public class EnemyBuilder {
    private String name;
    private String description;
    private int healthPoints;
    private Weapon weapon;

    public EnemyBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public EnemyBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public EnemyBuilder setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
        return this;
    }

    public EnemyBuilder setWeapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }

    public Enemy build() {
        return new Enemy(name, description, healthPoints, weapon);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store enemies
        List<Enemy> enemies = new ArrayList<>();

        // Create weapons
        Weapon knife = new Weapon("knife", 10);
        Weapon boarTusk = new Weapon("Tusk", 20);
        Weapon fangs = new Weapon("Fangs", 30);

        // Create enemies using the EnemyBuilder
        EnemyBuilder enemyBuilder = new EnemyBuilder();

        // Create a Thief
        Thief thief = (Thief) enemyBuilder
                .setName("A Thief")
                .setDescription("Looking for trouble")
                .setHealthPoints(40)
                .setWeapon(knife)
                .build();
        enemies.add(thief);

        // Create a WildBoar
        WildBoar wildBoar = (WildBoar) enemyBuilder
                .setName("Wild Boar")
                .setDescription("An angry boar")
                .setHealthPoints(30)
                .setWeapon(boarTusk)
                .build();
        enemies.add(wildBoar);

        // Create a Bear
        Bear bear = (Bear) enemyBuilder
                .setName("Bear")
                .setDescription("An angry bear")
                .setHealthPoints(70)
                .setWeapon(fangs)
                .build();
        enemies.add(bear);

        // Print information about the enemies
        for (Enemy enemy : enemies) {
            System.out.println("Name: " + enemy.getName());
            System.out.println("Description: " + enemy.getDescription());
            System.out.println("Health Points: " + enemy.getHealthPoints());
            System.out.println("Weapon: " + enemy.getWeapon().getName());
            System.out.println();
        }
    }
}
