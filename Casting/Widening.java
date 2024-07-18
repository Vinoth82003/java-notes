package Casting;


public class Widening {
    public static void main(String[] args) {
        byte b = 20;
        
        short s = b;// Widening
        System.err.println(s);
        
        long l = b;
        System.err.println(l);

        double d = b;
        System.out.println(d);
        
    }
}
