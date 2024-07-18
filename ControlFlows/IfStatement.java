public class IfStatement {
    
    public static String GetInput(int number) {
        String answer = "";
        
        if (number > 50) {
            answer = "Number is Greater" + 50;
            }
            return answer;
    }
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.println("Program  starts");
            // int a = 2;
            // int b = 30;

            // if (a>b) {
            //     System.out.println("Inside if block");
            // } 

            System.out.println("Enter any number:");
            String Answer = GetInput(sc.nextInt());
            System.out.println(Answer);
        }
        
        System.out.println("Program Ends");
    }
}
