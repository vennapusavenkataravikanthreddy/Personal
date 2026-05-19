package RealTime;

public class ReverseStringwithStringBuilder {


	    public static void main(String[] args) {
	        String input = "Ravi kanth Reddy";

	        // Split the string into words using one or more spaces
	        String[] words = input.split("\\s+");

	        StringBuilder result = new StringBuilder();

	        // Reverse each word using StringBuilder reverse()
	        for (int i = 0; i < words.length; i++) {
	            String reversedWord = new StringBuilder(words[i]).reverse().toString();
	            result.append(reversedWord);

	            // Add space between words (not after last word)
	            if (i < words.length - 1) {
	                result.append(" ");
	            }
	        }

	        System.out.println(result.toString());  // ivaR htnaK yddeR
	    }
	}
