package Task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook {

	
	        public static void main(String[] args) {
				
	        	
	        	WebDriver driver=new ChromeDriver();
	        	
	        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        	
	        	driver.manage().window().maximize();
	        	
	        	driver.get("https://www.facebook.com/");
	        	
	        	// verify the website page
	        	String currentUrl = driver.getCurrentUrl();
	        	
	        	if (currentUrl.equalsIgnoreCase("https://www.facebook.com/")) {
	        		
	        		System.out.println("succesfully verified facebook home page ");
					
				} else {

					System.out.println("Not match facebook home page ");
				}
	        	
	        	driver.findElement(By.linkText("Create new account")).click();
	        	
	        	driver.findElement(By.name("firstname")).sendKeys("Test");
	        	
	        	driver.findElement(By.name("lastname")).sendKeys("User");
	        	
	        	driver.findElement(By.name("reg_email__")).sendKeys("testuser@test.com");
	        	
	        	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("testuser@test.com");
	        	
	        	driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
	        	
	        		        	
	        	WebElement daydropdown = driver.findElement(By.id("day"));
	        	
	        	Select day= new Select(daydropdown);
	        	
	        	day.selectByIndex(10);	        	
	        	WebElement monthdropdown = driver.findElement(By.id("month"));
	        	
	        	Select month= new Select(monthdropdown);
	        	
	        	month.selectByValue("6");
	        	
	        	WebElement yeardropdown = driver.findElement(By.id("year"));
	        	
	        	Select year= new Select(yeardropdown);
	        	
	        	year.selectByVisibleText("1985");
	        	
	        	driver.findElement(By.xpath("(//*[@class='_8esa'])[2]")).click();
	        	
	        	
	        	WebElement signupbtn = driver.findElement(By.xpath("//button[@name='websubmit']"));
	        	
	        	signupbtn.click();
	        	
	        	String text = signupbtn.getText();
	        	
	        	
	        	if (text.equalsIgnoreCase("sign up")) {
					 
	        		System.out.println("sucessfull sign up");
	        		
				} else {
					
					System.out.println("sucessfull not sign up");

				}
	        	
	        	
	        	
	        	
			}
}
