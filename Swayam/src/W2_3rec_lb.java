
import java.util.Scanner;
class Rectangle {
    // Private variables
    private double length;
    private double width;

    // Default constructor
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Method to calculate area
    public double getArea() {
        return length * width;
    }
}


public class W2_3rec_lb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // Create Rectangle objects
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, width);

        // Print rectangle dimensions
        System.out.print("Default Rectangle: L, W, A : ");
        System.out.println(rect1.getLength() + ", " + rect1.getWidth() + ", " + rect1.getArea());
        System.out.print("Parameterized Rectangle: L, W, A : ");
        System.out.println(rect2.getLength() + ", " + rect2.getWidth() + ", " + rect2.getArea());

        scanner.close();
    }
}

