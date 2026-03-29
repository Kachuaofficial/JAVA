package array2d;

/**
 * Teaching Example: Row Sum in 2D Array
 * 
 * Problem Statement:
 * Given a 2D matrix, calculate and print the sum of elements corresponding to each row.
 * 
 * Approach:
 * Iterate through each row index (outer loop), and then sum up all elements in 
 * that specific row (inner loop) to compute the row-wise sum.
 * 
 * Time Complexity: O(R * C) where R is rows and C is columns.
 * Space Complexity: O(1)
 */
public class RowSum {
    
    public static void printRowSums(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of row " + i + ": " + rowSum);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        System.out.println("Processing Row Sums:");
        printRowSums(matrix);
    }
}
