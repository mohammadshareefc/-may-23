import java.util.Scanner;

public class W4_05ins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the number of positive even numbers to sum
        
        // Declare variables for the calculation
        int sum = 0; // To accumulate the sum
        int count = 0; // To count the number of valid even numbers
        int i = 2; // Start with the first positive even number
        
        // Loop to find and sum the first n positive even numbers divisible by 3
        while (count < n) {
            if (i % 3 == 0) { // Check if the even number is divisible by 3
                sum += i;
                count++;
            }
            i += 2; // Move to the next even number
        }
        
        // Print the result
        System.out.println("Sum: " + sum);
        
        sc.close(); // Close the Scanner
    }
}
