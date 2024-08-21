import java.util.Scanner;

class Point {
    double x, y;
    
    // Constructor to initialize point coordinates
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Method to calculate the slope between this point and another point
    double slope(Point p) {
        if (this.x == p.x) {
            throw new ArithmeticException("Slope is undefined (vertical line).");
        }
        return (p.y - this.y) / (p.x - this.x);
    }
}

public class W4_02slop {         
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading the coordinates for the two points
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        // Creating Point objects
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        
        // Calculating and printing the slope
        try {
            System.out.print("Slope: " + p1.slope(p2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        sc.close();
    }
}
