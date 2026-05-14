import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

        // try-with-resources
        // Automatically closes stream

        try(FileOutputStream fout =
                    new FileOutputStream("demo.txt")) {

            // =========================================
            // WRITING STRING DATA
            // =========================================

            String str1 = "Welcome To Java File Handling\n";

            // Converting string into bytes
            byte b1[] = str1.getBytes();

            // Writing complete byte array
            fout.write(b1);

            System.out.println(
                    "String Data Written Successfully."
            );


            // =========================================
            // WRITING CHARACTER BY CHARACTER
            // =========================================

            fout.write('J');
            fout.write('A');
            fout.write('V');
            fout.write('A');

            fout.write('\n');

            System.out.println(
                    "Characters Written Successfully."
            );


            // =========================================
            // WRITING PARTIAL DATA
            // =========================================

            String str2 = "ProgrammingLanguage";

            byte b2[] = str2.getBytes();

            // Writing partial data
            // Start index = 3
            // Length = 7

            fout.write(b2, 3, 7);

            fout.write('\n');

            System.out.println(
                    "Partial Data Written Successfully."
            );


            // =========================================
            // USING FLUSH METHOD
            // =========================================

            // Forcefully writes buffered data
            fout.flush();

            System.out.println(
                    "flush() Executed Successfully."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // APPEND MODE
        // =========================================

        try(FileOutputStream fout2 =
                    new FileOutputStream(
                            "demo.txt", true)) {

            // true = append mode

            String str3 =
                    "\nThis Data Is Appended.";

            byte b3[] = str3.getBytes();

            fout2.write(b3);

            System.out.println(
                    "Append Operation Successful."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll FileOutputStream Operations Completed."
        );
    }
}
