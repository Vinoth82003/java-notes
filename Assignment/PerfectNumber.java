package Assignment;

import java.util.Scanner;

public class PerfectNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int number = input.nextInt();
    int sum = 0;
    for (int i = 1; i < number; i++) {
        if (number %i==0) {
            sum += i;
        }
    }
    if (number == sum) {
        System.out.println(number+" is Perfect Number");
    }else {
        System.out.println(number+" is Not Perfect Number");
    }
    input.close();
  }

}
