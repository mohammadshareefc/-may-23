
// Abstract class Person
abstract class Person {
    public abstract void eat();
    public abstract void sleep();
    public abstract void exercise();
}

// Subclass Athlete
class Athlete extends Person {
    @Override
    public void eat() {
        System.out.println("Athlete eats a balanced diet with high protein and carbs.");
    }

    @Override
    public void sleep() {
        System.out.println("Athlete sleeps for 8 hours to recover.");
    }

    @Override
    public void exercise() {
        System.out.println("Athlete trains rigorously every day.");
    }
}

// Subclass LazyPerson
class LazyPerson extends Person {
    @Override
    public void eat() {
        System.out.println("Lazy person prefers fast food and snacks.");
    }

    @Override
    public void sleep() {
        System.out.println("Lazy person sleeps for more than 10 hours a day.");
    }

    @Override
    public void exercise() {
        System.out.println("Lazy person exercises very rarely.");
    }
}

// Main class
public class W9_02 {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyPerson = new LazyPerson();
        
        // Display athlete's activities
        System.out.println("Athlete's routine:");
        athlete.eat();
        athlete.exercise();
        athlete.sleep();
        
        System.out.println(); // Blank line for separation
        
        // Display lazy person's activities
        System.out.println("Lazy person's routine:");
        lazyPerson.eat();
        lazyPerson.exercise();
        lazyPerson.sleep();
    }
}
