
import java.util.*;

public class W10_02 {  
    public static void main(String[] args) { 
        try { 
            // Initializing the byte array
            byte barr[] = {'N', 'P', 'T', 'E', 'L', '-', 'J', 'A', 'V', 'A', 'J', 'U', 'L', '-', 'N', 'O', 'C', 'C', 'S', '\n'};
            
            // Create a Scanner object to take input from the user
            Scanner inr = new Scanner(System.in);
            
            // Read index input from the user
            int n = inr.nextInt();
            
            // Fetching the byte value at the specified index
            byte byteValue = barr[n];
            
            // Converting byte to char
            char charValue = (char) byteValue;
            
            // Printing the byte value and its corresponding char value
            System.out.println("Byte value: " + byteValue + ", Char value: " + charValue);
            
        } catch (Exception e) {
            // Print the required error message in case of an exception
            System.out.println("Error: Exception occurred");
        }
    }  
}
