package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRadingProgram {
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
           
        	// Read the file name from the user
            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();

           
            
            // Attempt to open the file
            File file = new File(fileName);

            
            if (!file.exists()) {
                // If the file does not exist, throw FileNotFoundException
                throw new FileNotFoundException("File not found: " + fileName);
            }

            // Read data from the file (replace this with your actual file reading logic)
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            // Close the file scanner
            fileScanner.close();

        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the main scanner to prevent resource leak
            scanner.close();
        }
    }

}
