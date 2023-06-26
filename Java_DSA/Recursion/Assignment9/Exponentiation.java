/*
💡 **Question 4**

Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P.

**Example 1 :** 

Input: N = 5, P = 2

Output: 25

**Example 2 :**
Input: N = 2, P = 5

Output: 32

 */

package Java_DSA.Recursion.Assignment9;

public class Exponentiation {
    public static double calculateExponent(double N, double P) {
        double result = Math.pow(N, P);
        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(calculateExponent(5, 2)); // 25.0
        System.out.println(calculateExponent(2, 5)); // 32.0
    }
}
