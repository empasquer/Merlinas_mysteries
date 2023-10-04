package test;

public class WildBoar extends Enemy {
    public WildBoar(String name, String description, int healthPoints, Weapon weapon){
        super(name, description, healthPoints, weapon);

    }

    public static void main(String[]args){
        WildBoar wildBoar = new WildBoar("Wild Boar", "An angry boar", 30, boraTusk);
        Weapon boarTusk = new Weapon("Tusk", 10);

    }
}

