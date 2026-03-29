package recursion;

import java.util.Arrays;

/**
 * Teaching Example: Reverse an Array using Recursion
 * 
 * Problem Statement:
 * Given an array, reverse it in-place using a recursive function.
 * 
 * Approach:
 * Swap the elements at `start` and `end`, then make a recursive call with `start+1` and `end-1`.
 * Base case is `start >= end`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N) for recursive call stack
 */
public class ReverseArray {

    public static void reverse(int[] arr, int start, int end) {
        // Base case: when pointers cross or meet, we are done
        if (start >= end) {
            return;
        }

        // Swap the elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call for the inner remaining array
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 2, 9, 5};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        reverse(arr, 0, arr.length - 1);
        
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
