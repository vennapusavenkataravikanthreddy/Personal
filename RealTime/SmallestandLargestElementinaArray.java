package RealTime;

public class SmallestandLargestElementinaArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, -8, 55, 3};                             // Sample array

        int smallest = arr[0];                                           // Initialize smallest with the first element
        int largest = arr[0];                                         // Initialize largest with the first element

        for (int i = 1; i < arr.length; i++) {                     // start at 1, since 0 is already used
            if (arr[i] > largest) {                               // Check for largest
                largest = arr[i];                                   // Update largest if current element is greater
            } else if (arr[i] < smallest) {       // Check for smallest
                smallest = arr[i];             // Update smallest if current element is smaller
            }
        }

        System.out.println("Smallest element is: " + smallest);  // Print smallest element
        System.out.println("Largest element is: " + largest);    // Print largest element
    }
}

// Output:
// Smallest element is: -8
// Largest element is: 55