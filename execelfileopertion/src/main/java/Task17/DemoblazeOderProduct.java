package Task17;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoblazeOderProduct {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Browser launch
        WebDriver driver=new ChromeDriver();
		
		// window maximize
		driver.manage().window().maximize();
		
		//Navigate to url
		driver.navigate().to("https://www.demoblaze.com/");
		
		// click laptop
		driver.findElement(By.linkText("Laptops")).click();
		
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		Thread.sleep(5000);
		//choose laptop
		driver.findElement(By.linkText("Sony vaio i5")).click();
		
		Thread.sleep(5000);
		// add to cart
		driver.findElement(By.linkText("Add to cart")).click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		driver.close();
	}

}
