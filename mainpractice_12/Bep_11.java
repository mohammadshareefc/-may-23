package mainpractice_12;

import java.util.Scanner;

public class Bep_11 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter your String :");
		String originalString = sc.nextLine();
		String lowerCaseString = originalString.toLowerCase();;
		String reversedString= "";
		for(int i =lowerCaseString.length()-1;i>=0;i--) {
			reversedString += lowerCaseString.charAt(i);
		}
		if(lowerCaseString.equals(reversedString)) {
			System.out.println(originalString + " is a palindrome.");
		}else {
			System.out.println(originalString + " is not a palindrome.");
		}
	}

}
