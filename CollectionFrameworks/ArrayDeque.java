// Full ArrayDeque Program in Java
// Implementing all important methods and logic

// Importing package
import java.util.ArrayDeque;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // Creating ArrayDeque
        // =========================================

        ArrayDeque<String> deque = new ArrayDeque<>();


        // =========================================
        // ADDING ELEMENTS
        // =========================================

        // add() -> Adds at rear
        deque.add("A");

        // addFirst() -> Adds at front
        deque.addFirst("Start");

        // addLast() -> Adds at rear
        deque.addLast("End");

        // offer() -> Safely adds at rear
        deque.offer("B");

        // offerFirst() -> Add at front
        deque.offerFirst("Front");

        // offerLast() -> Add at rear
        deque.offerLast("Rear");

        System.out.println("Original ArrayDeque:");
        System.out.println(deque);


        // =========================================
        // ACCESSING ELEMENTS
        // =========================================

        // getFirst()
        System.out.println("\nFirst Element: " + deque.getFirst());

        // getLast()
        System.out.println("Last Element: " + deque.getLast());

        // peek()
        System.out.println("Peek First: " + deque.peek());

        // peekFirst()
        System.out.println("Peek First Again: " + deque.peekFirst());

        // peekLast()
        System.out.println("Peek Last: " + deque.peekLast());


        // =========================================
        // TRAVERSING USING FOR-EACH LOOP
        // =========================================

        System.out.println("\nTraversing using FOR-EACH LOOP:");

        for(String value : deque) {

            System.out.println(value);
        }


        // =========================================
        // TRAVERSING USING ITERATOR
        // =========================================

        System.out.println("\nTraversing using ITERATOR:");

        Iterator<String> itr = deque.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }


        // =========================================
        // REVERSE TRAVERSING
        // descendingIterator()
        // =========================================

        System.out.println("\nReverse Traversing:");

        Iterator<String> reverseItr = deque.descendingIterator();

        while(reverseItr.hasNext()) {

            System.out.println(reverseItr.next());
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove()
        deque.remove();

        // removeFirst()
        deque.removeFirst();

        // removeLast()
        deque.removeLast();

        System.out.println("\nAfter Removing Elements:");
        System.out.println(deque);


        // =========================================
        // POLL METHODS
        // =========================================

        // poll() -> Removes first element
        System.out.println("\nPoll(): " + deque.poll());

        // pollFirst()
        System.out.println("Poll First(): " + deque.pollFirst());

        // pollLast()
        System.out.println("Poll Last(): " + deque.pollLast());

        System.out.println("After Poll Operations:");
        System.out.println(deque);


        // =========================================
        // ADDING AGAIN FOR STACK OPERATIONS
        // =========================================

        deque.add("Java");
        deque.add("Python");
        deque.add("C++");

        System.out.println("\nAfter Adding Elements:");
        System.out.println(deque);


        // =========================================
        // STACK OPERATIONS
        // =========================================

        // push() -> Insert at top/front
        deque.push("TopElement");

        System.out.println("\nAfter push():");
        System.out.println(deque);

        // pop() -> Remove top/front
        System.out.println("Popped Element: " + deque.pop());

        System.out.println("After pop():");
        System.out.println(deque);


        // =========================================
        // SEARCHING ELEMENTS
        // =========================================

        // contains()
        System.out.println("\nContains Java? " + deque.contains("Java"));

        // size()
        System.out.println("Size: " + deque.size());

        // isEmpty()
        System.out.println("Is Empty? " + deque.isEmpty());


        // =========================================
        // CLEARING DEQUE
        // =========================================

        deque.clear();

        System.out.println("\nAfter clear():");
        System.out.println(deque);

        System.out.println("Size After Clear: " + deque.size());
    }
}

OUTPUT

Original ArrayDeque:
[Front, Start, A, End, B, Rear]

First Element: Front
Last Element: Rear
Peek First: Front
Peek First Again: Front
Peek Last: Rear

Traversing using FOR-EACH LOOP:
Front
Start
A
End
B
Rear

Reverse Traversing:
Rear
B
End
A
Start
Front
