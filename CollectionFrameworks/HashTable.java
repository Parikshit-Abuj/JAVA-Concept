import java.util.Hashtable;
import java.util.Map;
import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {

        // =========================================
        // CREATING HASHTABLE
        // =========================================

        Hashtable<Integer, String> table =
                new Hashtable<>();


        // =========================================
        // ADDING KEY-VALUE PAIRS
        // =========================================

        // put() -> Insert data
        table.put(101, "Rahul");
        table.put(102, "Amit");
        table.put(103, "Sneha");
        table.put(104, "Priya");

        // Duplicate key
        table.put(102, "Updated_Amit");

        System.out.println("Original Hashtable:");
        System.out.println(table);


        // =========================================
        // ACCESSING VALUES
        // =========================================

        // get()
        System.out.println("\nValue of key 103: " +
                table.get(103));

        // getOrDefault()
        System.out.println("Value of key 200: " +
                table.getOrDefault(200, "Not Found"));


        // =========================================
        // SEARCH OPERATIONS
        // =========================================

        // containsKey()
        System.out.println("\nContains key 101? " +
                table.containsKey(101));

        // containsValue()
        System.out.println("Contains value Sneha? " +
                table.containsValue("Sneha"));


        // =========================================
        // SIZE OF HASHTABLE
        // =========================================

        // size()
        System.out.println("\nSize of Hashtable: " +
                table.size());


        // =========================================
        // TRAVERSING USING ENTRYSET
        // =========================================

        System.out.println("\nTraversing using entrySet():");

        for(Map.Entry<Integer, String> entry :
                table.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " +
                    entry.getValue()
            );
        }


        // =========================================
        // TRAVERSING USING KEYSET
        // =========================================

        System.out.println("\nTraversing using keySet():");

        for(Integer key : table.keySet()) {

            System.out.println(
                    key + " -> " + table.get(key)
            );
        }


        // =========================================
        // TRAVERSING VALUES ONLY
        // =========================================

        System.out.println("\nTraversing Values Only:");

        for(String value : table.values()) {

            System.out.println(value);
        }


        // =========================================
        // USING ENUMERATION
        // OLD STYLE TRAVERSAL
        // =========================================

        System.out.println("\nTraversing using Enumeration:");

        Enumeration<Integer> e = table.keys();

        while(e.hasMoreElements()) {

            Integer key = e.nextElement();

            System.out.println(
                    key + " -> " + table.get(key)
            );
        }


        // =========================================
        // REMOVING ELEMENTS
        // =========================================

        // remove()
        table.remove(104);

        System.out.println("\nAfter Removing Key 104:");
        System.out.println(table);


        // =========================================
        // REPLACING VALUE
        // =========================================

        // replace()
        table.replace(103, "Updated_Sneha");

        System.out.println("\nAfter Replacing Value:");
        System.out.println(table);


        // =========================================
        // PUT IF ABSENT
        // =========================================

        // putIfAbsent()
        table.putIfAbsent(105, "Rohan");

        // Existing key will NOT update
        table.putIfAbsent(101, "NewValue");

        System.out.println("\nAfter putIfAbsent():");
        System.out.println(table);


        // =========================================
        // CHECK EMPTY
        // =========================================

        // isEmpty()
        System.out.println("\nIs Hashtable Empty? " +
                table.isEmpty());


        // =========================================
        // CLEARING HASHTABLE
        // =========================================

        table.clear();

        System.out.println("\nAfter clear():");
        System.out.println(table);

        System.out.println("Size After Clear: " +
                table.size());
    }
}

OUTPUT
Original Hashtable:
{104=Priya, 103=Sneha,
102=Updated_Amit, 101=Rahul}
