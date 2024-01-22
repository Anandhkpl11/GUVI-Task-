package com.example.hr.Task12;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
	
	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Green");
		stringList.add("Red");
		stringList.add("Blue");
		stringList.add("Orange");
		
		// Convert List to array
		String [] stringArray=new String[stringList.size()];
		
		stringArray = stringList.toArray(stringArray);
		
		
		
		 // Print the elements of the array
        System.out.println("Elements of the array:");
        
        for (String element : stringArray) {
          
        	System.out.println(element);
            
        }
		   
		
	}

}
