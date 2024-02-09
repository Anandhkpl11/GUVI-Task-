package Task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guvi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
         WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guvi.in/register");
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
    	
    	// Locator Id
    	driver.findElement(By.id("name")).sendKeys("Anandhakumar");
    	
    	Thread.sleep(2000);
    	
    	//locator class name
    	driver.findElement(By.id("email")).sendKeys("anandhakumarak11@gmil.com");
    	
    	//Locator Tagname
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Moorthi@05");
    	
    	//Locator CSS selector
    	driver.findElement(By.cssSelector("#mobileNumber")).sendKeys("9787968776");
    	
    	
    	
    	
    	
    	
    	//Relative
    	//
    	//tagName[@attributeName = 'attributeValue']
    	//tagName[contains(@attributeName,'half of the attributeValue')]
    	//tagName[text() ='full text']
    	//tagName[contains(text(), 'half text']
    	//(//tagName[@attributeName = 'attributeValue'])[index]


    	//syntax 

    	//tagname[@attributeName = 'attributeValue']/ancestor::previous tagname -------ancestor
    	//tagname[@attributeName = 'attributeValue']/parent::previous tagname[@attributeName = 'attributeValue']-------parent
    	//tagname[@attributeName = 'attributeValue']/preceding-sibling::previous tagname-----preceding-sibling
    	//previous tagname[@attributeName = 'attributeValue']/following-sibling::current roottag tagname-----following-sibling
    	//tagname[@attributeName = 'attributeValue']/preceding::previous tagname
    	//previous tagname[@attributeName = 'attributeValue']/following::current roottag tagname------ following
    	
    	//Locator Relative xpath
    	driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
    	
    	driver.close();
		

	}

}
