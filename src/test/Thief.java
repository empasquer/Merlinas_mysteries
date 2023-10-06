package test;

public class Thief extends Enemy {
    public Thief(String name, String description, int healthPoints, Weapon weapon){
        super(name, description, healthPoints, weapon);

    }

    public static void main(String[]args){
        Thief thief = new Thief("Thief", "A thief looking for trouble!", 40, Knife);
        Weapon Thief = new Weapon("Thief", 10);

    }
}
