/*
💡 **Question 1**

A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

- s[i] == 'I' if perm[i] < perm[i + 1], and
- s[i] == 'D' if perm[i] > perm[i + 1].

Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return **any of them**.

**Example 1:**

**Input:** s = "IDID"

**Output:**

[0,4,1,3,2]

 */

package Java_DSA.Array.Assignment6;
import java.util.ArrayList;
import java.util.List;

public class PermutationReconstruction {
    public int[] findPermutation(String s) {
        int n = s.length();
        int[] perm = new int[n + 1];

        // Initialize the permutation array with consecutive numbers
        for (int i = 0; i <= n; i++) {
            perm[i] = i;
        }

        // Reconstruct the permutation based on the string
        int i = 0;
        while (i < n) {
            int j = i;
            while (i < n && s.charAt(i) == 'D') {
                i++;
            }
            reverse(perm, j, i);
            i++;
        }

        return perm;
    }

    private void reverse(int[] perm, int start, int end) {
        while (start < end) {
            int temp = perm[start];
            perm[start] = perm[end];
            perm[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        PermutationReconstruction solution = new PermutationReconstruction();
        String s = "IDID";
        int[] perm = solution.findPermutation(s);
        for (int num : perm) {
            System.out.print(num + " ");
        }
    }
}
