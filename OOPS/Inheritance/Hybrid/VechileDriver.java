package OOPS.Inheritance.Hybrid;

class Vechile{
    private String model;
    private int cc;
    Vechile(){
        // To use default super class
    }

    Vechile(String model, int cc){
        this.model = model;
        this.cc = cc;
    }

    public String getModel() {
        return model;
    }

    public int getCc() {
        return cc;
    }

}

class Car extends Vechile{
    private String color;
    private double price;

    Car(){
        // It will reduce the error possibility
    }

    Car(String model, int cc, String color, double price){
        super(model, cc);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

class Bike extends Vechile{
    private String color;
    private double price;

    Bike(){

    }

    Bike(String model, int cc, String color, double price){
        super(model, cc);
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

// maruti, nano, tvs, pulsur

class Maruti extends Car{
    String owner;
    long reg_num;

    Maruti(){

    }

    Maruti(String model, int cc, String color, double price, String owner, long reg_num){
        super(model, cc, color, price);
        this.owner = owner;
        this.reg_num = reg_num;
    }

    void displayDetails(){
        System.out.println("--------------------");
        System.out.println("| Model  | "+getModel());
        System.out.println("| CC     | "+getCc());
        System.out.println("| Color  | "+getColor());
        System.out.println("| Price  | "+getPrice());
        System.out.println("| Owner  | "+owner);
        System.out.println("| Reg No | "+reg_num);
        System.out.println("--------------------");
    }
}

class Nano extends Car{
    String owner;
    long reg_num;

    Nano(){

    }

    Nano(String model, int cc, String color, double price, String owner, long reg_num){
        super(model, cc, color, price);
        this.owner = owner;
        this.reg_num = reg_num;
    }

    void displayDetails(){
        System.out.println("--------------------");
        System.out.println("| Model  | "+getModel());
        System.out.println("| CC     | "+getCc());
        System.out.println("| Color  | "+getColor());
        System.out.println("| Price  | "+getPrice());
        System.out.println("| Owner  | "+owner);
        System.out.println("| Reg No | "+reg_num);
        System.out.println("--------------------");
    }
}

class Tvs extends Bike{
    String owner;
    long reg_num;

    Tvs(){

    }

    Tvs(String model, int cc, String color, double price, String owner, long reg_num){
        super(model, cc, color, price);
        this.owner = owner;
        this.reg_num = reg_num;
    }

    void displayDetails(){
        System.out.println("--------------------");
        System.out.println("| Model  | "+getModel());
        System.out.println("| CC     | "+getCc());
        System.out.println("| Color  | "+getColor());
        System.out.println("| Price  | "+getPrice());
        System.out.println("| Owner  | "+owner);
        System.out.println("| Reg No | "+reg_num);
        System.out.println("--------------------");
    }
}

class Pulsur extends Bike{
    String owner;
    long reg_num;

    Pulsur(){

    }

    Pulsur(String model, int cc, String color, double price, String owner, long reg_num){
        super(model, cc, color, price);
        this.owner = owner;
        this.reg_num = reg_num;
    }

    void displayDetails(){
        System.out.println("--------------------");
        System.out.println("| Model  | "+getModel());
        System.out.println("| CC     | "+getCc());
        System.out.println("| Color  | "+getColor());
        System.out.println("| Price  | "+getPrice());
        System.out.println("| Owner  | "+owner);
        System.out.println("| Reg No | "+reg_num);
        System.out.println("--------------------");
    }
}

public class VechileDriver {
    public static void main(String[] args) {
        Maruti mr = new Maruti("Maruti-2021", 500, "Red", 567890d, "Vinoth", 1234567890l);
        Nano no = new Nano("Nano-2025", 550, "Blue", 967890d, "Vinoth", 1234567895l);
        Tvs tvs = new Tvs("TVS-50", 50, "Black", 544890d, "Vinoth", 12345444890l);
        Pulsur plsr = new Pulsur("Pulsur-2020", 700, "Violet", 588890d, "Vinoth", 3214567890l);

        mr.displayDetails();
        no.displayDetails();
        tvs.displayDetails();
        plsr.displayDetails();
    }
}
