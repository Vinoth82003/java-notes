package Casting;

public class Narrowing {
    public static void main(String[] args) {
        long l = 1234567899876543212l;
        int i = (int)l;

        int f = 138;
        byte b = (byte)f;

        System.out.println(i);
        System.out.println(b);
    }
}
