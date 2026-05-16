// Full DataInputStream and DataOutputStream Program
// Implementing all important methods and logic

// Importing packages
import java.io.*;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // WRITING DATA USING DATAOUTPUTSTREAM
        // =========================================

        try(FileOutputStream fout =
                    new FileOutputStream("student.dat");

            DataOutputStream dout =
                    new DataOutputStream(fout)) {

            System.out.println(
                    "Writing Data Into File...\n"
            );

            // =========================================
            // WRITING DIFFERENT DATA TYPES
            // =========================================

            // writeInt()
            dout.writeInt(101);

            // writeUTF()
            dout.writeUTF("Rahul");

            // writeDouble()
            dout.writeDouble(89.5);

            // writeBoolean()
            dout.writeBoolean(true);

            // writeChar()
            dout.writeChar('A');

            // writeFloat()
            dout.writeFloat(95.6f);

            // writeLong()
            dout.writeLong(9876543210L);

            // writeShort()
            dout.writeShort(500);

            // writeByte()
            dout.writeByte(100);

            // Forcefully write data
            dout.flush();

            System.out.println(
                    "Data Written Successfully."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // READING DATA USING DATAINPUTSTREAM
        // =========================================

        try(FileInputStream fin =
                    new FileInputStream("student.dat");

            DataInputStream din =
                    new DataInputStream(fin)) {

            System.out.println(
                    "\nReading Data From File...\n"
            );

            // =========================================
            // READING DATA IN SAME ORDER
            // =========================================

            int id = din.readInt();

            String name = din.readUTF();

            double marks = din.readDouble();

            boolean result = din.readBoolean();

            char grade = din.readChar();

            float percentage = din.readFloat();

            long mobile = din.readLong();

            short value = din.readShort();

            byte number = din.readByte();


            // =========================================
            // PRINTING DATA
            // =========================================

            System.out.println(
                    "ID: " + id
            );

            System.out.println(
                    "Name: " + name
            );

            System.out.println(
                    "Marks: " + marks
            );

            System.out.println(
                    "Result: " + result
            );

            System.out.println(
                    "Grade: " + grade
            );

            System.out.println(
                    "Percentage: " + percentage
            );

            System.out.println(
                    "Mobile: " + mobile
            );

            System.out.println(
                    "Short Value: " + value
            );

            System.out.println(
                    "Byte Value: " + number
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll Data Stream Operations Completed."
        );
    }
}
