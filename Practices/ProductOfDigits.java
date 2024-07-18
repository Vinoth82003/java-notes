package Practices;

import java.util.Scanner;

public class ProductOfDigits {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;
        int prod = 1;
        while (number!=0) {
            prod *= (number%10 == 0?(1):(number%10));
            sum += number%10;
            number /= 10;
        }
        if (sum == prod) {
            System.err.println("The Number "+originalNumber+" is Spy Number");
        }else{
            System.err.println("The Number "+originalNumber+" is Not Spy Number");
        }
        input.close();
    }    
}
