import java.util.Scanner;

// Class Declaration
public class W2_p5con_gett {
    // Instance Variables
    private String name;
    private String breed;
    private int age;
    private String color;

    // Constructor
    public W2_p5con_gett(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Getter functions
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter breed: ");
        String breed = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter color: ");
        String color = scanner.next(); // Use next() to read color (may need nextLine() if color has spaces)

        // Create Dog object
        W2_p5con_gett tommy = new W2_p5con_gett(name, breed, age, color);

        // Print dog details
        System.out.println("Hi, my name is: " + tommy.getName());
        System.out.println("My breed is: " + tommy.getBreed());
        System.out.println("My age is: " + tommy.getAge());
        System.out.println("My color is: " + tommy.getColor());

        scanner.close();
    }
}


