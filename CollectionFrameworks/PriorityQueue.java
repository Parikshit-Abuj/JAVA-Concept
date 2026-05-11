import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING PRIORITYQUEUE
        // =========================================

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        // =========================================
        // ADDING ELEMENTS
        // =========================================

        // add() -> Insert element
        pq.add(50);
        pq.add(10);
        pq.add(30);

        // offer() -> Safe insertion
        pq.offer(20);
        pq.offer(40);

        System.out.println("Original PriorityQueue:");
        System.out.println(pq);


        // =========================================
        // ACCESSING ELEMENTS
        // =========================================

        // peek() -> View highest priority element
        System.out.println("\nPeek Element: " + pq.peek());

        // element() -> Similar to peek()
        System.out.println("Element(): " + pq.element());


        // =========================================
        // SIZE AND SEARCH
        // =========================================

        // size()
        System.out.println("\nSize: " + pq.size());

        // contains()
        System.out.println("Contains 30? " + pq.contains(30));


        // =========================================
        // TRAVERSING USING FOR-EACH LOOP
        // =========================================

        System.out.println("\nTraversing using FOR-EACH LOOP:");

        for(Integer num : pq) {

            System.out.println(num);
        }


        // =========================================
        // TRAVERSING USING ITERATOR
        // =========================================

        System.out.println("\nTraversing using ITERATOR:");

        Iterator<Integer> itr = pq.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // poll() -> Removes highest priority element
        System.out.println("\nRemoved using poll(): " + pq.poll());

        // remove() -> Removes highest priority
        System.out.println("Removed using remove(): " + pq.remove());

        System.out.println("\nAfter Removing Elements:");
        System.out.println(pq);


        // =========================================
        // INSERTING DUPLICATES
        // =========================================

        pq.add(20);
        pq.add(20);

        System.out.println("\nAfter Adding Duplicates:");
        System.out.println(pq);


        // =========================================
        // PROCESSING ELEMENTS IN SORTED ORDER
        // =========================================

        System.out.println("\nProcessing Elements in Priority Order:");

        while(!pq.isEmpty()) {

            // poll() always removes smallest element
            System.out.println(pq.poll());
        }


        // =========================================
        // MAX HEAP (DESCENDING ORDER)
        // =========================================

        System.out.println("\nMAX HEAP PRIORITYQUEUE:");

        // Creating Max Heap
        PriorityQueue<Integer> maxPQ =
                new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(10);
        maxPQ.add(50);
        maxPQ.add(30);
        maxPQ.add(20);

        System.out.println("Max Heap Queue:");
        System.out.println(maxPQ);

        System.out.println("\nProcessing Max Heap:");

        while(!maxPQ.isEmpty()) {

            // Largest element removed first
            System.out.println(maxPQ.poll());
        }


        // =========================================
        // CHECK EMPTY
        // =========================================

        System.out.println("\nIs Empty? " + maxPQ.isEmpty());


        // =========================================
        // CLEARING PRIORITYQUEUE
        // =========================================

        maxPQ.clear();

        System.out.println("After clear():");
        System.out.println(maxPQ);
    }
}

OUTPUT

Original PriorityQueue:
[10, 20, 30, 50, 40]

Peek Element: 10

Processing Elements in Priority Order:
10
20
20
20
30
40
