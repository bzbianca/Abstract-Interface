1. The enemy class cannot be instantiated because it is an abstract class, meaning they are dependant on other extended classes
2. The value of update() and attack() would not exist as the Enemy class only declares the method.
3. Enemy[] allows for all of the subclasses to be inside of an array to be iterated through and to call all methods.
4. It is helpful to have a concrete method for output that are similar to each other. This example includes takeDamage() where each enemy takes damage.
5. Yes, the classes utlize implemenation of methods to get values from the main class of Enemy while polymorphism is executed in the GameDriver.
