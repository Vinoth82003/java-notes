package loops;

import java.util.Scanner;

public class Patter {
    public static void main(String[] args) {
        System.out.println("----------------Pattern program---------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = input.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
