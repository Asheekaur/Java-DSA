/*
💡 **Question 3**

****Given a positive integer, N. Find the factorial of N. 

**Example 1:**

Input: N = 5 

Output: 120

**Example 2:**

Input: N = 4

Output: 24

*/
package Java_DSA.Recursion.Assignment9;

public class Factorial {
    public static int factorial(int N) {
        int result = 1;
        for (int i = 2; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(4)); // 24
    }
}
