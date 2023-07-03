package Java_DSA.MockTest.MockTest4;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Initialize variables
        int sum = 0;
        int count = 0;

        // Read the list of numbers from the user
        System.out.println("Enter " + numElements + " numbers:");
        do {
            int num = scanner.nextInt();
            sum += num;
            count++;
        } while (count < numElements);

        // Calculate the average
        double average = (double) sum / numElements;

        // Display the average
        System.out.println("The average is: " + average);

        // Close the Scanner object
        scanner.close();
    }
}
