package com.example.hr.Task12;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> employeeMap = new TreeMap<Integer, String>();
		
		employeeMap.put(1001, "Balaji");
		employeeMap.put(1002, "Anandh");
		employeeMap.put(1003, "Dinesh");
		employeeMap.put(1004, "Karthik");
		employeeMap.put(1005, "Viswa");
		
		// Print names of all employees in alphabetical order
        System.out.println("Names of employees in alphabetical order:");
       
        
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
	}
	
	
	
}
