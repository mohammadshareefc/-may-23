
import java.util.Scanner;

public class W3_p3 {

    // Recursive method to calculate the factorial of a number
    static int factorial(int n) {
        // Base case: Factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial of (n-1)
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Enter a number: ");
        int x = in.nextInt();

        // Print the factorial of the number
        System.out.println("Factorial of " + x + " is: " + factorial(x));
    }
}
