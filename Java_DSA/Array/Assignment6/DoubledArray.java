/*
💡 **Question 6**

An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].

 */

package Java_DSA.Array.Assignment6;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DoubledArray {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0];
        }

        int[] original = new int[changed.length / 2];
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Arrays.sort(changed);

        for (int i = 0; i < changed.length; i++) {
            int num = changed[i];

            if (countMap.getOrDefault(num, 0) > 0 && countMap.getOrDefault(num * 2, 0) > 0) {
                original[i / 2] = num;
                countMap.put(num, countMap.get(num) - 1);
                countMap.put(num * 2, countMap.get(num * 2) - 1);
            } else if (countMap.getOrDefault(num, 0) > 0) {
                return new int[0];
            }
        }

        return original;
    }

    public static void main(String[] args) {
        DoubledArray solution = new DoubledArray();
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = solution.findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}
