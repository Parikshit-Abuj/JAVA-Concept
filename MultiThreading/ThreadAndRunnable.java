package threadtest;

// Creating a thread by extending Thread class
class ThreadTest extends Thread {

    // This method runs when thread starts
    @Override
    public void run() {

        int i = 1;

        // Infinite loop
        while (true) {
            System.out.println(i + " Hello");
            i++;

            // Optional: slow down output (uncomment if needed)
            // try {
            //     Thread.sleep(500);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }

    // Main method (program starts here)
    public static void main(String[] args) {

        // Create thread object
        ThreadTest t = new ThreadTest();

        // Start the thread (calls run() internally)
        t.start();

        int i = 1;

        // Main thread running simultaneously
        while (true) {
            System.out.println(i + " World");
            i++;

            // Optional: slow down output
            // try {
            //     Thread.sleep(500);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}
