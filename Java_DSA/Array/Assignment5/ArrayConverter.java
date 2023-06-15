/*

💡 **Question 1**

Convert 1D Array Into 2D Array

You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.

The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.

Return *an* m x n *2D array constructed according to the above procedure, or an empty 2D array if it is impossible*.

**Example 1:**

**Input:** original = [1,2,3,4], m = 2, n = 2

**Output:** [[1,2],[3,4]]

**Explanation:** The constructed 2D array should contain 2 rows and 2 columns.

The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.

The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.


 */

package Java_DSA.Array.Assignment5;

public class ArrayConverter {
    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        
        if (original.length != m * n) {
            return new int[0][0]; // Return empty 2D array if the conversion is impossible
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index = i * n + j;
                result[i][j] = original[index];
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6}; // Example 1D array
        int m = 2; // Number of rows
        int n = 3; // Number of columns

        int[][] result = convertTo2DArray(original, m, n);
        
        // Print the resulting 2D array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
