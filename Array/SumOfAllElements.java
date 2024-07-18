package Array;

public class SumOfAllElements {
    public static void main(String[] args) {
        int sum = 0;
        int arrs [] = {1,2,3,4,5};
        for(int i =0; i<= arrs.length -1; i++){
            sum += arrs[i];
        }

        System.out.println("Sum of all elements in an array is : "+sum);
    }
}
