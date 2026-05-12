// Full LinkedHashSet Program in Java
// Implementing all important methods and logic

// Importing packages
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING LINKEDHASHSET
        // =========================================

        LinkedHashSet<String> set =
                new LinkedHashSet<>();


        // =========================================
        // ADDING ELEMENTS
        // =========================================

        // add() -> Adds elements
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("HTML");

        // Duplicate value
        set.add("Java");

        // Null value
        set.add(null);

        System.out.println("Original LinkedHashSet:");
        System.out.println(set);


        // =========================================
        // INSERTION ORDER MAINTAINED
        // =========================================

        System.out.println("\nInsertion order maintained.");


        // =========================================
        // SEARCHING ELEMENTS
        // =========================================

        // contains()
        System.out.println("\nContains Python? " +
                set.contains("Python"));

        System.out.println("Contains PHP? " +
                set.contains("PHP"));


        // =========================================
        // SIZE OF LINKEDHASHSET
        // =========================================

        // size()
        System.out.println("\nSize of LinkedHashSet: " +
                set.size());


        // =========================================
        // TRAVERSING USING FOR-EACH LOOP
        // =========================================

        System.out.println("\nTraversing using FOR-EACH LOOP:");

        for(String value : set) {

            System.out.println(value);
        }


        // =========================================
        // TRAVERSING USING ITERATOR
        // =========================================

        System.out.println("\nTraversing using ITERATOR:");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove()
        set.remove("C++");

        System.out.println("\nAfter Removing C++:");
        System.out.println(set);


        // =========================================
        // ADDING MORE ELEMENTS
        // =========================================

        set.add("CSS");
        set.add("JavaScript");

        System.out.println("\nAfter Adding More Elements:");
        System.out.println(set);


        // =========================================
        // REMOVE USING ITERATOR
        // =========================================

        System.out.println("\nRemoving Elements Starting with J:");

        Iterator<String> itr2 = set.iterator();

        while(itr2.hasNext()) {

            String value = itr2.next();

            // Remove elements starting with J
            if(value != null &&
                    value.startsWith("J")) {

                itr2.remove();
            }
        }

        System.out.println(set);


        // =========================================
        // CONVERT LINKEDHASHSET TO ARRAY
        // =========================================

        Object arr[] = set.toArray();

        System.out.println("\nConverted to Array:");

        for(Object obj : arr) {

            System.out.println(obj);
        }


        // =========================================
        // CHECK EMPTY
        // =========================================

        // isEmpty()
        System.out.println("\nIs LinkedHashSet Empty? " +
                set.isEmpty());


        // =========================================
        // CLEARING LINKEDHASHSET
        // =========================================

        set.clear();

        System.out.println("\nAfter clear():");
        System.out.println(set);

        System.out.println("Size After Clear: " +
                set.size());
    }
}

OUTPUT
Original LinkedHashSet:
[Java, Python, C++, HTML, null]
