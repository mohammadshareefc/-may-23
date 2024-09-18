class W06_P3 extends Thread {
    
    @Override
    public void run() {
        // The code that will be executed by the thread
        System.out.println("Thread is running...");
    }

    public static void main(String args[]) {  
        // Creating an object of the thread class
        W06_P3 thread = new W06_P3();  

        // Start the thread
        thread.start();
    }  
}
