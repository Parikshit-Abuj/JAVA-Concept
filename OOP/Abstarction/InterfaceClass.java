package interfacepractice;

interface Test
{
    int X = 10;  //public static final by default

    void meth1();  //public abstract by default
    void meth2();

    static void meth3() // static method in interface
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends Test // interface inheritance
{
    void meth4();
}

class My implements Test2 // class implementing interfaces
{
    public void meth1()
    {
        System.out.println("Meth1");
    }

    public void meth2()
    {
        System.out.println("Meth2");
    }

    public void meth4()
    {
        System.out.println("Meth4");
    }
}

public class InterfacePractice 
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X); // access constant

        Test.meth3(); // call static method

        Test2 t = new My(); // reference of interface

        t.meth1(); // overridden methods
        t.meth2();
        t.meth4();
    }
}

output
10
Meth3 of Test
Meth1
Meth2
Meth4
