public class ConditionalStatements {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;
        int day = 3;

        // if statement
        if (a < b) {
            System.out.println("a is less than b");
        }

        // if-else statement
        if (b < a) {
            System.out.println("b is less than a");
        } else {
            System.out.println("b is not less than a");
        }

        // if-else if-else statement
        if (c > b) {
            System.out.println("c is greater than b");
        } else if (c == b) {
            System.out.println("c is equal to b");
        } else {
            System.out.println("c is less than b");
        }

        // switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
