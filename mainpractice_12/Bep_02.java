package mainpractice_12;

import java.util.Scanner;

public class Bep_02 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your First num :");
		int num1 = sc.nextInt();
		System.out.print("Enter your Second num :");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println(" The sum of " +num1+ " and " +num2+ " is = " +sum);
		sc.close();
	}

}
