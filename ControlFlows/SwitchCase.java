import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int a = s.nextInt();
        switch (a) {
            case 1:
                {
                    System.out.println("case 1");
                }
                
                break;
            case 2:
            {
                    System.out.println("case 2");
            }break;
            case 3 :
            {
                        System.out.println("case 3");
            }break;
            default:
            {
                System.out.println("default");
            } break;
        }

        s.close();
    }
}
