// find the missing number in an array

package Array;

/**
 * MissingValueInArray
 */
public class MissingValueInArray {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,7,8,9,10};

        for (int i = array[0]; i < array.length; i++) {
            int index = i+1;
            // System.out.println(array[i]+" "+index);
            if (array[i] != index) {
                System.out.println(index);
                break;
            }
        }

    }
}