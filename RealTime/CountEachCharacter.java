package RealTime;

public class CountEachCharacter {

    // Method to count each character in a sentence
    /**
     * @param sentence
     */
    public static void countCharacters(String sentence) {
        int[] freq = new int[256];                     // For ASCII characters        
        for (char c : sentence.toCharArray()) {       // Convert string to char array and iterate
            if (c == ' ') continue;                   // Ignore spaces  
            freq[c]++;                                 // Increment frequency count for the character
        }
        System.out.println("Character counts:");       // Print header
        for (int i = 0; i < freq.length; i++) {         // Iterate through frequency array
            if (freq[i] > 0) {                           // If character occurred
                System.out.println((char)i + ": " + freq[i]);  // Print character and its count
            }
        }
    }

    public static void main(String[] args) {         // Main method to test countCharacters function
        String sentence = "Hello World";           // Sample input sentence
        countCharacters(sentence);                   // Call method to count characters
    }

}

// Output:Character counts:
//H: 1
//W: 1
//d: 1
//e: 1
//l: 3
//o: 2
//r: 1
