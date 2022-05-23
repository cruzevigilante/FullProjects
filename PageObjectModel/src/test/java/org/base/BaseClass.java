package org.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
       
	}
	public static String excelData(String name,int rowNo,int cellNo) throws IOException, InvalidFormatException {
		
		File file = new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\PageObjectModel\\Credentials.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet=book.getSheet(name);
		Row row=sheet.getRow(rowNo);
		Cell cell=row.getCell(cellNo);
		String value=null;
		CellType cellType=cell.getCellType();
		switch (cellType) {
		
		case STRING:
			value =cell.getStringCellValue();
			break;
		case NUMERIC:
			double numericCellValue=cell.getNumericCellValue();
			long l=(long)numericCellValue;
			value = String.valueOf(l);
			break;

		default:
			break;
		}
		return value;
		
		
		
		
		
		
		
		
		
		
		/*Workbook w = new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\PageObjectModel\\Credentials.xlsx")));
		return w.getSheet(name).getRow(rowNo).getCell(cellNo).getStringCellValue();*/
		
		}

}
