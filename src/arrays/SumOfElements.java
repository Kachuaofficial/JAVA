package arrays;

/**
 * Teaching Example: Sum of Elements
 * 
 * Problem Statement:
 * Given an integer array, calculate the sum of all its elements.
 * 
 * Approach:
 * Iterate over all elements using a for-each loop and accumulate the sum.
 * 
 * Time Complexity: O(N) where N is the number of elements.
 * Space Complexity: O(1)
 */
public class SumOfElements {
    
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 6, 8, 3};
        
        System.out.println("Sum of array elements is: " + getSum(arr));
    }
}
