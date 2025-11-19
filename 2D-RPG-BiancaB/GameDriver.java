// Driver for the Enemy inheritance lab

public class GameDriver {

    public static void main(String[] args) {

        // TODO: Add this commented line to show that Enemy cannot be instantiated:
        //Enemy e = new Enemy();

        // TODO: Create an Enemy[] array with:
        // new Slime(...)
        // new Skeleton(...)
        // new Dragon(...)
        Enemy[] enemies = {new Slime(10, 5, "Green Slime"), new Skeleton(15, 10, "Skeleton Archer"), new Dragon(25, 15, "End Dragon")};

        // TODO: Loop through the array and call:
        // update(), attack(), takeDamage()
        for (Enemy enemy : enemies) {
            System.out.println("=== " + enemy.getName() + " ===");
            enemy.update();
            enemy.attack();
            enemy.takeDamage(5);
        }

        // TODO: Add reflection answers as comments at the bottom of this file
    }
}