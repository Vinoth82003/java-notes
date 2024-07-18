import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("----------Largest of three numbers ---------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = input.nextInt();

        System.out.println("Enter number 2:");
        int num2 = input.nextInt();

        System.out.println("Enter number 3:");
        int num3 = input.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1+" is Greatest of three");
            }else{
                System.out.println(num3+ " is Greatest of three");
            }
        }else{
            if (num2 > num3) {
                System.out.println(num2+ " is Greatest of three");
            }else{
                System.out.println(num3+ " is Greatest of three");
            }
        }

        input.close();
    }
}
