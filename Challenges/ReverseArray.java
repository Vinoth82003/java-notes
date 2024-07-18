import java.util.Arrays;

public class ReverseArray {
    public static void SwapMethod(int arry[]){
        int j = arry.length-1;
    
        for (int i = 0; i < arry.length; i++) {
            if (i==j) {
                break;
            }
                int temp = arry[i];
                arry[i]= arry[j];
                arry[j] = temp;
                j--;
            
        }
        System.out.println("------------------------Swap method-------------------");
        System.out.println(Arrays.toString(arry));
    }

    public static void NewArrayMethod(int arry[]){
        int newArray[] = new int[arry.length] ;
        int j = arry.length -1;
        for (int i = 0; i < arry.length; i++) {
            newArray[i] = arry[j];
            j--;
        }
        System.out.println("------------------------New Array method-------------------");
        System.out.println(Arrays.toString(arry));
    }

    public static void HalfLengthMethod(int a[]){
        // int j = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            // System.out.println(i+" "+j);
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
            // j--;
        }
        System.out.println("------------------------N / 2 method-------------------");
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        SwapMethod(arr);
        NewArrayMethod(arr);
        HalfLengthMethod(arr);
    }
}
