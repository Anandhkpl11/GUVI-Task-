package pages;

import org.openqa.selenium.WebDriver;

import base.ProjectSpecification;

public class Homepage extends ProjectSpecification {
	
	//public static WebDriver driver;
	
	public Homepage() {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public Registerpage Regiterbutton() {
		
		click("xpath", "//a[@href=\"/register\"]");
		return new Registerpage(driver);
	}
	
	public LoginPage Loginbutton() {
		click("xpath", "//a[@class=\"ico-login\"]");
		return new LoginPage(driver);
		
	}

}
