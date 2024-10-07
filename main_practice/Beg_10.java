package main_practice;

//import java.util.Scanner;
//
//public class Beg_10 {
//	public static void main(String arg[]) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter a positive integer: ");
//		int number =sc.nextInt();
//		int orginalnumber = number;
//		int reversednumber = 0;
//		while(number != 0) {
//			int digit = number % 10;
//			reversednumber = reversednumber * 10+ digit;
//			number /=10;
//		}
//		if(orginalnumber == reversednumber) {
//			System.out.println(orginalnumber + "is a palindrome. ");
//		}else {
//			System.out.println(orginalnumber + "is  not a palindrome. ");
//		}
//	}
//
//}




import java.util.Scanner;

public class Beg_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for a name
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniform comparison
        String cleanedName = name.replaceAll("\\s+", "").toLowerCase();
        String reversedName = "";

        // Reverse the name
        for (int i = cleanedName.length() - 1; i >= 0; i--) {
            reversedName += cleanedName.charAt(i);
        }

        // Check if the original name is equal to the reversed name
        if (cleanedName.equals(reversedName)) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }

        // Close the scanner
        scanner.close();
    }
}




//Enter a name: A man a plan a canal Panama



