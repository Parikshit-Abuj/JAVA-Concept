class Demo {

    // =========================================
    // GENERIC METHOD
    // =========================================

    public <T> void display(T data) {

        System.out.println(
                "Value: " + data
        );

        System.out.println(
                "Datatype: " +
                data.getClass().getName()
        );
    }


    // =========================================
    // GENERIC RETURN METHOD
    // =========================================

    public <T> T returnData(T data) {

        return data;
    }


    // =========================================
    // GENERIC ARRAY METHOD
    // =========================================

    public <T> void displayArray(T arr[]) {

        System.out.println(
                "\nArray Elements:"
        );

        for(T value : arr) {

            System.out.println(value);
        }
    }


    // =========================================
    // MULTIPLE TYPE PARAMETERS
    // =========================================

    public <T, U> void show(T a, U b) {

        System.out.println(
                "\nFirst Value: " + a
        );

        System.out.println(
                "Second Value: " + b
        );

        System.out.println(
                "First Datatype: " +
                        a.getClass().getName()
        );

        System.out.println(
                "Second Datatype: " +
                        b.getClass().getName()
        );
    }


    // =========================================
    // BOUNDED GENERIC METHOD
    // =========================================

    public <T extends Number> double square(T num) {

        return num.doubleValue() *
                num.doubleValue();
    }
}


// =========================================
// MAIN CLASS
// =========================================

public class Main {

    public static void main(String[] args) {

        Demo d = new Demo();


        // =========================================
        // USING GENERIC METHOD
        // =========================================

        System.out.println(
                "Generic Method Examples:\n"
        );

        d.display(100);

        d.display("Java");

        d.display(99.5);

        d.display('A');

        d.display(true);


        // =========================================
        // GENERIC RETURN METHOD
        // =========================================

        System.out.println(
                "\nGeneric Return Method:"
        );

        Integer num =
                d.returnData(500);

        String str =
                d.returnData("Hello");

        System.out.println(
                "Returned Integer: " + num
        );

        System.out.println(
                "Returned String: " + str
        );


        // =========================================
        // GENERIC ARRAY METHOD
        // =========================================

        Integer arr1[] =
                {10, 20, 30, 40};

        String arr2[] =
                {"Java", "Python", "C++"};

        d.displayArray(arr1);

        d.displayArray(arr2);


        // =========================================
        // MULTIPLE TYPE PARAMETERS
        // =========================================

        d.show(101, "Rahul");

        d.show("Java", 99.5);


        // =========================================
        // BOUNDED GENERIC METHOD
        // =========================================

        System.out.println(
                "\nBounded Generic Method:"
        );

        System.out.println(
                "Square: " +
                        d.square(5)
        );

        System.out.println(
                "Square: " +
                        d.square(5.5)
        );


        // =========================================
        // INVALID EXAMPLE
        // =========================================

        // ❌ ERROR
        // String is not Number

        /*
        d.square("Java");
        */


        // =========================================
        // FINAL MESSAGE
        // =========================================

        System.out.println(
                "\nAll Generic Method Operations Completed."
        );
    }
}
