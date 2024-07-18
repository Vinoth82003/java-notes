package Objects.LapTop;

public class LaptopDrive {
    public static void main(String[] args) {
        System.out.println("------------------Only brand-------------------------");
        Laptop lp1 = new Laptop("the brand is - 'Vivo'");
        lp1.displayDetails();

        System.out.println("--------------------Brand and Model-------------------");
        Laptop lp2 = new Laptop("Mac Book", 12);
        lp2.displayDetails();

        System.out.println("------------------Brand , Model, and Price---------------");
        Laptop lp3 = new Laptop("Lenova", 13, 65000.67d);
        lp3.displayDetails();

        System.out.println("-------------------With all parameters----------------------");
        Laptop lp4 = new Laptop("HP", 19, 99000.99d, 12);
        lp4.displayDetails();
    }
}
