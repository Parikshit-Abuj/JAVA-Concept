import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // WRITING USING FILEOUTPUTSTREAM
        // =========================================

        try(FileOutputStream fout =
                    new FileOutputStream("demo.txt")) {

            System.out.println(
                    "Writing Data Into File...\n"
            );

            // String data
            String str =
                    "Welcome To Java Byte Streams";

            // Convert string to bytes
            byte b[] = str.getBytes();

            // Writing bytes into file
            fout.write(b);

            // flush() forces write
            fout.flush();

            System.out.println(
                    "Data Written Successfully."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING USING FILEINPUTSTREAM
        // =========================================

        try(FileInputStream fin =
                    new FileInputStream("demo.txt")) {

            System.out.println(
                    "\nReading Data From File...\n"
            );

            int i;

            // read() returns byte value
            while((i = fin.read()) != -1) {

                // Convert byte to character
                System.out.print((char)i);
            }

            System.out.println(
                    "\n\nData Read Successfully."
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
                    "\nReading Using Byte Array...\n"
            );

            // available() gives remaining bytes
            int size = fin2.available();

            // Creating byte array
            byte b[] = new byte[size];

            // Reading all bytes
            fin2.read(b);

            // Convert bytes into string
            String data = new String(b);

            System.out.println(data);

            System.out.println(
                    "\nByte Array Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll Byte Stream Operations Completed."
        );
    }
}
