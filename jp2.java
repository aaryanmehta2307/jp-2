import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input for the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Take input for the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Add the two numbers
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
