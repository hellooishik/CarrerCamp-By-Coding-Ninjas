/*
 * Reset Matrix
 * 
 * 
Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0. Do it in place.
Note : You don't need to print the matrix. Just change in the given input.

Input format :

Line 1 : No. of rows & No. of columns (separated by space)

Line 2 : Row 1 elements (separated by space)

Line 3 : Row 2 elements (separated by space)

Line 4 : and so on

Sample Input 1 :
3 3
1 0 1
1 1 1 
1 1 1

Sample Output 1 :
0 0 0
1 0 1
1 0 1
 */
// **************************************Code**********************************
import java.util.Scanner;
public class solution {
	public static void makeRowsCols0(int [][]input) {
		// Write your code here
		int m =input.length;
        int n = input[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row contains any zero
        for (int j = 0; j < n; j++) {
            if (input[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column contains any zero
        for (int i = 0; i < m; i++) {
            if (input[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use the first row and first column to mark the zero positions
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (input[i][j] == 0) {
                    input[0][j] = 0; // Mark the column as zero
                    input[i][0] = 0; // Mark the row as zero
                }
            }
        }

        // Set the rows to zero
        for (int i = 1; i < m; i++) {
            if (input[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    input[i][j] = 0;
                }
            }
        }

        // Set the columns to zero
        for (int j = 1; j < n; j++) {
            if (input[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    input[i][j] = 0;
                }
            }
        }

        // Set the first row to zero if necessary
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                input[0][j] = 0;
            }
        }

        // Set the first column to zero if necessary
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                input[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the dimensions of the matrix
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Create the matrix
        int[][] input = new int[m][n];

        // Read the matrix elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        // Call the setZeroes function
        makeRowsCols0(input);

        // Print the modified matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }
}
