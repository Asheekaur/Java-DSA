/*

💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

 */

import java.util.*;

 class Main1 {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int sum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n

        for (int num : nums) {
            if (set.contains(num)) {
                result[0] = num; // Found the duplicate number
            }
            set.add(num);
            sum -= num; // Update the sum by subtracting each number
        }

        result[1] = sum + result[0]; // Missing number = sum - duplicate number

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] errorNums = findErrorNums(nums);
        System.out.println(Arrays.toString(errorNums));
    }
}
