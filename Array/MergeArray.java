// programm to merge two arrays
package Array;

import java.util.Arrays;

/**
 * MergeArray
 */
public class MergeArray {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int [] array2 = {6,7,8,9,10}; 
        int MergedArray [] = new int[ array1.length + array2.length ];

        for (int i = 0; i < MergedArray.length; i++) {
            if (i<array1.length) {
                MergedArray[i] = array1[i];
            }else{
                MergedArray[i] = array2[i-array1.length];
            }
        }

        System.out.println(Arrays.toString(MergedArray));
    }
}