package Task11;

import java.util.Scanner;

public class LoginSystem {

	
	 private static final String CORRECT_PASSWORD = "secret";

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	           
	            System.out.print("Enter your password: ");    // Read user input for password
	            String enteredPassword = scanner.nextLine();

	           
	            if (!isCorrectPassword(enteredPassword)) {   // Check if the entered password is correct
	                // If not correct, throw a custom exception
	                throw new IncorrectPasswordException("Incorrect password entered.");
	            }

	            // If the password is correct, proceed with login logic
	            System.out.println("Login successful!");
	            // ... (add your login logic here)

	            
	        } catch (IncorrectPasswordException e) {
	     
	        	// Handle the custom exception for incorrect password
	        
	        	System.out.println("Error: " + e.getMessage());
	        } finally {
	            // Close the scanner to prevent resource leak
	            scanner.close();
	        }
	    }

	    // Custom exception for incorrect password
	    static class IncorrectPasswordException extends Exception {
	        public IncorrectPasswordException(String message) {
	            super(message);
	        }
	    }

	    
	    // Method to check if the entered password is correct
	    private static boolean isCorrectPassword(String enteredPassword) {
	        return CORRECT_PASSWORD.equals(enteredPassword);
	    }
	
	
	
}
