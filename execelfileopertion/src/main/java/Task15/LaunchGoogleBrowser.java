package Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogleBrowser {
	public static void main(String[] args) {
		
		
		// 1,3,4,5 Question https://hashnode.com/preview/65b253e18b4b3d8600abdf1a
		
//	Q.no 2	
		
		// Launch Chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//load url
		driver.get("https://www.google.co.uk/");
		
		// window maximize
		driver.manage().window().maximize();
		
		// find search element and sent text,click the enter button
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver",Keys.ENTER);
		
		//close browser
		driver.close();
		
		
		
		
		
		
	}

}
