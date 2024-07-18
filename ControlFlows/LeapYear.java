import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("-------Leap year program------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = input.nextInt();

        if (year % 4 == 0 || year % 400 == 0 || year % 100 == 0) {
            System.out.println(year+" is Leap year");
        }else{
            System.out.println(year+" is not leap year");
        }

        input.close();
    }
}
