package Assignment;

import java.util.Scanner;

public class XPowerN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of X: ");
        int x= input.nextInt();
        System.out.print("Enter the Power Value: ");
        int n = input.nextInt();
        int answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= x;
        }
        System.out.println("The "+x+" power "+n+" value is "+answer);
        input.close();
    }
}
