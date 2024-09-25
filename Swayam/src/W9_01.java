import java.util.Scanner;

class W9_01 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        // Input the number of rows for the rhombus
        System.out.print("Input the number: ");
        int n = in.nextInt();
        
        // Display the number rhombus
        displayRhombus(n);
        
        in.close();
    }

    public static void displayRhombus(int n) {
        // Upper half of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Lower half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
