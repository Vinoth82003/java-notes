package OOPS.Inheritance.Hierarchical;

class Fruit{
    String origin;

    Fruit(){
        // No Argument Constructor;
    }

    Fruit(String origin){
        this.origin = origin;
    }
}

class Apple extends Fruit{
    String taste;
    String color;

    Apple(){
        // Non argumented Constructor;
    }

    Apple(String origin , String taste, String color){
        super(origin);
        this.taste = taste;
        this.color = color;
    }

    void displayDetails(){
        System.out.println("----------------------");
        System.out.println("| Origin | "+super.origin);
        System.out.println("| Taste  | "+taste);
        System.out.println("| Color  | "+color);
        System.out.println("----------------------");
    }
}

class Orange extends Fruit{
    String taste;
    String color;

    Orange(){
        // Non argumented Constructor;
    }

    Orange(String origin , String taste, String color){
        super(origin);
        this.taste = taste;
        this.color = color;
    }

    void displayDetails(){
        System.out.println("----------------------");
        System.out.println("| Origin | "+super.origin);
        System.out.println("| Taste  | "+taste);
        System.out.println("| Color  | "+color);
        System.out.println("----------------------");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        // Lets create Apple object 1st....!
        Apple apl = new Apple("Kazakhstan", "Sweetness", "Red");
        Orange org = new Orange("Northeast India", "Tartness", "Orange");
        apl.displayDetails();
        org.displayDetails();
    }
}
