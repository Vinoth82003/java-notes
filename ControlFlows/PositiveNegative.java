import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = input.nextInt();

        if (number >0) {
            System.out.println(number+" is Positive number");
        }else if (number == 0) {
            System.out.println(number+" is 0");
        } else {
            System.out.println(number+ " is Negative");
        }
    input.close();
    }
}
