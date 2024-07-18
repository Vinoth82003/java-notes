package Non_Primitive_casting;


class Fruit{
    String origin = "India";
}

class Apple extends Fruit{
    String name = "Apple";
}

class Orange extends Fruit{
    String taste = "Sweet";
}

class PineApple extends Fruit{
    String color = "Yellow";
}

public class Casting2 {

    public static void addFruit(Fruit f){
        if (f instanceof Apple) {
            Apple a = (Apple)f;
            System.out.println("Name "+a.name);
            System.out.println("Origin "+a.origin);
        }else if(f instanceof Orange){
            Orange o = (Orange)f;
            System.out.println("Origin "+o.origin);
            System.out.println("Taste "+o.taste);
        }else{
            PineApple p = (PineApple)f;
            System.out.println("origin "+p.origin);
            System.out.println("Color "+p.color);
        }
    }
    public static void main(String[] args) {
        System.out.println("--------------------------");
        addFruit(new Orange());
        System.out.println("--------------------------");
        addFruit(new Apple());
        System.out.println("--------------------------");
        addFruit(new PineApple());
        System.out.println("--------------------------");
    }
}
