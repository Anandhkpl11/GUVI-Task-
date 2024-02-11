package Task21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
    	
    	WebElement Topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
    	
    	// switch to Top Frame
    	driver.switchTo().frame(Topframe);
    	
    	int framesize = driver.findElements(By.cssSelector("frame")).size();
    	// verify the three frame page
    	if (framesize==3) {
			
    		System.out.println("there are three on the page");
		}else {
			
			System.out.println("there are not three on the page");
			
			
			Thread.sleep(3000);
			
		WebElement leftframe = driver.findElement(By.cssSelector("frame[name='frame-left']"));	
		
		driver.switchTo().frame(leftframe);
		
		WebElement leftframe1 = driver.findElement(By.tagName("body"));
		
		// verify the left frame
		
		if (leftframe1.getText().equals("LEFT")) {
			
			System.out.println("The left frame verified");
			
		} else {
			
			System.out.println("The left frame Not verified");

		}
		// Move to the top frame
		driver.switchTo().parentFrame();
		
		WebElement middleframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		
		driver.switchTo().frame(middleframe);
		
		WebElement middleframe1 = driver.findElement(By.tagName("body"));
		
	   // verify the middle frame
		
		if (middleframe.getText().equals("MIDDLE")) {
			
			System.out.println("The middle frame verified");
			
		} else {
			
			System.out.println("The middle frame Not verified");
		
			// Move to the top frame
			driver.switchTo().parentFrame();
			
		WebElement rightframe = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		
		driver.switchTo().frame(rightframe);
		
		// verify the gight frame
		WebElement rightframe1 = driver.findElement(By.tagName("body"));
			
		if (rightframe1.getText().equals("RIGHT")) {
			
			System.out.println("The right frame verified");
			
		} else {
			
			System.out.println("The right frame Not verified");
		
		}
		
		// Move to the top frame
		driver.switchTo().parentFrame();
		
		WebElement bottomframe = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		
		driver.switchTo().frame(bottomframe);
		
		WebElement bottomframe1 = driver.findElement(By.tagName("body"));
		
		if (bottomframe1.getText().equals("BOTTOM")) {
			
			System.out.println("The bottom frame verified");
			
		} else {

			System.out.println("The bottom frame not verified");
		}
		
		// verify the frame page
		driver.switchTo().defaultContent();
		
		if (driver.getTitle().equals("Frame")) {
			
			System.out.println("Verify the title of the page");
			
		}else {
		System.out.println("Not Verify the title of the page");
		}
		
		driver.close();

	}

}
	}
}
