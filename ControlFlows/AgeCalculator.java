import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        System.out.println("----------------Age Calculator programm--------------");
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Age:");
        int age = input.nextInt();

        if (age >= 1 && age <= 12) {
            System.out.println("You are a ----- Child");
        }else if (age >= 13 && age <= 20) {
            System.out.println("You are a ----- Teenage");
        }else if (age >= 21 && age <= 29) {
            System.out.println("You are a ----- Teemage Adult");   
        }else if (age >= 30 && age <= 59) {
            System.out.println("You are a ----- Adult");
        }else{
            System.out.println("You are a ----- Senior");
        }

        input.close();
    }
}
