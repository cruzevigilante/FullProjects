package org.extractdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonData {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		File file = new File("C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\DataDrivenFramework\\Amazon1.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(Stream);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\Browser Launch\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		String name=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).getText();
		/*List<WebElement> elements=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (int i = 0; i < elements.size(); i++) {
			
			Sheet sheet=book.createSheet("FirstSheet");
			Row row =sheet.createRow(i);
			Cell cell=row.createCell(0);
			
			WebElement ns =elements.get(i);
			String text=ns.getText();
			System.out.println(text);
			
		}
		FileOutputStream fos = new FileOutputStream(file);
        book.write(fos);
        System.out.println("Succesfully Created");*/
		
		
		
		
		
	    Sheet sheet =book.createSheet("FirstSheet");
        Row row=sheet.createRow(0);
        Cell cc=row.createCell(0);
        cc.setCellValue(name);
        FileOutputStream fos = new FileOutputStream(file);
        book.write(fos);
        System.out.println("Succesfully Created");
        driver.close();
		}

}
