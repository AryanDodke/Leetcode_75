package WIPRO;

import java.util.ArrayList;

public class IndexOfSubArray {

    // Method to find subarray with the given sum
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>(); // To store the start and end indices of the subarray
        int currentSum = 0; // To keep track of the current sum
        int start = 0; // Starting index of the subarray

        // Iterate through the array
        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end]; // Add the current element to the sum

            // If the current sum exceeds the target, move the start pointer forward
            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // If the current sum matches the target, add the indices to the result
            if (currentSum == target) {
                result.add(start + 1); // Adding 1 to convert to 1-based indexing
                result.add(end + 1);   // Adding 1 to convert to 1-based indexing
                return result;
            }
        }

        // If no subarray is found, return an empty list
        result.add(-1);
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);

        if (result.get(0) == -1) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarray found from index " + result.get(0) + " to " + result.get(1));
        }
    }
}