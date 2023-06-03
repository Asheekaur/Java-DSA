/*
 Question 8
You are given an integer array nums and an integer k.

In one operation, you can choose any index i where 0 <= i < nums.length and change nums[i] to nums[i] + x where x is an integer from the range [-k, k]. You can apply this operation at most once for each index i.

The score of nums is the difference between the maximum and minimum elements in nums.

Return the minimum score of nums after applying the mentioned operation at most once for each index in it.

Example 1:
Input: nums = [1], k = 0
Output: 0

Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 */

 import java.util.Arrays;

public class MinimizeScore {
    public static int minimizeScore(int[] nums, int k) {
        Arrays.sort(nums);
        int minScore = nums[nums.length - 1] - nums[0];
        
        for (int i = 1; i < nums.length - 1; i++) {
            int minVal = Math.min(nums[0] + k, nums[i] - k);
            int maxVal = Math.max(nums[nums.length - 1] - k, nums[i] + k);
            minScore = Math.min(minScore, maxVal - minVal);
        }
        
        return minScore;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
        int minScore = minimizeScore(nums, k);
        System.out.println(minScore);
    }
}
