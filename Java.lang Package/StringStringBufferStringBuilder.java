package stringdemo;

public class StringClassesDemo {

    // ----------------------------------------
    // String Example
    // Immutable object
    // ----------------------------------------
    public static void stringDemo() {

        String str = "Hello";

        // Creates new object
        str = str.concat(" World");

        System.out.println("String: " + str);
    }

    // ----------------------------------------
    // StringBuffer Example
    // Mutable + Thread-safe
    // ----------------------------------------
    public static void stringBufferDemo() {

        StringBuffer sb = new StringBuffer("Hello");

        // Modifies same object
        sb.append(" World");

        System.out.println("StringBuffer: " + sb);
    }

    // ----------------------------------------
    // StringBuilder Example
    // Mutable + Faster (not thread-safe)
    // ----------------------------------------
    public static void stringBuilderDemo() {

        StringBuilder sb = new StringBuilder("Hello");

        // Modifies same object
        sb.append(" World");

        System.out.println("StringBuilder: " + sb);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        stringDemo();

        stringBufferDemo();

        stringBuilderDemo();
    }
}
