// Using LinkedHashMap as LRU Cache

// Importing package
import java.util.LinkedHashMap;
import java.util.Map;

// Creating custom cache class
class LRUCache<K, V> extends LinkedHashMap<K, V> {

    // Maximum cache size
    private final int capacity;

    // Constructor
    public LRUCache(int capacity) {

        // accessOrder = true
        // Maintains access order
        super(capacity, 0.75f, true);

        this.capacity = capacity;
    }

    // removeEldestEntry()
    // Automatically removes oldest entry
    @Override
    protected boolean removeEldestEntry(
            Map.Entry<K, V> eldest) {

        // Remove eldest if size exceeds capacity
        return size() > capacity;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING CACHE
        // =========================================

        LRUCache<Integer, String> cache =
                new LRUCache<>(3);

        // Cache size = 3


        // =========================================
        // ADDING DATA
        // =========================================

        cache.put(1, "Java");
        cache.put(2, "Python");
        cache.put(3, "C++");

        System.out.println("Initial Cache:");
        System.out.println(cache);


        // =========================================
        // ACCESSING ELEMENT
        // =========================================

        // Accessing key 1
        // It becomes recently used
        cache.get(1);

        System.out.println("\nAfter Accessing Key 1:");
        System.out.println(cache);


        // =========================================
        // ADDING NEW ELEMENT
        // =========================================

        // Cache is full now
        // Least recently used item removed automatically

        cache.put(4, "JavaScript");

        System.out.println("\nAfter Adding Key 4:");
        System.out.println(cache);


        // =========================================
        // ACCESSING MORE ELEMENTS
        // =========================================

        cache.get(3);

        System.out.println("\nAfter Accessing Key 3:");
        System.out.println(cache);


        // =========================================
        // ADDING ANOTHER ELEMENT
        // =========================================

        cache.put(5, "Go");

        System.out.println("\nAfter Adding Key 5:");
        System.out.println(cache);


        // =========================================
        // TRAVERSING CACHE
        // =========================================

        System.out.println("\nTraversing Cache:");

        for(Map.Entry<Integer, String> entry :
                cache.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue()
            );
        }


        // =========================================
        // SEARCHING
        // =========================================

        System.out.println("\nContains Key 1? " +
                cache.containsKey(1));

        System.out.println("Contains Value Go? " +
                cache.containsValue("Go"));


        // =========================================
        // REMOVING DATA
        // =========================================

        cache.remove(3);

        System.out.println("\nAfter Removing Key 3:");
        System.out.println(cache);


        // =========================================
        // SIZE OF CACHE
        // =========================================

        System.out.println("\nCache Size: " +
                cache.size());


        // =========================================
        // CLEAR CACHE
        // =========================================

        cache.clear();

        System.out.println("\nAfter clear():");
        System.out.println(cache);
    }
}
