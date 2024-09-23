package COGNIZANT;

import java.util.Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int [] array = {-1,1,0,-3,3};
        int [] prod = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int product = 1;
            for (int j = 0; j < array.length; j++) {
                if (i!=j) {
                    product *= array[j];
                }
            }

            prod[i] = product;
        }

        System.out.println(Arrays.toString(prod));

    }
}
