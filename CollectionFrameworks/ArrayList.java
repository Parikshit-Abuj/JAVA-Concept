// Importing required package
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Creating ArrayList of String type
        ArrayList<String> students = new ArrayList<>();

        // Adding elements into ArrayList
        students.add("Rahul");
        students.add("Amit");
        students.add("Sneha");
        students.add("Rahul"); // Duplicate allowed

        // Printing full ArrayList
        System.out.println("Student List: " + students);

        // Accessing element using index
        System.out.println("First Student: " + students.get(0));

        // Changing element
        students.set(1, "Priya");

        // Printing updated list
        System.out.println("After Update: " + students);

        // Removing element
        students.remove(2);

        // Printing after removal
        System.out.println("After Remove: " + students);

        // Checking size
        System.out.println("Size of ArrayList: " + students.size());

        // Checking element exists or not
        System.out.println("Contains Rahul? " + students.contains("Rahul"));

        // Clearing all elements
        // students.clear();

        // Printing final list
        System.out.println("Final List: " + students);
    }
}

Output

Student List: [Rahul, Amit, Sneha, Rahul]
First Student: Rahul
After Update: [Rahul, Priya, Sneha, Rahul]
After Remove: [Rahul, Priya, Rahul]
Size of ArrayList: 3
Contains Rahul? true
Final List: [Rahul, Priya, Rahul]
