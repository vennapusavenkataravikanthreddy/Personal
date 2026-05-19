package RealTime;

public class TrianglePattern {

	public static void main(String[] args) {
		int num = 1;						 // Number of rows
		for (int i = 1; i <= 4; i++) {       // Outer loop for number of rows
			for(int j = 1; j <= i; j++) {    // Inner loop for printing stars in each row
				System.out.print("* ");     // Print the star
			}
			System.out.println();            // Move to the next line after each row
		}

	}
}



// Output:
// *
// * *
// * * *
// * * * *


