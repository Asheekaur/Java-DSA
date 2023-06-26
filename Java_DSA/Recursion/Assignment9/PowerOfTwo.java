/*
💡 **Question 1**

Given an integer `n`, return *`true` if it is a power of two. Otherwise, return `false`*.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.

**Example 1:**
Input: n = 1 

Output: true

**Example 2:**
Input: n = 16 

Output: true

**Example 3:**
Input: n = 3 

Output: false

*/

package Java_DSA.Recursion.Assignment9;
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfTwo(1));  // true
        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(3));  // false
    }
}
