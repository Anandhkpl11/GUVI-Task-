package Task10;

public class Circle {
	
	// Q.No 3
	
	
	    
	    private double radius;

	    // No-argument constructor
	    public Circle() {
	       
	        this.radius = 1.0;
	    }

	    // Two-argument constructor
	    public Circle(double radius) {
	        
	        this.radius = radius;
	    }

	    // Method to calculate circumference
	    public double calculateCircumference() {
	       
	        return 2 * Math.PI * radius;
	    }

	    public static void main(String[] args) {
	       
	        Circle circle1 = new Circle();
	        Circle circle2 = new Circle(5.0); 
	       
	        // Display circumferences
	        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
	        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
	    }
	}

