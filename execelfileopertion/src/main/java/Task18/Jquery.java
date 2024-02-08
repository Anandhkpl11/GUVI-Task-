package Task18;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.css.model.CSSStyleSheetHeader;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
    	
       	WebElement first = driver.findElement(By.id("draggable"));
    	 
    	WebElement second = driver.findElement(By.id("droppable"));
    	
    	Actions act=new Actions(driver);
    
    	act.dragAndDrop(first, second).build().perform();    	
    	
    	
	}

}
