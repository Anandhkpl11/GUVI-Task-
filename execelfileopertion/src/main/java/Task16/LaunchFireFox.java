package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Browser Launch 
		WebDriver driver=new FirefoxDriver();
		
		// window maximize
		driver.manage().window().maximize();
		
		//Navigate to url
		driver.navigate().to("https://www.google.com/");
		
		//get currentUrl
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		//reload the page
		driver.navigate().refresh();
		
		//close browser
		driver.close();
		
		
		
		
		
		 
		

	}

}
