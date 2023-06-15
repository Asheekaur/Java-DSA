/*
💡 **Question 4**

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**

**Input:** s = "Let's take LeetCode contest"

**Output:** "s'teL ekat edoCteeL tsetnoc"

*/

package Java_DSA.Strings.Assignment7;
public class ReverseWords {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(reverseString(word)).append(" ");
        }

        return sb.toString().trim();
    }

    private static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String reversedWords = reverseWords(s);
        System.out.println(reversedWords);
    }
}
