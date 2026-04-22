import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    // ----------------------------------------
    // Method: Read file using try-with-resources
    // Resource will auto-close (no need for finally)
    // ----------------------------------------
    public static void readFile() {

        // Resource declared inside try ()
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handles file-related exceptions
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("Reading file using try-with-resources:\n");

        readFile();

        System.out.println("\nProgram Ended");
    }
}
