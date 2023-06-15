/*
💡 **Question 5**

Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of **consecutive repeating characters** in chars:

- If the group's length is 1, append the character to s.
- Otherwise, append the character followed by the group's length.

The compressed string s **should not be returned separately**, but instead, be stored **in the input character array chars**. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done **modifying the input array,** return *the new length of the array*.

You must write an algorithm that uses only constant extra space.

**Example 1:**

**Input:** chars = ["a","a","b","b","c","c","c"]

**Output:** Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

**Explanation:**

The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

*/

package Java_DSA.Strings.Assignment8;
public class StringCompression {
    public static int compress(char[] chars) {
        int n = chars.length;
        int i = 0; // pointer to the current position in the compressed array
        int count = 1; // count of consecutive repeating characters

        for (int j = 1; j <= n; j++) {
            if (j < n && chars[j] == chars[j - 1]) {
                count++;
            } else {
                chars[i++] = chars[j - 1]; // store the current character

                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[i++] = c; // store the count of consecutive repeating characters
                    }
                }

                count = 1; // reset the count for the next group
            }
        }

        return i; // return the new length of the array
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = compress(chars);
        System.out.print("Compressed array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}
