package COGNIZANT;

import java.util.Arrays;

public class KthLargestNumber {

    public static int[] Search(int array[][],int i,int N)
    {
        System.out.println(i);
        int[] ans = new int[2];
        ans[0] = i;
        for (int j = 0; j < array[i].length; j++) {
            if (array[i][j]==N) {
                ans[1] = j;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][] array = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int N = 30;
        int[] ans = new int[2];
        for (int i = 0; i < array.length; i++) {
           if ( i+1 != array.length && N>=array[i][0] && N<=array[i+1][0]) {
            System.out.println(array[i][0]);
            System.out.println(array[i+1][0]);
                ans =Search(array,i,N);
                break;
           }else{
                ans = Search(array,i+1,N);
                break;
           }
        }

        System.out.println(ans[0]+"-"+ans[1]);

    }
}
