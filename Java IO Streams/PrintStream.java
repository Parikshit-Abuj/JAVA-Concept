import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING PRINTSTREAM OBJECT
        // =========================================

        try(PrintStream ps =
                    new PrintStream("demo.txt")) {

            // =========================================
            // print() METHOD
            // =========================================

            System.out.println(
                    "Using print() Method..."
            );

            ps.print("Hello ");
            ps.print("Java ");

            // No new line
            ps.print("PrintStream");

            ps.println();


            // =========================================
            // println() METHOD
            // =========================================

            System.out.println(
                    "Using println() Method..."
            );

            ps.println("Welcome To Java IO");
            ps.println("Learning PrintStream");


            // =========================================
            // PRINTING DIFFERENT DATA TYPES
            // =========================================

            ps.println(100);
            ps.println(99.5);
            ps.println(true);
            ps.println('A');


            // =========================================
            // printf() METHOD
            // =========================================

            System.out.println(
                    "Using printf() Method..."
            );

            String name = "Rahul";
            int marks = 85;

            // Formatted output
            ps.printf(
                    "Student Name: %s\n",
                    name
            );

            ps.printf(
                    "Student Marks: %d\n",
                    marks
            );


            // =========================================
            // TAB AND NEWLINE
            // =========================================

            ps.println("\nUsing Escape Sequences:");

            ps.println("Java\tPython\tC++");

            ps.println("Line1");
            ps.println("Line2");


            // =========================================
            // FLUSH METHOD
            // =========================================

            // Forcefully write data
            ps.flush();

            System.out.println(
                    "flush() Executed Successfully."
            );


            // =========================================
            // CHECK ERROR
            // =========================================

            System.out.println(
                    "Checking Error Status:"
            );

            System.out.println(ps.checkError());


        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // PRINTSTREAM WITH SYSTEM.OUT
        // =========================================

        PrintStream console = System.out;

        console.println(
                "\nPrinting Using System.out"
        );

        console.println(
                "System.out is also PrintStream."
        );


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll PrintStream Operations Completed."
        );
    }
}
