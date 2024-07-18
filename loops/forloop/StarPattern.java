package loops.forloop;

public class StarPattern {

    public static void star() {
        System.out.println("----------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void squareStar() {
        System.out.println("----------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) { // Corrected the condition to print a square
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedStar() {
        System.out.println("----------------------------------------------------------");
        for (int i = 5; i >= 1; i--) { // Corrected the loop condition
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondStar() {
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5 - 2; i >= 0; i--) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star();
        invertedStar();
        squareStar();
        diamondStar();
    }
}
