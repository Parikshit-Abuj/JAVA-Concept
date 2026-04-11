class Parent
{
    int x;

    Parent()
    {
        System.out.println("Parent Default Constructor");
    }

    Parent(int x)
    {
        this.x = x;
        System.out.println("Parent Parameter Constructor: " + x);
    }
}

class Child extends Parent
{
    int y;

    Child()
    {
        super();
        System.out.println("Child Default Constructor");
    }

    Child(int x, int y)
    {
        super(x);
        this.y = y;
        System.out.println("Child Parameter Constructor: " + y);
    }
}

public class InheritanceConstructorDemo
{
    public static void main(String[] args)
    {
        Child c1 = new Child();
        System.out.println();

        Child c2 = new Child(10, 20);
    }
}

OUTPUT
Parent Default Constructor
Child Default Constructor

Parent Parameter Constructor: 10
Child Parameter Constructor: 20
