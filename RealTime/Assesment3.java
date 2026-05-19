package RealTime;

public class Assesment3 {

	    public static int[] asteroidCollision(int[] asteroids) { // This method simulates the collision of asteroids based on their sizes and directions. Positive values represent asteroids moving to the right, while negative values represent asteroids moving to the left. The method returns an array of surviving asteroids after all collisions have been resolved.

	        // Simple manual stack using array
	        int[] stack = new int[asteroids.length];// Create an array to be used as a stack to keep track of the surviving asteroids during the collision process. The size of the stack is the same as the input array, which ensures that it can hold all asteroids if necessary.
	        int top = -1;  // stack is empty  // Initialize a variable 'top' to keep track of the top index of the stack. Initially, it is set to -1, indicating that the stack is empty.

	        for (int a : asteroids) {  // Iterate through each asteroid in the input array 'asteroids'. The variable 'a' represents the current asteroid being processed in the loop.

	            boolean destroyed = false; // A flag to indicate if the current asteroid 'a' has been destroyed during the collision process. It is initialized to false at the beginning of each iteration.

	            // Collision happens only if:
	            //   top element > 0 (right) AND current < 0 (left)
	            while (top >= 0 && stack[top] > 0 && a < 0) {   // This while loop checks for collisions between the current asteroid 'a' and the top asteroid on the stack. A collision occurs only if the top asteroid is moving to the right (positive value) and the current asteroid is moving to the left (negative value). The loop continues as long as there are asteroids on the stack, the top asteroid is moving to the right, and the current asteroid is moving to the left.

	                if (stack[top] < -a) {   // If the size of the top asteroid (stack[top]) is smaller than the absolute value of the current asteroid (-a), it means that the top asteroid will be destroyed in the collision. In this case, we decrement 'top' to remove the top asteroid from the stack and continue checking for collisions with the next asteroid on the stack.
	                    // Top asteroid is smaller → explode
	                    top--;  // Remove the top asteroid from the stack as it is destroyed in the collision.
	                } 
	                else if (stack[top] == -a) {   // If the size of the top asteroid is equal to the absolute value of the current asteroid, it means that both asteroids will be destroyed in the collision. In this case, we decrement 'top' to remove the top asteroid from the stack and set the 'destroyed' flag to true to indicate that the current asteroid is also destroyed. We then break out of the loop since both asteroids are destroyed.
	                    // Equal size → both explode
	                    top--;   // Remove the top asteroid from the stack as it is destroyed in the collision.
	                    destroyed = true;   // Set the 'destroyed' flag to true to indicate that the current asteroid is also destroyed in the collision.
	                    break;             // Break out of the loop since both asteroids are destroyed and there is no need to check for further collisions with the current asteroid.
	                } 
	                else {    //	
	                    // Current asteroid is smaller → explode
	                    destroyed = true;    // If the size of the top asteroid is greater than the absolute value of the current asteroid, it means that the current asteroid will be destroyed in the collision. In this case, we set the 'destroyed' flag to true to indicate that the current asteroid is destroyed and break out of the loop since there is no need to check for further collisions with the current asteroid.
	                    break;  // Break out of the loop since the current asteroid is destroyed and there is no need to check for further collisions with the current asteroid.
	                }
	            }

	            if (!destroyed) {
	                // Push into stack
	                stack[++top] = a;
	            }
	        }

	        // Prepare output array
	        int[] result = new int[top + 1];
	        for (int i = 0; i <= top; i++) {
	            result[i] = stack[i];
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[] asteroids = {10, 2, -5};
	        int[] result = asteroidCollision(asteroids);

	        // Print result nicely
	        System.out.print("[");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]);
	            if (i < result.length - 1) System.out.print(",");
	        }
	        System.out.print("]");
	    }
	}


