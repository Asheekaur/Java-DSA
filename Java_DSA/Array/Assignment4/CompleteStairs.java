/*

💡 **Question 5**
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

**Example 1:**

[]()

![v2.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4bd91cfa-d2b1-47b3-8197-a72e8dcfff4b/v2.jpg)

**Input:** n = 5

**Output:** 2

**Explanation:** Because the 3rd row is incomplete, we return 2.

*/


package Java_DSA.Array.Assignment4;

public class CompleteStairs {
    public int arrangeCoins(int n) {
        long left = 0;
        long right = n;
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long total = (mid * (mid + 1)) / 2;
            
            if (total == n) {
                return (int) mid;
            } else if (total < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return (int) right;
    }
    
    public static void main(String[] args) {
        CompleteStairs completeStairs = new CompleteStairs();
        int n = 5;
        int result = completeStairs.arrangeCoins(n);
        
        System.out.println(result);
    }
}
