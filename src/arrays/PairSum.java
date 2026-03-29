package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Teaching Example: Pair Sum in Sorted Array (Two Sum II)
 * 
 * Problem Statement:
 * Given a 1-indexed array of integers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * 
 * Approach: Two Pointers
 * Since the array is sorted, we can use a left pointer and a right pointer.
 * If the sum is less than target, we increment left pointer (to increase sum).
 * If the sum is greater than target, we decrement right pointer (to decrease sum).
 * 
 * Time Complexity: O(N) - We scan the array at most once.
 * Space Complexity: O(1) - Only two pointers are used (excluding the result storage).
 */
public class PairSum {

    public static List<Integer> findPairSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int currentSum = nums[start] + nums[end];
            
            if (currentSum == target) {
                ans.add(nums[start]);
                ans.add(nums[end]);
                return ans;
            } else if (currentSum > target) {
                end--; // We need a smaller sum
            } else {
                start++; // We need a larger sum
            }
        }

        return ans; // Empty if no pair found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        
        List<Integer> result = findPairSum(arr, target);
        System.out.println("Pair with sum " + target + ": " + result);
    }
}
