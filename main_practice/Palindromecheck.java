package main_practice;
//import java.util.Scanner;
//public class Palindromecheck {
//     public static boolean isPalindrome(String str) {
//    	  str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//    	 int left = 0, right = str.length()-1;
//    	 while(left < right) {
//    		 if(str.charAt(left)!= str.charAt(right)) {
//    			 return false;
//    		 }
//    		 left++;
//    		 right++;
//    	 }
//    	 return true;
//     }
//     public static boolean isPalindrome(int number) {
//    	 
//    	 int original = number, reverse =0;
//    	 while(number !=0) {
//    		 int digit = number % 10;
//    		 reverse = reverse * 10 + digit ;
//    		 number /= 10;
//    	 }
//    	 return original == reverse;
//     }
//     public static void main(String [] args) {
//    	 Scanner sc = new Scanner(System.in);
//    	 System.out.print("Enter a string to check: ");
//    	 String inputString = sc.nextLine();
//    	 if(isPalindrome(inputString)) {
//    		 System.out.println(inputString+ " is a palindrome. ");
//    	 }else {
//    		 System.out.println(inputString+ " is not a palindrome. ");
//    	 }
//    	 
//    	 System.out.print("Enter a number to check: ");
//    	 int inputnumber = sc.nextInt();
//    	 if(isPalindrome(inputnumber)) {
//    		 System.out.println(inputnumber + " is a palindrome. ");
//    		 
//    	 }else {
//    		 System.out.println(inputnumber + " is not a palindrome. ");
//    	 }
//     }
//}

import java.util.Scanner;

public class Palindromecheck {
    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Edge case: if the string is empty or has only one character, it's a palindrome
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }

        int left = 0, right = str.length() - 1;
        
        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int original = number, reverse = 0;
        
        // Reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        // Check if reversed number matches the original number
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Palindrome check for string
        System.out.print("Enter a string to check: ");
        String inputString = scanner.nextLine();
        
        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
        
        // Palindrome check for number
        System.out.print("Enter a number to check: ");
        int inputNumber = scanner.nextInt();
        
        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " is a palindrome.");
        } else {
            System.out.println(inputNumber + " is not a palindrome.");
        }
        
        scanner.close();
    }
}

