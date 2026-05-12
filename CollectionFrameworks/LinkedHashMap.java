import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING LINKEDHASHMAP
        // =========================================

        LinkedHashMap<Integer, String> map =
                new LinkedHashMap<>();


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
        map.put(null, "Null_Key");

        // Null value
        map.put(105, null);

        System.out.println("Original LinkedHashMap:");
        System.out.println(map);


        // =========================================
        // INSERTION ORDER MAINTAINED
        // =========================================

        System.out.println("\nInsertion order maintained.");


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
        System.out.println("Contains value Priya? " +
                map.containsValue("Priya"));


        // =========================================
        // SIZE OF LINKEDHASHMAP
        // =========================================

        // size()
        System.out.println("\nSize of LinkedHashMap: " +
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
        // TRAVERSING VALUES ONLY
        // =========================================

        System.out.println("\nTraversing Values Only:");

        for(String value : map.values()) {

            System.out.println(value);
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove()
        map.remove(104);

        System.out.println("\nAfter Removing Key 104:");
        System.out.println(map);


        // =========================================
        // REPLACING VALUE
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

        // Existing key will NOT update
        map.putIfAbsent(101, "New_Value");

        System.out.println("\nAfter putIfAbsent():");
        System.out.println(map);


        // =========================================
        // CHECK EMPTY
        // =========================================

        // isEmpty()
        System.out.println("\nIs LinkedHashMap Empty? " +
                map.isEmpty());


        // =========================================
        // CLEARING LINKEDHASHMAP
        // =========================================

        map.clear();

        System.out.println("\nAfter clear():");
        System.out.println(map);

        System.out.println("Size After Clear: " +
                map.size());
    }
}

OUTPUT
Original LinkedHashMap:
{101=Rahul, 102=Updated_Amit,
103=Sneha, 104=Priya,
null=Null_Key, 105=null}
