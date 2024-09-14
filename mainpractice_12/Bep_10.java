package mainpractice_12;

import java.util.Scanner;

public class Bep_10 {
	public static void main(String args[]) {
		Scanner shareef =new Scanner (System.in);
		
		System.out.print("Enter Your number :");
		
		int number = shareef.nextInt();
		int orginalNumber = number;
		int reversed = 0;
		
		while( number != 0) {
			int digit = number % 10;
			reversed = reversed*10+digit;
			number= number/10;
		}
		if(orginalNumber == reversed) {
			System.out.println(orginalNumber + " is a palindrome.");
		}else {
			System.out.println(orginalNumber + " is  not a palindrome.");
		}
		shareef.close();
	}

}
