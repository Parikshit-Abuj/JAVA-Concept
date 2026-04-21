public class FinallyDemo {

    // ----------------------------------------
    // Method 1: TRY-CATCH-FINALLY (exception occurs)
    // ----------------------------------------
    public static void case1() {
        try {
            int a = 10, b = 0;
            int result = a / b;   // ❌ Exception
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally block executed (case 1)");
        }
    }

    // ----------------------------------------
    // Method 2: TRY-FINALLY (no catch)
    // ----------------------------------------
    public static void case2() {
        try {
            System.out.println("\nOnly try block running");
        } finally {
            System.out.println("Finally block executed (case 2)");
        }
    }

    // ----------------------------------------
    // Method 3: NO EXCEPTION (still finally runs)
    // ----------------------------------------
    public static void case3() {
        try {
            int x = 10 / 2;   // ✅ No exception
            System.out.println("\nDivision successful");
        } catch (Exception e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally block executed (case 3)");
        }
    }

    // ----------------------------------------
    // Method 4: RETURN + FINALLY
    // ----------------------------------------
    public static int case4() {
        try {
            System.out.println("\nInside try (returning 10)");
            return 10;
        } finally {
            System.out.println("Finally block executed (case 4)");
        }
    }

    // ----------------------------------------
    // MAIN METHOD (placed last as per your pattern)
    // ----------------------------------------
    public static void main(String[] args) {

        System.out.println("Program Started\n");

        case1();
        case2();
        case3();

        System.out.println("\nReturn value: " + case4());

        System.out.println("\nProgram Ended");
    }
}
