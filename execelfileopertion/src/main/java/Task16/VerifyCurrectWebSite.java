package Task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyCurrectWebSite {
	
	public static void main(String[] args) {
		
		//Browser launch
        WebDriver driver=new ChromeDriver();
		
		// window maximize
		driver.manage().window().maximize();
		
		//Navigate to url
		driver.navigate().to("https://www.demoblaze.com/");
		
		// verify the correct website
		String title = driver.getTitle();
		
		
		if (title.equals("STORE")) {
			
			System.out.println("page landed on correct website");
			
		} else {
			System.out.println("page not landed on correct website");

		}
		

		//close browser
		driver.close();
	}

}
