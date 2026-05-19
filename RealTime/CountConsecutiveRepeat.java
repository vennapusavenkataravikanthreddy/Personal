package RealTime;

public class CountConsecutiveRepeat {


			 public static void main(String[] args) {
	        String s = "aaaabbbcca";
	        StringBuilder result = new StringBuilder();  // StringBuilder to build the result string efficiently
	        int count =1;                                // Initialize count to 1 for the first character
	        
	        for(int i=0;i<s.length();i++){                 // Iterate through each character in the string
	            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){  // Check if the current character is the same as the next one
	                count++;                                  // If they are the same, increment the count
	            }else{                                      // If the current character is different from the next one, append the character and its count to the result
	                result.append(s.charAt(i)).append(count); // Append the character and its count to the result
	                count=1;                                       // Reset count to 1 for the next character
	            }
	        }
	        System.out.println(result.toString());                    //
	    }
	}

//OUTPut:a4b3c2a1