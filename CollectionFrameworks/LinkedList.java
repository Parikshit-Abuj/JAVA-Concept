// Full LinkedList Program in Java
// Implementing almost all important methods and logic

// Importing required packages
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Creating LinkedList
        // =========================================
        LinkedList<String> list = new LinkedList<>();


        // =========================================
        // ADDING ELEMENTS
        // =========================================

        // add() -> Adds element at end
        list.add("Rahul");
        list.add("Amit");
        list.add("Sneha");

        // addFirst() -> Adds at beginning
        list.addFirst("Start");

        // addLast() -> Adds at end
        list.addLast("End");

        // add(index, element) -> Add at specific position
        list.add(2, "Priya");

        System.out.println("Original LinkedList:");
        System.out.println(list);


        // =========================================
        // ACCESSING ELEMENTS
        // =========================================

        // get() -> Access by index
        System.out.println("\nElement at index 2: " + list.get(2));

        // getFirst()
        System.out.println("First Element: " + list.getFirst());

        // getLast()
        System.out.println("Last Element: " + list.getLast());


        // =========================================
        // UPDATING ELEMENTS
        // =========================================

        // set(index, value)
        list.set(1, "Updated_Name");

        System.out.println("\nAfter Updating Element:");
        System.out.println(list);


        // =========================================
        // SEARCHING ELEMENTS
        // =========================================

        // contains()
        System.out.println("\nContains Rahul? " + list.contains("Rahul"));

        // indexOf()
        System.out.println("Index of Priya: " + list.indexOf("Priya"));

        // lastIndexOf()
        System.out.println("Last Index of End: " + list.lastIndexOf("End"));


        // =========================================
        // SIZE OF LINKEDLIST
        // =========================================

        System.out.println("\nSize of LinkedList: " + list.size());


        // =========================================
        // TRAVERSING USING FOR LOOP
        // =========================================

        System.out.println("\nTraversing using FOR LOOP:");

        for(int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }


        // =========================================
        // TRAVERSING USING FOR-EACH LOOP
        // =========================================

        System.out.println("\nTraversing using FOR-EACH LOOP:");

        for(String name : list) {

            System.out.println(name);
        }


        // =========================================
        // TRAVERSING USING ITERATOR
        // =========================================

        System.out.println("\nTraversing using ITERATOR:");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()) {

            String value = itr.next();

            System.out.println(value);
        }


        // =========================================
        // TRAVERSING USING LISTITERATOR
        // Forward + Backward Traversal
        // =========================================

        System.out.println("\nTraversing using LISTITERATOR (Forward):");

        ListIterator<String> listItr = list.listIterator();

        while(listItr.hasNext()) {

            System.out.println(listItr.next());
        }

        System.out.println("\nTraversing using LISTITERATOR (Backward):");

        while(listItr.hasPrevious()) {

            System.out.println(listItr.previous());
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove() by index
        list.remove(2);

        // remove(Object)
        list.remove("End");

        // removeFirst()
        list.removeFirst();

        // removeLast()
        list.removeLast();

        System.out.println("\nAfter Removing Elements:");
        System.out.println(list);


        // =========================================
        // ADDING DUPLICATE ELEMENTS
        // =========================================

        list.add("Rahul");
        list.add("Rahul");

        System.out.println("\nAfter Adding Duplicates:");
        System.out.println(list);


        // =========================================
        // REMOVE DUPLICATE USING ITERATOR LOGIC
        // =========================================

        System.out.println("\nRemoving Rahul using Iterator:");

        Iterator<String> itr2 = list.iterator();

        while(itr2.hasNext()) {

            String name = itr2.next();

            // Remove Rahul safely
            if(name.equals("Rahul")) {

                itr2.remove();
            }
        }

        System.out.println(list);


        // =========================================
        // QUEUE OPERATIONS
        // =========================================

        System.out.println("\nQUEUE OPERATIONS:");

        // offer() -> Add element
        list.offer("Queue1");
        list.offer("Queue2");

        System.out.println("Queue Elements: " + list);

        // peek() -> View front element
        System.out.println("Front Element: " + list.peek());

        // poll() -> Remove front element
        System.out.println("Removed Element: " + list.poll());

        System.out.println("After poll(): " + list);


        // =========================================
        // STACK OPERATIONS
        // =========================================

        System.out.println("\nSTACK OPERATIONS:");

        // push() -> Add at top
        list.push("StackTop");

        System.out.println("After push(): " + list);

        // pop() -> Remove top element
        System.out.println("Popped Element: " + list.pop());

        System.out.println("After pop(): " + list);


        // =========================================
        // CHECK EMPTY
        // =========================================

        System.out.println("\nIs LinkedList Empty? " + list.isEmpty());


        // =========================================
        // CLEARING LINKEDLIST
        // =========================================

        list.clear();

        System.out.println("\nAfter clear():");
        System.out.println(list);

        System.out.println("Size After Clear: " + list.size());
    }
}
