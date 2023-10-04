package test;

public class Enemy {
    private String name;
    private String description;
    private int healthPoints;
    private Weapon weapon;

    // Constructor
    public Enemy(String name, String description, int healtPoints, Weapon weapon){
        this.name = name;
        this.description = description;
        this.healthPoints = healtPoints;
        //this.weapon = weapon;
    }

    // Method to make the enemy attack the player
    public void attack(Player player){
        System.out.println(name + "attacks" + player.getName() + "with" + weapon.getName());

    }

    //Getters and setters for the attributers
    public String getName(){
        return name;

    }

    public String getDescription(){
        return description;

    }

    public int getHealthPoints() {
        return healthPoints;

    }

    // Add a setter method for healtPoints specific to WildBoar

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;

    }
}


