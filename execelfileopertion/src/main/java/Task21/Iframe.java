package Task21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
    	
    	driver.switchTo().frame(0);
    	
    	WebElement input = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
    	
    	input.clear();
    	
    	input.sendKeys("Hello people");
    	
    	driver.close();

	}

}
