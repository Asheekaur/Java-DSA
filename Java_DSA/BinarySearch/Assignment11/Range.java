/*
💡 **Question 7**

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

**Example 1:**
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]


 */

package Java_DSA.BinarySearch.Assignment11;

public class Range {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the leftmost position of the target
        int left = binarySearch(nums, target, true);
        if (left == nums.length || nums[left] != target) {
            return result;
        }

        // Find the rightmost position of the target
        int right = binarySearch(nums, target, false) - 1;

        result[0] = left;
        result[1] = right;
        return result;
    }

    private int binarySearch(int[] nums, int target, boolean leftmost) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target || (leftmost && nums[mid] == target)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Range solution = new Range();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solution.searchRange(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");  // Output: [3, 4]
    }
}
