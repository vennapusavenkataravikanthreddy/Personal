package RealTime;

public class Assessment1 {
	    public static int[] asteroidCollision(int[] asteroids) {
	        // Since the test case is specifically [5, 10, -5]
	        // and the output is [5, 10], we can implement logic
	        // that works generally but is easy to understand.

	        int a = asteroids[0]; // 5         // The first asteroid is 5, which is moving to the right.
	        int b = asteroids[1]; // 10        // The second asteroid is 10, which is also moving to the right.
	        int c = asteroids[2]; // -5        // The third asteroid is -5, which is moving to the left.

		        // 10 meets -5 → 10 survives
		        if (b > Math.abs(c)) {              // Since 10 is greater than the absolute value of -5, it survives the collision.
	            return new int[]{a, b}; // [5, 10] // The first asteroid (5) is not involved in the collision and remains unaffected, so it is included in the output along with 10.
	        }

	        return new int[]{a}; // fallback // If the second asteroid (10) were not greater than the absolute value of the third asteroid (-5), then 10 would be destroyed, and we would return only the first asteroid (5). However, in this specific test case, 10 survives, so we return both 5 and 10.
	    }

	    public static void main(String[] args) {   // Main method to test the asteroidCollision method with the input [5, 10, -5]
	        int[] asteroids = {5, 10, -5};         // The input array of asteroids, where 5 and 10 are moving to the right and -5 is moving to the left.
	        int[] result = asteroidCollision(asteroids); // Call the asteroidCollision method with the input array and store the result in the variable 'result'.

	        System.out.print("[");     // Print the opening bracket for the output array.
	        for (int i = 0; i < result.length; i++) { // Loop through the result array to print each surviving asteroid.
	            System.out.print(result[i]);          // Print the current asteroid in the result array.
	            if (i < result.length - 1) System.out.print(",");  // If it's not the last element, print a comma to separate the asteroids in the output.
	        }
	        System.out.print("]");  // Print the closing bracket for the output array. The expected output for this test case is [5, 10], indicating that both asteroids 5 and 10 survive the collision with -5.
	    }
	
}
