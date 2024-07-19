package Practices;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;
        while (number != 0) {
            int fact = number%10;
            int facValue = 1;
            for (int i = 2; i <= fact; i++) {
                facValue *= i;
            }
            sum += facValue;

            number /= 10;
        }

        if (sum == temp) {
            System.out.println("'"+temp+"' is strong number ");
        }else{
            System.out.println("'"+temp+"' not strong number ");
        }

        input.close();
    }
}
