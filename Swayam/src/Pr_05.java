import java.util.Scanner;
public class Pr_05 {
	public static void main(String arg[]) {
		Scanner SS = new Scanner(System.in);
		System.out.println("Enter the charcter");
	char ch = SS.next().charAt(0);
		for(int i=0;i<5;i++) {
			ch++;
			if(ch >'z') {
				ch = 'A';
				System.out.println(ch+ " ");
			}
			else if(ch >'Z' && ch<'a') {
				ch ='a';
				System.out.println(ch+ " ");
			}
			else {
				System.out.print(ch+ " ");
			}
		}
	}
}
