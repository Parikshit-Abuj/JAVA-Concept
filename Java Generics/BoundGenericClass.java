// Bounded Generic Class in Java
// Implementing all important logic and methods

// =========================================
// GENERIC CLASS WITH BOUND
// =========================================

// Only Number class and subclasses allowed

class Calculator<T extends Number> {

    // Generic variables
    T num1;
    T num2;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    Calculator(T num1, T num2) {

        this.num1 = num1;
        this.num2 = num2;
    }


    // =========================================
    // ADDITION METHOD
    // =========================================

    public double add() {

        // doubleValue() converts any Number
        return num1.doubleValue() +
                num2.doubleValue();
    }


    // =========================================
    // SUBTRACTION METHOD
    // =========================================

    public double subtract() {

        return num1.doubleValue() -
                num2.doubleValue();
    }


    // =========================================
    // MULTIPLICATION METHOD
    // =========================================

    public double multiply() {

        return num1.doubleValue() *
                num2.doubleValue();
    }


    // =========================================
    // DIVISION METHOD
    // =========================================

    public double divide() {

        return num1.doubleValue() /
                num2.doubleValue();
    }


    // =========================================
    // DISPLAY METHOD
    // =========================================

    public void display() {

        System.out.println(
                "Num1: " + num1
        );

        System.out.println(
                "Num2: " + num2
        );

        System.out.println(
                "Datatype: " +
                num1.getClass().getName()
        );
    }
}


// =========================================
// MAIN CLASS
// =========================================

public class Main {

    public static void main(String[] args) {

        // =========================================
        // INTEGER TYPE
        // =========================================

        Calculator<Integer> intObj =
                new Calculator<>(10, 5);

        System.out.println(
                "Integer Type:"
        );

        intObj.display();

        System.out.println(
                "Addition: " +
                        intObj.add()
        );

        System.out.println(
                "Subtraction: " +
                        intObj.subtract()
        );

        System.out.println(
                "Multiplication: " +
                        intObj.multiply()
        );

        System.out.println(
                "Division: " +
                        intObj.divide()
        );


        // =========================================
        // DOUBLE TYPE
        // =========================================

        Calculator<Double> doubleObj =
                new Calculator<>(10.5, 2.5);

        System.out.println(
                "\nDouble Type:"
        );

        doubleObj.display();

        System.out.println(
                "Addition: " +
                        doubleObj.add()
        );


        // =========================================
        // FLOAT TYPE
        // =========================================

        Calculator<Float> floatObj =
                new Calculator<>(5.5f, 2.0f);

        System.out.println(
                "\nFloat Type:"
        );

        floatObj.display();

        System.out.println(
                "Addition: " +
                        floatObj.add()
        );


        // =========================================
        // INVALID TYPE
        // =========================================

        // ❌ ERROR
        // String is not subclass of Number

        /*
        Calculator<String> strObj =
                new Calculator<>("A", "B");
        */


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll Bounded Generic Operations Completed."
        );
    }
}

OUTPUT

Integer Type:
Num1: 10
Num2: 5
Datatype: java.lang.Integer
Addition: 15.0
