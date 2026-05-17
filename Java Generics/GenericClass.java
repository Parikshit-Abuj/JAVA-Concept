// Full Generic Class Program in Java
// Implementing all important methods and logic

// =========================================
// GENERIC CLASS
// =========================================

class Box<T> {

    // Generic variable
    T data;

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
        // INTEGER TYPE GENERIC OBJECT
        // =========================================

        Box<Integer> intBox =
                new Box<>();

        intBox.setData(100);

        System.out.println(
                "Integer Generic Class:"
        );

        intBox.display();

        System.out.println(
                "Returned Value: " +
                        intBox.getData()
        );


        // =========================================
        // STRING TYPE GENERIC OBJECT
        // =========================================

        Box<String> strBox =
                new Box<>();

        strBox.setData("Java Generics");

        System.out.println(
                "\nString Generic Class:"
        );

        strBox.display();

        System.out.println(
                "Returned Value: " +
                        strBox.getData()
        );


        // =========================================
        // DOUBLE TYPE GENERIC OBJECT
        // =========================================

        Box<Double> doubleBox =
                new Box<>();

        doubleBox.setData(99.5);

        System.out.println(
                "\nDouble Generic Class:"
        );

        doubleBox.display();

        System.out.println(
                "Returned Value: " +
                        doubleBox.getData()
        );


        // =========================================
        // CHARACTER TYPE GENERIC OBJECT
        // =========================================

        Box<Character> charBox =
                new Box<>();

        charBox.setData('A');

        System.out.println(
                "\nCharacter Generic Class:"
        );

        charBox.display();


        // =========================================
        // BOOLEAN TYPE GENERIC OBJECT
        // =========================================

        Box<Boolean> boolBox =
                new Box<>();

        boolBox.setData(true);

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

OUTPUT

Integer Generic Class:
Stored Data: 100
Datatype: java.lang.Integer
