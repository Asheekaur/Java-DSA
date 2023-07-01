/* 
💡 **Question 5**

Given two integer arrays `nums1` and `nums2`, return *an array of their intersection*. Each element in the result must be **unique** and you may return the result in **any order**.

**Example 1:**
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]


*/

package Java_DSA.BinarySearch.Assignment11;

import java.util.HashSet;
import java.util.Set;

public class intersect {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int num : set2) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        intersect solution = new intersect();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.intersection(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");  // Output: 2
        }
    }
}
