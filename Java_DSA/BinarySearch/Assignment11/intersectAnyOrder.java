/*
💡 **Question 8**

Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must appear as many times as it shows in both arrays and you may return the result in **any order**.

**Example 1:**
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

*/

package Java_DSA.BinarySearch.Assignment11;
import java.util.*;

public class intersectAnyOrder {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap1 = new HashMap<>();
        for (int num : nums1) {
            countMap1.put(num, countMap1.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (countMap1.containsKey(num) && countMap1.get(num) > 0) {
                resultList.add(num);
                countMap1.put(num, countMap1.get(num) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        intersectAnyOrder solution = new intersectAnyOrder();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));  // Output: [2, 2]
    }
}
