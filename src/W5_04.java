// Define the Flyable interface
interface Flyable {
    void fly_obj(); // Abstract method to be implemented by classes
}

// Define the Spacecraft class implementing Flyable
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}

// Define the Airplane class implementing Flyable
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}

// Define the Helicopter class implementing Flyable
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying");
    }
}

// Main class to test the Flyable interface implementations
public class W5_04 {
    public static void main(String[] args) {
        // Create an array of Flyable objects, including a Spacecraft, Airplane, and Helicopter
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};

        // Iterate through the array and call the "fly_obj" method on each object
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}
