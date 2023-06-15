/*
💡 **Question 6**

Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. You may return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

**Input:** s = "cbaebabacd", p = "abc"

**Output:** [0,6]

**Explanation:**

The substring with start index = 0 is "cba", which is an anagram of "abc".

The substring with start index = 6 is "bac", which is an anagram of "abc".

*/

package Java_DSA.Strings.Assignment8;

import java.util.ArrayList;
import java.util.List;

public class AnagramsSubstring {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();

        if (s.length() < p.length()) {
            return indices;
        }

        int[] pFreq = new int[26]; // frequency array for characters in p
        int[] windowFreq = new int[26]; // frequency array for characters in the sliding window

        // Calculate the frequency of characters in p
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int windowSize = p.length();

        // Initialize the sliding window frequency array
        for (int i = 0; i < windowSize; i++) {
            windowFreq[s.charAt(i) - 'a']++;
        }

        // Check if the initial window is an anagram of p
        if (isAnagram(pFreq, windowFreq)) {
            indices.add(0);
        }

        // Slide the window and check for anagrams
        for (int i = windowSize; i < s.length(); i++) {
            windowFreq[s.charAt(i - windowSize) - 'a']--; // remove the leftmost character from the window
            windowFreq[s.charAt(i) - 'a']++; // add the current character to the window

            // Check if the current window is an anagram of p
            if (isAnagram(pFreq, windowFreq)) {
                indices.add(i - windowSize + 1);
            }
        }

        return indices;
    }

    private static boolean isAnagram(int[] pFreq, int[] windowFreq) {
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] != windowFreq[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = findAnagrams(s, p);
        System.out.println("Indices of anagrams: " + indices);
    }
}
