package RealTime;

public class Palindrome {
    public static void main (String [] args)
    {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
       // System.out.println(str.equals(reversed));  // true
        System.out.println(reversed);  // "madam"
    }
}
// Output: true

// Explanation: The code checks if the string "madam" is a palindrome by reversing it and comparing it to the original string. Since "madam" is the same as its reverse, the output is true.