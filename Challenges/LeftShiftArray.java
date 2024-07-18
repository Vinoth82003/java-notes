import java.util.Arrays;

public class LeftShiftArray {

    public static void SwapMethod(int arr[]){
        System.out.println("\n-------------------------Swap method--------------------------");
        for (int i = 0; i < arr.length; i++) {
            int temp ;
            int a = arr[i];
            int b = i == arr.length-1?(arr[i]):(arr[i+1]);
            temp = a;
            a = b;
            b = temp;
            arr[i] = a;
            if (i != arr.length-1) {
                arr[i+1] = b;
            }
            System.out.println("a "+a+" b "+b);
        }
        System.out.println("Swaped array "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int temp = 0;
        int arr [] = {1,2,3,4,5};
        SwapMethod(arr);
        // Print the original array
        System.out.println("Original array: "+Arrays.toString(arr));
        // printArray(arr);
        
        temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i]; 
        }
        arr[arr.length-1] = temp;

        // Print the array after left shift
        System.out.println("Array after left shift: "+Arrays.toString(arr));

    }
}
