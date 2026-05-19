package RealTime;
import java.util.*;

public class AllCombinations {                  // Class to generate
    public static List<String> combinations(String s) { // Method to generate all combinations of characters in the string
       
    	int n = s.length();                           // Get the length of the input string
        List<String> result = new ArrayList<>();      // List to store the resulting combinations
        for (int mask = 1; mask < (1 << n); mask++) { // Loop through all possible combinations using bit masking
            StringBuilder sb = new StringBuilder();   // StringBuilder to build the current combination
            for (int i = 0; i < n; i++) {             // Loop through each character in the string
                if (((mask >> i) & 1) == 1) {         // Check if the i-th bit is set in the mask
                    sb.append(s.charAt(i));           // If the bit is set, append the corresponding character to the StringBuilder
                }
            }
            result.add(sb.toString());           // Add the generated combination to the result list
        }
        return result;                            // Return the list of combinations
    }

    public static void main(String[] args) {
        System.out.println(combinations("abc")); // Test the combinations method with the input "abc"
        // [a, b, ab, c, ac, bc, abc]
    }
}

// Output: [a, b, ab, c, ac, bc, abc]