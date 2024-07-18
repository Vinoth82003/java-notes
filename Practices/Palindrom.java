package Practices;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number with 2 or more degit: ");
        int number = input.nextInt();
        int temp = 0;
        int originalNumber = number;
        while (number != 0) {
            temp *= 10;
            temp += number%10;
            number /= 10;
        }
        if (temp == originalNumber) {
            System.out.println("The Number "+originalNumber+" is palindrome");
        }else{
            System.out.println("The Number "+originalNumber+" is not palindrome");
        }

        input.close();
    }
}
