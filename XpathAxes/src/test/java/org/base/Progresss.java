package org.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Progresss {
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		//tbody//tr[4]
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		Map<String,Integer> m= new HashMap<String, Integer>();
		List<WebElement> findElements = driver.findElements(By.xpath("//tbody//tr[4]"));
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			System.out.println(text);
			}	
		}

}
