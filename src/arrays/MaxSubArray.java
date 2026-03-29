package arrays;

/**
 * Teaching Example: Maximum Subarray Sum (Kadane's Algorithm)
 * 
 * Problem Statement:
 * Given an integer array, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * 
 * Approach (Kadane's Algorithm):
 * Keep track of current sum. If current sum drops below zero, reset it to zero.
 * Always keep updating the maximum sum encountered so far.
 * 
 * Time Complexity: O(N) where N is the length of array.
 * Space Complexity: O(1)
 */
public class MaxSubArray {
    
    public static int maxSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int maxSum = arr[0];
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            
            // Update max sum if current sum is larger
            maxSum = Math.max(currentSum, maxSum);
            
            // Reset current sum if it drops below zero
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, 5, -6, 2};
        
        System.out.println("Maximum contiguous subarray sum is: " + maxSubArraySum(arr));
    }
}
