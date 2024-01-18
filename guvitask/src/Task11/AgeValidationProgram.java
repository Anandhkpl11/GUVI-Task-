package Task11;

import java.util.Scanner;

public class AgeValidationProgram {
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read user input for age
            System.out.print("Enter your age: ");
            int enteredAge = scanner.nextInt();

            // Check if the entered age is less than 18
            if (enteredAge < 18) {
                // If less than 18, throw the custom exception
                throw new InvalidAgeException("Invalid age. Must be 18 or older.");
            }

            // If the age is valid, proceed with the program logic
            System.out.println("Age is valid. Proceeding with the program.");
            // ... (add your program logic here)

        } catch (InvalidAgeException e) {
            // Handle the custom exception for invalid age
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            // Handle input mismatch exception (non-integer input)
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }

    // Custom exception for invalid age
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
	

}
