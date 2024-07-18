// write a program to count the number of digits present in the given number
package loops.whileloop;

import java.util.Scanner;

public class DigitCount {
    public static void WhileFnc(int num){
        System.out.println("----------------While Loop--------------------");
        int count =0;
        int number = num;
        while(number!=0){
            count++;
            number=number/10;
        }
        System.out.println("The Count: "+count);
    }

    public static void ForLoop(int num){
        System.out.println("------------For Loop---------------- ");
         int count = 0;
        for(int i = num; i!=0;i/=10){
            count ++;
        }
        System.out.println("The Count: "+count);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int num = input.nextInt();
        WhileFnc(num);
        ForLoop(num);
        input.close();
    }
}
