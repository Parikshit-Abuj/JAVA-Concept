package overriderules; 

class A {}

class B extends A {}

class Super
{
    public A display()
    {
        System.out.println("Super Display");
        return new A();
    }
}

class Sub extends Super
{
    @Override
    public B display()
    {
        System.out.println("Sub Display");
        return new B();
    }
}

public class OverrideRules
{
    public static void main(String[] args)
    {
        Super s = new Sub();
        A obj = s.display();

        System.out.println("Returned object: " + obj.getClass().getSimpleName());
    }
}

OUTPUT
Sub Display
Returned object: B
