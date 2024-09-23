package COGNIZANT;

/**
 * PrimeWoZero
 */
public class PrimeWoZero {

    public static boolean isWithouZero(int N)
    {
        while (N>0) {
            int last = N%10;
            if (last==0) {
                return false;
            }
            N /=10;
        }
        return true;
    }

    public static boolean isPime(int N)
    {
        if (N<=2) {
            return true;
        }

        for (int i = 2; i < N; i++) {
            if (N%i==0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int N = 4;
        int count = 1;

        for (int i = 3; i <= N; i+=2) {
            if (isPime(i)) {
                if (isWithouZero(i)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}