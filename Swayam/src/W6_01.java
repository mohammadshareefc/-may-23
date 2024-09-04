
import java.util.Scanner;

interface Number {
    int findSqr(int i);  // Returns the square of n
}

// Class A implementing the Number interface
class A implements Number {
    @Override
    public int findSqr(int i) {
        return i * i;  // Return the square of the number
    }
}

public class W6_01 {
    public static void main(String[] args) {
        A a = new A();  // Create an object of class A
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter a number: ");
        int i = sc.nextInt();  // Read a number from the keyboard
        
        System.out.print("Square of " + i + " is: " + a.findSqr(i)); 
    }
}
