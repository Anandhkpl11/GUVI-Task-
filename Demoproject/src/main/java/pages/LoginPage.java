package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class LoginPage extends ProjectSpecification {

		public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
		
		public LoginPage email(String value) {
			
			input("name", "Email",value);
			return this;
			
		}
		
		public LoginPage password(String value) {
			
			input("name", "Password", value);
			return this;
			
		}
		
		public LoginPage login() {
			
			click("xpath", "//input[@class=\"button-1 login-button\"]");
			return this;
			
		}
		
		
	
	


} 
