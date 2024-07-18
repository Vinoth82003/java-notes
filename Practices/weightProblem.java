// take the weight the 5 person and calculate the average of all 5 persons weight (result should be in whole numbers)

package Practices;

import java.util.Scanner;

public class weightProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Weight of Person 1: ");
        float weight1 = input.nextFloat(); 
        
        System.out.print("Enter Weight of Person 2: ");
        float weight2 = input.nextFloat(); 
        
        System.out.print("Enter Weight of Person 3: ");
        float weight3 = input.nextFloat(); 
        
        System.out.print("Enter Weight of Person 4: ");
        float weight4 = input.nextFloat(); 
        
        System.out.print("Enter Weight of Person 5: ");
        float weight5 = input.nextFloat(); 

        int average = (int) ((weight1+weight2+weight3+weight4+weight5)/5);

        System.out.println("Average of 5 persons weight is : "+average);

        input.close();
        
    }
}
