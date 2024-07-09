import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Add the two numbers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        
        // Close the scanner
        scanner.close();
    }
}