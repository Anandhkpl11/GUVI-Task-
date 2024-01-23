package Task13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {
	
	public static void main(String[] args) throws IOException {
		
		             XSSFWorkbook book=new XSSFWorkbook();
		             XSSFSheet sheet = book.createSheet("sheet1");
		             
		             
		             Object [][] TestData= {
		            		 
		            		 { "Name", "Age","Email"},
		 		             {"John Doe",30,"john@test.com"},
		 		             {"Jane Doe",28,"jane@test.com"},
		 		             {"Bob Smith",35,"jacky@example.com"},
		 		             {"Swapnil",37,"swapnil@example.com"}         		 
		             };
		             
		             int rowcount=0;
		             
		             for (Object[] row1 : TestData) {
		            	 
		            	      XSSFRow row = sheet.createRow(rowcount++);
		            	      
		            	      int colunmcount=0;
		            	      
		            	      for (Object colunm : row1) {
		            	    	    
		            	    	  XSSFCell cell = row.createCell(colunmcount++);
		            	    	  
		            	    	  if (colunm instanceof String) {
		            	    		   
		            	    		   cell.setCellValue((String)colunm);
									
								} else if(colunm instanceof Integer){
									
									cell.setCellValue((Integer)colunm);

								}
								
							}
		            	      
		            	     
		  						}
		             
		             try {
	  						FileOutputStream output=new FileOutputStream("C:\\Users\\HAPPY\\Desktop\\GUVI Notes\\GUVI Java Automation\\execelfileopertion\\firstfile.xlsx");
	  						book.write(output);
	  					} catch (FileNotFoundException e) {
	  						// TODO Auto-generated catch block
	  						e.printStackTrace();
	  					}     
		           
		             
		            
	}
	

}
