package arrays;

/**
 * Teaching Example: Find Maximum Element
 * 
 * Problem Statement:
 * Given an integer array, find the maximum element present in it.
 * 
 * Approach:
 * Initialize the max value with Integer.MIN_VALUE, then iterate through
 * the array and update the max value whenever a larger element is found.
 * 
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1) as we use only one tracking variable.
 */
public class MaxElement {
    
    public static int maxNumber(int[] num) {
        if (num == null || num.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = Integer.MIN_VALUE;
        for (int n : num) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, -1, -6, -8, 5, 9};
        System.out.println("Maximum element is: " + maxNumber(arr));
    }
}
