package RealTime;

public class ReversedNumber {
	    public static void main(String[] args) {
	        int num = 12345;                                     // Number to be reversed
	        int reversed = 0;                                   // Variable to store the reversed number

	        while (num != 0) {                                   // Loop until all digits are processed
	            reversed = reversed * 10 + num % 10;             // Append the last digit of num to reversed
	            num /= 10;                                        // Remove the last digit from num
	        }

	        System.out.println(reversed); // 54321                 // Print the reversed number
	    }
	}


// Output: 54321

// Explanation: The code takes an integer number (12345) and reverses it by repeatedly extracting the last digit and building the reversed number. The process continues until all digits have been processed, resulting in the reversed number (54321).


//using StringBuilder to reverse the number as a string
/*class Main {
    public static void main(String[] args) {
        int num = 12345;
        String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
        System.out.println(reversed);
    }
}*/

// Output: 54321
// Explanation: This code converts the integer number (12345) to a string, reverses it using StringBuilder, and then converts it back to a string. The output is the reversed number (54321).