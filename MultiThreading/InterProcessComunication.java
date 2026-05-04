package threadtest;

// Shared resource class
class Customer {

    int amount = 1000;

    // ----------------------------------------
    // Withdraw method
    // ----------------------------------------
    synchronized void withdraw(int amount) {

        System.out.println("Trying to withdraw...");

        // If balance is low, thread waits
        if (this.amount < amount) {

            System.out.println("Insufficient balance, waiting for deposit...");

            try {
                // wait() → releases lock and waits
                wait();

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        // Withdraw money
        this.amount -= amount;

        System.out.println("Withdraw successful");
        System.out.println("Remaining Balance: " + this.amount);
    }

    // ----------------------------------------
    // Deposit method
    // ----------------------------------------
    synchronized void deposit(int amount) {

        System.out.println("Depositing money...");

        // Add money
        this.amount += amount;

        System.out.println("Deposit completed");
        System.out.println("Current Balance: " + this.amount);

        // notify() → wakes waiting thread
        notify();
    }
}

// MAIN CLASS
public class InterThreadCommunicationDemo {

    public static void main(String[] args) {

        // Shared object
        Customer c = new Customer();

        // Thread for withdrawal
        Thread t1 = new Thread() {

            @Override
            public void run() {
                c.withdraw(1500);
            }
        };

        // Thread for deposit
        Thread t2 = new Thread() {

            @Override
            public void run() {
                c.deposit(2000);
            }
        };

        // Start threads
        t1.start();
        t2.start();
    }
}
