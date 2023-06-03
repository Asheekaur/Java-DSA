/*

💡  You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
Input: digits = [1,2,3]
Output: [1,2,4]

**Explanation:** The array represents the integer 123.

Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

 */

 public class IncrementIntegerArray {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit by 1
            digits[i] += 1;
            
            // If the digit becomes 10, carry over to the next digit
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // No carry-over, so we can stop incrementing
                return digits;
            }
        }
        
        // If all digits are 9 and there's a carry-over, create a new array with size n+1
        int[] result = new int[n+1];
        result[0] = 1;  // Set the most significant digit to 1
        return result;
    }
    
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        
        // Print the result
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
