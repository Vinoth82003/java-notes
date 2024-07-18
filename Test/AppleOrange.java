package Test;

import java.util.Scanner;

/**
 * AppleOrange
 */
public class AppleOrange {

    public static void FindAppleAndOrange(int start, int end, int appletree, int orangetree, int apples[], int oranges[]){
        int appleCount =0;
        int orangeCount =0;
        for (int i = 0; i < apples.length; i++) {
            int addedvalue = appletree + apples[i];
            if (addedvalue >=start && addedvalue<= end) {
                appleCount++;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            int addedvalue = orangetree + oranges[i];
            if (addedvalue >=start && addedvalue<= end) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------Welcome to Apple and Orange problem---------");
        System.out.print("Enter Start value s: ");
        int s = sc.nextInt();
        System.out.print("Enter End value t: ");
        int t = sc.nextInt();
        System.out.print("Enter Apple tree a: ");
        int a = sc.nextInt();
        System.out.print("Enter Orange tree b: ");
        int b = sc.nextInt();
        System.out.print("Enter Apple count m:");
        int m = sc.nextInt();
        System.out.print("Enter Orange count n:");
        int n = sc.nextInt();
        // int apples [] = new int[m];
        // int oranges [] = new int[n];
        // System.out.println("Enter the apples distance one by one");
        // for (int i = 0; i < apples.length; i++) {
        //     apples[i] = sc.nextInt();
        // }
        // System.out.println("Enter the Oranges distance one by one");
        // for (int i = 0; i < oranges.length; i++) {
        //     apples[i] = sc.nextInt();
        // }
        int []apples = {2,3,-4};
        int []oranges = {3,-2,-4};
        FindAppleAndOrange(s, t, a, b, apples, oranges);
        sc.close();
    }
}