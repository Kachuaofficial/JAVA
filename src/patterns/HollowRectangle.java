package patterns;

/**
 * Teaching Example: Print a Hollow Rectangle
 * 
 * Problem Statement:
 * Given Rows and Columns, print a hollow rectangle made of stars.
 * 
 * Approach:
 * Use nested loops. Print '*' only if we are at the first row, last row,
 * first column, or last column. Otherwise, print space.
 * 
 * Time Complexity: O(R * C)
 * Space Complexity: O(1)
 */
public class HollowRectangle {
    
    public static void printHollowRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        
        System.out.println("Hollow Rectangle of " + rows + "x" + cols + ":");
        printHollowRectangle(rows, cols);
    }
}
