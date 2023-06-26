/*
💡 **Question 5**

We are given a string S, we need to find count of all contiguous substrings starting and ending with same character.

**Examples :**
Input  : S = "abcab"
Output : 7
There are 15 substrings of "abcab"
a, ab, abc, abca, abcab, b, bc, bca
bcab, c, ca, cab, a, ab, b
Out of the above substrings, there
are 7 substrings : a, abca, b, bcab,
c, a and b.

Input  : S = "aba"
Output : 4
The substrings are a, b, a and aba

 */


package Java_DSA.Recursion.Assignment10;

public class CountSubstrings {
    public static int countSubstrings(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(countSubstrings("abc")); // 3
        System.out.println(countSubstrings("aba")); // 4
    }
}
