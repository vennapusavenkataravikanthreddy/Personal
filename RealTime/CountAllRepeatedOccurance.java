package RealTime;

public class CountAllRepeatedOccurance {
		public static void main(String[] args) {
		String str = "programming";                            // Input string
		int[] freq = new int[256]; // ASCII character set       // Frequency array to count occurrences of each character

		// Count frequency of each character
		for (char c : str.toCharArray()) {       // Convert string to char array and iterate
			freq[c]++;                           // Increment frequency count for the character
		}

		int duplicateCount = 0;                 // Counter for characters that appear more than once
		// Count characters that appear more than once
		for (int count : freq) {                // Iterate through frequency array
			if (count > 1) {                     // If character appears more than once
				duplicateCount++;                 // Increment duplicate count
			}
		}

		System.out.println("Number of duplicate characters: " + duplicateCount);
	}
}
		
// Output: Number of duplicate characters: 3
// (Characters 'r', 'g', and 'm' are repeated) 