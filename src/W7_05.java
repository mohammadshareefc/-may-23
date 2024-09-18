import java.util.Scanner;

class PrintNumbers implements Runnable {
    private int start;
    private int end;
    
    // Constructor
    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void run() {
        // Determine the thread name
        String threadName = Thread.currentThread().getName();
        
        // Print numbers in the specified range
        for (int i = start; i <= end; i++) {
            if (threadName.equals("EvenThread") && i % 2 == 0) {
                System.out.println(threadName + ": " + i);
            } else if (threadName.equals("OddThread") && i % 2 != 0) {
                System.out.println(threadName + ": " + i);
            }
        }
    }
}

class W7_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        System.out.print("Enter the starting value for even numbers: ");
        int evenStart = scanner.nextInt();
        System.out.print("Enter the ending value for even numbers: ");
        int evenEnd = scanner.nextInt();
        System.out.print("Enter the starting value for odd numbers: ");
        int oddStart = scanner.nextInt();
        System.out.print("Enter the ending value for odd numbers: ");
        int oddEnd = scanner.nextInt();
        
        // Create threads
        Thread evenThread = new Thread(new PrintNumbers(evenStart, evenEnd), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(oddStart, oddEnd), "OddThread");

        // Start threads
        evenThread.start();
        try {
            // Sleep to ensure that even numbers are printed before odd numbers
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();
        
        // Close scanner
        scanner.close();
    }
}
