import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // READING CHARACTER BY CHARACTER
        // =========================================

        try(FileReader fr =
                    new FileReader("demo.txt")) {

            System.out.println(
                    "Reading Character By Character:\n"
            );

            int i;

            // read() returns ASCII/Unicode value
            // returns -1 at end of file

            while((i = fr.read()) != -1) {

                // Convert integer into character
                System.out.print((char)i);
            }

            System.out.println(
                    "\n\nCharacter Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING USING CHARACTER ARRAY
        // =========================================

        try(FileReader fr2 =
                    new FileReader("demo.txt")) {

            System.out.println(
                    "\nReading Using Character Array:\n"
            );

            // Character array
            char ch[] = new char[100];

            // read() fills array
            int charsRead = fr2.read(ch);

            // Printing only read characters
            for(int i = 0; i < charsRead; i++) {

                System.out.print(ch[i]);
            }

            System.out.println(
                    "\n\nCharacter Array Reading Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // SKIP METHOD
        // =========================================

        try(FileReader fr3 =
                    new FileReader("demo.txt")) {

            System.out.println(
                    "\nReading After Skipping 10 Characters:\n"
            );

            // Skip first 10 characters
            fr3.skip(10);

            int i;

            while((i = fr3.read()) != -1) {

                System.out.print((char)i);
            }

            System.out.println(
                    "\n\nSkip Operation Completed."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READY METHOD
        // =========================================

        try(FileReader fr4 =
                    new FileReader("demo.txt")) {

            System.out.println(
                    "\nChecking ready() Method:"
            );

            // ready() checks stream ready or not
            System.out.println(fr4.ready());

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING FIRST 20 CHARACTERS ONLY
        // =========================================

        try(FileReader fr5 =
                    new FileReader("demo.txt")) {

            System.out.println(
                    "\nReading First 20 Characters:\n"
            );

            char ch[] = new char[20];

            // Reading limited characters
            fr5.read(ch);

            System.out.println(ch);

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll FileReader Operations Completed."
        );
    }
}
