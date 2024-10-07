
import java.util.Scanner;

public class W10_05 {

    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        // Read any two values for a and b
        a = input.nextInt();
        b = input.nextInt();
        input.close();

        // Try block to divide two numbers and display the result
        try {
            int result = a / b;  // Division operation
            System.out.print(result);
        }
        // Catch block to catch the ArithmeticException if denominator is zero
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by ZERO");
        }
        // Catch any other general exceptions
        catch (Exception e) {
            System.out.println("Exception Occurred");
        }
    }
}
