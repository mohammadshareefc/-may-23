
import java.util.*;

public class W10_04 {  
    public static void main(String[] args) { 
        try {
            String s1 = "NPTELJAVA";  // Original string
            Scanner inr = new Scanner(System.in);
            
            // Reading the index from the user
            int n = inr.nextInt();
            
            // Using StringBuilder to modify the string
            StringBuilder sb = new StringBuilder(s1);
            
            // Replace the character at index "n" with 'a'
            sb.setCharAt(n, 'a');
            
            // Print the modified string
            System.out.println(sb.toString());
            
        } catch (Exception e) {
            // Catching any exceptions (e.g., index out of bounds) and printing the message
            System.out.print("exception occur");
        }	   
    }  
}
