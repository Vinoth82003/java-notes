package Practices;

import java.util.Scanner;

// square the number after square add the digit if number == digit sum then it is neon number
// 9*9 = 81 => 8+1 = 9 = 9==9 neon number
public class NeonNumber {

    public static void FindNeonNumber(int number){
        int square = number*number;
        int sum = 0;
        while (square !=0) {
            int last = square%10;
            sum += last;
            square /= 10;
        }
        if (sum == number) {
            System.out.println(number+" is neon Number");
        }else{
            System.out.println(number+" is not neon Number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int number = 9;
        System.out.print("Enter the Number: ");
        int number = input.nextInt();
        
        FindNeonNumber(number);

        input.close();
    }
}
