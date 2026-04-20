public class NestedTryCatchDemo {

    public static void main(String[] args) {

        try {
            // Outer try block

            int arr[] = {10, 20, 30};

            try {
                // Inner try block
                System.out.println(arr[5]);   //  ArrayIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e) {
                // Inner catch handles array error
                System.out.println("Inner catch: Array index error handled");
            }

            int a = 10, b = 0;
            int result = a / b;   //  ArithmeticException (handled by outer catch)

        } catch (ArithmeticException e) {
            // Outer catch handles arithmetic error
            System.out.println("Outer catch: Arithmetic error handled");
        }

    }
}
