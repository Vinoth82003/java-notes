
class Shape{
    private String color;

    public String getColor() {
        return color;
    }

    Shape(){

    }

    Shape(String color){
        this.color = color;
    }

    void CalculateArea(){
       
    }

}

class Circle extends Shape{
    double radius;
    Circle(){}
    Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    void CalculateArea(){
        System.out.println("Color is : "+super.getColor());
        System.out.println("Area of circle is : "+(3.14 * (this.radius*this.radius)));
    }
}

class Rectangle extends Shape{
    int lenght ;
    int breath;
    Rectangle(){}
    Rectangle(int lenght, int breath, String color){
        super(color);
        this.lenght = lenght;
        this.breath = breath;
    }

    @Override
    void CalculateArea(){
        System.out.println("Color is : "+super.getColor());
        System.out.println("Area of triangle : "+(this.lenght*this.breath));
    }
}

public class ShapeDriver {
    public static void main(String[] args) {
        Shape s ;//Generalized variable
        s = new Circle(15.4d, "RED");
        s.CalculateArea();
        s = new Rectangle(7, 2, "BLUE");
        s.CalculateArea();
    }
}
