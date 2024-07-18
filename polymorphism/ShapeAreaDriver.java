package polymorphism;
// write a program to find area of shape (rectangle, triangle, circle) with the help of method overloading..
class Shape{
    public static double Area(double r){
        double area = 3.14 * r * r;
        return area;
    }

    public static double Area(double b , double h){
        double area = 0.5 * b * h;
        return area;
    }

    public static float Area(float l , float b){
        float area = l * b;
        return area;
    }
}

public class ShapeAreaDriver {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Area of Circle: "+Shape.Area(15d));
        System.out.println("Area of Triangle: "+Shape.Area(15d,20d));
        System.out.println("Area of Rectangle: "+Shape.Area(15f,20f));
        System.out.println("------------------------------------------");
    }
}
