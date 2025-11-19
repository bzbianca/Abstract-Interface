// Dragon enemy subclass

// TODO: Extend Enemy

public class Dragon extends Enemy{

    // TODO: Create constructor (call super)
    public Dragon(int health, int damage, String name) {
        super(health, damage, name);
    }

    // TODO: Implement update()
    String update() {
        System.out.println(name + " breathes in..");
        return null;
    }
    // TODO: Implement attack()
    String attack() {
        System.out.println(name + " blows fire!");
        return null;
    }
}