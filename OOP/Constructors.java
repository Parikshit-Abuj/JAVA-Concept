class Rectangle {
    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10.5, 5.5);

        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}

OUTPUT
Area = 57.75
Perimeter = 32.0
