import java.io.*;

// =========================================
// STUDENT CLASS
// =========================================

// Serializable interface
class Student implements Serializable {

    // serialVersionUID
    // Recommended for serialization
    private static final long serialVersionUID = 1L;

    // Instance variables
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // toString() method
    @Override
    public String toString() {

        return "ID: " + id +
                ", Name: " + name +
                ", Marks: " + marks;
    }
}


// =========================================
// MAIN CLASS
// =========================================

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING OBJECT
        // =========================================

        Student s1 =
                new Student(101,
                        "Rahul",
                        89.5);


        // =========================================
        // SERIALIZATION
        // WRITING OBJECT INTO FILE
        // =========================================

        try(FileOutputStream fout =
                    new FileOutputStream("student.ser");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fout)) {

            System.out.println(
                    "Serializing Object...\n"
            );

            // Writing object into file
            oos.writeObject(s1);

            System.out.println(
                    "Object Stored Successfully."
            );

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // DESERIALIZATION
        // READING OBJECT FROM FILE
        // =========================================

        try(FileInputStream fin =
                    new FileInputStream("student.ser");

            ObjectInputStream ois =
                    new ObjectInputStream(fin)) {

            System.out.println(
                    "\nDeserializing Object...\n"
            );

            // Reading object from file
            Student student =
                    (Student) ois.readObject();

            // Printing object data
            System.out.println(
                    "Object Data:"
            );

            System.out.println(student);

        } catch(Exception e) {

            System.out.println(e);
        }


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nSerialization Operations Completed."
        );
    }
}
