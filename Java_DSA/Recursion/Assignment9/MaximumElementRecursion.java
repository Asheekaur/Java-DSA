/*

💡 **Question 5**

Given an array of integers **arr**, the task is to find maximum element of that array using recursion.

**Example 1:**

Input: arr = {1, 4, 3, -5, -4, 8, 6};
Output: 8

**Example 2:**

Input: arr = {1, 4, 45, 6, 10, -8};
Output: 45

*/

package Java_DSA.Recursion.Assignment9;

public class MaximumElementRecursion {
    public static int findMaximum(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftMax = findMaximum(arr, start, mid);
            int rightMax = findMaximum(arr, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(findMaximum(arr1, 0, arr1.length - 1)); // 8

        int[] arr2 = {1, 4, 45, 6, 10, -8};
        System.out.println(findMaximum(arr2, 0, arr2.length - 1)); // 45
    }
}
