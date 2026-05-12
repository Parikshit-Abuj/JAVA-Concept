// Full HashMap Program in Java
// Implementing all important methods and logic

// Importing packages
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING HASHMAP
        // =========================================

        HashMap<Integer, String> map = new HashMap<>();


        // =========================================
        // ADDING KEY-VALUE PAIRS
        // =========================================

        // put() -> Insert data
        map.put(101, "Rahul");
        map.put(102, "Amit");
        map.put(103, "Sneha");
        map.put(104, "Priya");

        // Duplicate key
        map.put(102, "Updated_Amit");

        // Null key
        map.put(null, "NullKey");

        // Null value
        map.put(105, null);

        System.out.println("Original HashMap:");
        System.out.println(map);


        // =========================================
        // ACCESSING VALUES
        // =========================================

        // get()
        System.out.println("\nValue of key 103: " +
                map.get(103));

        // getOrDefault()
        System.out.println("Value of key 200: " +
                map.getOrDefault(200, "Not Found"));


        // =========================================
        // SEARCH OPERATIONS
        // =========================================

        // containsKey()
        System.out.println("\nContains key 101? " +
                map.containsKey(101));

        // containsValue()
        System.out.println("Contains value Sneha? " +
                map.containsValue("Sneha"));


        // =========================================
        // SIZE OF HASHMAP
        // =========================================

        // size()
        System.out.println("\nSize of HashMap: " +
                map.size());


        // =========================================
        // TRAVERSING USING ENTRYSET
        // =========================================

        System.out.println("\nTraversing using entrySet():");

        for(Map.Entry<Integer, String> entry :
                map.entrySet()) {

            // getKey() -> Returns key
            // getValue() -> Returns value

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
        // TRAVERSING VALUES ONLY
        // =========================================

        System.out.println("\nTraversing Values Only:");

        for(String value : map.values()) {

            System.out.println(value);
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove(key)
        map.remove(104);

        System.out.println("\nAfter Removing Key 104:");
        System.out.println(map);


        // =========================================
        // REPLACE VALUE
        // =========================================

        // replace()
        map.replace(103, "Updated_Sneha");

        System.out.println("\nAfter Replacing Value:");
        System.out.println(map);


        // =========================================
        // PUT IF ABSENT
        // =========================================

        // putIfAbsent()
        map.putIfAbsent(106, "Rohan");

        // This will NOT replace existing key
        map.putIfAbsent(101, "New_Value");

        System.out.println("\nAfter putIfAbsent():");
        System.out.println(map);


        // =========================================
        // CHECK EMPTY
        // =========================================

        // isEmpty()
        System.out.println("\nIs HashMap Empty? " +
                map.isEmpty());


        // =========================================
        // CLEARING HASHMAP
        // =========================================

        map.clear();

        System.out.println("\nAfter clear():");
        System.out.println(map);

        System.out.println("Size After Clear: " +
                map.size());
    }
}
