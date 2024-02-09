package Task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//a[text()='22']")).click();
		
		WebElement dateprint = driver.findElement(By.id("datepicker"));
		
		String text = dateprint.getText();
		
		System.out.println(text);
		
		driver.quit();
		
		
		
		
		
	}

}
