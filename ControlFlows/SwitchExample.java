import java.util.Scanner;

public class SwitchExample {

    public static int addition(int a, int b){
        int c = a+b;
        return c;
    }
    public static int subtract(int a, int b){
        int c = a-b;
        return c;
    }
    public static int multiple(int a, int b){
        int c = a*b;
        return c;
    }
    public static float divide(float a, float b){
        float c = a/b;
        return c;
    }
    public static void main(String[] args) {
        // swtich program
        Scanner input = new Scanner(System.in);

        System.out.println("a Addition");
        System.out.println("b Subtraction");
        System.out.println("c Multiplication");
        System.out.println("d Division");
        System.out.println("Choose any one option from a, b, c, d:");
        char option = input.next().charAt(0);

        switch (option) {
            case 'a':
                {
                    System.out.println("You have selected Addition");
                    System.out.println("Enter Number 1:");
                    int a = input.nextInt();
                    System.out.println("Enter Number 2:");
                    int b = input.nextInt();
                    System.out.println("Addition of 2 numbers : "+addition(a,b));
                }
                break;
        
             case 'b':
                {
                    System.out.println("You have selected Subtraction");
                    System.out.println("Enter Number 1:");
                    int a = input.nextInt();
                    System.out.println("Enter Number 2:");
                    int b = input.nextInt();
                    System.out.println("Addition of 2 numbers : "+subtract(a,b));
                }
                break;
            
            case 'c':
                {
                    System.out.println("You have selected Multiplication");
                    System.out.println("Enter Number 1:");
                    int a = input.nextInt();
                    System.out.println("Enter Number 2:");
                    int b = input.nextInt();
                    System.out.println("Addition of 2 numbers : "+multiple(a,b));
                }
                break;

            case 'd':
                {
                    System.out.println("You have selected Division");
                    System.out.println("Enter Number 1:");
                    int a = input.nextInt();
                    System.out.println("Enter Number 2:");
                    int b = input.nextInt();
                    System.out.println("Addition of 2 numbers : "+divide(a,b));
                }
                break;
            default:
                {
                    System.out.println("Wrong selectio");
                }
                break;
        }

        input.close();
    }
}
