package OOPS.Inheritance;

class Phone{
    private String OS;

    public String getOS(){
        return this.OS;
    }

    Phone(String OS){
        this.OS = OS;
    }
}

class OnePlus extends Phone{
    String brand;
    double price;
    int model;

    OnePlus(String OS,String brand,double price, int model){
        super(OS);
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public void displayDetails(){
        System.out.println("OS    - "+super.getOS());
        System.out.println("Brand - "+brand);
        System.out.println("Price - "+price);
        System.out.println("Model - "+model);
    }
}

public class PhoneDriver {
    public static void main(String[] args) {
        OnePlus ph = new OnePlus("Oxygen OS","OnePlus Nord 10+", 57000d, 12);
        ph.displayDetails();
    }
}
