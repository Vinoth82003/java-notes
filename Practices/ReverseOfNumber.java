package Practices;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int rev = 0;
        while (number>0) {
            int last = number%10;
            rev = (rev*10)+last;
            number = number/10;
        } 
        System.out.println("The reverse of "+originalNumber+" number is : "+rev);
        input.close();
    }
}
