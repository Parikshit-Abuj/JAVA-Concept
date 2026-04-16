package nestedinner;

class Outer
{
    static int x = 10;          // static member of outer
    int z = 30;                 // instance member of outer

    Inner i = new Inner();      // inner object inside outer

    class Inner
    {
        int y = 20;             // inner class variable

        public void innerDisplay()
        {
            System.out.println(x + " " + y + " " + z); // access outer + inner members
        }
    }

    public void outerDisplay()
    {
        i.innerDisplay();       // calling inner method
        System.out.println(i.y); // accessing inner variable
    }
}

public class NestedInner
{
    public static void main(String[] args)
    {
        Outer o = new Outer();

        o.outerDisplay();   // calling through outer

        Outer.Inner oi = o.new Inner(); // creating inner object separately
        oi.innerDisplay();
    }
}

OUTPUT

10 20 30
20
10 20 30  
