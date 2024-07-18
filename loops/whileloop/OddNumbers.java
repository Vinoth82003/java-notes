package loops.whileloop;

public class OddNumbers {
    public static void main(String[] args) {
        int a = 1;
        do {
            if (a%2 !=0 ) {
                System.out.print(a+" ");
            }
            a++;
        } while (a<=100);
    }
}
