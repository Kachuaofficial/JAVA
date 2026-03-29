package array2d;

/**
 * Teaching Example: Column Sum in 2D Array
 * 
 * Problem Statement:
 * Given a 2D matrix, calculate and print the sum of elements corresponding to each column.
 * 
 * Approach:
 * Iterate through each column index first (outer loop), and then iterate through 
 * each row index (inner loop) to compute the column-wise sum.
 * 
 * Time Complexity: O(R * C) where R is rows and C is columns.
 * Space Complexity: O(1)
 */
public class ColumnSum {
    
    public static void printColumnSums(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {
            int colSum = 0;
            for (int row = 0; row < rows; row++) {
                colSum += matrix[row][col];
            }
            System.out.println("Sum of column " + col + ": " + colSum);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        System.out.println("Processing Column Sums:");
        printColumnSums(matrix);
    }
}
