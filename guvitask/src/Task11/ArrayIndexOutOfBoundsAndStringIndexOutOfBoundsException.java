package Task11;

public class ArrayIndexOutOfBoundsAndStringIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
            // Attempting to access a character at an index that is out of bounds
            String text = "Hello";
            char character = text.charAt(10);  // This will throw StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Error: " + e.getMessage());
        }
		
		
		try {
            // Attempting to access an index that is out of bounds
            int[] array = {1, 2, 3};
            int value = array[5];  // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Error: " + e.getMessage());
        }
		
		

	}

}
