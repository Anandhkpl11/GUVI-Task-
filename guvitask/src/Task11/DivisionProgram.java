package Task11;

import java.util.Scanner;

public class DivisionProgram{
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the first integer
            System.out.print("Enter the first integer: ");
            int numerator = scanner.nextInt();

            // Read the second integer
            System.out.print("Enter the second integer: ");
            int denominator = scanner.nextInt();

            // Check if the denominator is zero
            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }

            // Perform division
            double result = (double) numerator / denominator;

            // Display the result
            System.out.println("Result of division: " + result);
        } catch (java.util.InputMismatchException e) {
            // Handle input mismatch exception (non-integer input)
           
        	System.out.println("Invalid input. Please enter integers.");
        } catch (ArithmeticException e) {
            // Handle division by zero exception
            
        	System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

}
