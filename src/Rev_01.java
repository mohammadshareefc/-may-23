
/*public class Rev_01 {
	public static void main(String args[]) {
		String orginal = "feerahs";
		String reversed = new StringBuilder(orginal).reverse().toString();
		System.out.println(reversed);
	}

}*/

import java.util.Scanner;

public class Rev_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your String name: ");
        String original = scanner.nextLine(); // Read user input
        
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: " + reversed);
        
        scanner.close();
    }
}

