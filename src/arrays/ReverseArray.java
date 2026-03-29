package arrays;

import java.util.Arrays;

/**
 * Teaching Example: Reverse an Array
 * 
 * Problem Statement:
 * Given an array of integers, reverse the array in place.
 * 
 * Approach (Two Pointers):
 * Use a `start` pointer at the beginning and an `end` pointer at the last index.
 * Swap the elements at `start` and `end`, then increment `start` and decrement `end`.
 * 
 * Time Complexity: O(N) - We traverse half the array.
 * Space Complexity: O(1) - Modification is done in-place.
 */
public class ReverseArray {

    public static void reverseInPlace(int[] arr) {
        if (arr == null || arr.length <= 1) return;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 62, 6, 2};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        reverseInPlace(arr);
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
