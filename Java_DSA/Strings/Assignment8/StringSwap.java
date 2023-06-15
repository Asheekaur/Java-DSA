/*
💡 **Question 8**

Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

**Example 1:**

**Input:** s = "ab", goal = "ba"

**Output:** true

**Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

*/

package Java_DSA.Strings.Assignment8;
public class StringSwap {
    public static boolean areAlmostEqual(String s, String goal) {
        if (s.equals(goal)) {
            return true;
        }

        int n = s.length();
        int diffCount = 0;
        int[] diffIndices = new int[2];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (diffCount == 2) {
                    return false;
                }

                diffIndices[diffCount++] = i;
            }
        }

        return diffCount == 2 && s.charAt(diffIndices[0]) == goal.charAt(diffIndices[1])
                && s.charAt(diffIndices[1]) == goal.charAt(diffIndices[0]);
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        boolean result = areAlmostEqual(s, goal);
        System.out.println("Can swap two letters: " + result);
    }
}
