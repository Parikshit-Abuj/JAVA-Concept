import java.util.TreeMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING TREEMAP
        // =========================================

        TreeMap<Integer, String> map = new TreeMap<>();


        // =========================================
        // ADDING KEY-VALUE PAIRS
        // =========================================

        // put() -> Insert data
        map.put(103, "Rahul");
        map.put(101, "Amit");
        map.put(104, "Sneha");
        map.put(102, "Priya");

        // Duplicate key
        map.put(101, "Updated_Amit");

        System.out.println("Original TreeMap:");
        System.out.println(map);


        // =========================================
        // AUTOMATIC SORTING OF KEYS
        // =========================================

        System.out.println("\nKeys are automatically sorted.");


        // =========================================
        // ACCESSING VALUES
        // =========================================

        // get()
        System.out.println("\nValue of key 102: " +
                map.get(102));

        // getOrDefault()
        System.out.println("Value of key 200: " +
                map.getOrDefault(200, "Not Found"));


        // =========================================
        // SEARCHING OPERATIONS
        // =========================================

        // containsKey()
        System.out.println("\nContains key 103? " +
                map.containsKey(103));

        // containsValue()
        System.out.println("Contains value Sneha? " +
                map.containsValue("Sneha"));


        // =========================================
        // FIRST AND LAST KEY
        // =========================================

        // firstKey()
        System.out.println("\nFirst Key: " +
                map.firstKey());

        // lastKey()
        System.out.println("Last Key: " +
                map.lastKey());


        // =========================================
        // FIRST AND LAST ENTRY
        // =========================================

        // firstEntry()
        System.out.println("\nFirst Entry: " +
                map.firstEntry());

        // lastEntry()
        System.out.println("Last Entry: " +
                map.lastEntry());


        // =========================================
        // SIZE OF TREEMAP
        // =========================================

        // size()
        System.out.println("\nSize of TreeMap: " +
                map.size());


        // =========================================
        // TRAVERSING USING ENTRYSET
        // =========================================

        System.out.println("\nTraversing using entrySet():");

        for(Map.Entry<Integer, String> entry :
                map.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue()
            );
        }


        // =========================================
        // TRAVERSING USING KEYSET
        // =========================================

        System.out.println("\nTraversing using keySet():");

        for(Integer key : map.keySet()) {

            System.out.println(
                    key + " -> " + map.get(key)
            );
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove()
        map.remove(102);

        System.out.println("\nAfter Removing Key 102:");
        System.out.println(map);


        // =========================================
        // POLL METHODS
        // =========================================

        // pollFirstEntry()
        System.out.println("\nRemoved First Entry: " +
                map.pollFirstEntry());

        // pollLastEntry()
        System.out.println("Removed Last Entry: " +
                map.pollLastEntry());

        System.out.println("After Poll Operations:");
        System.out.println(map);


        // =========================================
        // ADDING MORE VALUES
        // =========================================

        map.put(105, "Rohan");
        map.put(106, "Karan");
        map.put(107, "Neha");

        System.out.println("\nAfter Adding More Entries:");
        System.out.println(map);


        // =========================================
        // SUBMAP OPERATIONS
        // =========================================

        // headMap()
        System.out.println("\nHeadMap (<106):");
        System.out.println(map.headMap(106));

        // tailMap()
        System.out.println("\nTailMap (>=106):");
        System.out.println(map.tailMap(106));

        // subMap()
        System.out.println("\nSubMap (105 to 107):");
        System.out.println(map.subMap(105, 107));


        // =========================================
        // CHECK EMPTY
        // =========================================

        // isEmpty()
        System.out.println("\nIs TreeMap Empty? " +
                map.isEmpty());


        // =========================================
        // CLEARING TREEMAP
        // =========================================

        map.clear();

        System.out.println("\nAfter clear():");
        System.out.println(map);

        System.out.println("Size After Clear: " +
                map.size());
    }
}
