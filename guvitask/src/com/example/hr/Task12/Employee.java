package com.example.hr.Task12;

import javax.swing.plaf.PanelUI;

public class Employee {
	
	String EmployeeName;
	int EmployeeId;
	double Salary;
	
	public Employee(String EmployeeName,int EmployeeId,double Salary) {
		
		this.EmployeeName=EmployeeName;
		this.EmployeeId=EmployeeId;
		this.Salary=Salary;
		
	}
	
	public void printName() {
		System.out.println("Print the Employee Name $:"+EmployeeName );
	}
	
	
	public void printSalary() {
		
		System.out.println("Print the Employee Salary  $:" +Salary);
	}
	
	
	

}
