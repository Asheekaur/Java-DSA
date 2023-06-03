/*

💡 **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
- Return k.

**Example :**
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_*,_*]

**Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)[

*/

import java.util.*;

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // variable to store the number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // overwrite the element at index k with the current element
                k++; // increment k
            }
        }

        return k;
    }
}

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

        System.out.println("Output: " + k + ", nums = " + Arrays.toString(nums));
    }
}
