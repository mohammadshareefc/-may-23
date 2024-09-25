
import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    public abstract void draw();
    public abstract double calculateArea();
}

// Subclass Circle
class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Cylinder
class Cylinder extends Shape {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a cylinder");
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Main class
public class W9_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input for radius and height
        System.out.print("Enter the radius: ");
        int radius = in.nextInt();
        System.out.print("Enter the height: ");
        int height = in.nextInt();

        Shape circle = new Circle(radius);
        Shape cylinder = new Cylinder(radius, height);

        drawShapeAndCalculateArea(circle);
        drawShapeAndCalculateArea(cylinder);
        
        in.close();
    }

    public static void drawShapeAndCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.printf("Area: %.4f%n", area);
    }
}
