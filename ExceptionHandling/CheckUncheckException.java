import java.io.FileReader;
import java.io.IOException;

public class CheckedUncheckedDemo {

    public static void main(String[] args) {

        // ----------------------------------------
        // 1. CHECKED EXCEPTION (Compile-time)
        // Must handle using try-catch or throws
        // ----------------------------------------
        try {
            FileReader file = new FileReader("abc.txt"); //  File may not exist
            System.out.println("File opened successfully");
        } catch (IOException e) {
            // Mandatory handling
            System.out.println("Checked Exception handled: File not found");
        }


        // ----------------------------------------
        // 2. UNCHECKED EXCEPTION (Runtime)
        // Handling is optional
        // ----------------------------------------
        try {
            int a = 10, b = 0;
            int result = a / b;   //  ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception handled: Divide by zero");
        }

    }
}
