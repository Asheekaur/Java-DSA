/*
💡 **Question 7**

Given a string S, the task is to write a program to print all permutations of a given string.

**Example 1:**

***Input:***

*S = “ABC”*

***Output:***

*“ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”*

**Example 2:**

***Input:***

*S = “XY”*

***Output:***

*“XY”, “YX”*

 */

package Java_DSA.Recursion.Assignment9;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static List<String> findPermutations(String S) {
        List<String> permutations = new ArrayList<>();
        backtrack(S.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void backtrack(char[] chars, int start, List<String> permutations) {
        if (start == chars.length - 1) {
            permutations.add(new String(chars));
        } else {
            for (int i = start; i < chars.length; i++) {
                swap(chars, start, i);
                backtrack(chars, start + 1, permutations);
                swap(chars, start, i);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        // Test cases
        String S1 = "ABC";
        List<String> permutations1 = findPermutations(S1);
        System.out.println(permutations1); // ["ABC", "ACB", "BAC", "BCA", "CBA", "CAB"]

        String S2 = "XY";
        List<String> permutations2 = findPermutations(S2);
        System.out.println(permutations2); // ["XY", "YX"]
    }
}