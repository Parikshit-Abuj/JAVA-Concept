class Parent
{
    int x;

    Parent(int x)
    {
        this.x = x;
        System.out.println("Parent x = " + x);
    }
}

class Child extends Parent
{
    int x;

    Child(int a, int b)
    {
        super(a);
        this.x = b;

        System.out.println("Parent x using super = " + super.x);
        System.out.println("Child x using this = " + this.x);
    }
}

public class ThisSuperDemo
{
    public static void main(String[] args)
    {
        Child c = new Child(10, 20);
    }
}

OUTPUT
Parent x = 10
Parent x using super = 10
Child x using this = 20
