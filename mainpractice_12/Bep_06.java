package mainpractice_12;
import java.util.Scanner;

public class Bep_06 {
public static void main(String args[]) {
	Scanner mn = new Scanner(System.in);
	System.out.print(" Enter your number :");
	
	int num = mn.nextInt();
	boolean isPrime = true;
	
	if(num <=1) {
		isPrime= false;
	}else {
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i==0) {
				isPrime = false;
				break;
			}
		}
	}
	if(isPrime) {
		System.out.println(num+ " is a prime number. ");
	}else {
		System.out.println(num+ " is a not prime number. ");
	}
	mn.close();
}
}
