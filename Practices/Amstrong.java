package Practices;

import java.util.Scanner;

public class Amstrong {

    public static int getCount(int a){
        int count = 0;
        while (a != 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    public static int getProd(int power, int number){
        int prod = 1;
        for (int i = 0; i < power; i++) {  
            prod *= number;
        }
        return prod;
    }

    public static void AmstrongNumber(int number){
        int power = getCount(number);  
        int temp = number;
        int sum = 0;
        while (number != 0) {
            int last = number % 10;
            sum += getProd(power, last);
            number /= 10;
        }
        System.out.println(sum);
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
    public static void main(String[] args) {
        // int number = 153;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        AmstrongNumber(number);
        input.close();
    }
}
