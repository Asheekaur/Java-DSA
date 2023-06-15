/*
💡 **Question 7**

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

 */

package Java_DSA.Array.Assignment6;

import java.util.Arrays;

public class SpiralMatrix {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int num = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (num <= n * n) {
            // Traverse right
            for (int i = colStart; i <= colEnd; i++) {
                matrix[rowStart][i] = num++;
            }
            rowStart++;

            // Traverse down
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;

            // Traverse left
            for (int i = colEnd; i >= colStart; i--) {
                matrix[rowEnd][i] = num++;
            }
            rowEnd--;

            // Traverse up
            for (int i = rowEnd; i >= rowStart; i--) {
                matrix[i][colStart] = num++;
            }
            colStart++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        SpiralMatrix solution = new SpiralMatrix();
        int n = 3;
        int[][] matrix = solution.generateMatrix(n);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
