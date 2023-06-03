/*
 
💡 **Question 7**
You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

Count and return *the number of maximum integers in the matrix after performing all the operations*

**Example 1:**

![q4.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4d0890d0-7bc7-4f59-be8e-352d9f3c1c52/q4.jpg)

**Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

**Output:** 4

**Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4.


 */

package Java_DSA.Array.Assignment4;

public class MaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null || ops.length == 0) {
            return m * n;
        }
        
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        
        for (int[] op : ops) {
            minX = Math.min(minX, op[0]);
            minY = Math.min(minY, op[1]);
        }
        
        return minX * minY;
    }
    
    public static void main(String[] args) {
        MaxCount maxCount = new MaxCount();
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        int result = maxCount.maxCount(m, n, ops);
        
        System.out.println(result);
    }
}
