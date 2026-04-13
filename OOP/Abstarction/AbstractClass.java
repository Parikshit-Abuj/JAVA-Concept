abstract class Shape
{
    abstract double area();

    void display()
    {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape
{
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    @Override
    double area()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length, breadth;

    Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }

    @Override
    double area()
    {
        return length * breadth;
    }
}

public class AbstractClass
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}

OUTPUT
This is a shape
Circle Area = 78.53981633974483
This is a shape
Rectangle Area = 24.0
