package Task10;

public class PersonConstructor {
	
	//Q.No 1
	
	 private String name;
	    private int age;

	    
	    public PersonConstructor(String name, int age) {  // Constructor
	        this.name = name;
	        this.age = age;
	    }

	   
	    public String getName() {    // Getter methods
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	      
	    	PersonConstructor person1 = new PersonConstructor(" Anandh", 25);   // Example usage

	    	// Accessing attributes using getter methods
	        System.out.println("Name: " + person1.getName());
	        System.out.println("Age: " + person1.getAge());

}
}
