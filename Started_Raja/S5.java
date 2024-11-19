package Started_Raja;

public class S5 {
	public static void main(String arg[]) {
		int a = 2024;
		if((a % 4==0 && a % 100 != 0) || (a % 400 == 0)) {
			System.out.println("It is a leap year");
		}else {
			System.out.println("It is not a leap year");
		}
	}

}
