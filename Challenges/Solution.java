import java.util.*;

public class Solution {

    public static int isSameReflection(String word1, String word2) {
        // Check if both words have the same length
        if (word1.length() != word2.length()) {
            return -1;
        }
        
        // Concatenate word1 with itself to check all possible rotations
        String concatenated = word1 + word1;
        
        // Check if word2 is a substring of concatenated word1
        if (concatenated.contains(word2)) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input for word1
        String word1 = in.nextLine().trim();

        // Input for word2
        String word2 = in.nextLine().trim();

        // Check if word1 is the same reflection as word2
        int result = isSameReflection(word1, word2);
        
        // Print the result
        System.out.print(result);
    }
}
