package threadtest;

// Creating a thread using Runnable interface
public class RunnableDemo implements Runnable {

    // This method runs when thread starts
    @Override
    public void run() {

        int i = 1;

        // Infinite loop
        while (true) {
            System.out.println(i + " Hello");
            i++;

            // Optional: slow down output
            // try {
            //     Thread.sleep(500);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }

    // MAIN METHOD (placed last as per your pattern)
    public static void main(String[] args) {

        // Create object of Runnable class
        RunnableDemo obj = new RunnableDemo();

        // Pass Runnable object to Thread
        Thread t = new Thread(obj);

        // Start thread (calls run())
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
