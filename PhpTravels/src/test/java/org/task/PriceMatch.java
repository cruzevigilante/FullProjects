package org.task;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriceMatch {
	WebDriver driver;
	@Test
	public void taskVerify() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/demo");
		driver.findElement(By.xpath("//a[@class='lvl-0 link nav-link']")).click();
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='money number']"));
		for (int i = 0; i < findElements.size(); i++) {
			String text = findElements.get(i).getText();
			System.out.println(text);
			
		}
		
		
	}

}
