package Methods;

public class ParamaterizedAddition {
    public static void addition(int a, int b){
        int c = a+b;
        System.out.println("The Sum of 2 number is : "+c);
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        addition(a, b);
    }
}
