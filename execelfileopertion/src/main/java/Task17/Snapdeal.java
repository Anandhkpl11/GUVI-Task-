package Task17;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		// Browser Launch
		WebDriver driver=new ChromeDriver();
		
		// Navigate to url
		driver.navigate().to("http://www.snapdeal.com");
		
		driver.manage().window().maximize();
		
		// Use Action
		
		Actions ac =new Actions(driver);
		
		// move to corser sign in
		WebElement signin = driver.findElement(By.className("accountInner"));
		
		// click and hold
		ac.moveToElement(signin).clickAndHold().build().perform();
		
		// click the account
		driver.findElement(By.xpath("//a[normalize-space()='Your Account']")).click();
		
		// enter the emailid
		driver.findElement(By.id("userName")).sendKeys("anandhmoorthi190@gmail.com");
		
		// click continue button
		driver.findElement(By.id("checkUser")).click();
		

		
		//driver.findElement(By.className("otpValueCode")).sendKeys("8418");
		
		Thread.sleep(5000);
		//verify otp continue button
		driver.findElement(By.id("loginUsingOtp")).click();
		//verify userid
		WebElement userid = driver.findElement(By.id("loggedInUserName"));
		
		String text = userid.getText();
		
		if (text.equalsIgnoreCase("Anandha kumar M")) {
			System.out.println("logged in successfully");
		}
		
		 driver.close();
		
		
		
		
	}

}
