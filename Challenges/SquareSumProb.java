public class SquareSumProb {

    public static void main(String[] args) {
        int number = 19;
        while (number != 0) {
            int sum = 0;
            if (number == 1) {
                System.out.println("Yes");
                break;
            }

            if (number == 4) {
                System.out.println("no");
                break;
            }

            while (number !=0) {
                int lst = number % 10;
                sum += lst*lst;
                number /= 10;
            }
            number = sum;
        }
    }

}
