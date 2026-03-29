package array2d;

/**
 * Teaching Example: Total Sum of 2D Array (Matrix)
 * 
 * Problem Statement:
 * Given a 2D matrix, calculate the total sum of all its elements.
 * 
 * Approach:
 * Iterate through each cell of the matrix using a nested for-each loop
 * and accumulate the total sum.
 * 
 * Time Complexity: O(R * C) where R is rows and C is columns.
 * Space Complexity: O(1)
 */
public class MatrixSum {
    
    public static int getTotalSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;
        
        int sum = 0;
        for (int[] row : matrix) {
            for (int col : row) {
                sum += col;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        System.out.println("Total sum of the matrix is: " + getTotalSum(matrix));
    }
}
