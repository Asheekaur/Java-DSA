/*
💡 **Question 8**

Given two [sparse matrices](https://en.wikipedia.org/wiki/Sparse_matrix) mat1 of size m x k and mat2 of size k x n, return the result of mat1 x mat2. You may assume that multiplication is always possible.

*/

package Java_DSA.Array.Assignment6;
public class SparseMatrixMultiplication {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        int[][] result = new int[m][n];

        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    result[i][j] += mat1[i][l] * mat2[l][j];
                }
            }
        }

        return result;
    }
}
