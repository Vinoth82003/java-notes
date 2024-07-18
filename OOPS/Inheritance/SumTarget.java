package OOPS.Inheritance;

import java.util.Arrays;

public class SumTarget {
    public static void removeDuplicate(int a[]){
        // int b[] =new int[a.length];
        int dublicate = 0;
        for (int i = 0; i < a.length-1; i++) {
            for(int j =0; j<a.length; j++){
                System.out.println(i+"-"+j);
                if (a[i] == a[j]) {
                    a[i] = -1;
                    dublicate++;
                }
            }
        }
        System.out.println(dublicate);
        System.out.println(Arrays.toString(a));
    } 
    public static void main(String[] args) {
        int [] array = {1,3,5,3,1,4};
        // int target = 6;
        // for (int i = 0; i < array.length-1; i++) {
        //     for (int j = i+1; j < array.length; j++) {
        //         if (array[i] + array[j] == target) {
        //             System.out.println("["+array[i]+","+array[j]+"]");
        //         }
        //     }
        // }
        removeDuplicate(array);
    }
}
