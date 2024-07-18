import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to find the range.....:");
        int number = sc.nextInt();

        if (number >= 100 && number <= 200) {
            System.out.println(number + " Range b/w 100-200");
        }else if (number >= 201 && number <=300) {
            System.out.println(number +" Range b/w 201-300");
        }else if (number >= 301 && number <= 400) {
            System.out.println(number + " Ramge b/w 301-400");
        }else{
            System.out.println("Out of Range......!");
        }

        sc.close();
    }
}
