package RealTime;

public class Day1Task3 {

    // Method to check for vowels in a string
    public static void checkVowels(String input) throws Exception {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new Exception("String does not contain any vowels.");
        }
        System.out.println("String contains vowels.");
    }

    public static void main(String[] args) {
        String test = "Hello"; // You can change this value for testing
        try {
            checkVowels(test);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}