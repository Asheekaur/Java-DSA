package Java_DSA.MockTest.MockTest4;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        // Initialize the first two numbers of the series
        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci series up to " + limit + ":");
        System.out.print(num1 + " " + num2 + " ");

        // Generate and print the Fibonacci series
        for (int i = 2; i < limit; i++) {
            int sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }

        // Close the Scanner object
        scanner.close();
    }
}
