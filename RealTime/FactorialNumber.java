package RealTime;

public class FactorialNumber {
		public static void main(String[] args) {
		int num = 5;                                          // Number to calculate factorial
		int factorial = 1;                                   // Variable to store the factorial result

		for (int i = 1; i <= num; i++) {                      // Loop from 1 to num
			factorial *= i;                                    // Multiply factorial by the current number
		}

		System.out.println("Factorial of " + num + " is: " + factorial); // Print the factorial result
	}

}
 //Output:Factorial of 5 is: 120
