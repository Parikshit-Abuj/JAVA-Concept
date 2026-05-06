package reflectiondemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// ----------------------------------------
// Sample class
// ----------------------------------------
class Student {

    private int id;
    public String name;

    // Constructor
    public Student() {
        id = 101;
        name = "Rahul";
    }

    // Method
    public void display() {
        System.out.println("Display method called");
    }
}

public class ReflectionDemo {

    // ----------------------------------------
    // Method to demonstrate reflection
    // ----------------------------------------
    public static void reflectionMethods() {

        try {

            // ----------------------------------------
            // getClass()
            // Get class information
            // ----------------------------------------
            Class<?> cls = Student.class;

            System.out.println("Class Name: "
                    + cls.getName());

            // ----------------------------------------
            // getDeclaredFields()
            // Get all variables
            // ----------------------------------------
            System.out.println("\nFields:");

            Field fields[] = cls.getDeclaredFields();

            for (Field f : fields) {
                System.out.println(f.getName());
            }

            // ----------------------------------------
            // getDeclaredMethods()
            // Get all methods
            // ----------------------------------------
            System.out.println("\nMethods:");

            Method methods[] = cls.getDeclaredMethods();

            for (Method m : methods) {
                System.out.println(m.getName());
            }

            // ----------------------------------------
            // getDeclaredConstructors()
            // Get constructors
            // ----------------------------------------
            System.out.println("\nConstructors:");

            Constructor constructors[] =
                    cls.getDeclaredConstructors();

            for (Constructor c : constructors) {
                System.out.println(c.getName());
            }

            // ----------------------------------------
            // Create object dynamically
            // ----------------------------------------
            Object obj = cls.newInstance();

            // ----------------------------------------
            // Invoke method dynamically
            // ----------------------------------------
            Method method = cls.getMethod("display");

            System.out.println("\nInvoking method:");

            method.invoke(obj);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        reflectionMethods();
    }
}
