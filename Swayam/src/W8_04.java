// Import the required package
import java.util.Scanner;

// Main class is created
public class W8_04 {
    public static void main(String[] args) {
        // Scanner object is created
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your CourseName: ");
        
        // Read String input using scanner class
        String CourseName = scanner.nextLine(); 
        
        // Print the scanned String
        System.out.print("Course: " + CourseName); 
        
        // Close the scanner
        scanner.close();
    }
}
