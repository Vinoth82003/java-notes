package operators;

public class ConditionalOp {

    public static void greaterOfNumbers(){
        int x = 20;
        int y = 10;
        String result = (x > y)?("X is Greater"):("Y is Greater");
        System.out.println(result);
    }

    public static void smallOfNumbers(){
        int x = 20;
        int y = 10;
        String result = (x > y)?("Y is Smaller"):("X is Smaller");
        System.out.println(result);
    }

    public static void evenOrodd(){
        int x = 20;
        String result = (x % 2 == 0)?("X is even number"):("X is not even number");
        System.out.println(result);
    }
    public static void main(String[] args) {
        int x = 20;
        int y = 20;

        String result = (x != y ? "X is not equal to Y":" X is equal to Y");

        System.out.println(result);
        evenOrodd();
        smallOfNumbers();
        greaterOfNumbers();
    }
}
