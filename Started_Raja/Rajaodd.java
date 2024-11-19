package Started_Raja;

import java.util.Scanner;

public class Rajaodd {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "is even .");
		}else {
			System.out.println(num + "is odd.");
		}
		
		s.close();
	}

}
