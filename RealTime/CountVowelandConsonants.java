package RealTime;

public class CountVowelandConsonants {
    public static void main(String[] args) {
    
    	        String str = "Interview Prep";    //

    	        int vowels = 0, consonants = 0; // counters for vowels and consonants

    	        str = str.toLowerCase();  // convert to lowercase for easy comparison

    	        for (char c : str.toCharArray()) {   // iterate through each character in the string
    	            if (c >= 'a' && c <= 'z') {   // check only alphabets
    	                if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {  // check if the character is a vowel
    	                    vowels++; // increment vowel count
    	                } else {      // if it's not a vowel, it must be a consonant
    	                    consonants++;  // increment consonant count
    	                }
    	            }
    	        }

    	        System.out.println("Vowels: " + vowels);       // print the number of vowels
    	        System.out.println("Consonants: " + consonants); // print the number of consonants
    	    }
    	}
 //OUTPUT:


 //Vowels=5, Consonants=8


/*class Main {
    public static void main(String[] args) {
        String str = "Ravikanth";
        int vowels = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
    }
}*/

// Output: Vowels: 3
