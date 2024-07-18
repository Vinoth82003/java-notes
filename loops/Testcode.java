package loops;

public class Testcode {
    public static void main(String[] args) {
        byte b =2;
        while (b++<=2||b==6) {
            ++b;
            b++;
            System.err.println("*");
        }
        System.out.println(b);
    }
}
