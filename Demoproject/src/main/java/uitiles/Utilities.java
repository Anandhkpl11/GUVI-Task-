package uitiles;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Utilities {
	
	
	public static WebDriver driver;
	
	public void lanuchBrowser(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
		} else if(Browser.equalsIgnoreCase("firefox")){
           driver=new FirefoxDriver();
		}else if(Browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		
	}
	
	public void geturl(String url) {
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public void inputmethods(String locator, String attributevalue, String value) {
		
		if (locator.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(attributevalue)).sendKeys(value);
			
		} else if(locator.equalsIgnoreCase("name")) {
			
			driver.findElement(By.name(attributevalue)).sendKeys(value);
		}else if(locator.equalsIgnoreCase("xpath")) {
			
			driver.findElement(By.xpath(attributevalue)).sendKeys(value);
		}else if(locator.equalsIgnoreCase("classname")) {
			
			driver.findElement(By.className(attributevalue)).sendKeys(value);
		}else if(locator.equalsIgnoreCase("cssselector")) {
			
			driver.findElement(By.cssSelector(attributevalue)).sendKeys();
		}
		
	}
	
	
	public void click(String locator, String attributevalue) {
        if (locator.equals("id")) {
			
			driver.findElement(By.id(attributevalue)).click();
			
		} else if(locator.equals("name")) {
			
			driver.findElement(By.name(attributevalue)).click();
		}else if(locator.equals("xpath")) {
			
			driver.findElement(By.xpath(attributevalue)).click();
		
		
	}
        
        

}
	
		public void closebrowserwindow() {
			
			driver.close();
			
		}
		
		public void Alertaccept() {
			
			driver.switchTo().alert().accept();
			
		}
		
		public String[][] excelread() throws IOException {
			XSSFWorkbook book=new XSSFWorkbook("C:\\Users\\HAPPY\\Desktop\\GUVI Notes\\GUVI Java Automation\\Demoproject\\Data\\logintest.xlsx");
		    
			XSSFSheet sheetAt = book.getSheetAt(0);
			
			int Rowcount = sheetAt.getLastRowNum();
			int	 colunmcount = sheetAt.getRow(0).getLastCellNum();
			
			// get data
			String [][] TestData=new String[Rowcount][colunmcount];
			
			//get into row
			
			for (int i = 1; i <=Rowcount; i++) {
				  XSSFRow row = sheetAt.getRow(i);
				  
				  //get into cell
				  for (int j = 0; j <colunmcount; j++) {
					  XSSFCell cell = row.getCell(j);
					  
					  TestData[i-1][j]=cell.getStringCellValue();
					
					
				}
			}
			book.close();
			return TestData;
			
			}
		

			
	}


