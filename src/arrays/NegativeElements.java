package arrays;

/**
 * Teaching Example: Print Negative Elements
 * 
 * Problem Statement:
 * Given an array of integers, identify and print all negative numbers.
 * 
 * Approach:
 * Iterate through the array using an enhanced for-loop (for-each) and 
 * filter based on the condition n < 0.
 * 
 * Time Complexity: O(N) where N is the length of the array.
 * Space Complexity: O(1)
 */
public class NegativeElements {
    
    public static void printNegatives(int[] arr) {
        System.out.print("Negative elements: ");
        boolean found = false;
        for (int n : arr) {
            if (n < 0) {
                System.out.print(n + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, -1, -6, -8, 5, 9};
        printNegatives(arr);
    }
}
