/*
💡 **Question 7**

Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

**Example 1:**

**Input:** s = "ab#c", t = "ad#c"

**Output:** true

**Explanation:**

Both s and t become "ac".

*/

package Java_DSA.Strings.Assignment7;
public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String processedS = processString(s);
        String processedT = processString(t);
        return processedS.equals(processedT);
    }

    private static String processString(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";

        boolean areEqual = backspaceCompare(s, t);
        System.out.println(areEqual);
    }
}
