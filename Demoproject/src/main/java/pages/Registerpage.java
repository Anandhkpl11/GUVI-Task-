package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Registerpage extends ProjectSpecification {
	
	
	
	public Registerpage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public  Registerpage gender() {
		click("id", "gender-male");
		return this ;
		
	}
	
	public Registerpage firstname(String value) {
		input("id", "FirstName",value);
		return this;
	}
	public Registerpage lastname(String value) {
		input("id", "LastName",value);
		return this;
		
	}
	
	public Registerpage email(String value) {
		input("id", "Email",value);
		return this;
		
	}
	
	public Registerpage password(String value) {
		input("name", "Password",value);
		return this;
		
	}
    
	public Registerpage confirmpassword(String value) {
		input("name", "ConfirmPassword",value);
		return this;
		
	}
	
	public Registerpage register() {
		click("name", "register-button");
		return this;
		
	}
	
}
