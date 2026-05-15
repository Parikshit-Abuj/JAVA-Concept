import java.io.*;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // BUFFEREDOUTPUTSTREAM
        // WRITING BYTE DATA
        // =========================================

        try(FileOutputStream fout =
                    new FileOutputStream("demo.txt");

            BufferedOutputStream bout =
                    new BufferedOutputStream(fout)) {

            System.out.println(
                    "Writing Using BufferedOutputStream...\n"
            );

            String str =
                    "Welcome To Java Buffered Streams";

            // Convert string to bytes
            byte b[] = str.getBytes();

            // Writing bytes
            bout.write(b);

            // Force write from buffer to file
            bout.flush();

            System.out.println(
                    "Data Written Successfully."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // BUFFEREDINPUTSTREAM
        // READING BYTE DATA
        // =========================================

        try(FileInputStream fin =
                    new FileInputStream("demo.txt");

            BufferedInputStream bin =
                    new BufferedInputStream(fin)) {

            System.out.println(
                    "\nReading Using BufferedInputStream:\n"
            );

            int i;

            while((i = bin.read()) != -1) {

                System.out.print((char)i);
            }

            System.out.println(
                    "\n\nByte Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // BUFFEREDWRITER
        // WRITING CHARACTER DATA
        // =========================================

        try(FileWriter fw =
                    new FileWriter("text.txt");

            BufferedWriter bw =
                    new BufferedWriter(fw)) {

            System.out.println(
                    "\nWriting Using BufferedWriter...\n"
            );

            // Writing text
            bw.write("BufferedWriter Example");

            // New line
            bw.newLine();

            bw.write("Java IO Streams");

            // Force write
            bw.flush();

            System.out.println(
                    "Character Data Written Successfully."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // BUFFEREDREADER
        // READING CHARACTER DATA
        // =========================================

        try(FileReader fr =
                    new FileReader("text.txt");

            BufferedReader br =
                    new BufferedReader(fr)) {

            System.out.println(
                    "\nReading Using BufferedReader:\n"
            );

            String line;

            // readLine() reads complete line
            while((line = br.readLine()) != null) {

                System.out.println(line);
            }

            System.out.println(
                    "\nCharacter Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // MARK AND RESET
        // BUFFEREDINPUTSTREAM
        // =========================================

        try(FileInputStream fin2 =
                    new FileInputStream("demo.txt");

            BufferedInputStream bin2 =
                    new BufferedInputStream(fin2)) {

            System.out.println(
                    "\nMark and Reset Example:\n"
            );

            // Reading first character
            System.out.println(
                    (char)bin2.read()
            );

            // Mark position
            bin2.mark(10);

            // Reading more characters
            System.out.println(
                    (char)bin2.read()
            );

            System.out.println(
                    (char)bin2.read()
            );

            // Reset back
            bin2.reset();

            System.out.println(
                    "\nAfter reset():"
            );

            // Reading again
            System.out.println(
                    (char)bin2.read()
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // SKIP METHOD
        // =========================================

        try(FileInputStream fin3 =
                    new FileInputStream("demo.txt");

            BufferedInputStream bin3 =
                    new BufferedInputStream(fin3)) {

            System.out.println(
                    "\nReading After Skipping 10 Bytes:\n"
            );

            // Skip bytes
            bin3.skip(10);

            int i;

            while((i = bin3.read()) != -1) {

                System.out.print((char)i);
            }

            System.out.println(
                    "\n\nSkip Operation Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll Buffered Stream Operations Completed."
        );
    }
}
