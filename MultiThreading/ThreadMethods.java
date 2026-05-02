package threadtest;

// Thread class example
public class ThreadMethodsDemo extends Thread {

    // run() method → thread task
    @Override
    public void run() {

        // currentThread() → returns current running thread
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        for (int i = 1; i <= 5; i++) {

            System.out.println(i + " Child Thread");

            try {
                // sleep() → pauses thread for 1 second
                Thread.sleep(1000);

            } catch (InterruptedException e) {

                // interrupt() exception handling
                System.out.println("Thread interrupted");
            }
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Create thread object
        ThreadMethodsDemo t = new ThreadMethodsDemo();

        // setName() → changes thread name
        t.setName("MyThread");

        // getName() → gets thread name
        System.out.println("Thread Name: " + t.getName());

        // getPriority() → gets thread priority
        System.out.println("Default Priority: " + t.getPriority());

        // setPriority() → changes priority
        t.setPriority(MAX_PRIORITY);

        System.out.println("New Priority: " + t.getPriority());

        // isAlive() → checks thread is running or not
        System.out.println("Before start(): " + t.isAlive());

        // start() → starts thread
        t.start();

        System.out.println("After start(): " + t.isAlive());

        try {
            // join() → main waits until child thread finishes
            t.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finished");
    }
}

SAMPLE OUTPUT
Thread Name: MyThread
Default Priority: 5
New Priority: 10
Before start(): false
After start(): true
Current Thread: MyThread
1 Child Thread
2 Child Thread
3 Child Thread
4 Child Thread
5 Child Thread
Main thread finished
