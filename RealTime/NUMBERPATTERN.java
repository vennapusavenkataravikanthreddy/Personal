package RealTime;

public class NUMBERPATTERN {

	public static void main(String[] args) {
		int num = 1;                         // Number of rows
		for (int i = 1; i <= 4; i++) {       // Outer loop for number of rows
			for(int j = 1; j <= i; j++) {    // Inner loop for printing numbers in each row
				System.out.print(num+ " ");  // Print the current number
				num++;                       // Increment the number for the next position
			}
			System.out.println();            // Move to the next line after each row
		}

	}

} 
// Output:
// 1
// 2 3
// 4 5 6
// 7 8 9 10


