


import java.util.Scanner;

public class Ln_03 {
    public static void main(String[] args) {
        int i, n, sum = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println ("Enter input Digit:");
        
        // Read the number of terms from the user
        n = in.nextInt();

        System.out.printf("The first %d natural numbers are: \n", n);
        
        // Loop through the first n natural numbers
        for (i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;  // Calculate the sum
        }

        // Print the sum of the first n natural numbers
        System.out.printf("The Sum of Natural Number upto %d terms: %d", n, sum);
    }
}
