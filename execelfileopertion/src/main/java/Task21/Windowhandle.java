package Task21;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
    	
    	driver.findElement(By.linkText("Click Here")).click();
    	
    	String oldwindowHandle = driver.getWindowHandle();
    	
    	Set<String> windowHandles = driver.getWindowHandles();
    	
    	for (String newwindow : windowHandles) {
			driver.switchTo().window(newwindow);
		}
    	
    	WebElement newwindowverify = driver.findElement(By.xpath("/html/body/div/h3"));
    	
    	String text = newwindowverify.getText();
    	
    	if (text.equalsIgnoreCase("New Window")) {
			
    		System.out.println("sucessfully switch the window");
    		
		} else {
			
			
			System.out.println("sucessfully not switch the window");

		}
    	
    	driver.close();
	}

}
