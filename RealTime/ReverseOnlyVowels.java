package RealTime;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String input = "SDETAutomation";              // Sample input
        String result = reverseVowels(input);         // Reverse vowels in the input string
        System.out.println(result); // SDEToitamotuAn  	// Print the result
    }

    public static String reverseVowels(String s) {   // Method to reverse vowels in a string
        if (s == null || s.length() < 2) return s;   // Handle edge cases

        char[] arr = s.toCharArray();                 // Convert string to character array
        int i = 0, j = arr.length - 1;                // Initialize two pointers

        while (i < j) {                              // Loop until pointers meet
            while (i < j && !isVowel(arr[i])) i++;    // Move left pointer to the next vowel
            while (i < j && !isVowel(arr[j])) j--;   // Move right pointer to the previous vowel

            // swap vowels
            if (i < j) {                           // Swap the vowels at the two pointers
                char tmp = arr[i];                 // Temporary variable for swapping
                arr[i] = arr[j];                   // Swap characters
                arr[j] = tmp;                      // Complete the swap
                i++;                               // Move pointers inward
                j--;                               // Move pointers inward
            }
        }
        return new String(arr);                     // Convert character array back to string and return
    }

    private static boolean isVowel(char c) {         // Helper method to check if a character is a vowel
        switch (c) {                                  // Check for both uppercase and lowercase vowels
            case 'a','e','i','o','u','A','E','I','O','U': return true;   // Vowel found
            default: return false;                         // Not a vowel
        }
    }
}