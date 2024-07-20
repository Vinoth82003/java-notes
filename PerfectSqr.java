public class PerfectSqr {
    public static void main(String[] args) {
        int num = 36;
        boolean isSqr = false;
        for(int i=1; i<num; i++){
            if (i*i == num) {
                System.out.println(i);
                isSqr = true;
            }
        }
        System.out.println(isSqr);
    }
}
