package COGNIZANT;

public class BitDifference {
    public static void main(String[] args) {
        int A = 3;
        int B = 14;
        int count = 0;
        String str = (Integer.toBinaryString(A^B));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='1') {
                count++;
            }
        }

        System.out.println(count);
    }
}
