/*
 Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1

Constraints:
a. 1 <= s.length <= 10^5
b. s consists of only lowercase English letters.

*/

package Java_DSA.MockTest.MockTest1;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        int result = firstUniqChar(s);
        System.out.println(result);
    }
    
    public static int firstUniqChar(String s) {
        // Create a HashMap to store the frequency of each character
        Map<Character, Integer> charFreq = new HashMap<>();
        
        // Calculate the frequency of each character in the string
        for (char c : s.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }
        
        // Find the index of the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charFreq.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If there are no non-repeating characters, return -1
        return -1;
    }
}
