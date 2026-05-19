package RealTime;

public class PyramidPattern {             
                                                           // Pyramid and Diamond Pattern are same in this context i.e 
	                                                       // diamond pattern is just two pyramids joined together
	public static void main(String[] args) {
        int n = 5; // Number of rows for the upper half of the diamond

        // Upper pyramid
        for (int i = 1; i <= n; i++) {                       // Outer loop for number of rows
            System.out.print(" ".repeat(n - i));             // Print leading spaces
            System.out.println("*".repeat(2 * i - 1));        // Print stars
        }

        // Lower pyramid
        for (int i = n - 1; i >= 1; i--) {                    // Outer loop for number of rows
            System.out.print(" ".repeat(n - i));              // Print leading spaces
            System.out.println("*".repeat(2 * i - 1));         // Print stars
        }
    }
}
// Output:
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *