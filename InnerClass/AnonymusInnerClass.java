package nestedinner;

// interface
interface My
{
    void display(); // abstract method
}

// outer class
class Outer
{
    public void meth()
    {
        // anonymous inner class implementing interface
        My m = new My()
        {
            public void display()
            {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };

        m.display(); // calling method
    }
}

// main class
public class AnonymousInnerDemo
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        o.meth();
    }
}

OUTPUT

Hello from Anonymous Inner Class
