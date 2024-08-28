import java.util.*;

class IllegalArgumentException extends Exception {  // Custom Exception class
  public IllegalArgumentException(String message) {
    super(message);
  }
}

public class W5_01 {
    public static void main(String[] args) {
      // int n = 18;
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      trynumber(n);
    }

    // Method to try and check the number
    public static void trynumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to check if a number is even, throws an exception if it's odd
    public static void checkEvenNumber(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is an odd number!");
        }
    }
}
