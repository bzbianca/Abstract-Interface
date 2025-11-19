// Slime enemy subclass

// TODO: Extend Enemy

public class Slime extends Enemy{

    // TODO: Create constructor
    // Must call super(...)
    public Slime(int health, int damage, String name) {
        super(health, damage, name);
    }
    // TODO: Implement update()
    public String update() {
        System.out.println(name + " wiggles closer..");
        return null;
    }
    // TODO: Implement attack()
    String attack() {
        System.out.println(name + " spits goo!");
        return null;
    }
}