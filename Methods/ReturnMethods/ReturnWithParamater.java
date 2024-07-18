package Methods.ReturnMethods;

import java.util.Scanner;

public class ReturnWithParamater {
    public static String Concat(String s1, String s2){
        String s3 = s1+" "+s2;
        return s3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.print("Enter String 1: ");
        String s1 = sc.next();
        System.out.print("Enter String 2: ");
        String s2 = sc.next();
        
        System.out.println(Concat(s1, s2));
        System.out.println("-----------------------------------------");
        sc.close();
    }
}
