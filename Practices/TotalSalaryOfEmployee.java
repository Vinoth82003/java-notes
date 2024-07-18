package Practices;

import java.util.Scanner;

public class TotalSalaryOfEmployee {
    public static void main(String[] args) {
        System.out.println("----------------- Salary programm -------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Hours: ");
        int hours = input.nextInt();
        System.out.print("Enter Hour rate: ");
        float rate = input.nextFloat();

        int SalInt = (int)(hours*rate);
        double SalDouble = (hours*rate);

        System.out.println("Int type Salary: "+SalInt);
        System.out.println("Int type Salary: "+SalDouble);

        input.close();
    }
}
