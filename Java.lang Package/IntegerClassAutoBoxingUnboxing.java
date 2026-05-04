package wrapperdemo;

public class IntegerClassDemo {

    // ----------------------------------------
    // Method to demonstrate Integer class
    // ----------------------------------------
    public static void integerMethods() {

        // Primitive int
        int num = 100;

        // ----------------------------------------
        // AUTOBOXING
        // Primitive int → Integer object
        // ----------------------------------------
        Integer obj = num;

        System.out.println("Autoboxing:");
        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object: " + obj);

        // ----------------------------------------
        // AUTOUNBOXING
        // Integer object → Primitive int
        // ----------------------------------------
        int value = obj;

        System.out.println("\nAutoUnboxing:");
        System.out.println("Primitive value: " + value);

        // ----------------------------------------
        // valueOf()
        // Converts primitive/string → Integer object
        // ----------------------------------------
        Integer n1 = Integer.valueOf(500);
        Integer n2 = Integer.valueOf("700");

        System.out.println("\nvalueOf():");
        System.out.println(n1);
        System.out.println(n2);

        // ----------------------------------------
        // parseInt()
        // String → Primitive int
        // ----------------------------------------
        int x = Integer.parseInt("900");

        System.out.println("\nparseInt():");
        System.out.println(x);

        // ----------------------------------------
        // toString()
        // int → String
        // ----------------------------------------
        String str = Integer.toString(300);

        System.out.println("\ntoString():");
        System.out.println(str);

        // ----------------------------------------
        // compareTo()
        // Compare two Integer objects
        // ----------------------------------------
        Integer a = 50;
        Integer b = 100;

        System.out.println("\ncompareTo():");
        System.out.println(a.compareTo(b));

        // ----------------------------------------
        // MAX_VALUE and MIN_VALUE
        // ----------------------------------------
        System.out.println("\nMAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Integer.MIN_VALUE);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        integerMethods();
    }
}
