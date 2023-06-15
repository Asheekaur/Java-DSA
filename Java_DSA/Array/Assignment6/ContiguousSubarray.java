/*
💡 **Question 4**

Given a binary array nums, return *the maximum length of a contiguous subarray with an equal number of* 0 *and* 1.

**Example 1:**

**Input:** nums = [0,1]

**Output:** 2

**Explanation:**

[0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

 */

package Java_DSA.Array.Assignment6;
import java.util.HashMap;
import java.util.Map;

public class ContiguousSubarray {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        int count = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;
            
            if (countMap.containsKey(count)) {
                int prevIndex = countMap.get(count);
                maxLength = Math.max(maxLength, i - prevIndex);
            } else {
                countMap.put(count, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        ContiguousSubarray solution = new ContiguousSubarray();
        int[] nums = {0, 1};
        int maxLength = solution.findMaxLength(nums);
        System.out.println(maxLength);
    }
}
