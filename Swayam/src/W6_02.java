import java.util.Scanner;

interface GCD {
    int findGCD(int n1, int n2);
}

// Class B implementing the GCD interface
class B implements GCD {
    @Override
    public int findGCD(int n1, int n2) {
        // Implementing the Euclidean algorithm to find the GCD
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}

public class W6_02 {
    public static void main(String[] args) {
        B a = new B();  // Create an object of class B
        Scanner sc = new Scanner(System.in);  
        
        System.out.print("Enter first number: ");
        int p1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int p2 = sc.nextInt();
        
        System.out.print("GCD of " + p1 + " and " + p2 + " is: " + a.findGCD(p1, p2)); 
    }
}
