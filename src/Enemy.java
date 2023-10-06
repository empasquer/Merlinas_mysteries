public class Enemy {
    private String name;
    private String description;
    private int healthPoints;
    private Weapon weapon;

    // Constructor
    public Enemy(String name, String description, int healthPoints, Weapon weapon){
        this.name = name;
        this.description = description;
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    // Method to make the enemy attack the player
    public void attack(Player player){
        System.out.println(name + "attacks" + player.getName() + "with" + weapon.getName());

        int damage = weapon.getDamage();
        int playerHealth = player.getHealth();
        player.setHealth(playerHealth - damage);
    }

    //Getters and setters for the attributes
    public String getName(){
        return name;

    }

    public String getDescription(){
        return description;

    }

    public int getHealthPoints() {
        return healthPoints;

    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }


}


