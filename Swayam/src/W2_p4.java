import java.util.Scanner;
class Circle {
    // Private attributes
    private double radius;

    // Default constructor
    public Circle() {
        this.radius = 1.0; // Default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Setter method for radius (optional, if needed)
    public void setRadius(double radius) {
        this.radius = radius;
    }
}


public class W2_p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter radius for circle: ");
        double radius = scanner.nextDouble();

        // Create Circle objects
        Circle defaultCircle = new Circle();
        Circle parameterizedCircle = new Circle(radius);

        // Get and print the area and circumference for the default circle
        System.out.println("Default Circle: ");
        System.out.println("Radius: " + defaultCircle.getRadius());
        System.out.println("Area: " + defaultCircle.getArea());
        System.out.println("Circumference: " + defaultCircle.getCircumference());

        // Get and print the area and circumference for the parameterized circle
        System.out.println("Parameterized Circle: ");
        System.out.println("Radius: " + parameterizedCircle.getRadius());
        System.out.println("Area: " + parameterizedCircle.getArea());
        System.out.println("Circumference: " + parameterizedCircle.getCircumference());

        scanner.close();
    }
}
