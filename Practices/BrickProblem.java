package Practices;

import java.util.Scanner;

public class BrickProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------Brick problem------------------");
        int big = 5;
        int small = 1;
        System.out.println("Enter the Goal Space");
        int goal = input.nextInt();
        // now get the number of 
        System.out.println("Enter the number of Big: ");
        int nOfBig = input.nextInt();
        System.out.println("Enter the number of Small: ");
        int nOfSmall = input.nextInt();
        int totalSpace = (big*nOfBig)+(small*nOfSmall);
        if (totalSpace >= goal) {
            System.err.println(true);
        }else{
            System.out.println(false);
        }

        input.close();
    }
}
// converting 1 type of data into another type is known as type casting