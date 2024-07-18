abstract class Shape {
    String color;

    abstract public double area();

    Shape(String color) {
        this.color = color;
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth, String color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    int length;

    Square(int length, String color) {
        super(color);
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;
    }
}

public class ShapeProblem {
    public static void main(String[] args) {
        Shape s;
        System.out.println("_________________________________________");
        System.out.println("\n- Rectangle -");
        s = new Rectangle(2, 2, "red");
        System.out.println("Color: " + s.color);
        System.out.println("Area: " + s.area());
        System.out.println("\n- Circle -");
        s = new Circle(12, "Blue");
        System.out.println("Color: " + s.color);
        System.out.println("Area: " + s.area());
        System.out.println("\n- Square -");
        s = new Square(2, "Green");
        System.out.println("Color: " + s.color);
        System.out.println("Area: " + s.area());
        System.out.println("_________________________________________");
    }
}
