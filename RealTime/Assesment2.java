package RealTime;
import java.util.*;
public class Assesment2 {
	    public int[] asteroidCollision(int[] asteroids) {
	        Deque<Integer> stack = new ArrayDeque<>();

	        for (int a : asteroids) {
	            while (!stack.isEmpty() && a < 0 && stack.peekLast() > 0) {
	                int top = stack.peekLast();

	                if (top < -a) {         // top is smaller → top explodes
	                    stack.pollLast();
	                    continue;
	                }

	                if (top == -a) {        // equal → both explode
	                    stack.pollLast();
	                }

	                a = 0;                  // current asteroid also destroyed
	                break;
	            }

	            if (a != 0) stack.addLast(a); // survivor goes to stack
	        }

	        // Convert to array
	        int[] result = new int[stack.size()];
	        int i = 0;
	        for (int v : stack) result[i++] = v;
	        return result;
	    }

	    public static void main(String[] args) {
	        Assesment2 s = new Assesment2();
	        System.out.println(Arrays.toString(s.asteroidCollision(new int[]{8, -8})));
	    }
	}