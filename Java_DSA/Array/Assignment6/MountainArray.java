/*
💡 **Question 3**

Given an array of integers arr, return *true if and only if it is a valid mountain array*.

Recall that arr is a mountain array if and only if:

- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
    - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */

package Java_DSA.Array.Assignment6;
public class MountainArray {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;

        // Check for increasing sequence
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Check if peak exists and not at the start or end
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Check for decreasing sequence
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // If the pointer reached the end, it's a valid mountain array
        return i == n - 1;
    }

    public static void main(String[] args) {
        MountainArray solution = new MountainArray();
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        boolean isValidMountain = solution.validMountainArray(arr);
        System.out.println(isValidMountain);
    }
}
