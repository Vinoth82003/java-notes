package Objects.LapTop;

public class Laptop {
    String brand;
    int model;
    double price;
    int ram;

    public Laptop(){

    }

    public Laptop(String brand){
        this.brand = brand;
    }

    public Laptop(String brand, int model){
        this(brand);
        this.model = model;
    }

    public Laptop(String brand, int model, double price){
        this(brand, model);
        this.price = price;
    }

    public Laptop(String brand, int model, double price, int ram){
        this(brand, model, price);
        this.ram = ram;
    }

    public void displayDetails(){
        System.out.println("********************* Welcome to laptop store *******************************");
        System.out.println("Brand - "+brand);
        System.out.println("Model - "+model);
        System.out.println("Price - "+price);
        System.out.println("RAM - "+ram);
        System.out.println("*****************************************************************************");
    }
}

// constructor chaining when 1 constructor call another contructor is called chaining;>