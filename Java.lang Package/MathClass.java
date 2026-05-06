package mathdemo;

public class MathClassDemo {

    // ----------------------------------------
    // Method to demonstrate Math class methods
    // ----------------------------------------
    public static void mathMethods() {

        int a = 10;
        int b = 20;

        System.out.println("----- Math Class Methods -----");

        // ----------------------------------------
        // max() → returns maximum value
        // ----------------------------------------
        System.out.println("Max value: "
                + Math.max(a, b));

        // ----------------------------------------
        // min() → returns minimum value
        // ----------------------------------------
        System.out.println("Min value: "
                + Math.min(a, b));

        // ----------------------------------------
        // sqrt() → square root
        // ----------------------------------------
        System.out.println("Square root of 25: "
                + Math.sqrt(25));

        // ----------------------------------------
        // pow() → power
        // ----------------------------------------
        System.out.println("2 power 3: "
                + Math.pow(2, 3));

        // ----------------------------------------
        // abs() → absolute value
        // ----------------------------------------
        System.out.println("Absolute value: "
                + Math.abs(-50));

        // ----------------------------------------
        // ceil() → rounds up
        // ----------------------------------------
        System.out.println("Ceil value: "
                + Math.ceil(4.2));

        // ----------------------------------------
        // floor() → rounds down
        // ----------------------------------------
        System.out.println("Floor value: "
                + Math.floor(4.9));

        // ----------------------------------------
        // round() → nearest integer
        // ----------------------------------------
        System.out.println("Rounded value: "
                + Math.round(4.6));

        // ----------------------------------------
        // random() → random number between 0 and 1
        // ----------------------------------------
        System.out.println("Random value: "
                + Math.random());

        // ----------------------------------------
        // PI constant
        // ----------------------------------------
        System.out.println("PI value: "
                + Math.PI);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        mathMethods();
    }
}
