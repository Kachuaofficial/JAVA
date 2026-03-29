package arrays;

import java.util.Arrays;

/**
 * Teaching Example: Rotate Array
 * 
 * Problem Statement:
 * Given an array, rotate the array to the right by k steps.
 * 
 * Approach (Reversal Algorithm):
 * 1. Reverse the first part of the array.
 * 2. Reverse the second part of the array.
 * 3. Reverse the entire array.
 * 
 * Time Complexity: O(N) where N is array length.
 * Space Complexity: O(1) rotation is done in-place.
 */
public class RotateArray {

    /**
     * Helper method to reverse a portion of the array.
     */
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    /**
     * Rotates array to the left by k positions.
     * Note: The original code implements a variation of a left rotate.
     */
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;
        
        k = k % n; // Limit k to array bounds
        
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 9, 2, 6, 4};
        int rotationAmt = 20;

        System.out.println("Original Array: " + Arrays.toString(arr));
        
        leftRotate(arr, rotationAmt);
        
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
