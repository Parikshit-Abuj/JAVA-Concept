package staticpractice;

class Test
{
    static int x;

    //  static block → runs when class is loaded (only once)
    static
    {
        System.out.println("Static Block 1 executed");
        x = 10;
    }

    static
    {
        System.out.println("Static Block 2 executed");
        x = x + 5;
    }

    //  constructor → runs when object is created
    Test()
    {
        System.out.println("Constructor executed");
    }

    void show()
    {
        System.out.println("Value of x = " + x);
    }
}

public class StaticBlockDemo
{
    public static void main(String[] args)
    {
        System.out.println("Main starts");

        Test t1 = new Test(); // first object
        t1.show();

        Test t2 = new Test(); // second object
        t2.show();

        System.out.println("Main ends");
    }
}

OUTPUT

Main starts
Static Block 1 executed
Static Block 2 executed
Constructor executed
Value of x = 15
Constructor executed
Value of x = 15
Main ends
