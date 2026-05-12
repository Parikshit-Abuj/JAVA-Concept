import java.util.ArrayList;
import java.util.Collections;

// Student class
class Student implements Comparable<Student> {

    // Instance variables
    int id;
    String name;
    int marks;

    // Constructor
    Student(int id, String name, int marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // compareTo() method
    // Sorting by marks in ascending order
    @Override
    public int compareTo(Student s) {

        // Current object compared with another object

        // Ascending order
        return this.marks - s.marks;
    }

    // toString() method
    // Used to print object properly
    @Override
    public String toString() {

        return id + " " + name + " " + marks;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING ARRAYLIST OF STUDENTS
        // =========================================

        ArrayList<Student> list = new ArrayList<>();


        // =========================================
        // ADDING STUDENT OBJECTS
        // =========================================

        list.add(new Student(101, "Rahul", 75));
        list.add(new Student(102, "Amit", 90));
        list.add(new Student(103, "Sneha", 65));
        list.add(new Student(104, "Priya", 85));


        // =========================================
        // PRINTING BEFORE SORTING
        // =========================================

        System.out.println("Before Sorting:");

        for(Student s : list) {

            System.out.println(s);
        }


        // =========================================
        // SORTING USING COLLECTIONS.SORT()
        // =========================================

        Collections.sort(list);


        // =========================================
        // PRINTING AFTER SORTING
        // =========================================

        System.out.println("\nAfter Sorting by Marks:");

        for(Student s : list) {

            System.out.println(s);
        }
    }
}

OUTPUT
Before Sorting:
101 Rahul 75
102 Amit 90
103 Sneha 65
104 Priya 85

After Sorting by Marks:
103 Sneha 65
101 Rahul 75
104 Priya 85
102 Amit 90
