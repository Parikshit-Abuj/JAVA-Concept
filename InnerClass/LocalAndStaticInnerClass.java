package nestedinner;

// OUTER CLASS
class Outer
{
    int x = 10;              // instance variable
    static int y = 20;       // static variable

    //  LOCAL INNER CLASS (inside method)
    public void displayLocal()
    {
        int z = 30; // local variable (must be effectively final)

        class LocalInner
        {
            public void show()
            {
                System.out.println("Local Inner: " + x + " " + y + " " + z);
            }
        }

        LocalInner li = new LocalInner(); // object of local inner
        li.show();
    }

    //  STATIC INNER CLASS
    static class StaticInner
    {
        public void show()
        {
            // can access only static members of outer directly
            System.out.println("Static Inner: " + y);
        }
    }
}

// MAIN CLASS
public class InnerClassDemo
{
    public static void main(String[] args)
    {
        Outer o = new Outer();

        // LOCAL INNER CLASS execution
        o.displayLocal();

        // STATIC INNER CLASS object creation
        Outer.StaticInner si = new Outer.StaticInner();
        si.show();
    }
}

OUTPUT

Local Inner: 10 20 30
Static Inner: 20
