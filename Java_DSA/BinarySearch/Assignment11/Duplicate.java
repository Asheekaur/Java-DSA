/*
💡 **Question 4**

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return *this repeated number*.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.

**Example 1:**
Input: nums = [1,3,4,2,2]
Output: 2

*/

package Java_DSA.BinarySearch.Assignment11;
    
public class Duplicate {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Find the intersection point of the two pointers
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Find the entrance to the cycle
        int pointer1 = nums[0];
        int pointer2 = slow;
        while (pointer1 != pointer2) {
            pointer1 = nums[pointer1];
            pointer2 = nums[pointer2];
        }

        return pointer1;
    }

    public static void main(String[] args) {
        Duplicate solution = new Duplicate();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(solution.findDuplicate(nums));  // Output: 2
    }
}
