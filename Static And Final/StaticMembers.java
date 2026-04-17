package staticpractice;

class Test
{
    static int x = 10;   // static variable → shared by all objects
    int y = 20;          // instance variable → separate for each object

    void show()
    {
        System.out.println("x = " + x + ", y = " + y); // prints current values
    }

    static void display()
    {
        System.out.println("Static x = " + x); // static method → can access only static
    }
}

public class StaticPractice
{
    public static void main(String[] args)
    {
        Test t1 = new Test();   // object 1
        t1.show();              // initial values

        Test.x = 30;            // modify static (shared)
        t1.y = 50;              // modify instance (only for t1)

        Test t2 = new Test();   // object 2 (new instance variable)

        t2.show();              // shows updated static, fresh instance

        Test.display();         // calling static method
    }
}

OUTPUT

x = 10, y = 20
x = 30, y = 20
Static x = 30
