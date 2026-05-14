import java.io.CharArrayReader;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING CHARACTER ARRAY
        // =========================================

        char data[] = {
                'J', 'A', 'V', 'A', ' ',
                'I', 'O', ' ',
                'S', 'T', 'R', 'E', 'A', 'M'
        };


        // =========================================
        // READING CHARACTER BY CHARACTER
        // =========================================

        try(CharArrayReader cr =
                    new CharArrayReader(data)) {

            System.out.println(
                    "Reading Character By Character:\n"
            );

            int i;

            // read() returns character value
            while((i = cr.read()) != -1) {

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

        try(CharArrayReader cr2 =
                    new CharArrayReader(data)) {

            System.out.println(
                    "\nReading Using Character Array:\n"
            );

            // New character array
            char ch[] = new char[20];

            // Reading characters into array
            int charsRead = cr2.read(ch);

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

        try(CharArrayReader cr3 =
                    new CharArrayReader(data)) {

            System.out.println(
                    "\nReading After Skipping 5 Characters:\n"
            );

            // Skip first 5 characters
            cr3.skip(5);

            int i;

            while((i = cr3.read()) != -1) {

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

        try(CharArrayReader cr4 =
                    new CharArrayReader(data)) {

            System.out.println(
                    "\nChecking ready() Method:"
            );

            // ready() checks stream ready or not
            System.out.println(cr4.ready());

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // MARK AND RESET METHODS
        // =========================================

        try(CharArrayReader cr5 =
                    new CharArrayReader(data)) {

            System.out.println(
                    "\nMark and Reset Example:\n"
            );

            // Reading first character
            System.out.println(
                    "First Character: " +
                            (char)cr5.read()
            );

            // Mark current position
            cr5.mark(5);

            // Reading next characters
            System.out.println(
                    "Next Character: " +
                            (char)cr5.read()
            );

            System.out.println(
                    "Next Character: " +
                            (char)cr5.read()
            );

            // Reset to marked position
            cr5.reset();

            System.out.println(
                    "\nAfter reset():"
            );

            // Reading again from marked position
            System.out.println(
                    "Character: " +
                            (char)cr5.read()
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING FIRST 6 CHARACTERS ONLY
        // =========================================

        try(CharArrayReader cr6 =
                    new CharArrayReader(data)) {

            System.out.println(
                    "\nReading First 6 Characters:\n"
            );

            char ch[] = new char[6];

            cr6.read(ch);

            System.out.println(ch);

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll CharArrayReader Operations Completed."
        );
    }
}
