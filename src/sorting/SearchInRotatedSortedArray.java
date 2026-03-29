package sorting;

/**
 * Teaching Example: Search in Rotated Sorted Array
 * 
 * Problem Statement:
 * Given a sorted array that has been rotated at some unknown pivot, and a target value,
 * return the index of the target if found, otherwise return -1.
 * 
 * Approach (Binary Search):
 * Modified binary search. In every step, one half of the array will always be sorted.
 * We find out which half is sorted, and check if the target lies within that sorted half.
 * 
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */
public class SearchInRotatedSortedArray {
    
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } 
            // Otherwise, right half must be sorted
            else {
                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println("Target " + target + " found at index: " + search(rotatedArray, target));
    }
}
