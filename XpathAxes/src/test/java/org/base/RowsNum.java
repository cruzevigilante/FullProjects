package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RowsNum {
	static WebDriver driver;
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/table.html");
	List<WebElement> findElements = driver.findElements(By.xpath("//tbody//tr"));
	int b=0;
	for (int i = 0; i < findElements.size(); i++) {
		findElements.get(i);
		
		b++;
		
	}
	System.out.println("No of Rows are"+b);

}
}

