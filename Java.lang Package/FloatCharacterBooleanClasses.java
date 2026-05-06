package wrapperdemo;

public class WrapperClassesDemo {

    // ----------------------------------------
    // Float Class Methods
    // ----------------------------------------
    public static void floatClassDemo() {

        float price = 99.5f;

        // Autoboxing
        Float f1 = price;

        // Unboxing
        float value = f1;

        System.out.println("----- Float Class -----");

        System.out.println("Autoboxing: " + f1);
        System.out.println("Unboxing: " + value);

        // valueOf()
        Float f2 = Float.valueOf("45.67");

        System.out.println("valueOf(): " + f2);

        // parseFloat()
        float num = Float.parseFloat("55.5");

        System.out.println("parseFloat(): " + num);

        // MAX_VALUE and MIN_VALUE
        System.out.println("MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Float.MIN_VALUE);
    }

    // ----------------------------------------
    // Character Class Methods
    // ----------------------------------------
    public static void characterClassDemo() {

        char ch = 'A';

        // Autoboxing
        Character c1 = ch;

        // Unboxing
        char value = c1;

        System.out.println("\n----- Character Class -----");

        System.out.println("Autoboxing: " + c1);
        System.out.println("Unboxing: " + value);

        // isLetter()
        System.out.println("isLetter(): "
                + Character.isLetter(ch));

        // isDigit()
        System.out.println("isDigit(): "
                + Character.isDigit(ch));

        // toLowerCase()
        System.out.println("toLowerCase(): "
                + Character.toLowerCase(ch));

        // toUpperCase()
        System.out.println("toUpperCase(): "
                + Character.toUpperCase('b'));
    }

    // ----------------------------------------
    // Boolean Class Methods
    // ----------------------------------------
    public static void booleanClassDemo() {

        boolean flag = true;

        // Autoboxing
        Boolean b1 = flag;

        // Unboxing
        boolean value = b1;

        System.out.println("\n----- Boolean Class -----");

        System.out.println("Autoboxing: " + b1);
        System.out.println("Unboxing: " + value);

        // valueOf()
        Boolean b2 = Boolean.valueOf("true");

        System.out.println("valueOf(): " + b2);

        // parseBoolean()
        boolean result = Boolean.parseBoolean("false");

        System.out.println("parseBoolean(): " + result);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        floatClassDemo();

        characterClassDemo();

        booleanClassDemo();
    }
}
