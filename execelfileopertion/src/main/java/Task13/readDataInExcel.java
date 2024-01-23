package Task13;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataInExcel {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook book=new XSSFWorkbook("C:\\Users\\HAPPY\\Desktop\\ExcelReadData.xlsx");
		    
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
				  System.out.println(cell.getStringCellValue());
				
			}
		}
		
		
		
		
		
		
	}

}
