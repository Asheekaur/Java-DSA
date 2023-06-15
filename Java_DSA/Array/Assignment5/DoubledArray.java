/*

💡 **Question 8**

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

package Java_DSA.Array.Assignment5;

import java.util.*;

public class DoubledArray {
    public static int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0) {
            return new int[0]; // Empty array if the length is odd
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> original = new ArrayList<>();

        // Count the frequency of elements in the changed array
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Sort the array in ascending order
        Arrays.sort(changed);

        // Construct the original array
        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) == 0) {
                continue; // Skip if the element is already used
            }

            int doubledNum = num * 2;
            if (countMap.getOrDefault(doubledNum, 0) == 0) {
                return new int[0]; // Empty array if the doubled element is missing
            }

            original.add(num); // Add the original element to the list
            countMap.put(num, countMap.get(num) - 1); // Decrease the count of original element
            countMap.put(doubledNum, countMap.get(doubledNum) - 1); // Decrease the count of doubled element
        }

        int[] result = new int[original.size()];
        for (int i = 0; i < original.size(); i++) {
            result[i] = original.get(i); // Convert the list to an array
        }

        return result;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8}; // Example changed array

        int[] original = findOriginalArray(changed);
        System.out.println(Arrays.toString(original));
    }
}
