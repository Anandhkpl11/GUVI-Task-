package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Homepage;

public class TC001RegisterAccount {
   
    @Test
	public void Registerpage() throws IOException {
		FileReader read=new FileReader("C:\\Users\\HAPPY\\Desktop\\GUVI Notes\\GUVI Java Automation\\Demoproject\\src\\test\\resources\\TestData.properties");
		
	     Properties p=new Properties();
	     p.load(read);
		
				
		Homepage obj=new Homepage();
		
		obj.Browser("chrome");
		obj.url(p.getProperty("url"));
		obj.Regiterbutton().gender().firstname(p.getProperty("Firstname"))
		.lastname(p.getProperty("lastname")).email(p.getProperty("email")).password(p.getProperty("password"))
		.confirmpassword(p.getProperty("password")).register();

		
	}

}
