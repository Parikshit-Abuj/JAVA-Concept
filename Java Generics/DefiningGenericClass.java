// Defining Generic Class in Java
// Implementing all important logic and methods

// =========================================
// GENERIC CLASS
// =========================================

class Box<T> {

    // Generic variable
    T data;

    // =========================================
    // CONSTRUCTOR
    // =========================================

    Box(T data) {

        this.data = data;
    }


    // =========================================
    // SETTER METHOD
    // =========================================

    public void setData(T data) {

        this.data = data;
    }


    // =========================================
    // GETTER METHOD
    // =========================================

    public T getData() {

        return data;
    }


    // =========================================
    // DISPLAY METHOD
    // =========================================

    public void display() {

        System.out.println(
                "Stored Data: " + data
        );

        System.out.println(
                "Datatype: " +
                data.getClass().getName()
        );
    }
}


// =========================================
// MAIN CLASS
// =========================================

public class Main {

    public static void main(String[] args) {

        // =========================================
        // INTEGER GENERIC OBJECT
        // =========================================

        Box<Integer> intBox =
                new Box<>(100);

        System.out.println(
                "Integer Generic Class:"
        );

        intBox.display();

        System.out.println(
                "Getter Value: " +
                        intBox.getData()
        );


        // Updating value
        intBox.setData(500);

        System.out.println(
                "Updated Integer Value: " +
                        intBox.getData()
        );


        // =========================================
        // STRING GENERIC OBJECT
        // =========================================

        Box<String> strBox =
                new Box<>("Java Generics");

        System.out.println(
                "\nString Generic Class:"
        );

        strBox.display();


        // =========================================
        // DOUBLE GENERIC OBJECT
        // =========================================

        Box<Double> doubleBox =
                new Box<>(99.5);

        System.out.println(
                "\nDouble Generic Class:"
        );

        doubleBox.display();


        // =========================================
        // CHARACTER GENERIC OBJECT
        // =========================================

        Box<Character> charBox =
                new Box<>('A');

        System.out.println(
                "\nCharacter Generic Class:"
        );

        charBox.display();


        // =========================================
        // BOOLEAN GENERIC OBJECT
        // =========================================

        Box<Boolean> boolBox =
                new Box<>(true);

        System.out.println(
                "\nBoolean Generic Class:"
        );

        boolBox.display();


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll Generic Class Operations Completed."
        );
    }
}
