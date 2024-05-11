package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static String getDataFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		String data;
		
	    String path = "D:\\Project\\OrangeHRM\\OrangeHRM.xlsx";
	    FileInputStream file = new FileInputStream(path);
	    Workbook book = WorkbookFactory.create(file);
	    Sheet sheet = book.getSheet(sheetName);
	    Row row = sheet.getRow(rowNo);
	    Cell cell = row.getCell(cellNo);
	    
	    try {
	    	double value = cell.getNumericCellValue();
	    //Conversion of double to String
	    	data = String.valueOf(value);
	    }
	    catch (IllegalStateException e)
	    {
	    	data = cell.getStringCellValue();
	    }
	    finally {
	   // Close Excel file
	    book.close();
	    }
		return data;
	}
	public static Date getDateFromExcelSheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		
	    String path = "D:\\OrangeHRM test cases.xlsx";
	    FileInputStream file = new FileInputStream(path);
	    Workbook book = WorkbookFactory.create(file);
	    Sheet sheet = book.getSheet(sheetName);
	    Row row = sheet.getRow(rowNo);
	    Cell cell = row.getCell(cellNo);
	    
	    Date date = cell.getDateCellValue();
	   
	   // Close Excel file
	     book.close();
	 	    
	    return date;
	}
	
	public static void captureScreenshot(String testID ,WebDriver driver) throws IOException
	{
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
		//Conversion of Date to String
		String strDate = dateFormat.format(date); 
		File Source1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File Destination1 = new File("D:\\Screenshots\\OrangeHRM\\image"+testID+strDate+".jpg");
	     FileHandler.copy(Source1, Destination1);
		
	}

}
