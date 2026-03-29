package arrays;

import java.util.Arrays;

/**
 * Teaching Example: Squares of a Sorted Array
 * 
 * Problem Statement:
 * Given an integer array sorted in non-decreasing order, return an array of 
 * the squares of each number sorted in non-decreasing order.
 * 
 * Approach (Two Pointers):
 * Since the array is sorted, the absolute largest numbers will be at either 
 * the ends (large negatives or large positives). We use two pointers strategy 
 * at both ends and construct the result array from back to front.
 * 
 * Time Complexity: O(N) where N is array length.
 * Space Complexity: O(N) for storing the result.
 */
public class SquareSortedArray {

    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        
        int left = 0;
        int right = n - 1;
        int idx = n - 1; // Start filling result from the end
        
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            
            if (leftSquare > rightSquare) {
                result[idx] = leftSquare;
                left++;
            } else {
                result[idx] = rightSquare;
                right--;
            }
            idx--;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-6, -2, 1, 4, 6, 8};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        int[] squaredArray = sortedSquares(arr);
        System.out.println("Squared Sorted Array: " + Arrays.toString(squaredArray));
    }
}
