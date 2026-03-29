package sorting;

import java.util.Arrays;

/**
 * Teaching Example: Bubble Sort
 * 
 * Problem Statement:
 * Sort an array of integers using the Bubble Sort algorithm.
 * 
 * Approach:
 * Repeatedly step through the list, compare adjacent elements and swap them if
 * they are in the wrong order. The pass through the list is repeated until the list is sorted.
 * We optimize it by adding a "swapped" flag to stop early if it's already sorted.
 * 
 * Time Complexity: O(N^2) worst/average case, O(N) best case (already sorted).
 * Space Complexity: O(1)
 */
public class BubbleSort {
    
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Last i elements are already in place
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true;
                }
            }
            
            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 5, -2, 4, 1, 3};
        
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
