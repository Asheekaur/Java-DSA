/*
💡 **Question 4**

Given a string calculate length of the string using recursion.

**Examples:**
Input : str = "abcd"
Output :4

Input : str = "GEEKSFORGEEKS"
Output :13

 */

package Java_DSA.Recursion.Assignment10;

public class StringLength {
    public static int calculateLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        
        return 1 + calculateLength(str.substring(1));
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(calculateLength("Hello")); // 5
        System.out.println(calculateLength("Java")); // 4
    }
}
