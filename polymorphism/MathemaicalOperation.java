// Write a program to perform mathematical operations (Add,sub,multiplication and division)with 2 and 3 numbers with the help of method overloading...
package polymorphism;
class Operations {
    public static void add(int a, int b){
        System.out.println("Addition of 2 numbers :"+(a+b)); 
    }

    public static void add(int a , int b, int c){
        System.out.println("Addition of 3 numbers :"+(a+b+c));
    }

    public static void sub(int a, int b){
        System.out.println("Subtraction of 2 numbers : "+(a-b));
    }

    public static void sub(int a, int b, int c){
        System.out.println("Subtraction of 3 numbers :"+(a-b-c));
    }

    public static void mul(int a, int b){
        System.out.println("Multiplication of 2 numbers :"+(a*b));
    }

    public static void mul(int a, int b, int c){
        System.out.println("Multiplication of 3 numbers :"+(a*b*c));
    }

    public static void div(int a, int b){
        System.out.println("Division of 2 numbers :"+(a/b));
    }
}
public class MathemaicalOperation {
    public static void main(String[] args) {
        Operations maths = new Operations();
        System.out.println("------------------------------------");
        maths.add(10, 20);
        maths.add(10, 20, 30);
        maths.sub(30, 10);
        maths.sub(30, 10, 10);
        maths.mul(3, 5);
        maths.mul(10, 2, 4);
        maths.div(50, 5);
        System.out.println("------------------------------------");
    }
}
