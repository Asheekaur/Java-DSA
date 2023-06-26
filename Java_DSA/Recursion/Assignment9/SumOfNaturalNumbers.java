/*
💡 **Question 2**

Given a number n, find the sum of the first natural numbers.

**Example 1:**

Input: n = 3 

Output: 6

**Example 2:**

Input  : 5 

Output : 15

*/

package Java_DSA.Recursion.Assignment9;
public class SumOfNaturalNumbers {
    public static int sumOfFirstNNumbers(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sumOfFirstNNumbers(3)); // 6
        System.out.println(sumOfFirstNNumbers(5)); // 15
    }
}
