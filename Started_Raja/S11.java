package Started_Raja;

public class S11 {
	public static void main(String arg[]) {
		int num = 25;
		boolean isPrime = true;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num + " is a prime number");
		}else {
			System.out.println(num + " is not a prime number");
		}
	}

}
