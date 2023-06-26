/*
💡 **Question 3**

****Given a set represented as a string, write a recursive code to print all subsets of it. The subsets can be printed in any order.

**Example 1:**

Input :  set = “abc”

Output : { “”, “a”, “b”, “c”, “ab”, “ac”, “bc”, “abc”}

**Example 2:**

Input : set = “abcd”

Output : { “”, “a” ,”ab” ,”abc” ,”abcd”, “abd” ,”ac” ,”acd”, “ad” ,”b”, “bc” ,”bcd” ,”bd” ,”c” ,”cd” ,”d” }

 */

package Java_DSA.Recursion.Assignment10;

import java.util.ArrayList;
import java.util.List;

public class SubsetPrinter {
    public static List<String> subsets(String set) {
        List<String> result = new ArrayList<>();
        backtrack(set, "", 0, result);
        return result;
    }

    private static void backtrack(String set, String subset, int index, List<String> result) {
        result.add(subset);

        for (int i = index; i < set.length(); i++) {
            backtrack(set, subset + set.charAt(i), i + 1, result);
        }
    }

    public static void main(String[] args) {
        // Test cases
        String set1 = "abc";
        List<String> subsets1 = subsets(set1);
        System.out.println(subsets1); // ["", "a", "ab", "abc", "ac", "b", "bc", "c"]

        String set2 = "abcd";
        List<String> subsets2 = subsets(set2);
        System.out.println(subsets2); // ["", "a", "ab", "abc", "abcd", "abd", "ac", "acd", "ad", "b", "bc", "bcd", "bd", "c", "cd", "d"]
    }
}
