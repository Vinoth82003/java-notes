// Write program to sum of the digit
package Practices;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        int number = input.nextInt();
        int sum = 0;
        System.out.println("Sum Value: "+sum);
        while (number!=0) {
            sum += number%10;
            // System.out.println("Sum "+sum);
            number /= 10;
            // System.out.println("Num "+number);
        }
        System.out.println("The Sum of the digit is : "+sum);
        input.close();

    }    
}
