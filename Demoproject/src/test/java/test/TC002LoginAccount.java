package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.Homepage;

public class TC002LoginAccount extends ProjectSpecification {
	@Test (dataProvider ="readexcel")
	public void logintest( String email,String password) {
		
		Homepage obj= new Homepage();
		obj.Browser("chrome");
		obj.url("https://demowebshop.tricentis.com/");
		obj.Loginbutton().email(email).password(password).login();
		//obj.alart();
		
		
		//obj.closebrowser();	
		
	}
		
			
	

}
