/*
💡 **Question 8**

Given a string, count total number of consonants in it. A consonant is an English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.

**Examples :**
Input : abc de
Output : 3
There are three consonants b, c and d.

Input : geeksforgeeks portal
Output : 12
 */

package Java_DSA.Recursion.Assignment10;

public class CountConsonants {
    public static int countConsonants(String str) {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (consonants.contains(String.valueOf(ch))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test cases
        String str1 = "Hello World";
        System.out.println("Total number of consonants in \"" + str1 + "\": " + countConsonants(str1));

        String str2 = "OpenAI";
        System.out.println("Total number of consonants in \"" + str2 + "\": " + countConsonants(str2));
    }
}
