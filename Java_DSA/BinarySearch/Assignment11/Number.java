/*
💡 **Question 3**

****

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return *the only number in the range that is missing from the array.*

**Example 1:**
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

*/

package Java_DSA.BinarySearch.Assignment11;

public class Number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = n;

        for (int i = 0; i < n; i++) {
            missing ^= i ^ nums[i];
        }

        return missing;
    }

    public static void main(String[] args) {
        Number solution = new Number();
        int[] nums = {3, 0, 1};
        System.out.println(solution.missingNumber(nums));  // Output: 2
    }
}
