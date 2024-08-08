import java.util.Scanner;

public class Ln_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println ("Enter input Number:");
        

        // Read the integer from the user
        long n = input.nextLong();

        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }

    // Calculate the sum of the digits by defining a sumDigits() function
    // This should return the sum
    public static int sumDigits(long number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
