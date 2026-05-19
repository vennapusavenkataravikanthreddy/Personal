package RealTime;

public class Assesment4 {
	public class Solution {

	    public static int[] asteroidCollision(int[] asteroids) {
	        // Use a plain array as a stack
	        int[] stack = new int[asteroids.length];
	        int top = -1; // empty stack

	        for (int a : asteroids) {
	            boolean destroyed = false;

	            // Only collide when top > 0 (right) and a < 0 (left)
	            while (top >= 0 && stack[top] > 0 && a < 0) {
	                int topAst = stack[top];

	                if (topAst < -a) {
	                    // Top asteroid explodes; continue checking with previous ones
	                    top--;
	                } else if (topAst == -a) {
	                    // Both explode
	                    top--;
	                    destroyed = true;
	                    break;
	                } else {
	                    // Current asteroid explodes
	                    destroyed = true;
	                    break;
	                }
	            }

	            if (!destroyed) {
	                // Push current asteroid to stack
	                stack[++top] = a;
	            }
	        }

	        // Copy survivors into result array
	        int[] result = new int[top + 1];
	        for (int i = 0; i <= top; i++) {
	            result[i] = stack[i];
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int[] asteroids = {3, 5, -6, 2, -1, 4};
	        int[] result = asteroidCollision(asteroids);

	        System.out.print("[");
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i]);
	            if (i < result.length - 1) System.out.print(",");
	        }
	        System.out.print("]");
	    }
	}

}
