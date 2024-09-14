package mainpractice_12;

import java.util.Scanner;

public class Bep_08 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter your number :");
		int num = sc.nextInt();
		
		int sum = 0;
		int temp = num ;
		 while (temp !=0) {
			 int digit = temp % 10;
			 sum += digit;
			 temp = temp/10;
		 }
		 System.out.println("The sum of digits of " +num+ " is: " +sum);
		 sc.close();
	}

}
