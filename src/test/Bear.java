package test;

public class Bear extends Enemy {
    public Bear(String name, String description, int healthPoints, Weapon weapon){
        super(name, description, healthPoints, weapon);

    }

    public static void main(String[]args){
        Bear bear = new Thief("Bear", "A Big and hungry bear", 80, fangsAndClaws);
        Weapon Bear = new Weapon("Bear", 30);

    }
}
