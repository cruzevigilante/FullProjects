package org.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeastCompletedProgress {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> progress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> li = new ArrayList<Integer>();

		for (int i = 0; i < progress.size(); i++) {
			String text = progress.get(i).getText();
			String replaceAll = text.replaceAll("%", "");
			int parseInt = Integer.parseInt(replaceAll);
			li.add(parseInt);
		}
		Integer min = Collections.min(li);
		System.out.println(min);
		String minValue=min+"%";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
