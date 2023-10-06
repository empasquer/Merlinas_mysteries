public class Weapon extends Item {
    private int damage;
    private boolean isRangeWeapon;

    public Weapon(String name, String description, int damage, boolean isRangeWeapon ) {
        super(name, description);
        this.damage = damage;
        this.isRangeWeapon = isRangeWeapon;
    }

    public int getDamage() {
        return damage;
    }

    /*
    Weapon elvenBow = new Weapon();
    Weapon battleAxe = new Weapon();
    Weapon druidStaff = new Weapon();*/
}
