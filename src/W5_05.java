// Define the Playable interface
interface Playable {
    void play(); // Abstract method to be implemented by classes
}

// Define the Volleyball class implementing Playable
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing volleyball");
    }
}

// Define the Basketball class implementing Playable
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Define the Football class implementing Playable
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Main class to test the Playable interface implementations
public class W5_05 {
    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}
