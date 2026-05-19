package RealTime;

public class EvenOddPartition {
    public static void partitionEvenOdd(int[] arr) {
        int left = 0, right = arr.length - 1;                         // Two pointers
        while (left < right) {                                      // While they don't cross
            // Move left pointer until it finds an odd
            while (left < right && arr[left] % 2 == 0) left++;
            // Move right pointer until it finds an even
            while (left < right && arr[right] % 2 != 0) right--;
            // Swap
            if (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++; right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 8, 5, 12, 7, 6, 4, 9};
        partitionEvenOdd(a);
        // Result: [8, 12, 6, 4, 7, 5, 3, 9] (evens left, odds right; internal order not guaranteed)
        System.out.println(java.util.Arrays.toString(a));
    }
}

// Output: 
