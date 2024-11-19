package Started_Raja;

import java.util.Scanner;

public class S9 {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter your number :");
		int num = scan.nextInt();
		int reversed =0;
		do {
			int digit = num % 10;
			reversed = reversed * 10+digit;
			num /= 10;
		}while(num >0);
		System.out.println("Reversed Number:" + reversed);
	}

}
