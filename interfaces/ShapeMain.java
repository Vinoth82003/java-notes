package interfaces;

abstract interface Shape{
    public static String color = "red";

   abstract public double Area();

}

class Rectangle implements Shape{

    int length ;
    int breadth;

    Rectangle(){}
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double Area()
    {
        return length * breadth;
    }
}

class Circle implements Shape{
    double radius ;

    Circle(){}

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double Area(){
        return 3.14 * radius * radius;
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Shape S;
        System.out.println("------------------------------------");
        S = new Rectangle(12, 12);
        System.out.println("\n---Reactangle---\n");
        System.out.println("Color | "+S.color);
        System.out.println("Area  | "+ S.Area());
        S = new Circle(2.2d);
        System.out.println("\n---Circle---\n");
        System.out.println("Color | "+S.color);
        System.out.println("Area  | "+ S.Area());
        System.out.println("------------------------------------");
    }
}
