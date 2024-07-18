import java.util.Arrays;

public class ArraySorting {
    public static void AscendingSort(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("\n--------------------------Ascending Sort-----------------------------\n");
        System.out.println(Arrays.toString(array));
    }

    public static void ReverseSort(int array []){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]<array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("\n--------------------------Reverse Sort-----------------------------\n");
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        System.out.println("------------Original Array------------------------------------------\n");
        int array [] = {5,2,1,4,3,9,6,8,7};
        System.out.println(Arrays.toString(array));
        AscendingSort(array);
        ReverseSort(array);
        System.out.println("\n-----------------------------------------------------------------------");
    }
}
