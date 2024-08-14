
import java.util.*;

public class W3_p4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        int sum = 0;
        int count = 0;
        int product = 1;

        while (true) {
            System.out.print("Enter an integer (press q to quit): ");
            choice = input.next();

            // Check if the user wants to quit
            if (choice.equalsIgnoreCase("q")) {
                break;
            }

            // Convert input to integer and process it
            try {
                int num = Integer.parseInt(choice);
                sum += num;
                count++;
                product *= num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        // Calculate and print the average and product
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("\nAverage: " + average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("\nNo numbers entered.");
        }
    }
}
