import java.util.Scanner;

public class W7_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input range from user
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Close the scanner
        sc.close();
        
        // Compute and print the sum of prime numbers in the range
        System.out.print(primeSum(x, y));
    }

    // Function to compute the sum of all prime numbers in a given range
    public static int primeSum(int x, int y) {
        int sum = 0;
        
        for (int num = x; num <= y; num++) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        
        return sum;
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
