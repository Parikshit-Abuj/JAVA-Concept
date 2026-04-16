package interfacepractice;

interface Test
{
    int X = 10; // public static final

    void meth1(); // public abstract
    void meth2();

    private void meth3() // private method (only inside interface)
    {
        System.out.println("Meth3 of Test");
    }

    default void meth5() // default method (can be used by class)
    {
        meth3(); // calling private method
        System.out.println("Meth5 of Test");
    }

    static void meth6() // static method (called using interface name)
    {
        System.out.println("Static meth6 of Test");
    }
}

interface Test2 extends Test // interface inheritance
{
    void meth4();
}

class My implements Test2 // implementing class
{
    public void meth1() { System.out.println("Meth1"); }

    public void meth2() { System.out.println("Meth2"); }

    public void meth4() { System.out.println("Meth4"); }
}

public class InterfacePractice 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X); // constant access

        Test.meth6(); // static method call

        Test2 t = new My(); // interface reference

        t.meth1(); // overridden methods
        t.meth2();
        t.meth4();

        t.meth5(); // default method call
    }
}

OUTPUT

10
Static meth6 of Test
Meth1
Meth2
Meth4
Meth3 of Test
Meth5 of Test
