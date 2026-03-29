package arrays;

/**
 * Teaching Example: Binary Search in Sorted Array
 * 
 * Problem Statement:
 * Given a sorted integer array and a target, return true if target is present, 
 * false otherwise.
 * 
 * Approach:
 * Use Binary Search. Calculate mid element, if target < mid, search left half.
 * If target > mid, search right half.
 * 
 * Time Complexity: O(log N) where N is array length.
 * Space Complexity: O(1)
 */
public class SortedArraySearch {

    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int target = 6;

        boolean isTargetPresent = binarySearch(arr, target);
        System.out.println("Is target present? " + isTargetPresent);
    }
}
