import java.io.FileInputStream;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // READING SINGLE BYTE
        // =========================================

        try(FileInputStream fin =
                    new FileInputStream("demo.txt")) {

            System.out.println(
                    "Reading Character By Character:\n"
            );

            int i;

            // read() returns ASCII value
            // returns -1 at end of file

            while((i = fin.read()) != -1) {

                // Convert ASCII to character
                System.out.print((char)i);
            }

            System.out.println(
                    "\n\nSingle Byte Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING USING BYTE ARRAY
        // =========================================

        try(FileInputStream fin2 =
                    new FileInputStream("demo.txt")) {

            System.out.println(
                    "\nReading Using Byte Array:\n"
            );

            // available() gives remaining bytes
            int size = fin2.available();

            // Creating byte array
            byte b[] = new byte[size];

            // Reading all bytes
            fin2.read(b);

            // Convert byte array to string
            String data = new String(b);

            System.out.println(data);

            System.out.println(
                    "Byte Array Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING PARTIAL DATA
        // =========================================

        try(FileInputStream fin3 =
                    new FileInputStream("demo.txt")) {

            System.out.println(
                    "\nReading Partial Data:\n"
            );

            // Skipping first 10 bytes
            fin3.skip(10);

            int i;

            while((i = fin3.read()) != -1) {

                System.out.print((char)i);
            }

            System.out.println(
                    "\n\nPartial Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // AVAILABLE METHOD
        // =========================================

        try(FileInputStream fin4 =
                    new FileInputStream("demo.txt")) {

            System.out.println(
                    "\nAvailable Bytes:"
            );

            System.out.println(fin4.available());

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING FIRST 15 BYTES ONLY
        // =========================================

        try(FileInputStream fin5 =
                    new FileInputStream("demo.txt")) {

            System.out.println(
                    "\nReading First 15 Bytes:\n"
            );

            byte b[] = new byte[15];

            // Reading limited bytes
            fin5.read(b);

            System.out.println(new String(b));

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll FileInputStream Operations Completed."
        );
    }
}
