// Lab: Abstract Enemies
// TODO: Declare this class as abstract

public abstract class Enemy {

    // TODO: Add protected instance variables:
    // health, damage, name
    protected int health;
    protected int damage;
    protected String name;

    // TODO: Create a constructor that initializes all fields
    public Enemy(int health, int damage, String name) {
        this.health = health;
        this.damage = damage;
        this.name = name;
    }

    // TODO: Declare abstract methods:
    // update()
    // attack()
    abstract String update();
    abstract String attack();

    // TODO: Create a concrete takeDamage(int amount) method
    void takeDamage(int amount) {
        System.out.println(name + " took " + amount + " damage! Remaining health: " + (health-amount));
    }

    // TODO: Add a getName() method
    public String getName() {
        return name;
    }
}