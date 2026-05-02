package threadtest;

public class ThreadMethods2 extends Thread {

    // run() method → thread task
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            // currentThread().getName() → current thread name
            System.out.println(Thread.currentThread().getName() + " : " + i);

            // yield() → pauses current thread temporarily
            Thread.yield();
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Create first thread
        ThreadMethodsExample t1 = new ThreadMethodsExample();

        // Create second thread
        ThreadMethodsExample t2 = new ThreadMethodsExample();

        // setName() → set custom thread names
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // ----------------------------------------
        // DAEMON THREAD
        // Background thread
        // Must set before start()
        // ----------------------------------------
        t1.setDaemon(true);

        // Check daemon status
        System.out.println("Is t1 daemon? " + t1.isDaemon());

        // Start threads
        t1.start();
        t2.start();

        try {

            // ----------------------------------------
            // JOIN()
            // Main thread waits for t2 to finish
            // ----------------------------------------
            t2.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finished");
    }
}

SAMPLE OUTPUT
Is t1 daemon? true
Thread-1 : 1
Thread-2 : 1
Thread-1 : 2
Thread-2 : 2
Thread-1 : 3
Thread-2 : 3
Thread-1 : 4
Thread-2 : 4
Thread-1 : 5
Thread-2 : 5
Main thread finished

SAMPLE OUTPUT

Is t1 daemon? true
Thread-1 : 1
Thread-2 : 1
Thread-1 : 2
Thread-2 : 2
Thread-1 : 3
Thread-2 : 3
Thread-1 : 4
Thread-2 : 4
Thread-1 : 5
Thread-2 : 5
Main thread finished
