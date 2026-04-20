public class MultipleCatch {

    public static void main(String[] args) {

        try {
            // Change values to test different exceptions

            int a = 10, b = 0;
            int result = a / b;   // ArithmeticException

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);   // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            // Handles divide by zero error
            System.out.println("Arithmetic Exception handled");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid array index
            System.out.println("Array Index Exception handled");

        } catch (Exception e) {
            // Fallback (must be last)
            System.out.println("Generic Exception handled");
        }
    }
}
