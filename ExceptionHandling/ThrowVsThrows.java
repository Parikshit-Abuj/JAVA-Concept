public class ThrowVsThrowsDemo {

    public static void main(String[] args) {

        // Calling method that uses 'throws'
        try {
            checkAge(15);   
        } catch (Exception e) {
            System.out.println("Handled in main: " + e.getMessage());
        }

    }

    // ----------------------------------------
    // 'throws' → declares exception at method level
    // ----------------------------------------
    public static void checkAge(int age) throws Exception {

        // ----------------------------------------
        // 'throw' → actually creates and throws exception
        // ----------------------------------------
        if (age < 18) {
            throw new Exception("Age must be 18 or above");  
        }

        System.out.println("Valid age");
    }
}
