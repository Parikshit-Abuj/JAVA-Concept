package threadtest;

// Shared resource class
class Counter {

    int count = 0;

    // ----------------------------------------
    // synchronized method
    // Only one thread can access at a time
    // ----------------------------------------
    public synchronized void increment() {

        count++;

        System.out.println(Thread.currentThread().getName()
                + " -> Count: " + count);
    }
}

// Thread class
class MyThread extends Thread {

    Counter c;

    // Constructor
    MyThread(Counter c) {
        this.c = c;
    }

    @Override
    public void run() {

        // Increment count 5 times
        for (int i = 1; i <= 5; i++) {
            c.increment();
        }
    }
}

// MAIN CLASS
public class SynchronizedDemo {

    public static void main(String[] args) {

        // Shared object
        Counter c = new Counter();

        // Two threads using same object
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);

        // Set thread names
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Start threads
        t1.start();
        t2.start();
    }
}
