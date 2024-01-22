package com.example.hr.Task12;

import java.util.ArrayList;

public class RemoveArrayListElement {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> stringList = new ArrayList<>();
		
		stringList.add("Red");
		stringList.add("Blue");
		stringList.add("Green");
		stringList.add("Orange");
		
		// Print the original ArrayList
        System.out.println("Original ArrayList: " + stringList);
        
     // Remove all elements from the ArrayList
        stringList.clear();
        
        // Print the ArrayList after removing elements
        System.out.println("ArrayList after removing all elements: " + stringList);
		
		
		
	}

}
