import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING HASHSET
        // =========================================

        HashSet<String> set = new HashSet<>();


        // =========================================
        // ADDING ELEMENTS
        // =========================================

        // add() -> Adds element
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate value

        // Adding null value
        set.add(null);

        System.out.println("Original HashSet:");
        System.out.println(set);


        // =========================================
        // DUPLICATE CHECK
        // =========================================

        System.out.println("\nDuplicate 'Java' ignored automatically.");


        // =========================================
        // SEARCHING ELEMENTS
        // =========================================

        // contains()
        System.out.println("\nContains Python? " +
                set.contains("Python"));

        System.out.println("Contains PHP? " +
                set.contains("PHP"));


        // =========================================
        // SIZE OF HASHSET
        // =========================================

        // size()
        System.out.println("\nSize of HashSet: " + set.size());


        // =========================================
        // TRAVERSING USING FOR-EACH LOOP
        // =========================================

        System.out.println("\nTraversing using FOR-EACH LOOP:");

        for(String language : set) {

            System.out.println(language);
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
        // CHECKING EMPTY
        // =========================================

        // isEmpty()
        System.out.println("\nIs HashSet Empty? " +
                set.isEmpty());


        // =========================================
        // ADDING MULTIPLE VALUES
        // =========================================

        set.add("HTML");
        set.add("CSS");
        set.add("JavaScript");

        System.out.println("\nAfter Adding More Elements:");
        System.out.println(set);


        // =========================================
        // REMOVE USING ITERATOR
        // =========================================

        System.out.println("\nRemoving Elements Starting with 'J':");

        Iterator<String> itr2 = set.iterator();

        while(itr2.hasNext()) {

            String value = itr2.next();

            // Remove elements starting with J
            if(value != null && value.startsWith("J")) {

                itr2.remove();
            }
        }

        System.out.println(set);


        // =========================================
        // CONVERT HASHSET TO ARRAY
        // =========================================

        Object arr[] = set.toArray();

        System.out.println("\nHashSet Converted to Array:");

        for(Object obj : arr) {

            System.out.println(obj);
        }


        // =========================================
        // CLEARING HASHSET
        // =========================================

        set.clear();

        System.out.println("\nAfter clear():");
        System.out.println(set);


        // =========================================
        // SIZE AFTER CLEAR
        // =========================================

        System.out.println("Size After Clear: " +
                set.size());
    }
}

OUTPUT

Original HashSet:
[null, Java, C++, Python]

Contains Python? true
Contains PHP? false

Size of HashSet: 4
