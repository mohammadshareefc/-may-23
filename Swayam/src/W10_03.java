import java.io.*;
import java.util.*;

public class W10_03 {  
    public static void main(String[] args) { 
        int count = 0;  // Initialize the count of digits
        try {
            // Create InputStreamReader and BufferedReader objects to read input from the user
            InputStreamReader r = new InputStreamReader(System.in);  
            BufferedReader br = new BufferedReader(r);  
            
            // Reading a line of text from the user
            String input = br.readLine();  

            // Loop through the input string and count digits
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (Character.isDigit(ch)) {
                    count++;
                }
            }
            
            // Printing the result (count of digits)
            System.out.println(count);
            
        } catch (IOException e) {
            // Handling IO exceptions
            System.out.println("Error: An exception occurred while reading input.");
        }
    }
}
