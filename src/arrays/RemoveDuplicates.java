package arrays;

import java.util.HashSet;

/**
 * Teaching Example: Remove Duplicates
 * 
 * Problem Statement:
 * Given an array of integers with duplicate elements, extract only the unique values.
 * 
 * Approach:
 * Use a HashSet. A HashSet automatically handles duplicate values by only
 * storing unique items.
 * 
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(N) to store elements in the HashSet.
 */
public class RemoveDuplicates {

    public static HashSet<Integer> getUniqueElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        return set;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 10, 2, 5, 8, 3, 0, 6, 2, 7, 97, 5, 2, 7, 4};
        
        HashSet<Integer> uniqueSet = getUniqueElements(arr);

        System.out.println("Original Array length: " + arr.length);
        System.out.println("Unique Elements: " + uniqueSet);
        System.out.println("Number of unique elements: " + uniqueSet.size());
    }
}
