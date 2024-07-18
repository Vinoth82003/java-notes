package OOPS.Encapsulation.Relationship;

class Engine {
    int model = 2021;
    double price = 500000d;
}

class Wheels{
    String brand = "MRF";
    double price = 120985d;
}

class Car{
    Engine e = new Engine();
    Wheels w = new Wheels();
}


public class CarDriver {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Engine Model - "+c.e.model);
        System.out.println("Engine Price - Rs."+c.e.price+" /-");
        System.out.println("Wheel Model - "+c.w.brand);
        System.out.println("Wheel Price - Rs."+c.w.price+" /-");
    }
}
