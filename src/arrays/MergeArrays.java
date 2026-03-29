package arrays;

import java.util.Arrays;

/**
 * Teaching Example: Merge Two Sorted Arrays
 * 
 * Problem Statement:
 * Given two sorted integer arrays, merge them into a single sorted array.
 * 
 * Approach:
 * Use the Two Pointers technique. Maintain one pointer for each array, pick
 * the smaller element, and put it in a new merged array.
 * 
 * Time Complexity: O(N + M) where N and M are lengths of the two arrays.
 * Space Complexity: O(N + M) to store the merged elements.
 */
public class MergeArrays {
    
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0; // Pointer for arr1
        int j = 0; // Pointer for arr2
        int k = 0; // Pointer for merged array

        // Traverse both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Store remaining elements of arr1
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Store remaining elements of arr2
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {6, 8, 9, 20};

        int[] mergedResult = mergeSortedArrays(arr1, arr2);
        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Merged Array: " + Arrays.toString(mergedResult));
    }
}
