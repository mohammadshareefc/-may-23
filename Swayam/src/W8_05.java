
import java.util.Scanner;

public class W8_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j;

        try {
            switch (i) {
                case 0:
                    int zero = 0;
                    j = 92 / zero; // This will throw ArithmeticException
                    break;
                case 1:
                    int[] b = null;
                    j = b[0]; // This will throw NullPointerException
                    break;
                default:
                    System.out.print("No exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (NullPointerException e) {
            System.out.println("java.lang.NullPointerException");
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e);
        } finally {
            scan.close(); // Close the scanner
        }
    }
}
