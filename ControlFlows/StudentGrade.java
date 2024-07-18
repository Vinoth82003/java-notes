import java.util.Scanner;

public class StudentGrade {
   public static String GetGrade(int mark){
        String Answer = "";
        if (mark == 100) {
            Answer = "Excellent";
        } else if (mark >= 91 && mark < 100) {
            Answer = "A+";
        } else if (mark >= 81 && mark < 91) {
            Answer = "A";
        } else if (mark >= 71 && mark < 81) {
            Answer = "B+";
        } else if (mark >= 61 && mark < 71) {
            Answer = "B";
        } else if (mark >= 51 && mark < 61) {
            Answer = "C";
        } else if (mark >= 41 && mark < 51) {
            Answer = "D";
        } else {
            Answer = "Fail";
        }

        return Answer;
    }
    public static void main(String[] args) {
        System.out.println("------Program for student grade---------");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Tamil Mark:");
        int mark1 = input.nextInt();
        System.out.println("Enter English Mark:");
        int mark2 = input.nextInt();
        System.out.println("Enter Maths Mark :");
        int mark3 = input.nextInt();
        System.out.println("Enter Science Mark:");
        int mark4 = input.nextInt();
        System.out.println("Enter Social Mark:");
        int mark5 = input.nextInt();

        System.out.println("Tamil ---- "+mark1+ " Grade is ---- "+GetGrade(mark1));
        System.out.println("English ---- "+mark2+ " Grade is ---- "+GetGrade(mark2));
        System.out.println("Maths ---- "+mark3+ " Grade is ---- "+GetGrade(mark3));
        System.out.println("Science ---- "+mark4+ " Grade is ---- "+GetGrade(mark4));
        System.out.println("Social ---- "+mark5+ " Grade is ---- "+GetGrade(mark5));

        input.close();
    }
}
