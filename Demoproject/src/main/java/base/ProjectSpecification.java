package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import uitiles.Utilities;

public class ProjectSpecification extends Utilities {
	
	public void Browser(String browser) {
		lanuchBrowser(browser);
	}
	
	public void url(String url) {
		geturl(url);
		
	}
	
	public void input(String locator, String attributevalue, String value) {
		inputmethods(locator,  attributevalue,value);
	}
    
	public void closebrowser() {
		closebrowserwindow();
		
	}
	public void alert() {
		Alertaccept();
		
	}
	@DataProvider(name="readexcel")
	public String[][] readexcel() throws IOException {
		
		String[][] Testdata = excelread();
		return Testdata;
		
	}
	

}
