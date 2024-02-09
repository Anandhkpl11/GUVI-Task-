package Task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuviSigninAndLogIn {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guvi.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("name")).sendKeys("Anandhakumar");
		
		driver.findElement(By.id("email")).sendKeys("Anandhakumarak92@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("Moorthi@05");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("9342850353");
		
		driver.findElement(By.id("signup-btn")).click();
		
		Thread.sleep(4000);
		
		WebElement currentprofile = driver.findElement(By.className("form-control"));
		
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//wait.until(ExpectedConditions.elementToBeSelected(currentprofile));
		
		Select s=new Select(currentprofile);
		
		s.selectByIndex(2);
		
		WebElement yourdegree = driver.findElement(By.id("degreeDrpDwn"));
		
		Select s1=new Select(yourdegree);
		
		s1.selectByValue("B.Com. / M.Com.");
		
        WebElement passoutyear = driver.findElement(By.id("year"));
		
        passoutyear.sendKeys("2015");
        
        WebElement signbtn = driver.findElement(By.id("details-btn"));
        
        signbtn.click();
        
        String text = signbtn.getText();
        
        if (text.equalsIgnoreCase("sign in")) {
			
        	System.out.println("successfully registerd");
		}else {
			
			System.out.println("successfully Not registerd");
		}
        
        driver.navigate().to("https://www.guvi.in/");
        
        driver.findElement(By.linkText("Login")).click();
        
        driver.findElement(By.id("email")).sendKeys("Anandhakumarak92@gmail.com");
        
        driver.findElement(By.id("password")).sendKeys("Moorthi@05");
        
        WebElement loginbtn = driver.findElement(By.id("login-btn"));
        
        loginbtn.click();
        
        String text2 = loginbtn.getText();
        
        if (text2.equalsIgnoreCase("login")) {
			
        	System.out.println("successfully login");
        	
		} else {
			
			System.out.println("successfully not  login");

		}
		
		
		
	}

}
