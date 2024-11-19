package Started_Raja;

import java.util.Scanner;

public class Change {
	public static void main(String arg[]) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your first number : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter your second number : ");
		int num2 = sc.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        sc.close();
    
			
	}

}
