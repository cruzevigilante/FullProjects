package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
      
		int a=0;
        List<WebElement> findElements = driver.findElements(By.xpath("//tbody//tr//th"));
        for (int i = 0; i < findElements.size(); i++) {
        	findElements.get(i);
        	a++;
			
		}
        System.out.println("Number of columns are" + a);
		
		
	}

}
