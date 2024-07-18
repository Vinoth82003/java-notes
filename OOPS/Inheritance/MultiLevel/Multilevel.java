package OOPS.Inheritance.MultiLevel;

class Vechile{
    private int model;

    Vechile(){
        // to create object
    }

    Vechile(int model){
        this.model = model;
    }
    
    public int getModel() {
        return model;
    }

} 

class Car extends Vechile{
    String brand ;
    int No_Of_Doors;
    double price;
    Car(){
        // to create object
    }
    Car(String brand,int No_Of_Doors, double price, int model){
        super(model);
        this.brand = brand;
        this.No_Of_Doors = No_Of_Doors;
        this.price = price;
    }
}

class E_car extends Car{

    int battery_level;
    E_car(){
        // to create object
    }
    E_car(int battery_level, String brand, int No_Of_Doors, double price, int model){
        super(brand, No_Of_Doors, price, model);
        this.battery_level = battery_level;
    }

    public void displayDetails(){
        System.out.println("----------------------------------");
        System.out.println("| Brand       | "+brand);
        System.out.println("| Model       | "+getModel());
        System.out.println("| Battery     | "+this.battery_level+"%");
        System.out.println("| No of Doors | "+No_Of_Doors);
        System.out.println("| Price       | "+price);
        System.out.println("----------------------------------");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        E_car ec = new E_car(90, "Hundai", 6, 899999d, 10);
        ec.displayDetails();
    }
}
