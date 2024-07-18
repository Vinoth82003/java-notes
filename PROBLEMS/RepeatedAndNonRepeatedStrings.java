package PROBLEMS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatedAndNonRepeatedStrings {
    public static void main(String[] args) {
        String[] inputArray = {"apple", "banana", "apple", "orange", "banana", "grape", "melon"};
        
        // Arrays to store repeated and non-repeated values
        ArrayList<String> repeatedValues = new ArrayList<>();
        ArrayList<String> nonRepeatedValues = new ArrayList<>();
        
        // HashMap to keep track of the count of each string
        HashMap<String, Integer> countMap = new HashMap<>();
        
        // Count the occurrences of each string
        for (String str : inputArray) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }
        
        // Distribute the strings to the appropriate list
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedValues.add(entry.getKey());
            } else {
                nonRepeatedValues.add(entry.getKey());
            }
        }
        
        // Output the results
        System.out.println("Repeated values: " + repeatedValues);
        System.out.println("Non-repeated values: " + nonRepeatedValues);
    }
}

