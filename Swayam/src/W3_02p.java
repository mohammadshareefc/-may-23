
import java.util.Scanner;

class cls1 {
    void add(int p, int q) {
        System.out.println("Sum: " + (p + q));
    }
}

// Subclass cls2 of cls1 which performs multiplication and sum of squares
class cls2 extends cls1 {
    void mul(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    // Method to calculate the sum of squares of two parameters
    void task(int a, int b) {
        int sumOfSquares = (a * a) + (b * b);
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}

public class W3_02p {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        cls2 obj = new cls2();
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        obj.add(a, b);
        obj.mul(a, b);
        obj.task(a, b);
    }
}
