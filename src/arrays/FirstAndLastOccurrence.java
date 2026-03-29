package arrays;

/**
 * Teaching Example: First and Last Occurrence in a Sorted Array
 * 
 * Problem Statement:
 * Given a sorted array, find the first and last position of a given target value.
 * Return -1 if not found.
 * 
 * Approach (Optimized):
 * Since the array is sorted, we can use Binary Search.
 * - One Binary Search to find the first occurrence (continue searching left when found).
 * - One Binary Search to find the last occurrence (continue searching right when found).
 * 
 * Time Complexity: O(log N) - binary search
 * Space Complexity: O(1) - no extra space used
 */
public class FirstAndLastOccurrence {

    /**
     * Finds the first occurrence of target using Binary Search
     */
    public static int findFirstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1; // Look for earlier occurrences on the left
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    /**
     * Finds the last occurrence of target using Binary Search
     */
    public static int findLastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1; // Look for later occurrences on the right
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 3, 4 };
        int target = 2;
        
        System.out.println("First occurrence of " + target + " is at index: " + findFirstOccurrence(arr, target));
        System.out.println("Last occurrence of " + target + " is at index: " + findLastOccurrence(arr, target));
    }
}
