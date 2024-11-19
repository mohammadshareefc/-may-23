package Started_Raja;

public class S10 {
	public static void main(String arg[]) {
		int n = 10, a = 0, b = 1;
		System.out.println("Fibonacci series:" +a+" "+b);
		for(int i = 2; i < n;i++) {
			int next = a+b;
			System.out.print(" " + next);
			a = b;
			b = next;
		}
		
	}

}
