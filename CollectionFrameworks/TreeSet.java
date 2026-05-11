import java.util.TreeSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING TREESET
        // =========================================

        TreeSet<Integer> set = new TreeSet<>();


        // =========================================
        // ADDING ELEMENTS
        // =========================================

        // add() -> Inserts elements in sorted order
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        // Duplicate value
        set.add(20);

        System.out.println("Original TreeSet:");
        System.out.println(set);


        // =========================================
        // AUTOMATIC SORTING
        // =========================================

        System.out.println("\nElements are automatically sorted.");


        // =========================================
        // SEARCHING ELEMENTS
        // =========================================

        // contains()
        System.out.println("\nContains 30? " +
                set.contains(30));

        System.out.println("Contains 100? " +
                set.contains(100));


        // =========================================
        // ACCESSING FIRST AND LAST
        // =========================================

        // first()
        System.out.println("\nSmallest Element: " +
                set.first());

        // last()
        System.out.println("Largest Element: " +
                set.last());


        // =========================================
        // SIZE OF TREESET
        // =========================================

        // size()
        System.out.println("\nSize of TreeSet: " +
                set.size());


        // =========================================
        // TRAVERSING USING FOR-EACH LOOP
        // =========================================

        System.out.println("\nTraversing using FOR-EACH LOOP:");

        for(Integer num : set) {

            System.out.println(num);
        }


        // =========================================
        // TRAVERSING USING ITERATOR
        // =========================================

        System.out.println("\nTraversing using ITERATOR:");

        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }


        // =========================================
        // REVERSE TRAVERSING
        // descendingIterator()
        // =========================================

        System.out.println("\nReverse Traversing:");

        Iterator<Integer> reverseItr =
                set.descendingIterator();

        while(reverseItr.hasNext()) {

            System.out.println(reverseItr.next());
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove()
        set.remove(30);

        System.out.println("\nAfter Removing 30:");
        System.out.println(set);


        // =========================================
        // POLL METHODS
        // =========================================

        // pollFirst() -> Removes smallest element
        System.out.println("\nRemoved First: " +
                set.pollFirst());

        // pollLast() -> Removes largest element
        System.out.println("Removed Last: " +
                set.pollLast());

        System.out.println("After Poll Operations:");
        System.out.println(set);


        // =========================================
        // ADDING MORE VALUES
        // =========================================

        set.add(60);
        set.add(70);
        set.add(80);

        System.out.println("\nAfter Adding More Elements:");
        System.out.println(set);


        // =========================================
        // SUBSET OPERATIONS
        // =========================================

        // headSet() -> Elements smaller than given value
        System.out.println("\nHeadSet (<70):");
        System.out.println(set.headSet(70));

        // tailSet() -> Elements greater/equal to value
        System.out.println("\nTailSet (>=60):");
        System.out.println(set.tailSet(60));

        // subSet() -> Range values
        System.out.println("\nSubSet (40 to 80):");
        System.out.println(set.subSet(40, 80));


        // =========================================
        // CHECK EMPTY
        // =========================================

        // isEmpty()
        System.out.println("\nIs TreeSet Empty? " +
                set.isEmpty());


        // =========================================
        // CLEARING TREESET
        // =========================================

        set.clear();

        System.out.println("\nAfter clear():");
        System.out.println(set);

        System.out.println("Size After Clear: " +
                set.size());
    }
}

OUTPUT

Original TreeSet:
[10, 20, 30, 40, 50]

Smallest Element: 10
Largest Element: 50
