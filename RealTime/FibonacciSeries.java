package RealTime;

public class FibonacciSeries {
		public static void main(String[] args) {
		int n = 10;                                           // Number of terms in the Fibonacci series
		int a = 0, b = 1;                                     // First two terms

		System.out.print("Fibonacci Series: " + a + " " + b + " ");

		for (int i = 2; i < n; i++) {
			int next = a + b;                                 // Next term is the sum of the previous two terms
			System.out.print(next + " ");
			a = b;                                            // Update a to the next term
			b = next;                                         // Update b to the next term
		}
	}

}

// Output: 0 1 1 2 3 5 8 13 21 34 