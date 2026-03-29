package arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Teaching Example: Two Sum
 * 
 * Problem Statement:
 * Given an array of integers and a target sum, return indices of the two
 * numbers such that they add up to the target. (Assume exact one solution).
 * 
 * Approach (HashMap):
 * Create a HashMap to store the `number` and its `index`. As we traverse the array,
 * for each number we check if `target - number` already exists in the map.
 * If yes, we found the pair!
 * 
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(N) for storing elements in HashMap.
 */
public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            // Check if complement is already present in hashmap
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise add current element to map
            map.put(arr[i], i);
        }

        return new int[] {-1, -1}; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] resultIndices = twoSum(arr, target);
        System.out.println("Indices of Two Sum: " + Arrays.toString(resultIndices));
    }
}
