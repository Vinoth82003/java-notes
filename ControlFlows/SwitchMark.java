import java.util.Scanner;

public class SwitchMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Student grade program:");
        System.out.println("Enter you Mark");
        int mark = input.nextInt();

        mark = mark/10;

        switch (mark) {
            case 10:
                System.out.println("A+");
                break;
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B+");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;

            default:
                System.out.println("Fail");
                break;
        }

        input.close();
    }
}
