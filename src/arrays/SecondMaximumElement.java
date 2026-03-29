package arrays;

/**
 * Teaching Example: Second Maximum Element
 * 
 * Problem Statement:
 * Given a one-dimensional array of integers, find the second largest element.
 * 
 * Approach:
 * Keep two variables: `max` and `secondMax`. Traverse the array, and whenever we
 * find a number greater than `max`, we update `secondMax` to `max` and `max` to the 
 * new number. If a number is between `secondMax` and `max`, we update `secondMax`.
 * 
 * Time Complexity: O(N) since we traverse the array only once.
 * Space Complexity: O(1)
 */
public class SecondMaximumElement {
    
    public static int findSecondMax(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int max = Integer.MIN_VALUE;
        // Depending on requirements, Integer.MIN_VALUE or initial array value
        int secondMax = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax && n != max) {
                secondMax = n;
            }
        }
        
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, -1, -6, -8, 5, 9};
        
        int secondMax = findSecondMax(arr);
        System.out.println("The second maximum element is: " + secondMax);
    }
}
