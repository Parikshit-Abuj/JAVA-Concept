// Import required packages
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Creating Iterator object
        Iterator<String> itr = fruits.iterator();

        System.out.println("Fruits List:");

        // Traversing using Iterator
        while(itr.hasNext()) {

            // Getting next element
            String fruit = itr.next();

            // Printing element
            System.out.println(fruit);
        }
    }
}
