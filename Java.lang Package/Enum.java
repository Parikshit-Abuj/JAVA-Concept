package enumdemo;

// ----------------------------------------
// Enum declaration
// Fixed set of constants
// ----------------------------------------
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

public class EnumDemo {

    // ----------------------------------------
    // Method to demonstrate enum
    // ----------------------------------------
    public static void enumMethods() {

        // Creating enum variable
        Day today = Day.FRIDAY;

        // ----------------------------------------
        // Print enum value
        // ----------------------------------------
        System.out.println("Today: " + today);

        // ----------------------------------------
        // ordinal()
        // Returns index position
        // ----------------------------------------
        System.out.println("Ordinal value: "
                + today.ordinal());

        // ----------------------------------------
        // values()
        // Returns all enum constants
        // ----------------------------------------
        System.out.println("\nAll Days:");

        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // ----------------------------------------
        // valueOf()
        // Converts string → enum constant
        // ----------------------------------------
        Day d1 = Day.valueOf("MONDAY");

        System.out.println("\nvalueOf(): " + d1);

        // ----------------------------------------
        // Comparing enums
        // ----------------------------------------
        if (today == Day.FRIDAY) {
            System.out.println("\nWeekend is near!");
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        enumMethods();
    }
}
