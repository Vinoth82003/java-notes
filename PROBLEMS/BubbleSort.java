package PROBLEMS;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int array [ ]= {9,3,7,2,6,1};

        for (int i = 0; i < array.length-1; i++) {
            System.out.println();
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]) {
                    System.out.println(array[j]+" > "+array[j+1]);
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }else{
                    System.out.println(array[j]+" < "+array[j+1]);
                }
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println("\n--------------------------------\n\t"+Arrays.toString(array)+"\n--------------------------------\n");

    }
}
