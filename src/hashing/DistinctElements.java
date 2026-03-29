package hashing;

import java.util.HashSet;

/**
 * Teaching Example: Find Number of Distinct Elements
 * 
 * Problem Statement:
 * Given an integer array, find the total number of distinct/unique elements.
 * 
 * Approach:
 * Add all elements to a HashSet. Since HashSet does not permit duplicates,
 * the final size of the HashSet will represent the number of distinct elements.
 * 
 * Time Complexity: O(N) because we iterate the array once.
 * Space Complexity: O(N) because the HashSet stores unique elements.
 */
public class DistinctElements {
    
    public static int getDistinctCount(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {4, 67, 1, 7, 4, 2};
        
        System.out.println("Original array has " + arr.length + " elements.");
        System.out.println("Number of distinct elements: " + getDistinctCount(arr));
    }
}
