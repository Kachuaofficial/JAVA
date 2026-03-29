package arrays;

import java.util.Arrays;

/**
 * Teaching Example: Find Unique Elements (Remove Duplicates)
 * 
 * Problem Statement:
 * Given an array of integers with duplicates, filter it to only contain unique elements.
 * 
 * Approach:
 * Use Java Streams to easily filter distinct elements.
 * 
 * Time Complexity: O(N) using Streams traversal.
 * Space Complexity: O(N) for storing the unique output array.
 */
public class Duplicates {
    
    public static void main(String[] args) {
        int[] arr = {2, 45, 1, 5, 6, 2, 6, 7};
        
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Use Streams to filter distinct elements and collect to array
        int[] unique = Arrays.stream(arr).distinct().toArray();

        System.out.println("Unique Elements: " + Arrays.toString(unique));
    }
}
