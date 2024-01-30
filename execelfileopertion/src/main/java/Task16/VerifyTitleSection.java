package Task16;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleSection {
	
	public static void main(String[] args) {
		
		
		//Browser launch
        WebDriver driver=new ChromeDriver();
		
			
		//Navigate to url
		driver.navigate().to("https://www.wikipedia.org/");
		
		// window maximize
		driver.manage().window().maximize();
		
		// search the for the query Artificial intelligence
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence",Keys.ENTER);
		
		// click on history
		driver.findElement(By.partialLinkText("intelligence")).click();
		
		//verify the Title
		String titlename = driver.getTitle();
		
		if (titlename.contains("Artificial intelligence (disambiguation) - Wikipedia")) {
			
			System.out.println("title verify");
			
		}
		
		//close browser
		driver.close();
		
		
		
		
		
	}

}
