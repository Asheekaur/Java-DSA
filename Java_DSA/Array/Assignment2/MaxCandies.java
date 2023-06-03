/*
 Question 2
Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. 

The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice. 

Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.

Example 1:
Input: candyType = [1,1,2,2,3,3]
Output: 3

Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

 */

 import java.util.HashSet;

public class MaxCandies {
    public static int maxCandies(int[] candyType) {
        // Calculate the maximum number of candies Alice can eat
        int maxEat = candyType.length / 2;

        // Use a HashSet to keep track of the unique candy types
        HashSet<Integer> uniqueCandies = new HashSet<>();

        // Iterate over the candy types and add them to the HashSet
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        // Return the minimum between the number of unique candies and the maximum number of candies Alice can eat
        return Math.min(uniqueCandies.size(), maxEat);
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int result = maxCandies(candyType);
        System.out.println("Maximum number of different types of candies Alice can eat: " + result);
    }
}
