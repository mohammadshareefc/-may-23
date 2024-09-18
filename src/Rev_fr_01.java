import java.util.Scanner;

public class Rev_fr_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your String name: ");
        String original = scanner.nextLine(); // Read user input
        
        // Initialize an empty string to hold the reversed string
        String reversed = "";
        
        // Reverse the string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println("Reversed String: " + reversed);
        
        scanner.close();
    }
}
 