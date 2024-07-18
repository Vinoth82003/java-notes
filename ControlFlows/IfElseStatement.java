import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your Age here :");
            int age = input.nextInt();

            if (age >= 18) {
                System.out.println("You are Eligible to vote");
            } else {
                System.out.println("You are not eligible");
            }
        }
    }
}
