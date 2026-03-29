package arrays;

import java.util.Arrays;

/**
 * Teaching Example: K-Diff Pairs in an Array
 * 
 * Problem Statement:
 * Given an array of integers and an integer k, return the number of unique k-diff pairs.
 * A k-diff pair is defined as an integer pair (nums[i], nums[j]) where i ! j and |nums[i] - nums[j]| == k.
 * 
 * Approach (Two Pointers):
 * Sort the array. Use two pointers, `low` and `high`.
 * Calculate difference. If diff == k, we found a pair (increment both and avoid duplicates).
 * If diff < k, increment high. If diff > k, increment low.
 * 
 * Time Complexity: O(N log N) dominated by sorting.
 * Space Complexity: O(1) or O(N) depending on sorting algorithm.
 */
public class KDiffPairs {

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int low = 0;
        int high = 1;
        int sum = Integer.MIN_VALUE;

        while (high < nums.length && low < nums.length - 1) {
            if (low == high) {
                high++; // Pointers cannot be the same
                continue;
            }

            int diff = nums[high] - nums[low];
            
            if (diff == k && nums[high] + nums[low] != sum) {
                sum = nums[high] + nums[low];
                count++;
                low++;
                high++;
            } else if (diff < k) {
                high++;
            } else {
                low++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5};
        int k = 2;

        System.out.println("Number of " + k + "-diff pairs is: " + findPairs(arr, k));
    }
}
