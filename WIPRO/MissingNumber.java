package WIPRO;
import java.util.Arrays;

public class MissingNumber {
    int missingNumber(int arr[]) {
        Arrays.sort(arr); // Sort the input array
        int count = 1; // Start checking from 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != count) {
                return count; // Return the missing number
            }
            count++; // Increment count for the next expected number
        }
        // If no missing number is found within the array, 
        // the missing number is the next consecutive integer after the last element
        return arr.length + 1;
    }
}
