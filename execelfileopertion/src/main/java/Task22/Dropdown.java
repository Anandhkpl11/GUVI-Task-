package Task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Dropdown {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.com/demo/");
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.name("first_name")).sendKeys("Anandhakumar");
    	
    	driver.findElement(By.name("last_name")).sendKeys("M");
    	
    	driver.findElement(By.name("business_name")).sendKeys("Retail Business");
    	
    	driver.findElement(By.name("email")).sendKeys("Anandhakumarak92@gmail.com");
    	
    	Thread.sleep(20000);
    	
    	driver.findElement(By.id("number")).sendKeys("16");
    	
    	Thread.sleep(20000);
    	
    	driver.findElement(By.id("demo")).click();
    	
    	WebElement text = driver.findElement(By.xpath("//h2[@class='text-start fs-4']"));
    	
    	if (text.getText().equalsIgnoreCase("Instant demo request form")) {
    		
    		System.out.println("successfull sign in");
			
		} else {
			
			System.out.println("successfull not  sign in");

		}
    	
    	
    	TakesScreenshot screenshot=(TakesScreenshot)driver;
    	File sources = screenshot.getScreenshotAs(OutputType.FILE);
    	File des=new File("C:\\Users\\HAPPY\\Desktop\\GUVI Notes\\GUVI Java Automation\\execelfileopertion\\screencaputer\\login.png") ;
    	FileHandler.copy(sources, des);

	}

}
