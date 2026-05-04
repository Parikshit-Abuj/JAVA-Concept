package objectclassdemo;

// Every class in Java automatically extends Object class
class Student {

    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // ----------------------------------------
    // toString()
    // Converts object into readable string
    // ----------------------------------------
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }

    // ----------------------------------------
    // equals()
    // Compares object data
    // ----------------------------------------
    @Override
    public boolean equals(Object obj) {

        Student s = (Student) obj;

        return this.id == s.id &&
               this.name.equals(s.name);
    }

    // ----------------------------------------
    // hashCode()
    // Generates unique hash value
    // ----------------------------------------
    @Override
    public int hashCode() {
        return id;
    }

    // ----------------------------------------
    // clone()
    // Creates duplicate object
    // ----------------------------------------
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// MAIN CLASS
public class ObjectClassDemo {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(101, "Rahul");

        // ----------------------------------------
        // getClass()
        // ----------------------------------------
        System.out.println("Class Name: " + s1.getClass());

        // ----------------------------------------
        // toString()
        // ----------------------------------------
        System.out.println("\ntoString():");
        System.out.println(s1);

        // ----------------------------------------
        // equals()
        // ----------------------------------------
        System.out.println("\nequals():");
        System.out.println(s1.equals(s2));

        // ----------------------------------------
        // hashCode()
        // ----------------------------------------
        System.out.println("\nhashCode():");
        System.out.println(s1.hashCode());

        // ----------------------------------------
        // clone()
        // ----------------------------------------
        System.out.println("\nclone():");

        Student s3 = (Student) s1.clone();

        System.out.println(s3);

    }
}
