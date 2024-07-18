package Array;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int Elements[] = {1,4,2,5,9,6,7,3,8};
        int largest = Integer.MIN_VALUE;
        int SecLargest = 0;
        int smallest = Integer.MAX_VALUE ;
        int SecSmallest = 0;
        for (int i = 0; i < Elements.length; i++) {
            if (largest <= Elements[i] ) {
                SecLargest = largest;
                largest = Elements[i];
            }
            
            if(smallest >= Elements[i]){
                smallest = Elements[i];
                SecSmallest = smallest;
            }
        }

        System.out.println(largest);
        System.out.println(SecLargest);
        System.out.println(smallest);
        System.out.println(SecSmallest);
    }
}
