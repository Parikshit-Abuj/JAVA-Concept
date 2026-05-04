package wrapperdemo;

public class WrapperClassDemo {

    // ----------------------------------------
    // Method to demonstrate wrapper classes
    // ----------------------------------------
    public static void wrapperMethods() {

        // Primitive data types
        int num = 10;
        double price = 99.99;
        char ch = 'A';

        // ----------------------------------------
        // AUTOBOXING
        // Primitive → Wrapper Object
        // ----------------------------------------
        Integer obj1 = num;
        Double obj2 = price;
        Character obj3 = ch;

        System.out.println("Autoboxing:");
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        // ----------------------------------------
        // UNBOXING
        // Wrapper Object → Primitive
        // ----------------------------------------
        int n = obj1;
        double p = obj2;
        char c = obj3;

        System.out.println("\nUnboxing:");
        System.out.println(n);
        System.out.println(p);
        System.out.println(c);

        // ----------------------------------------
        // valueOf()
        // Converts primitive/string → Wrapper object
        // ----------------------------------------
        Integer x = Integer.valueOf(100);
        Double y = Double.valueOf("45.67");

        System.out.println("\nvalueOf():");
        System.out.println(x);
        System.out.println(y);

        // ----------------------------------------
        // parseInt()
        // String → Primitive int
        // ----------------------------------------
        int number = Integer.parseInt("500");

        System.out.println("\nparseInt():");
        System.out.println(number);

        // ----------------------------------------
        // toString()
        // Primitive → String
        // ----------------------------------------
        String str = Integer.toString(200);

        System.out.println("\ntoString():");
        System.out.println(str);

        // ----------------------------------------
        // compareTo()
        // Compares two wrapper objects
        // ----------------------------------------
        Integer a = 50;
        Integer b = 100;

        System.out.println("\ncompareTo():");
        System.out.println(a.compareTo(b));

        // ----------------------------------------
        // MAX_VALUE and MIN_VALUE
        // ----------------------------------------
        System.out.println("\nInteger MAX: " + Integer.MAX_VALUE);
        System.out.println("Integer MIN: " + Integer.MIN_VALUE);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        wrapperMethods();
    }
}
