package mainpractice_12;

import java.util.Scanner;

public class Bep_05 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num =sc.nextInt();
		
		long factorial = 1 ;
		
		for(int i=1;i<=num;i++) {
			factorial *=i;
		}
		System.out.println("Factorial of " + num + " is:" +factorial);
		sc.close();
	}

}
