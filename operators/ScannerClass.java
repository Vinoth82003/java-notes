package operators;
import java.util.Scanner;
public class ScannerClass {
        
    public static int add(int a, int b) {
        return a + b;
    }
    public static char character(String a) {
        return a.charAt(0);
    }
    public static float Average(int a, int b, int c) {
        float avg = ((a+b+c)/3);
        return avg;
    }
    public static String Concat(String name1, String name2) {
        String answer = (name1 +" "+ name2);
        return answer;
    }
    public static String largestOfThree(int a, int b, int c) {
        String answer = (a>b?(a>c?("A is greater "+a):("C is greater "+c)):(b>c?("B is greater "+b):("C is greater "+c)));

        return answer;
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the number 2 :");
            int num2 = sc.nextInt();
            int total = add(num1, num2);
            System.out.println("Sum of 2 number is : "+total);
            System.out.println("-----------------");
            System.out.println("Enter the any Character");
            char charvalue = character(sc.next());
            System.out.println("Char is "+charvalue);
            System.out.println("-----------------");
            System.out.println("Enter Mark 1 :");
            int m1 = sc.nextInt();
            System.out.println("Enter Mark 2 :");
            int m2 = sc.nextInt();
            System.out.println("Enter Mark 3 :");
            int m3 = sc.nextInt();
            float value = Average(m1, m2, m3);
            System.out.println("Average is :"+value);
            System.out.println("-----------------");
            System.out.println("Enter your Name :");
            String name = sc.next();
            System.out.println("Enter your friend Name :");
            String friendname = sc.next();
            String cocatAnswer = Concat(name,friendname);
            System.out.println("Concated names "+cocatAnswer);
            System.out.println("-----------------");
            System.out.println("Enter number 1:");
            int a = sc.nextInt();
            System.out.println("Enter number 2:");
            int b = sc.nextInt();
            System.out.println("Enter number 3:");
            int c = sc.nextInt();
            String largest = largestOfThree(a, b, c);
            System.out.println("Largest of three is "+largest);

        }catch(Exception e){
            System.err.println(e);
        }
    }
}
