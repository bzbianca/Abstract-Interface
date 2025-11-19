// Skeleton enemy subclass

// TODO: Extend Enemy

public class Skeleton extends Enemy{

    // TODO: Create constructor (call super)
    public Skeleton(int health, int damage, String name) {
        super(health, damage, name);
    }

    // TODO: Implement update()
    String update() {
        System.out.println(name + " draws its bow.");
        return null;
    }
    // TODO: Implement attack()
    String attack() {
        System.out.println(name + " shoots its arrow!");
        return null;
    }
}