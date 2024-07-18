import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");

        int a = sc.nextInt();

        if (a < 5) {
            System.out.println(a+" is less than 5");
        } else if (a < 7) {
            System.out.println(a+" is less than 7");
        }else if (a <=10) {
            System.out.println(a+" is less than or equale to 10");
        }else{
            System.out.println("It is big number ");
        }
     
        sc.close();
    }
}
