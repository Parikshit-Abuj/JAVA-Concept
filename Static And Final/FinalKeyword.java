package finalpractice;

//  final class → cannot be inherited
final class FinalClass
{
    void show()
    {
        System.out.println("Inside Final Class");
    }
}

//  parent class
class Parent
{
    // final method → cannot be overridden
    final void display()
    {
        System.out.println("Final method in Parent");
    }
}

//  child class
class Child extends Parent
{
    //  Not allowed:
    // void display() { }  // cannot override final method

    void show()
    {
        System.out.println("Child class method");
    }
}

public class FinalKeywordDemo
{
    public static void main(String[] args)
    {
        //  final variable → constant
        final int x = 10;
        // x = 20;  not allowed

        System.out.println("Final variable x = " + x);

        //  final reference
        final int[] arr = {1, 2, 3};

        arr[0] = 100; //  allowed (data can change)
        // arr = new int[5];  not allowed (reference cannot change)

        System.out.print("Array: ");
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //  using final method
        Child c = new Child();
        c.display(); // inherited final method
        c.show();

        //  final class usage
        FinalClass fc = new FinalClass();
        fc.show();

        //  final parameter
        printValue(50);
    }

    //  final parameter → cannot modify inside method
    static void printValue(final int val)
    {
        // val = 100;  not allowed
        System.out.println("Final parameter value = " + val);
    }
}

OUTPUT

Final variable x = 10
Array: 100 2 3 
Final method in Parent
Child class method
Inside Final Class
Final parameter value = 50
