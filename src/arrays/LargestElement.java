package arrays;

/**
 * Teaching Example: Find Largest Element
 * 
 * Problem Statement:
 * Given an array of integers, find the maximum (largest) element.
 * 
 * Approach:
 * Iterate through the array, keeping track of the maximum element seen so far.
 * 
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1) as no extra space is needed.
 */
public class LargestElement {

    /**
     * Finds the largest element in the given array.
     * 
     * @param arr the input array
     * @return the maximum value
     */
    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null");
        }

        int maxElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 45, 2, 99, 34, 12 };
        System.out.println("The largest element is: " + findLargest(arr));
    }
}
