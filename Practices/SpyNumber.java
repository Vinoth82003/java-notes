package Practices;

public class SpyNumber {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;
            int prod = 1;
                int number = i;
                while (number!=0) {
                    prod *= ((number%10));
                    sum += number%10;
                    number /= 10;
                }
            if (sum == prod) {
                System.err.println(i);
            }
        }
    }
}
