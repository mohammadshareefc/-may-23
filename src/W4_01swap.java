
import java.util.Scanner;

class Question {
  // Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
  int e1 = sc.nextInt();  // Read e1
  int e2 = sc.nextInt();  // Read e2
}

public class W4_01swap {
  // Method to swap the elements using call by object reference
  static void swap(Question t) {
    int temp = t.e1;
    t.e1 = t.e2;
    t.e2 = temp;
  }

  public static void main(String[] args) {
    Question t = new Question();
    System.out.println("Before Swap: " + t.e1 + " " + t.e2);
    swap(t);  // Passing object reference to swap method
    System.out.println("After Swap: " + t.e1 + " " + t.e2);
  }
}
