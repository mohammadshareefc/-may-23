package Started_Raja;

import java.util.Scanner;

public class S6 {
	
	public static void main (String arg[]) {
		Scanner mm = new Scanner(System.in);
		System.out.println("Enter your year = ");
		int year = mm.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println("It is leap year. ");
			
		}else {
			System.out.println("It is not leap year. ");
		}
	}

}
