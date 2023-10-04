import java.util.ArrayList;

public class Liquid extends Item {
    private int thirstPoints;
    private int healthPoints; // healthPotion skal restore Health

    public Liquid(String name, String description, int thirstPoints, int healthPoints) {
        super(name, description);
        this.thirstPoints = thirstPoints;
        this.healthPoints = healthPoints;
    }















    // Liquid starlightElixir = new Liquid();
    //Liquid mysticElixir = new Liquid();
    // Liquid healthPotion = new Liquid();

/*    public void setHealthPotion(Liquid healthPotion) {
        this.healthPotion = healthPotion;
        healthPotion.healthPoints = 100;
        healthPotion.thirstPoints = 100;
        healthPotion.name = "Health Potion";
        healthPotion.description = "A potion that will restore you to full health and your thirst!";
    }

    public void setStarlightElixir(Liquid starlightElixir) {
        this.starlightElixir = starlightElixir;
        starlightElixir.thirstPoints = 50;
        starlightElixir.name = "Starlight Elixir";
        starlightElixir.description = "A mysterious substance that looks as if the night sky was trapped in a bottle.";
    }

    public void setMysticElixir(Liquid mysticElixir) {
        this.mysticElixir = mysticElixir;
        mysticElixir.thirstPoints = 10;
    }*/


}
